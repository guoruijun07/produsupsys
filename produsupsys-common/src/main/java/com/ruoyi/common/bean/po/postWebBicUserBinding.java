package com.ruoyi.common.bean.po;

public class postWebBicUserBinding {
    /**
     *  id
     */
    private Integer id;

    /**
     * 用户id userid
     */
    private Integer userid;

    /**
     * 合作伙伴编号 unitID
     */
    private Integer unitid;

    /**
     * 默认绑定时间向后推迟48小时，如有配置取配置值 validitytime
     */
    private Integer validitytime;

    /**
     * 来话控制，默认0；
 0：AXB不做来话控制，即允许A和B以及其他号码拨打X
 1：AXB做来话控制，只允许A和B打X callrestrict
     */
    private String callrestrict;

    /**
     * 来显控制，默认0,0；0：被叫UID(本UID)
 1：被叫UID所属企业统一标识(T_Unit中的UnitUIDNumber)
 2：主叫的真实号码
 3：主叫的UID
 4：95013X+主叫的真实号码
 注：主叫无UID时（即'0,0'中的第二列）不能设置为3；主叫有UID时（即'0,0'中的第一列）不能设置为4 calldisplay
     */
    private String calldisplay;

    /**
     * 默认录音，0：不录音；1：录音 callrecording
     */
    private String callrecording;

    /**
     *
     * @mbggenerated
     */
    public postWebBicUserBinding(Integer id, Integer userid, Integer unitid, Integer validitytime, String callrestrict, String calldisplay, String callrecording) {
        this.id = id;
        this.userid = userid;
        this.unitid = unitid;
        this.validitytime = validitytime;
        this.callrestrict = callrestrict;
        this.calldisplay = calldisplay;
        this.callrecording = callrecording;
    }

    /**
     *
     * @mbggenerated
     */
    public postWebBicUserBinding() {
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
     * 用户id
    
     * @return userid 用户id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 用户id
    
     * @param userid 用户id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 合作伙伴编号
    
     * @return unitID 合作伙伴编号
     */
    public Integer getUnitid() {
        return unitid;
    }

    /**
     * 合作伙伴编号
    
     * @param unitid 合作伙伴编号
     */
    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    /**
     * 默认绑定时间向后推迟48小时，如有配置取配置值
    
     * @return validitytime 默认绑定时间向后推迟48小时，如有配置取配置值
     */
    public Integer getValiditytime() {
        return validitytime;
    }

    /**
     * 默认绑定时间向后推迟48小时，如有配置取配置值
    
     * @param validitytime 默认绑定时间向后推迟48小时，如有配置取配置值
     */
    public void setValiditytime(Integer validitytime) {
        this.validitytime = validitytime;
    }

    /**
     * 来话控制，默认0；
 0：AXB不做来话控制，即允许A和B以及其他号码拨打X
 1：AXB做来话控制，只允许A和B打X
    
     * @return callrestrict 来话控制，默认0；
 0：AXB不做来话控制，即允许A和B以及其他号码拨打X
 1：AXB做来话控制，只允许A和B打X
     */
    public String getCallrestrict() {
        return callrestrict;
    }

    /**
     * 来话控制，默认0；
 0：AXB不做来话控制，即允许A和B以及其他号码拨打X
 1：AXB做来话控制，只允许A和B打X
    
     * @param callrestrict 来话控制，默认0；
 0：AXB不做来话控制，即允许A和B以及其他号码拨打X
 1：AXB做来话控制，只允许A和B打X
     */
    public void setCallrestrict(String callrestrict) {
        this.callrestrict = callrestrict == null ? null : callrestrict.trim();
    }

    /**
     * 来显控制，默认0,0；0：被叫UID(本UID)
 1：被叫UID所属企业统一标识(T_Unit中的UnitUIDNumber)
 2：主叫的真实号码
 3：主叫的UID
 4：95013X+主叫的真实号码
 注：主叫无UID时（即'0,0'中的第二列）不能设置为3；主叫有UID时（即'0,0'中的第一列）不能设置为4
    
     * @return calldisplay 来显控制，默认0,0；0：被叫UID(本UID)
 1：被叫UID所属企业统一标识(T_Unit中的UnitUIDNumber)
 2：主叫的真实号码
 3：主叫的UID
 4：95013X+主叫的真实号码
 注：主叫无UID时（即'0,0'中的第二列）不能设置为3；主叫有UID时（即'0,0'中的第一列）不能设置为4
     */
    public String getCalldisplay() {
        return calldisplay;
    }

    /**
     * 来显控制，默认0,0；0：被叫UID(本UID)
 1：被叫UID所属企业统一标识(T_Unit中的UnitUIDNumber)
 2：主叫的真实号码
 3：主叫的UID
 4：95013X+主叫的真实号码
 注：主叫无UID时（即'0,0'中的第二列）不能设置为3；主叫有UID时（即'0,0'中的第一列）不能设置为4
    
     * @param calldisplay 来显控制，默认0,0；0：被叫UID(本UID)
 1：被叫UID所属企业统一标识(T_Unit中的UnitUIDNumber)
 2：主叫的真实号码
 3：主叫的UID
 4：95013X+主叫的真实号码
 注：主叫无UID时（即'0,0'中的第二列）不能设置为3；主叫有UID时（即'0,0'中的第一列）不能设置为4
     */
    public void setCalldisplay(String calldisplay) {
        this.calldisplay = calldisplay == null ? null : calldisplay.trim();
    }

    /**
     * 默认录音，0：不录音；1：录音
    
     * @return callrecording 默认录音，0：不录音；1：录音
     */
    public String getCallrecording() {
        return callrecording;
    }

    /**
     * 默认录音，0：不录音；1：录音
    
     * @param callrecording 默认录音，0：不录音；1：录音
     */
    public void setCallrecording(String callrecording) {
        this.callrecording = callrecording == null ? null : callrecording.trim();
    }
}