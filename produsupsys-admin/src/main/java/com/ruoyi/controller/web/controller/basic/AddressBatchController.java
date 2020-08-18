package com.ruoyi.controller.web.controller.basic;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.util.DateUtils;
import com.ruoyi.common.bean.bo.AddressOriginalBO;
import com.ruoyi.common.bean.po.*;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.EnumDeviceCode;
import com.ruoyi.common.enums.EnumMenuCode;
import com.ruoyi.common.mapper.*;
import com.ruoyi.common.utils.bean.BeanUtils;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.controller.web.controller.excel.listener.AddressOriginalListener;
import com.ruoyi.controller.web.controller.excel.template.SortingMatchiingExportTemplate;
import com.ruoyi.service.BindingRalationService;
import com.ruoyi.service.SortingMatchingService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/address")
public class AddressBatchController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(AddressBatchController.class);

    @Autowired(required = false)
    private ISysUserMapper sysUserMapper;

    @Autowired(required = false)
    private PostPpcPriceMapper postPpcPriceMapper;

    @Autowired(required = false)
    private PostPscAddressMatchingExportMapper postWebPscAddressBatchExportMapper;

    @Autowired(required = false)
    private PostPscAddressOriginalMapper postPscAddressOriginalMapper;
    @Autowired(required = false)
    private SortingMatchingService sortingMatchingService;

    private  String dirPath = "/home/code"+ File.separator + "exportSorting" + File.separator;

    Random random=new Random();

    private String prefix = "sorting/";

    @RequiresPermissions("sorting:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysUser user)
    {
        startPage();
        List<PostPscAddressMatchingExport> list = postWebPscAddressBatchExportMapper.selectByUserId(ShiroUtils.getSysUser().getUserId());
        return getDataTable(list);
    }

    /**
     * excel文件的上传
     */
    @PostMapping("/uploadOrderOriginal")
    @ResponseBody
    public AjaxResult upload(MultipartFile file, HttpSession session) throws IOException {

        SysUser sysUser = sysUserMapper.selectByPrimaryKey(ShiroUtils.getSysUser().getUserId());
        Long userId = sysUser.getUserId();
        String userName = sysUser.getUserName();

        List<AddressOriginalBO> addressOriginalList = new ArrayList<>();
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(file.getInputStream(), AddressOriginalBO.class, new AddressOriginalListener(addressOriginalList)).sheet().doRead();
        int totalNum = addressOriginalList.size();
        //生成批次号
        Date currentDate= new Date();
        String batchNo = getBatchNo();
        PostPscAddressMatchingExport postPscAddressMatchingExport = new PostPscAddressMatchingExport();
        postPscAddressMatchingExport .setBatchNo(batchNo);
        postPscAddressMatchingExport.setStatus(0);
        postPscAddressMatchingExport.setTotalNum(totalNum);
        postPscAddressMatchingExport.setUserId(userId);
        postPscAddressMatchingExport.setModifyTime(currentDate);
        postPscAddressMatchingExport.setCreateTime(currentDate);
        postWebPscAddressBatchExportMapper.insert(postPscAddressMatchingExport);
        int batchId = postPscAddressMatchingExport.getId();
        //生成批次号
        List<PostPscAddressOriginal> postPscAddressOriginalList = new ArrayList<>();

        for (AddressOriginalBO orderOriginalBO : addressOriginalList) {
            PostPscAddressOriginal postPscAddressOriginal = new PostPscAddressOriginal();
            BeanUtils.copyProperties(orderOriginalBO,postPscAddressOriginal);
            postPscAddressOriginal.setBatchNo(batchNo);
            postPscAddressOriginal.setOrderNo(getOrderNo());
            postPscAddressOriginal.setOperationNo(String.valueOf(userId));
            postPscAddressOriginal.setOperationName(userName);
            postPscAddressOriginal.setOperationTime(currentDate);
            postPscAddressOriginal.setCityWideFlag(1); //同城标识（1同城，0外阜）
            postPscAddressOriginal.setSortingStatus(0);
            postPscAddressOriginal.setModifyTime(currentDate);
            postPscAddressOriginal.setCreateTime(currentDate);
            postPscAddressOriginalList.add(postPscAddressOriginal);
        }
//
//        //批量入库
        postPscAddressOriginalMapper.batchInsert(postPscAddressOriginalList);

        return AjaxResult.success("导入成功");
    }

    /**
     * 点击匹配按钮，调取实时接口匹配
     */
    @PostMapping("/matchingBatchNo")
    @ResponseBody
    public AjaxResult orderMatching( HttpSession session,String batchNo) throws IOException {

        SysUser sysUser = sysUserMapper.selectByPrimaryKey(ShiroUtils.getSysUser().getUserId());
        Long userId = sysUser.getUserId();
        //取出用户的余额
        Double account = sysUser.getAccount() == null ? 0.0 : sysUser.getAccount();
        PostPpcPrice priceInfo = postPpcPriceMapper.selectPriceByUserId(userId, EnumMenuCode.MENU_ADDRESS.getCode(),  EnumDeviceCode.PC.getCode());

        if(priceInfo ==  null){
            return AjaxResult.success("请先设置该用户pc功能单价");
        }
        Double pcPrice = priceInfo.getPrice() == null ? 0.0 : priceInfo.getPrice();

        //获取到总得需要匹配的条数
        List<PostPscAddressOriginal> postPscAddressOriginalList = postPscAddressOriginalMapper.selectByBatchNo(batchNo);

        int totalNum = postPscAddressOriginalList.size();

        //如果余额不够，直接返回，不生成文件
        Double cost = totalNum * pcPrice;
//        Double cost = successNum * Double.valueOf(perMoney);
        if (cost > account) {
            return AjaxResult.success("您的余额不够，请联系管理员充值");
        }

        //传入批次号，调取远程接口，根据匹配状态，生成对应文件导出
        try{
            //调取接口匹配分拣码
            sortingMatchingService.sortingMatchingInfoByPc(batchNo);

        }catch (Exception e){
            e.printStackTrace();
            return  AjaxResult.success("匹配数据失败");

        }

        List<PostPscAddressMatchingResult> tbSortingMatchingInfoList = PostPscAddressMatchingResult.selectByBatchNo(batchNo);
        Integer successMatching   = tbSortingMatchingInfoMapper.selectByCountSucessAndBatchNo(batchNo);

        //更新余额
        //如果余额不够，直接返回，不生成文件
        Double matchingCost = successMatching * pcPrice;
        Double remainingSum = totalSum - matchingCost;

        TbUserInfo tbUserInfo1 = new TbUserInfo();
        tbUserInfo1.setId(tbUserInfo.getId());
        tbUserInfo1.setRemainingSum(remainingSum);
        tbUserInfoMapper.updateRemainingSumByPrimaryKey(tbUserInfo1);

        String fileName = new String(("order" + "_" + DateUtils.format(new Date(), "yyyyMMddHHmmss") + ".xlsx").getBytes(), "UTF-8");
        try {

            File exportFile = MakeLogDir(fileName, tbUserInfo.getMobile());

            OutputStream outputStream = new FileOutputStream(exportFile);

            List<SortingMatchiingExportTemplate>  sortingMatchiingExports = new ArrayList<>();

            for (TbSortingMatchingInfo tbSortingMatchingInfo : tbSortingMatchingInfoList) {
                SortingMatchiingExportTemplate sortingMatchiingExportTemplate = new SortingMatchiingExportTemplate();
                sortingMatchiingExportTemplate.setSenderName(tbSortingMatchingInfo.getSenderName());
                sortingMatchiingExportTemplate.setSender_mobile_one(tbSortingMatchingInfo.getSenderMobileOne());
                sortingMatchiingExportTemplate.setSender_mobile_two(tbSortingMatchingInfo.getSenderMobileTwo());
                sortingMatchiingExportTemplate.setSenderProvince(tbSortingMatchingInfo.getSenderProvince());
                sortingMatchiingExportTemplate.setSenderCity(tbSortingMatchingInfo.getSenderCity());
                sortingMatchiingExportTemplate.setSenderCounty(tbSortingMatchingInfo.getSenderCounty());
                sortingMatchiingExportTemplate.setSenderAddress(tbSortingMatchingInfo.getSenderAddress());

                sortingMatchiingExportTemplate.setReciverName(tbSortingMatchingInfo.getReciverName());
                sortingMatchiingExportTemplate.setReciverMobileOne(tbSortingMatchingInfo.getReciverMobileOne());
                sortingMatchiingExportTemplate.setReciverMobileTwo(tbSortingMatchingInfo.getReciverMobileTwo());
                sortingMatchiingExportTemplate.setReciverProvince(tbSortingMatchingInfo.getReciverProvince());
                sortingMatchiingExportTemplate.setReciverCity(tbSortingMatchingInfo.getReciverCity());
                sortingMatchiingExportTemplate.setReciverCounty(tbSortingMatchingInfo.getReciverCounty());
                sortingMatchiingExportTemplate.setReciverAddress(tbSortingMatchingInfo.getReciverAddress());

                sortingMatchiingExportTemplate.setCityWideFlag(tbSortingMatchingInfo.getCityWideFlag()==1?"是":"否");
                sortingMatchiingExportTemplate.setLevelFourSortingName(tbSortingMatchingInfo.getLevelFourSortingName());
                sortingMatchiingExportTemplate.setSortingName(tbSortingMatchingInfo.getSortingName());
                sortingMatchiingExportTemplate.setMarking(tbSortingMatchingInfo.getMarking());
                sortingMatchiingExportTemplate.setDistribuCenter(tbSortingMatchingInfo.getDistribuCenter());
                sortingMatchiingExportTemplate.setDlvName(tbSortingMatchingInfo.getDlvName());
                sortingMatchiingExportTemplate.setAreaNum(tbSortingMatchingInfo.getDlvNo());
                sortingMatchiingExportTemplate.setOrgNum(tbSortingMatchingInfo.getOrgNo());
                sortingMatchiingExportTemplate.setOrgName(tbSortingMatchingInfo.getOrgName());

                sortingMatchiingExports.add(sortingMatchiingExportTemplate);
            }

            //把数据封装为对象
            EasyExcel.write(outputStream, SortingMatchiingExportTemplate.class).sheet("订单数据").doWrite(sortingMatchiingExports);


            TbOrderBatchInfo tbOrderBatchInfo = tbOrderBatchInfoMapper.selectByBatchNo(batchNo);
            tbOrderBatchInfo.setFileName(fileName);
            tbOrderBatchInfo.setTotalNum(totalNum);
            tbOrderBatchInfo.setSuccessNum(successMatching);
            tbOrderBatchInfo.setMoney(matchingCost);
            tbOrderBatchInfo.setStatus(1);
            tbOrderBatchInfo.setModifyTime(new Date());
            tbOrderBatchInfoMapper.updateByPrimaryKey(tbOrderBatchInfo);


        } catch (Exception e) {
            e.printStackTrace();
        }

        return AjaxResult.success("匹配成功");
    }



    //获取批次号
    private String getBatchNo() {
        int number=random.nextInt(900)+1000;
        return DateUtils.format(new Date(), DateUtils.DATE_FORMAT_14) + number;
    }

    //获取订单号
    private String getOrderNo() {
        int number=random.nextInt(90000)+100000;
        return DateUtils.format(new Date(), DateUtils.DATE_FORMAT_14) +number;
    }

    private File MakeLogDir(String fileName, String mobile) {
        File folder = new File(dirPath + mobile);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        File file = new File(dirPath + mobile + java.io.File.separator + fileName);
        if (file.exists()) {
            file.delete();
        }
        return file;
    }

}
