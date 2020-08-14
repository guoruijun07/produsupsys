package com.ruoyi.service;

import com.alibaba.csb.sdk.HttpCallerException;
import com.ruoyi.common.bean.po.PostWebPscOrderOriginal;
import com.ruoyi.common.bean.po.PostWebPscSortingMatching;

public interface SortingMatchingService {
    void sortingMatchingInfoByPc(String batchNo) throws HttpCallerException;
    PostWebPscSortingMatching sortingMatchingByApp(PostWebPscOrderOriginal postWebPscOrderOriginal) throws HttpCallerException;
}
