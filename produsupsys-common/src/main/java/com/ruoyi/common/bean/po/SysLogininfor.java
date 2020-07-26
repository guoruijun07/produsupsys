package com.ruoyi.common.bean.po;

public class SysLogininfor {
    /**
     * 访问ID info_id
     */
    private Long infoId;

    /**
     * 登录账号 login_name
     */
    private String loginName;

    /**
     * 登录IP地址 ipaddr
     */
    private String ipaddr;

    /**
     * 登录地点 login_location
     */
    private String loginLocation;

    /**
     * 浏览器类型 browser
     */
    private String browser;

    /**
     * 操作系统 os
     */
    private String os;

    /**
     * 登录状态（0成功 1失败） status
     */
    private String status;

    /**
     * 提示消息 msg
     */
    private String msg;

    /**
     * 访问时间 login_time
     */
    private java.util.Date loginTime;

    /**
     *
     * @mbggenerated
     */
    public SysLogininfor(Long infoId, String loginName, String ipaddr, String loginLocation, String browser, String os, String status, String msg, java.util.Date loginTime) {
        this.infoId = infoId;
        this.loginName = loginName;
        this.ipaddr = ipaddr;
        this.loginLocation = loginLocation;
        this.browser = browser;
        this.os = os;
        this.status = status;
        this.msg = msg;
        this.loginTime = loginTime;
    }

    /**
     *
     * @mbggenerated
     */
    public SysLogininfor() {
        super();
    }

    /**
     * 访问ID

     * @return info_id 访问ID
     */
    public Long getInfoId() {
        return infoId;
    }

    /**
     * 访问ID

     * @param infoId 访问ID
     */
    public void setInfoId(Long infoId) {
        this.infoId = infoId;
    }

    /**
     * 登录账号

     * @return login_name 登录账号
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 登录账号

     * @param loginName 登录账号
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * 登录IP地址

     * @return ipaddr 登录IP地址
     */
    public String getIpaddr() {
        return ipaddr;
    }

    /**
     * 登录IP地址

     * @param ipaddr 登录IP地址
     */
    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr == null ? null : ipaddr.trim();
    }

    /**
     * 登录地点

     * @return login_location 登录地点
     */
    public String getLoginLocation() {
        return loginLocation;
    }

    /**
     * 登录地点

     * @param loginLocation 登录地点
     */
    public void setLoginLocation(String loginLocation) {
        this.loginLocation = loginLocation == null ? null : loginLocation.trim();
    }

    /**
     * 浏览器类型

     * @return browser 浏览器类型
     */
    public String getBrowser() {
        return browser;
    }

    /**
     * 浏览器类型

     * @param browser 浏览器类型
     */
    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    /**
     * 操作系统

     * @return os 操作系统
     */
    public String getOs() {
        return os;
    }

    /**
     * 操作系统

     * @param os 操作系统
     */
    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    /**
     * 登录状态（0成功 1失败）

     * @return status 登录状态（0成功 1失败）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 登录状态（0成功 1失败）

     * @param status 登录状态（0成功 1失败）
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 提示消息

     * @return msg 提示消息
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 提示消息

     * @param msg 提示消息
     */
    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    /**
     * 访问时间

     * @return login_time 访问时间
     */
    public java.util.Date getLoginTime() {
        return loginTime;
    }

    /**
     * 访问时间

     * @param loginTime 访问时间
     */
    public void setLoginTime(java.util.Date loginTime) {
        this.loginTime = loginTime;
    }
}