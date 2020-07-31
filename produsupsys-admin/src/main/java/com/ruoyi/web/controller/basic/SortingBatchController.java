package com.ruoyi.web.controller.basic;

import com.alibaba.excel.EasyExcel;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.bean.bo.ReadySortingBO;
import com.ruoyi.common.bean.po.ClientWebPpcPrice;
import com.ruoyi.common.bean.po.PostWebPscExport;
import com.ruoyi.common.bean.po.PostWebPscSorting;
import com.ruoyi.common.bean.po.SysUser;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.enums.EnumPriceCode;
import com.ruoyi.common.mapper.ClientWebPpcPriceMapper;
import com.ruoyi.common.mapper.ISysUserMapper;
import com.ruoyi.common.mapper.PostWebPscExportMapper;
import com.ruoyi.common.mapper.PostWebPscSortingMapper;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.web.controller.excel.listener.BathSortingDataListener;
import com.ruoyi.web.controller.excel.template.SortingExportTemplate;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 分拣码批量查询
 */
@Controller
@RequestMapping("/sorting")
public class SortingBatchController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(SortingBatchController.class);
    @Autowired(required = false)
    private PostWebPscExportMapper postWebPscExportMapper;

    @Autowired(required = false)
    private ISysUserMapper sysUserMapper;

    @Autowired(required = false)
    private ClientWebPpcPriceMapper clientWebPpcPriceMapper;

    @Autowired(required = false)
    private PostWebPscSortingMapper postWebPscSortingMapper;

    String dirPath = "/home/code" + File.separator + "exportMatching" + File.separator;

    private String prefix = "sorting/";

    @RequiresPermissions("sorting:view")
    @GetMapping()
    public String dept()
    {
        return prefix + "/sortingcodelist";
    }

    @RequiresPermissions("sorting:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysUser user)
    {
        startPage();
        List<PostWebPscExport> list = postWebPscExportMapper.selectByUserId(1L);
        return getDataTable(list);
    }

    /**
     * excel文件的上传
     */
    @Log(title = "分拣码批量匹配", businessType = BusinessType.IMPORT)
//    @RequiresPermissions("sorting:import")
    @PostMapping("/importData")
    @ResponseBody
    public AjaxResult importData(MultipartFile file) throws IOException {
        Long startTime = System.currentTimeMillis();

        SysUser sysUser = sysUserMapper.selectByPrimaryKey(ShiroUtils.getSysUser().getUserId());

//        ExcelUtil<SysUser> util = new ExcelUtil<SysUser>(SysUser.class);
//        List<SysUser> userList = util.importExcel(file.getInputStream());
//        String operName = ShiroUtils.getSysUser().getLoginName();
//        String message = userService.importUser(userList, updateSupport, operName);

        //取出用户的余额
        Double account = sysUser.getAccount() == null ? 0.0 : sysUser.getAccount();
        ClientWebPpcPrice priceInfo = clientWebPpcPriceMapper.selectPriceByUserId(sysUser.getUserId(),1,  EnumPriceCode.PC_PRICE.getCode());

        if (priceInfo.getPrice() == null) {
            return AjaxResult.warn(0, "请先设置该用户pc功能单价");
        }

        List<ReadySortingBO> list = new ArrayList<>();
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(file.getInputStream(), ReadySortingBO.class, new BathSortingDataListener(list)).sheet().doRead();
        int totalNum = list.size();
        int successNum = 0;
        //获取到所有分拣信息
        List<PostWebPscSorting> postWebPscSortings = postWebPscSortingMapper.selectAllData();
        Map<String, PostWebPscSorting> map = new HashMap<>();
        for (PostWebPscSorting postWebPscSorting : postWebPscSortings) {
            map.put(postWebPscSorting.getSortingName(), postWebPscSorting);
        }

        List<SortingExportTemplate> exportDatas = new ArrayList<>();

        for (ReadySortingBO readySortingBo : list) {
            SortingExportTemplate sortingExport = new SortingExportTemplate();
            sortingExport.setWaybillNo(readySortingBo.getWaybillNo());
            sortingExport.setReceiveAddress(readySortingBo.getReceiveAddress());
            sortingExport.setThreeSorting(readySortingBo.getThreeSorting());
            sortingExport.setThreeSortingSimple(readySortingBo.getThreeSortingSimple());

            PostWebPscSorting postWebPscSorting = map.get(readySortingBo.getThreeSortingSimple());
            if (postWebPscSorting != null) {
                successNum++;
                sortingExport.setMarking(postWebPscSorting.getMarking());
                sortingExport.setDistribuCenter(postWebPscSorting.getDistribuCenter());
                sortingExport.setDlvName(postWebPscSorting.getDlvName());
                sortingExport.setAreaNum(postWebPscSorting.getAreaNum());
                sortingExport.setOrgNum(String.valueOf(postWebPscSorting.getOrgNo()));
                sortingExport.setOrgName(postWebPscSorting.getOrgName());
            }

            exportDatas.add(sortingExport);
        }
        //如果余额不够，直接返回，不生成文件
        Double cost = successNum * priceInfo.getPrice();
//        Double cost = successNum * Double.valueOf(perMoney);
        if (cost > account) {
            return AjaxResult.warn(0, "您的余额不够，请联系管理员充值");
        }
        //更新余额
        Double remainingSum = account - cost;

//        SysUser sysUser1 = new SysUser();
//        sysUser1.setId(sysUser1.getId());
//        sysUser1.setRemainingSum(remainingSum);
//        sysUserMapper.updateRemainingSumByPrimaryKey(tbUserInfo1);
//
//        String fileNameOriginal = file.getOriginalFilename();
//        String fileName = new String((fileNameOriginal + "_" + DateUtils.format(new Date(), "yyyyMMddHHmmss") + ".xlsx").getBytes(), "UTF-8");
//        try {
//
//            File exportFile = CommomUtils.MakeLogDir(dirPath, fileName, tbUserInfo.getMobile());
//
//            OutputStream outputStream = new FileOutputStream(exportFile);
//
//            //把数据封装为对象
//            EasyExcel.write(outputStream, SortingExportTemplate.class).sheet("订单数据").doWrite(exportDatas);
//
//            PostWebPscExport tbExportInfo = new PostWebPscExport();
//            tbExportInfo.setUserId(tbUserInfo.getId());
//            tbExportInfo.setFileName(fileName);
//            tbExportInfo.setTotalNum(totalNum);
//            tbExportInfo.setSucessNum(successNum);
//            tbExportInfo.setMoney(cost);
//            tbExportInfo.setCreateTime(new Date());
//            tbExportInfoMapper.insert(tbExportInfo);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        List<TbExportInfo> tbExportInfos = tbExportInfoMapper.selectAll();
//        return new SysResult(1, "导入数据成功", "", remainingSum, tbExportInfos);
        return AjaxResult.success("message");
        
    }

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public void exportDownExcel(HttpServletResponse response, HttpSession session, String fileName) {
        logger.info("文件名为:" + fileName);
        com.ruoyi.system.domain.SysUser sysUser = ShiroUtils.getSysUser();

        String fileNamePath = dirPath + sysUser.getPhonenumber() + java.io.File.separator + fileName;
        File file = new File(fileNamePath);
        if (file.exists()) {
            OutputStream os = null;
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            try {
                response.setContentType("application/force-download");
//                response.setContentType("application/json;charset=UTF-8");
                response.setCharacterEncoding("utf-8");
                String utf8fileName = URLEncoder.encode(fileName, "UTF-8");
                response.addHeader("Content-Disposition", "attachment;fileName=" + utf8fileName);

                byte[] buffer = new byte[1024];
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                os = response.getOutputStream();

                int i = bis.read(buffer);
                while (i != -1) {
                    os.write(buffer, 0, i);
                    i = bis.read(buffer);
                }
                os.flush();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bis != null) {
                        bis.close();
                    }
                    if (fis != null) {
                        fis.close();
                    }
                    if (os != null) {
                        os.close();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
