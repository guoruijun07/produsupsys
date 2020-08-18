package com.ruoyi.service.impl;

import com.alibaba.csb.sdk.HttpCaller;
import com.alibaba.csb.sdk.HttpCallerException;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.bean.bo.Address;
import com.ruoyi.common.bean.bo.SingleRouteInfoRequest;
import com.ruoyi.common.bean.po.PostPscAddressMatchingResult;
import com.ruoyi.common.bean.po.PostPscAddressOriginal;
import com.ruoyi.common.bean.po.PostPscBaseSorting;
import com.ruoyi.common.mapper.PostPscAddressMatchingResultMapper;
import com.ruoyi.common.mapper.PostPscAddressOriginalMapper;
import com.ruoyi.common.mapper.PostPscBaseSortingMapper;
import com.ruoyi.service.SortingMatchingService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author GuoRJ
 * @date 2020/7/4 13:35
 */
/*四级分拣码 通过CSB调用*/
@Service
public class SortingMatchingServiceImpl implements SortingMatchingService {

    private static final Logger logger = LoggerFactory.getLogger(SortingMatchingService.class);

    @Autowired(required = false)
    private PostPscAddressOriginalMapper postPscAddressOriginalMapper;
    @Autowired(required = false)
    private PostPscAddressMatchingResultMapper postPscAddressMatchingResultMapper;
    @Autowired(required = false)
    private PostPscBaseSortingMapper postPscBaseSortingMapper;

    @Override
    public void sortingMatchingInfoByPc(String batchNo) throws HttpCallerException {
        //batchNo="1";
        final List<PostPscAddressOriginal> postPscAddressOriginalList = postPscAddressOriginalMapper.selectByBatchNo(batchNo);
        final List<PostPscAddressMatchingResult> postPscAddressMatchingResults = postPscAddressMatchingResultMapper.selectByBatch(batchNo);
        logger.info("查询完毕");
        if (postPscAddressMatchingResults == null || postPscAddressMatchingResults.size() == 0) {
            //新增操作
            postPscAddressMatchingResultMapper.batchInsert(postPscAddressOriginalList);
        } else {
            //修改操作
        }

        List<SingleRouteInfoRequest> logisticsInterfaces = new ArrayList<>();
        List<PostPscAddressMatchingResult> sortingMatchingInfos = new ArrayList<>();
        List<PostPscAddressOriginal> orderOriginalInfos = new ArrayList<>();

        for (PostPscAddressOriginal postPscAddressOriginal : postPscAddressOriginalList) {
            SingleRouteInfoRequest singleRouteInfoRequest = new SingleRouteInfoRequest();
            Address senderAddress = new Address();
            Address receiverAddress = new Address();
            singleRouteInfoRequest.setObjectId(parseString(postPscAddressOriginal.getOrderNo()));
            senderAddress.setTown(null);
            senderAddress.setCity(postPscAddressOriginal.getSenderCity());
            senderAddress.setArea(postPscAddressOriginal.getSenderCounty());
            senderAddress.setDetail(postPscAddressOriginal.getSenderAddress());
            senderAddress.setProvince(postPscAddressOriginal.getSenderProvince());
            senderAddress.setZip(null);
            singleRouteInfoRequest.setSenderAddress(senderAddress);
            receiverAddress.setTown(null);
            receiverAddress.setCity(postPscAddressOriginal.getReciverCity());
            receiverAddress.setArea(postPscAddressOriginal.getReciverCounty());
            receiverAddress.setDetail(postPscAddressOriginal.getReciverAddress());
            receiverAddress.setProvince(postPscAddressOriginal.getReciverProvince());
            receiverAddress.setZip(null);
            singleRouteInfoRequest.setReceiverAddress(receiverAddress);
            logisticsInterfaces.add(singleRouteInfoRequest);
        }

        getMatchingData(logisticsInterfaces, sortingMatchingInfos, orderOriginalInfos);

//        for (TbSortingMatchingInfo sortingMatchingInfo : sortingMatchingInfos) {
//            postPscAddressMatchingResultMapper.updateByOrderNo(sortingMatchingInfo);
//        }
//        for (TbOrderOriginalInfo orderOriginalInfo : orderOriginalInfos) {
//            postPscAddressOriginalMapper.updateByOrderNo(orderOriginalInfo);
//        }
        if (sortingMatchingInfos.size() > 0) {
            postPscAddressMatchingResultMapper.batchUpdateByOrderNo(sortingMatchingInfos);
            postPscAddressOriginalMapper.batchUpdateByOrderNo(orderOriginalInfos);
        }

    }

    @Override
    public PostPscAddressMatchingResult sortingMatchingByApp(PostPscAddressOriginal tbOrderOriginalInfo) throws HttpCallerException {

        List<SingleRouteInfoRequest> logisticsInterfaces = new ArrayList<>();
        List<PostPscAddressMatchingResult> sortingMatchingInfos = new ArrayList<>();
        List<PostPscAddressOriginal> orderOriginalInfos = new ArrayList<>();

        SingleRouteInfoRequest singleRouteInfoRequest = new SingleRouteInfoRequest();

        Address senderAddress = new Address();
        Address receiverAddress = new Address();
        singleRouteInfoRequest.setObjectId(parseString(tbOrderOriginalInfo.getOrderNo()));
        senderAddress.setTown(null);
        senderAddress.setCity(tbOrderOriginalInfo.getSenderCity());
        senderAddress.setArea(tbOrderOriginalInfo.getSenderCounty());
        senderAddress.setDetail(tbOrderOriginalInfo.getSenderAddress());
        senderAddress.setProvince(tbOrderOriginalInfo.getSenderProvince());
        senderAddress.setZip(null);
        singleRouteInfoRequest.setSenderAddress(senderAddress);
        receiverAddress.setTown(null);
        receiverAddress.setCity(tbOrderOriginalInfo.getReciverCity());
        receiverAddress.setArea(tbOrderOriginalInfo.getReciverCounty());
        receiverAddress.setDetail(tbOrderOriginalInfo.getReciverAddress());
        receiverAddress.setProvince(tbOrderOriginalInfo.getReciverProvince());
        receiverAddress.setZip(null);
        singleRouteInfoRequest.setReceiverAddress(receiverAddress);
        logisticsInterfaces.add(singleRouteInfoRequest);

        getMatchingData(logisticsInterfaces, sortingMatchingInfos, orderOriginalInfos);
        return sortingMatchingInfos.get(0);
    }

    private void getMatchingData(List<SingleRouteInfoRequest> logisticsInterface, List<PostPscAddressMatchingResult> sortingMatchingInfos, List<PostPscAddressOriginal> orderOriginalInfos) throws HttpCallerException {

        //获取基础信息
        List<PostPscBaseSorting> tbSortingBaseInfos = postPscBaseSortingMapper.selectAllData();
        Map<String, PostPscBaseSorting> mapBasesSortingInfos = new HashMap<>();
        for (PostPscBaseSorting postPscBaseSorting : tbSortingBaseInfos) {
            mapBasesSortingInfos.put(postPscBaseSorting.getSortingName(), postPscBaseSorting);
        }

        Map<String, String> params = new HashMap<String, String>();
        params.put("logisticsInterface", JSON.toJSONString(logisticsInterface));
        params.put("dataDigest", "bb");
        params.put("wpCode", "DNMN-EMS");

        String requestURL = "https://211.156.195.14:443/csb_jidi1_1";
        String API_NAME = "routInfoQueryForPDD"; // CSB发布服务定义的服务名
        String version = "1.0.0";
        String ak = "111fdaf33ba14163b504fdfd4984b0fa";//
        String sk = "j3oGVJx9lq/wS2Eey+rasNwkrFs="; // 用户安全校验的签名密钥对

        String result = HttpCaller.doPost(requestURL, API_NAME, version, params, ak, sk);

        if (result != null) {
            logger.info("四级分拣码匹配成功，result：" + result);
            Map<String, Object> mapPc = JSONObject.parseObject(result);
            Map<String, Object> body = (Map<String, Object>) mapPc.get("body");
            if ("true".equals(body.get("success"))) {
                List<Map<String, Object>> list = (List<Map<String, Object>>) body.get("result");
                for (Map<String, Object> resultMap : list) {
                    if ("true".equals(resultMap.get("success"))) {
                        if (!"".equals(parseString(resultMap.get("objectId")))) {

                            PostPscAddressMatchingResult tbSortingMatchingInfo = new PostPscAddressMatchingResult();
                            tbSortingMatchingInfo.setOrderNo(parseString(resultMap.get("objectId")));

                            tbSortingMatchingInfo.setSortingStatus(1);
                            tbSortingMatchingInfo.setDatoubi(parseString(resultMap.get("datoubi")));
                            tbSortingMatchingInfo.setDatoubiCode(parseString(resultMap.get("datoubiCode")));
                            //四级分拣码，得到分拣码
                            String levelFourSortingName = parseString(resultMap.get("routeCode"));
                            if (StringUtils.isNotBlank(levelFourSortingName)) {

                                String substringTmp = levelFourSortingName.substring(0, levelFourSortingName.lastIndexOf("-"));

                                String sortingName = substringTmp.substring(substringTmp.lastIndexOf("-") + 1);

//                                String[] split = levelFourSortingName.split("-");
//                                if (split.length > 3) {
//                                    String sortingName = split[3];
                                tbSortingMatchingInfo.setSortingName(sortingName);
                                PostPscBaseSorting tbSortingInfo = mapBasesSortingInfos.get(sortingName);
                                if (tbSortingInfo != null) {
                                    tbSortingMatchingInfo.setDistribuCenter(tbSortingInfo.getDistribuCenter());
                                    tbSortingMatchingInfo.setMarking(tbSortingInfo.getMarking());
                                    tbSortingMatchingInfo.setOrgNo(tbSortingInfo.getOrgNo());
                                    tbSortingMatchingInfo.setOrgName(tbSortingInfo.getOrgName());
                                    tbSortingMatchingInfo.setDlvName(tbSortingInfo.getDlvName());
                                    tbSortingMatchingInfo.setDlvNo(tbSortingInfo.getAreaNum());
                                }
//                                }
                            }
                            tbSortingMatchingInfo.setLevelFourSortingName(levelFourSortingName);
                            if (resultMap.get("consolidationList") != null) {
                                List<Map<String, Object>> conList = (List<Map<String, Object>>) resultMap.get("consolidationList");
                                if (conList != null && conList.size() > 0) {
                                    tbSortingMatchingInfo.setConsolidationCode(parseString(conList.get(0).get("code")));
                                    tbSortingMatchingInfo.setConsolidationName(parseString(conList.get(0).get("name")));
                                }
                            }

//									postPscAddressMatchingResultMapper.updateByOrderNo(tbSortingMatchingInfo);
                            PostPscAddressOriginal updateOrderOriginalInfo = new PostPscAddressOriginal();
                            updateOrderOriginalInfo.setOrderNo(parseString(resultMap.get("objectId")));
                            updateOrderOriginalInfo.setSortingStatus(1);
                            updateOrderOriginalInfo.setModifyTime(new Date());
//									postPscAddressOriginalMapper.updateByOrderNo(updateOrderOriginalInfo);

                            sortingMatchingInfos.add(tbSortingMatchingInfo);
                            orderOriginalInfos.add(updateOrderOriginalInfo);
                        }
                    }

                }

            } else {
                logger.info("errorCode:" + body.get("errorCode"));
                logger.info("errorMsg:" + body.get("errorMsg"));

            }
        } else {
            logger.info("没有任何数据。");
        }
    }


    public String parseString(Object obj) {
        if (obj == null) {
            return "";
        } else {
            return obj.toString();
        }
    }

}
