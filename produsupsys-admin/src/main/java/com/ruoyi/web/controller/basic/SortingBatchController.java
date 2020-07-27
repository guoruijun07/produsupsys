package com.ruoyi.web.controller.basic;

import com.ruoyi.common.bean.po.PostWebPscExport;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.mapper.PostWebPscExportMapper;
import com.ruoyi.system.domain.SysUser;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
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

//    @Autowired(required = false)
//    private TbExportInfoMapper tbExportInfoMapper;
//
//    @Autowired(required = false)
//    private TbUserInfoMapper userInfoMapper;
//
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
}
