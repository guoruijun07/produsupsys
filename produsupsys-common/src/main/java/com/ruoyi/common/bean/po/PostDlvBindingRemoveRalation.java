package com.ruoyi.common.bean.po;

import  java.util.Date;

public class PostDlvBindingRemoveRalation {
    /**
     * id id
     */
    private Integer id;

    /**
     * 合作伙伴编号 unitID
     */
    private Long unitid;

    /**
     * 收件人真实号码,对应AXB业务中的号码A prtms
     */
    private String prtms;

    /**
     * 收件人安全号码,对应AXB业务中的号码X smbms
     */
    private String smbms;

    /**
     * 快递员其他号码，对应AXB业务中的号码B otherms
     */
    private String otherms;

    /**
     * 订购时间 subts
     */
    private Date subts;

    /**
     * 解绑时间 dissubts
     */
    private Date dissubts;

    /**
     * 来话控制
 0：AXB不做来话控制，即允许A和B以及其他号码拨打X
 1：AXB做来话控制，只允许A和B打X callrestrict
     */
    private String callrestrict;

    /**
     * 来显控制默认传入0,0，有传入1,1 calldisplay
     */
    private String calldisplay;

    /**
     * 录音控制
 0：不录音
 1：录音 callrecording
     */
    private String callrecording;

    /**
     * 号码有效期，以天为单位
 如调用本接口时时间为：2017-01-01 10:32:03， validitytime=5，则此安全号在2017-01-06 10:32:03失效；
 或者填写具体时间，例如validitytime=2018-01-01 01:00:00 validitytime
     */
    private java.util.Date validitytime;

    /**
     * 合作伙伴对本安全号码的自定义编号，如快递单号，客户编号 uuidinpartner
     */
    private String uuidinpartner;

    /**
     * 标识用户类型，1为收件人，2为发件人 usertype
     */
    private String usertype;

    /**
     * 解绑真实号码,对应AXB业务中的号码A regphone
     */
    private String regphone;

    /**
     * 绑定状态，1绑定。0解绑 status
     */
    private String status;

    /**
     * 数据来源: 0:根据菜单查询 :1WEB，2APP，3接口 source
     */
    private Integer source;

    /**
     * 菜单: 0:根据数据设备查询 1:匹配查询，2:地址查询，3:面单打印 menu
     */
    private Integer menu;

    /**
     * 用户ID userid
     */
    private Integer userid;

    /**
     * 用户姓名 username
     */
    private String username;

    /**
     * 创建时间 create_time
     */
    private java.util.Date createTime;

    /**
     * 更新时间 modify_time
     */
    private java.util.Date modifyTime;

    /**
     *
     * @mbggenerated
     */
    public PostDlvBindingRemoveRalation(Integer id, Long unitid, String prtms, String smbms, String otherms, java.util.Date subts, java.util.Date dissubts, String callrestrict, String calldisplay, String callrecording, java.util.Date validitytime, String uuidinpartner, String usertype, String regphone, String status, Integer source, Integer menu, Integer userid, String username, java.util.Date createTime, java.util.Date modifyTime) {
        this.id = id;
        this.unitid = unitid;
        this.prtms = prtms;
        this.smbms = smbms;
        this.otherms = otherms;
        this.subts = subts;
        this.dissubts = dissubts;
        this.callrestrict = callrestrict;
        this.calldisplay = calldisplay;
        this.callrecording = callrecording;
        this.validitytime = validitytime;
        this.uuidinpartner = uuidinpartner;
        this.usertype = usertype;
        this.regphone = regphone;
        this.status = status;
        this.source = source;
        this.menu = menu;
        this.userid = userid;
        this.username = username;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     *
     * @mbggenerated
     */
    public PostDlvBindingRemoveRalation() {
        super();
    }

    /**
     * id

     * @return id id
     */
    public Integer getId() {
        return id;
    }

    /**
     * id

     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 合作伙伴编号

     * @return unitID 合作伙伴编号
     */
    public Long getUnitid() {
        return unitid;
    }

    /**
     * 合作伙伴编号

     * @param unitid 合作伙伴编号
     */
    public void setUnitid(Long unitid) {
        this.unitid = unitid;
    }

    /**
     * 收件人真实号码,对应AXB业务中的号码A

     * @return prtms 收件人真实号码,对应AXB业务中的号码A
     */
    public String getPrtms() {
        return prtms;
    }

    /**
     * 收件人真实号码,对应AXB业务中的号码A

     * @param prtms 收件人真实号码,对应AXB业务中的号码A
     */
    public void setPrtms(String prtms) {
        this.prtms = prtms == null ? null : prtms.trim();
    }

    /**
     * 收件人安全号码,对应AXB业务中的号码X

     * @return smbms 收件人安全号码,对应AXB业务中的号码X
     */
    public String getSmbms() {
        return smbms;
    }

    /**
     * 收件人安全号码,对应AXB业务中的号码X

     * @param smbms 收件人安全号码,对应AXB业务中的号码X
     */
    public void setSmbms(String smbms) {
        this.smbms = smbms == null ? null : smbms.trim();
    }

    /**
     * 快递员其他号码，对应AXB业务中的号码B

     * @return otherms 快递员其他号码，对应AXB业务中的号码B
     */
    public String getOtherms() {
        return otherms;
    }

    /**
     * 快递员其他号码，对应AXB业务中的号码B

     * @param otherms 快递员其他号码，对应AXB业务中的号码B
     */
    public void setOtherms(String otherms) {
        this.otherms = otherms == null ? null : otherms.trim();
    }

    /**
     * 订购时间

     * @return subts 订购时间
     */
    public Date getSubts() {
        return subts;
    }

    /**
     * 订购时间

     * @param subts 订购时间
     */
    public void setSubts(Date subts) {
        this.subts = subts;
    }

    /**
     * 解绑时间

     * @return dissubts 解绑时间
     */
    public Date getDissubts() {
        return dissubts;
    }

    /**
     * 解绑时间

     * @param dissubts 解绑时间
     */
    public void setDissubts(Date dissubts) {
        this.dissubts = dissubts;
    }

    /**
     * 来话控制
 0：AXB不做来话控制，即允许A和B以及其他号码拨打X
 1：AXB做来话控制，只允许A和B打X

     * @return callrestrict 来话控制
 0：AXB不做来话控制，即允许A和B以及其他号码拨打X
 1：AXB做来话控制，只允许A和B打X
     */
    public String getCallrestrict() {
        return callrestrict;
    }

    /**
     * 来话控制
 0：AXB不做来话控制，即允许A和B以及其他号码拨打X
 1：AXB做来话控制，只允许A和B打X

     * @param callrestrict 来话控制
 0：AXB不做来话控制，即允许A和B以及其他号码拨打X
 1：AXB做来话控制，只允许A和B打X
     */
    public void setCallrestrict(String callrestrict) {
        this.callrestrict = callrestrict == null ? null : callrestrict.trim();
    }

    /**
     * 来显控制默认传入0,0，有传入1,1

     * @return calldisplay 来显控制默认传入0,0，有传入1,1
     */
    public String getCalldisplay() {
        return calldisplay;
    }

    /**
     * 来显控制默认传入0,0，有传入1,1

     * @param calldisplay 来显控制默认传入0,0，有传入1,1
     */
    public void setCalldisplay(String calldisplay) {
        this.calldisplay = calldisplay == null ? null : calldisplay.trim();
    }

    /**
     * 录音控制
 0：不录音
 1：录音

     * @return callrecording 录音控制
 0：不录音
 1：录音
     */
    public String getCallrecording() {
        return callrecording;
    }

    /**
     * 录音控制
 0：不录音
 1：录音

     * @param callrecording 录音控制
 0：不录音
 1：录音
     */
    public void setCallrecording(String callrecording) {
        this.callrecording = callrecording == null ? null : callrecording.trim();
    }

    /**
     * 号码有效期，以天为单位
 如调用本接口时时间为：2017-01-01 10:32:03， validitytime=5，则此安全号在2017-01-06 10:32:03失效；
 或者填写具体时间，例如validitytime=2018-01-01 01:00:00

     * @return validitytime 号码有效期，以天为单位
 如调用本接口时时间为：2017-01-01 10:32:03， validitytime=5，则此安全号在2017-01-06 10:32:03失效；
 或者填写具体时间，例如validitytime=2018-01-01 01:00:00
     */
    public Date getValiditytime() {
        return validitytime;
    }

    /**
     * 号码有效期，以天为单位
 如调用本接口时时间为：2017-01-01 10:32:03， validitytime=5，则此安全号在2017-01-06 10:32:03失效；
 或者填写具体时间，例如validitytime=2018-01-01 01:00:00

     * @param validitytime 号码有效期，以天为单位
 如调用本接口时时间为：2017-01-01 10:32:03， validitytime=5，则此安全号在2017-01-06 10:32:03失效；
 或者填写具体时间，例如validitytime=2018-01-01 01:00:00
     */
    public void setValiditytime(Date validitytime) {
        this.validitytime = validitytime;
    }

    /**
     * 合作伙伴对本安全号码的自定义编号，如快递单号，客户编号

     * @return uuidinpartner 合作伙伴对本安全号码的自定义编号，如快递单号，客户编号
     */
    public String getUuidinpartner() {
        return uuidinpartner;
    }

    /**
     * 合作伙伴对本安全号码的自定义编号，如快递单号，客户编号

     * @param uuidinpartner 合作伙伴对本安全号码的自定义编号，如快递单号，客户编号
     */
    public void setUuidinpartner(String uuidinpartner) {
        this.uuidinpartner = uuidinpartner == null ? null : uuidinpartner.trim();
    }

    /**
     * 标识用户类型，1为收件人，2为发件人

     * @return usertype 标识用户类型，1为收件人，2为发件人
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * 标识用户类型，1为收件人，2为发件人

     * @param usertype 标识用户类型，1为收件人，2为发件人
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    /**
     * 解绑真实号码,对应AXB业务中的号码A

     * @return regphone 解绑真实号码,对应AXB业务中的号码A
     */
    public String getRegphone() {
        return regphone;
    }

    /**
     * 解绑真实号码,对应AXB业务中的号码A

     * @param regphone 解绑真实号码,对应AXB业务中的号码A
     */
    public void setRegphone(String regphone) {
        this.regphone = regphone == null ? null : regphone.trim();
    }

    /**
     * 绑定状态，1绑定。0解绑

     * @return status 绑定状态，1绑定。0解绑
     */
    public String getStatus() {
        return status;
    }

    /**
     * 绑定状态，1绑定。0解绑

     * @param status 绑定状态，1绑定。0解绑
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 数据来源: 0:根据菜单查询 :1WEB，2APP，3接口

     * @return source 数据来源: 0:根据菜单查询 :1WEB，2APP，3接口
     */
    public Integer getSource() {
        return source;
    }

    /**
     * 数据来源: 0:根据菜单查询 :1WEB，2APP，3接口

     * @param source 数据来源: 0:根据菜单查询 :1WEB，2APP，3接口
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * 菜单: 0:根据数据设备查询 1:匹配查询，2:地址查询，3:面单打印

     * @return menu 菜单: 0:根据数据设备查询 1:匹配查询，2:地址查询，3:面单打印
     */
    public Integer getMenu() {
        return menu;
    }

    /**
     * 菜单: 0:根据数据设备查询 1:匹配查询，2:地址查询，3:面单打印

     * @param menu 菜单: 0:根据数据设备查询 1:匹配查询，2:地址查询，3:面单打印
     */
    public void setMenu(Integer menu) {
        this.menu = menu;
    }

    /**
     * 用户ID

     * @return userid 用户ID
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 用户ID

     * @param userid 用户ID
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 用户姓名

     * @return username 用户姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户姓名

     * @param username 用户姓名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 创建时间

     * @return create_time 创建时间
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间

     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间

     * @return modify_time 更新时间
     */
    public java.util.Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 更新时间

     * @param modifyTime 更新时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}