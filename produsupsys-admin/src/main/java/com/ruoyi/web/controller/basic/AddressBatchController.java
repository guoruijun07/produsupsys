package com.ruoyi.web.controller.basic;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/address")
public class AddressBatchController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(AddressBatchController.class);
//    @Value("${currentVersion}")
//    private String currentVersion;
//
//    @Value("${baseDir}")
//    private String baseDir;
//
//    @Autowired(required = false)
//    private TbUserInfoMapper tbUserInfoMapper;
//
//    @Autowired(required = false)
//    private TbPriceInfoMapper tbPriceInfoMapper;
//
//    @Autowired(required = false)
//    private TbOrderOriginalInfoMapper tbOrderOriginalInfoMapper;
//
//    @Autowired(required = false)
//    private TbSortingMatchingInfoMapper tbSortingMatchingInfoMapper;
//
//    @Autowired(required = false)
//    private TbOrderBatchInfoMapper tbOrderBatchInfoMapper;
//
//    @Autowired(required = false)
//    private SortingMatchingService sortingMatchingService;

    private  String dirPath = "/home/code"+ File.separator + "exportSorting" + File.separator;

    Random random=new Random();

    private String prefix = "sorting/";

    @RequiresPermissions("sorting:view")
    @GetMapping()
    public String dept()
    {
        return prefix + "/addresssortinglist";
    }

    @RequiresPermissions("sorting:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysUser user)
    {
        startPage();

        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();

//        TbUserInfo tbUserInfo= (TbUserInfo) session.getAttribute(Constants.SESSION_KEY);
//        tbUserInfo = tbUserInfoMapper.selectByPrimaryKey(tbUserInfo.getId());
//        session.setAttribute("remainingSum",tbUserInfo.getRemainingSum());
//        System.out.println("当前页为："+pageNum);
//        pageNum = pageNum==null?1:pageNum;
//        PageHelper.startPage(pageNum,10,"create_time desc");
//        List<TbOrderBatchInfo> tbOrderBatchInfos = tbOrderBatchInfoMapper.selectByUserId(tbUserInfo.getId());
//        PageInfo<TbOrderBatchInfo> page = new PageInfo<>(tbOrderBatchInfos);
//        System.out.println("总记录条数为："+page.getTotal());
//        model.addAttribute("page",page);

        List<SysUser> list = new ArrayList<>();
        return getDataTable(list);
    }
}
