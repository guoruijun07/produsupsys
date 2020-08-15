package com.ruoyi.service;

import com.alibaba.csb.sdk.HttpCallerException;

public interface SortingMatchingService {
    void sortingMatchingInfoByPc(String batchNo) throws HttpCallerException;
    PostWebPscSortingMatching sortingMatchingByApp(PostWebPscOrderOriginal postWebPscOrderOriginal) throws HttpCallerException;
}
