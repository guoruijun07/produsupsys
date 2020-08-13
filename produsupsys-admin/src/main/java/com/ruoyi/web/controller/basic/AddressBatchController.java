package com.ruoyi.web.controller.basic;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.util.DateUtils;
import com.ruoyi.common.bean.bo.AddressOriginalBO;
import com.ruoyi.common.bean.po.PostWebPscAddressBatchExport;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.mapper.ISysUserMapper;
import com.ruoyi.common.mapper.PostWebPpcPriceMapper;
import com.ruoyi.common.mapper.PostWebPscAddressBatchExportMapper;
import com.ruoyi.common.mapper.PostWebPscExportMapper;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.web.controller.excel.listener.AddressOriginalListener;
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/address")
public class AddressBatchController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(AddressBatchController.class);

    @Autowired(required = false)
    private PostWebPscExportMapper postWebPscExportMapper;

    @Autowired(required = false)
    private ISysUserMapper sysUserMapper;

    @Autowired(required = false)
    private PostWebPpcPriceMapper postWebPpcPriceMapper;

    @Autowired(required = false)
    private PostWebPscAddressBatchExportMapper postWebPscAddressBatchExportMapper;

    private  String dirPath = "/home/code"+ File.separator + "exportSorting" + File.separator;

    Random random=new Random();

    private String prefix = "sorting/";

    @RequiresPermissions("sorting:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysUser user)
    {
        startPage();
        List<PostWebPscAddressBatchExport> list = postWebPscAddressBatchExportMapper.selectByUserId(ShiroUtils.getSysUser().getUserId());
        return getDataTable(list);
    }

    /**
     * excel文件的上传
     */
    @PostMapping("/uploadOrderOriginal")
    @ResponseBody
    public AjaxResult upload(MultipartFile file, HttpSession session) throws IOException {
        Long startTime = System.currentTimeMillis();
        Long userId = ShiroUtils.getSysUser().getUserId();

        List<AddressOriginalBO> addressOriginalBO = new ArrayList<>();
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(file.getInputStream(), AddressOriginalBO.class, new AddressOriginalListener(addressOriginalBO)).sheet().doRead();
        int totalNum = addressOriginalBO.size();
        //生成批次号
        String batchNo = getBatchNo();
        PostWebPscAddressBatchExport postWebPscAddressBatchExport = new PostWebPscAddressBatchExport();
        postWebPscAddressBatchExport .setBatchNo(batchNo);
        postWebPscAddressBatchExport.setStatus(0);
        postWebPscAddressBatchExport.setTotalNum(totalNum);
        postWebPscAddressBatchExport.setUserId(userId);
        postWebPscAddressBatchExport.setModifyTime(new Date());
        postWebPscAddressBatchExport.setCreateTime(new Date());
        postWebPscAddressBatchExportMapper.insert(postWebPscAddressBatchExport);
        int batchId = postWebPscAddressBatchExport.getId();
        //生成批次号
//        List<TbOrderOriginalInfo> tbOrderOriginalInfoList = new ArrayList<>();
//
//        for (OrderOriginalBO orderOriginalBO : orderOriginalBOList) {
//            TbOrderOriginalInfo tbOrderOriginalInfo = new TbOrderOriginalInfo();
//            BeanUtils.copyProperties(orderOriginalBO,tbOrderOriginalInfo);
//            tbOrderOriginalInfo.setBatchNo(batchNo);
//            tbOrderOriginalInfo.setOrderNo(getOrderNo());
//            tbOrderOriginalInfo.setOperationNo(tbUserInfo.getId().toString());
//            tbOrderOriginalInfo.setOperationName(tbUserInfo.getRealName());
//            tbOrderOriginalInfo.setOperationTime(new Date());
//            tbOrderOriginalInfo.setCityWideFlag(1); //同城标识（1同城，0外阜）
//            tbOrderOriginalInfo.setSortingStatus(0);
//            tbOrderOriginalInfo.setModifyTime(new Date());
//            tbOrderOriginalInfo.setCreateTime(new Date());
//            tbOrderOriginalInfoList.add(tbOrderOriginalInfo);
//        }
//
//        //批量入库
//        tbOrderOriginalInfoMapper.batchInsert(tbOrderOriginalInfoList);

        return AjaxResult.success("导入成功");
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
