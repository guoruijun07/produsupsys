package com.ruoyi.service;

import com.alibaba.csb.sdk.HttpCallerException;
import com.ruoyi.common.bean.po.PostPscAddressMatchingResult;
import com.ruoyi.common.bean.po.PostPscAddressOriginal;

public interface SortingMatchingService {

    void sortingMatchingInfoByPc(String batchNo) throws HttpCallerException;
    PostPscAddressMatchingResult sortingMatchingByApp(PostPscAddressOriginal tbOrderOriginalInfo) throws HttpCallerException;
}
