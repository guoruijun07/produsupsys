package com.ruoyi.web.controller.basic;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.bean.po.ClientWebPpcPrice;
import com.ruoyi.common.bean.po.PostWebPscExport;
import com.ruoyi.common.bean.po.SysUser;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.enums.EnumPriceCode;
import com.ruoyi.common.mapper.ClientWebPpcPriceMapper;
import com.ruoyi.common.mapper.ISysUserMapper;
import com.ruoyi.common.mapper.PostWebPscExportMapper;
import com.ruoyi.framework.util.ShiroUtils;
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
import java.util.List;

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

//    @Autowired(required = false)
//    private TbPriceInfoMapper tbPriceInfoMapper;

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
        ClientWebPpcPrice price = clientWebPpcPriceMapper.selectPriceByUserId(sysUser.getUserId(),1,  EnumPriceCode.PC_PRICE.getCode());

        if (price == null) {
            return AjaxResult.warn(0, "请先设置该用户pc功能单价");
        }
//        Double pcPrice = tbPriceInfo.getPrice() == null ? 0.0 : tbPriceInfo.getPrice();
//
//        List<ReadySortingData> list = new ArrayList<>();
//        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
//        EasyExcel.read(file.getInputStream(), ReadySortingData.class, new BathSortingDataListener(list)).sheet().doRead();
//        int totalNum = list.size();
//        int successNum = 0;
//        //获取到所有分拣信息
//        List<TbSortingInfo> tbSortingInfos = tbSortingInfoMapper.selectAllData();
//        Map<String, TbSortingInfo> map = new HashMap<>();
//        for (TbSortingInfo tbSortingInfo : tbSortingInfos) {
//            map.put(tbSortingInfo.getSortingName(), tbSortingInfo);
//        }
//
//        List<SortingExportTemplate> exportDatas = new ArrayList<>();
//
//        for (ReadySortingData readySortingData : list) {
//            SortingExportTemplate sortingExport = new SortingExportTemplate();
//            sortingExport.setWaybillNo(readySortingData.getWaybillNo());
//            sortingExport.setReceiveAddress(readySortingData.getReceiveAddress());
//            sortingExport.setThreeSorting(readySortingData.getThreeSorting());
//            sortingExport.setThreeSortingSimple(readySortingData.getThreeSortingSimple());
//
//            TbSortingInfo tbSortingInfo = map.get(readySortingData.getThreeSortingSimple());
//            if (tbSortingInfo != null) {
//                successNum++;
//                sortingExport.setMarking(tbSortingInfo.getMarking());
//                sortingExport.setDistribuCenter(tbSortingInfo.getDistribuCenter());
//                sortingExport.setDlvName(tbSortingInfo.getDlvName());
//                sortingExport.setAreaNum(tbSortingInfo.getAreaNum());
//
//                String orgNo = "";
//                if (tbSortingInfo.getOrgNum() != null) {
//                    orgNo = String.valueOf(tbSortingInfo.getOrgNum());
//                }
//                sortingExport.setOrgNum(orgNo);
//                sortingExport.setOrgName(tbSortingInfo.getOrgName());
//            }
//
//            exportDatas.add(sortingExport);
//        }
//        //如果余额不够，直接返回，不生成文件
//        Double cost = successNum * pcPrice;
////        Double cost = successNum * Double.valueOf(perMoney);
//        if (cost > totalSum) {
//            return new SysResult(0, "您的余额不够，请联系管理员充值");
//        }
//        //更新余额
//        Double remainingSum = totalSum - cost;
//        TbUserInfo tbUserInfo1 = new TbUserInfo();
//        tbUserInfo1.setId(tbUserInfo.getId());
//        tbUserInfo1.setRemainingSum(remainingSum);
//        userInfoMapper.updateRemainingSumByPrimaryKey(tbUserInfo1);
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
