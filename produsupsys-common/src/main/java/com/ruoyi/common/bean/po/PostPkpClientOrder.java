package com.ruoyi.common.bean.po;

import java.math.BigDecimal;
import java.util.Date;

public class PostPkpClientOrder {
    /**
     * id
     */
    private Long id;

    /**
     * 付费情况 0未付费 1付费 is_fee
     */
    private String isFee;
    /**
     * 下单日期 order_date
     */
    private Date orderDate;

    /**
     * 收寄日期 send_date
     */
    private Date sendDate;

    /**
     * 快递公司 company
     */
    private String company;

    /**
     * 快递单号 mail_no
     */
    private String mailNo;

    /**
     * 收费 fee
     */
    private String fee;

    /**
     * 商品名称 inner_name
     */
    private String innerName;

    /**
     * 数量 count
     */
    private Integer count;

    /**
     * reciver_name
     */
    private String reciverName;

    /**
     * reciver_mobile_one
     */
    private String reciverMobileOne;

    /**
     * reciver_province
     */
    private String reciverProvince;

    /**
     * reciver_city
     */
    private String reciverCity;

    /**
     * reciver_county
     */
    private String reciverCounty;

    /**
     * reciver_address
     */
    private String reciverAddress;

    /**
     * sender_name
     */
    private String senderName;

    /**
     * sender_mobile_one
     */
    private String senderMobileOne;

    /**
     * 下单平台 order_channel
     */
    private String orderChannel;

    /**
     * order_no
     */
    private String orderNo;

    /**
     * weight
     */
    private String weight;

    /**
     * 实际运费 real_fee
     */
    private String realFee;

    /**
     * 包装 package_fee
     */
    private String packageFee;

    /**
     * 合计费用 total_fee
     */
    private String totalFee;

    /**
     * 利润 profit
     */
    private String profit;

    /**
     * 利润率 profit_rate
     */
    private BigDecimal profitRate;

    /**
     * @mbggenerated
     */
    public PostPkpClientOrder(Long id, String isFee, java.util.Date orderDate, java.util.Date sendDate, String company, String mailNo, String fee, String innerName, Integer count, String reciverName, String reciverMobileOne, String reciverProvince, String reciverCity, String reciverCounty, String reciverAddress, String senderName, String senderMobileOne, String orderChannel, String orderNo, String weight, String realFee, String packageFee, String totalFee, String profit, java.math.BigDecimal profitRate) {
        this.id = id;
        this.isFee = isFee;
        this.orderDate = orderDate;
        this.sendDate = sendDate;
        this.company = company;
        this.mailNo = mailNo;
        this.fee = fee;
        this.innerName = innerName;
        this.count = count;
        this.reciverName = reciverName;
        this.reciverMobileOne = reciverMobileOne;
        this.reciverProvince = reciverProvince;
        this.reciverCity = reciverCity;
        this.reciverCounty = reciverCounty;
        this.reciverAddress = reciverAddress;
        this.senderName = senderName;
        this.senderMobileOne = senderMobileOne;
        this.orderChannel = orderChannel;
        this.orderNo = orderNo;
        this.weight = weight;
        this.realFee = realFee;
        this.packageFee = packageFee;
        this.totalFee = totalFee;
        this.profit = profit;
        this.profitRate = profitRate;
    }

    /**
     * @mbggenerated
     */
    public PostPkpClientOrder() {
        super();
    }

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 付费情况 0未付费 1付费
     *
     * @return is_fee 付费情况 0未付费 1付费
     */
    public String getIsFee() {
        return isFee;
    }

    /**
     * 付费情况 0未付费 1付费
     *
     * @param isFee 付费情况 0未付费 1付费
     */
    public void setIsFee(String isFee) {
        this.isFee = isFee == null ? null : isFee.trim();
    }

    /**
     * 下单日期
     *
     * @return order_date 下单日期
     */
    public java.util.Date getOrderDate() {
        return orderDate;
    }

    /**
     * 下单日期
     *
     * @param orderDate 下单日期
     */
    public void setOrderDate(java.util.Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * 收寄日期
     *
     * @return send_date 收寄日期
     */
    public java.util.Date getSendDate() {
        return sendDate;
    }

    /**
     * 收寄日期
     *
     * @param sendDate 收寄日期
     */
    public void setSendDate(java.util.Date sendDate) {
        this.sendDate = sendDate;
    }

    /**
     * 快递公司
     *
     * @return company 快递公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 快递公司
     *
     * @param company 快递公司
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * 快递单号
     *
     * @return mail_no 快递单号
     */
    public String getMailNo() {
        return mailNo;
    }

    /**
     * 快递单号
     *
     * @param mailNo 快递单号
     */
    public void setMailNo(String mailNo) {
        this.mailNo = mailNo == null ? null : mailNo.trim();
    }

    /**
     * 收费
     *
     * @return fee 收费
     */
    public String getFee() {
        return fee;
    }

    /**
     * 收费
     *
     * @param fee 收费
     */
    public void setFee(String fee) {
        this.fee = fee == null ? null : fee.trim();
    }

    /**
     * 商品名称
     *
     * @return inner_name 商品名称
     */
    public String getInnerName() {
        return innerName;
    }

    /**
     * 商品名称
     *
     * @param innerName 商品名称
     */
    public void setInnerName(String innerName) {
        this.innerName = innerName == null ? null : innerName.trim();
    }

    /**
     * 数量
     *
     * @return count 数量
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 数量
     *
     * @param count 数量
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * @return reciver_name
     */
    public String getReciverName() {
        return reciverName;
    }

    /**
     * @param reciverName
     */
    public void setReciverName(String reciverName) {
        this.reciverName = reciverName == null ? null : reciverName.trim();
    }

    /**
     * @return reciver_mobile_one
     */
    public String getReciverMobileOne() {
        return reciverMobileOne;
    }

    /**
     * @param reciverMobileOne
     */
    public void setReciverMobileOne(String reciverMobileOne) {
        this.reciverMobileOne = reciverMobileOne == null ? null : reciverMobileOne.trim();
    }

    /**
     * @return reciver_province
     */
    public String getReciverProvince() {
        return reciverProvince;
    }

    /**
     * @param reciverProvince
     */
    public void setReciverProvince(String reciverProvince) {
        this.reciverProvince = reciverProvince == null ? null : reciverProvince.trim();
    }

    /**
     * @return reciver_city
     */
    public String getReciverCity() {
        return reciverCity;
    }

    /**
     * @param reciverCity
     */
    public void setReciverCity(String reciverCity) {
        this.reciverCity = reciverCity == null ? null : reciverCity.trim();
    }

    /**
     * @return reciver_county
     */
    public String getReciverCounty() {
        return reciverCounty;
    }

    /**
     * @param reciverCounty
     */
    public void setReciverCounty(String reciverCounty) {
        this.reciverCounty = reciverCounty == null ? null : reciverCounty.trim();
    }

    /**
     * @return reciver_address
     */
    public String getReciverAddress() {
        return reciverAddress;
    }

    /**
     * @param reciverAddress
     */
    public void setReciverAddress(String reciverAddress) {
        this.reciverAddress = reciverAddress == null ? null : reciverAddress.trim();
    }

    /**
     * @return sender_name
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * @param senderName
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName == null ? null : senderName.trim();
    }

    /**
     * @return sender_mobile_one
     */
    public String getSenderMobileOne() {
        return senderMobileOne;
    }

    /**
     * @param senderMobileOne
     */
    public void setSenderMobileOne(String senderMobileOne) {
        this.senderMobileOne = senderMobileOne == null ? null : senderMobileOne.trim();
    }

    /**
     * 下单平台
     *
     * @return order_channel 下单平台
     */
    public String getOrderChannel() {
        return orderChannel;
    }

    /**
     * 下单平台
     *
     * @param orderChannel 下单平台
     */
    public void setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel == null ? null : orderChannel.trim();
    }

    /**
     * @return order_no
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * @return weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    /**
     * 实际运费
     *
     * @return real_fee 实际运费
     */
    public String getRealFee() {
        return realFee;
    }

    /**
     * 实际运费
     *
     * @param realFee 实际运费
     */
    public void setRealFee(String realFee) {
        this.realFee = realFee == null ? null : realFee.trim();
    }

    /**
     * 包装
     *
     * @return package_fee 包装
     */
    public String getPackageFee() {
        return packageFee;
    }

    /**
     * 包装
     *
     * @param packageFee 包装
     */
    public void setPackageFee(String packageFee) {
        this.packageFee = packageFee == null ? null : packageFee.trim();
    }

    /**
     * 合计费用
     *
     * @return total_fee 合计费用
     */
    public String getTotalFee() {
        return totalFee;
    }

    /**
     * 合计费用
     *
     * @param totalFee 合计费用
     */
    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee == null ? null : totalFee.trim();
    }

    /**
     * 利润
     *
     * @return profit 利润
     */
    public String getProfit() {
        return profit;
    }

    /**
     * 利润
     *
     * @param profit 利润
     */
    public void setProfit(String profit) {
        this.profit = profit == null ? null : profit.trim();
    }

    /**
     * 利润率
     *
     * @return profit_rate 利润率
     */
    public java.math.BigDecimal getProfitRate() {
        return profitRate;
    }

    /**
     * 利润率
     *
     * @param profitRate 利润率
     */
    public void setProfitRate(java.math.BigDecimal profitRate) {
        this.profitRate = profitRate;
    }
}