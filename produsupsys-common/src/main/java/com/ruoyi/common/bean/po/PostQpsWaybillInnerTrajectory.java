package com.ruoyi.common.bean.po;

import java.util.Date;

public class PostQpsWaybillInnerTrajectory {
    /**
     *  id
     */
    private Integer id;

    /**
     *  trace_no
     */
    private String traceNo;

    /**
     *  post_date
     */
    private java.util.Date postDate;

    /**
     *  receive_place
     */
    private String receivePlace;

    /**
     *  biz_product_name
     */
    private String bizProductName;

    /**
     *  biz_product_no
     */
    private String bizProductNo;

    /**
     *  base_product_name
     */
    private String baseProductName;

    /**
     *  service
     */
    private String service;

    /**
     *  postage_paid
     */
    private String postagePaid;

    /**
     *  postage_standard
     */
    private String postageStandard;

    /**
     *  insurance_amount
     */
    private String insuranceAmount;

    /**
     *  insurance_premium_amo
     */
    private String insurancePremiumAmo;

    /**
     *  real_weight
     */
    private String realWeight;

    /**
     *  remarksender_no
     */
    private String remarksenderNo;

    /**
     *  sender
     */
    private String sender;

    /**
     *  sender_type
     */
    private String senderType;

    /**
     *  sender_tel
     */
    private String senderTel;

    /**
     *  receiver_linker
     */
    private String receiverLinker;

    /**
     *  receiver_mobile
     */
    private String receiverMobile;

    /**
     *  receiver_addr
     */
    private String receiverAddr;

    /**
     *  postal_code
     */
    private String postalCode;

    /**
     *  inner_name
     */
    private String innerName;

    /**
     *  returnn
     */
    private String returnn;

    /**
     *  return_code
     */
    private String returnCode;

    /**
     *  optime
     */
    private Date optime;

    /**
     *
     * @mbggenerated
     */
    public PostQpsWaybillInnerTrajectory(Integer id, String traceNo, java.util.Date postDate, String receivePlace, String bizProductName, String bizProductNo, String baseProductName, String service, String postagePaid, String postageStandard, String insuranceAmount, String insurancePremiumAmo, String realWeight, String remarksenderNo, String sender, String senderType, String senderTel, String receiverLinker, String receiverMobile, String receiverAddr, String postalCode, String innerName, String returnn, String returnCode, Date optime) {
        this.id = id;
        this.traceNo = traceNo;
        this.postDate = postDate;
        this.receivePlace = receivePlace;
        this.bizProductName = bizProductName;
        this.bizProductNo = bizProductNo;
        this.baseProductName = baseProductName;
        this.service = service;
        this.postagePaid = postagePaid;
        this.postageStandard = postageStandard;
        this.insuranceAmount = insuranceAmount;
        this.insurancePremiumAmo = insurancePremiumAmo;
        this.realWeight = realWeight;
        this.remarksenderNo = remarksenderNo;
        this.sender = sender;
        this.senderType = senderType;
        this.senderTel = senderTel;
        this.receiverLinker = receiverLinker;
        this.receiverMobile = receiverMobile;
        this.receiverAddr = receiverAddr;
        this.postalCode = postalCode;
        this.innerName = innerName;
        this.returnn = returnn;
        this.returnCode = returnCode;
        this.optime = optime;
    }

    /**
     *
     * @mbggenerated
     */
    public PostQpsWaybillInnerTrajectory() {
        super();
    }

    /**
     *

     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     *

     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *

     * @return trace_no
     */
    public String getTraceNo() {
        return traceNo;
    }

    /**
     *

     * @param traceNo
     */
    public void setTraceNo(String traceNo) {
        this.traceNo = traceNo == null ? null : traceNo.trim();
    }

    /**
     *

     * @return post_date
     */
    public Date getPostDate() {
        return postDate;
    }

    /**
     *

     * @param postDate
     */
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    /**
     *

     * @return receive_place
     */
    public String getReceivePlace() {
        return receivePlace;
    }

    /**
     *

     * @param receivePlace
     */
    public void setReceivePlace(String receivePlace) {
        this.receivePlace = receivePlace == null ? null : receivePlace.trim();
    }

    /**
     *

     * @return biz_product_name
     */
    public String getBizProductName() {
        return bizProductName;
    }

    /**
     *

     * @param bizProductName
     */
    public void setBizProductName(String bizProductName) {
        this.bizProductName = bizProductName == null ? null : bizProductName.trim();
    }

    /**
     *

     * @return biz_product_no
     */
    public String getBizProductNo() {
        return bizProductNo;
    }

    /**
     *

     * @param bizProductNo
     */
    public void setBizProductNo(String bizProductNo) {
        this.bizProductNo = bizProductNo == null ? null : bizProductNo.trim();
    }

    /**
     *

     * @return base_product_name
     */
    public String getBaseProductName() {
        return baseProductName;
    }

    /**
     *

     * @param baseProductName
     */
    public void setBaseProductName(String baseProductName) {
        this.baseProductName = baseProductName == null ? null : baseProductName.trim();
    }

    /**
     *

     * @return service
     */
    public String getService() {
        return service;
    }

    /**
     *

     * @param service
     */
    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }

    /**
     *

     * @return postage_paid
     */
    public String getPostagePaid() {
        return postagePaid;
    }

    /**
     *

     * @param postagePaid
     */
    public void setPostagePaid(String postagePaid) {
        this.postagePaid = postagePaid == null ? null : postagePaid.trim();
    }

    /**
     *

     * @return postage_standard
     */
    public String getPostageStandard() {
        return postageStandard;
    }

    /**
     *

     * @param postageStandard
     */
    public void setPostageStandard(String postageStandard) {
        this.postageStandard = postageStandard == null ? null : postageStandard.trim();
    }

    /**
     *

     * @return insurance_amount
     */
    public String getInsuranceAmount() {
        return insuranceAmount;
    }

    /**
     *

     * @param insuranceAmount
     */
    public void setInsuranceAmount(String insuranceAmount) {
        this.insuranceAmount = insuranceAmount == null ? null : insuranceAmount.trim();
    }

    /**
     *

     * @return insurance_premium_amo
     */
    public String getInsurancePremiumAmo() {
        return insurancePremiumAmo;
    }

    /**
     *

     * @param insurancePremiumAmo
     */
    public void setInsurancePremiumAmo(String insurancePremiumAmo) {
        this.insurancePremiumAmo = insurancePremiumAmo == null ? null : insurancePremiumAmo.trim();
    }

    /**
     *

     * @return real_weight
     */
    public String getRealWeight() {
        return realWeight;
    }

    /**
     *

     * @param realWeight
     */
    public void setRealWeight(String realWeight) {
        this.realWeight = realWeight == null ? null : realWeight.trim();
    }

    /**
     *

     * @return remarksender_no
     */
    public String getRemarksenderNo() {
        return remarksenderNo;
    }

    /**
     *

     * @param remarksenderNo
     */
    public void setRemarksenderNo(String remarksenderNo) {
        this.remarksenderNo = remarksenderNo == null ? null : remarksenderNo.trim();
    }

    /**
     *

     * @return sender
     */
    public String getSender() {
        return sender;
    }

    /**
     *

     * @param sender
     */
    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    /**
     *

     * @return sender_type
     */
    public String getSenderType() {
        return senderType;
    }

    /**
     *

     * @param senderType
     */
    public void setSenderType(String senderType) {
        this.senderType = senderType == null ? null : senderType.trim();
    }

    /**
     *

     * @return sender_tel
     */
    public String getSenderTel() {
        return senderTel;
    }

    /**
     *

     * @param senderTel
     */
    public void setSenderTel(String senderTel) {
        this.senderTel = senderTel == null ? null : senderTel.trim();
    }

    /**
     *

     * @return receiver_linker
     */
    public String getReceiverLinker() {
        return receiverLinker;
    }

    /**
     *

     * @param receiverLinker
     */
    public void setReceiverLinker(String receiverLinker) {
        this.receiverLinker = receiverLinker == null ? null : receiverLinker.trim();
    }

    /**
     *

     * @return receiver_mobile
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     *

     * @param receiverMobile
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    /**
     *

     * @return receiver_addr
     */
    public String getReceiverAddr() {
        return receiverAddr;
    }

    /**
     *

     * @param receiverAddr
     */
    public void setReceiverAddr(String receiverAddr) {
        this.receiverAddr = receiverAddr == null ? null : receiverAddr.trim();
    }

    /**
     *

     * @return postal_code
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     *

     * @param postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    /**
     *

     * @return inner_name
     */
    public String getInnerName() {
        return innerName;
    }

    /**
     *

     * @param innerName
     */
    public void setInnerName(String innerName) {
        this.innerName = innerName == null ? null : innerName.trim();
    }

    /**
     *

     * @return returnn
     */
    public String getReturnn() {
        return returnn;
    }

    /**
     *

     * @param returnn
     */
    public void setReturnn(String returnn) {
        this.returnn = returnn == null ? null : returnn.trim();
    }

    /**
     *

     * @return return_code
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     *

     * @param returnCode
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode == null ? null : returnCode.trim();
    }

    /**
     *

     * @return optime
     */
    public java.util.Date getOptime() {
        return optime;
    }

    /**
     *

     * @param optime
     */
    public void setOptime(Date optime) {
        this.optime = optime;
    }
}