package com.ruoyi.service;

import com.ruoyi.common.bean.po.PostWebQpsDetailTrajectoryOutside;

import java.util.List;

/**
 * @author GuoRJ
 * @date 2020/8/14 16:31
 */
public interface QueryTrackInfoService {

    List<PostWebQpsDetailTrajectoryOutside> queryTrackInfo(String mailNo);
}
