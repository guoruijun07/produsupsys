package com.ruoyi.common.bean.po;

public class SysUserOnline {
    /**
     * 用户会话id sessionId
     */
    private String sessionid;

    /**
     * 登录账号 login_name
     */
    private String loginName;

    /**
     * 部门名称 dept_name
     */
    private String deptName;

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
     * 在线状态on_line在线off_line离线 status
     */
    private String status;

    /**
     * session创建时间 start_timestamp
     */
    private java.util.Date startTimestamp;

    /**
     * session最后访问时间 last_access_time
     */
    private java.util.Date lastAccessTime;

    /**
     * 超时时间，单位为分钟 expire_time
     */
    private Integer expireTime;

    /**
     *
     * @mbggenerated
     */
    public SysUserOnline(String sessionid, String loginName, String deptName, String ipaddr, String loginLocation, String browser, String os, String status, java.util.Date startTimestamp, java.util.Date lastAccessTime, Integer expireTime) {
        this.sessionid = sessionid;
        this.loginName = loginName;
        this.deptName = deptName;
        this.ipaddr = ipaddr;
        this.loginLocation = loginLocation;
        this.browser = browser;
        this.os = os;
        this.status = status;
        this.startTimestamp = startTimestamp;
        this.lastAccessTime = lastAccessTime;
        this.expireTime = expireTime;
    }

    /**
     *
     * @mbggenerated
     */
    public SysUserOnline() {
        super();
    }

    /**
     * 用户会话id

     * @return sessionId 用户会话id
     */
    public String getSessionid() {
        return sessionid;
    }

    /**
     * 用户会话id

     * @param sessionid 用户会话id
     */
    public void setSessionid(String sessionid) {
        this.sessionid = sessionid == null ? null : sessionid.trim();
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
     * 部门名称

     * @return dept_name 部门名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 部门名称

     * @param deptName 部门名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
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
     * 在线状态on_line在线off_line离线

     * @return status 在线状态on_line在线off_line离线
     */
    public String getStatus() {
        return status;
    }

    /**
     * 在线状态on_line在线off_line离线

     * @param status 在线状态on_line在线off_line离线
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * session创建时间

     * @return start_timestamp session创建时间
     */
    public java.util.Date getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * session创建时间

     * @param startTimestamp session创建时间
     */
    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * session最后访问时间

     * @return last_access_time session最后访问时间
     */
    public java.util.Date getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * session最后访问时间

     * @param lastAccessTime session最后访问时间
     */
    public void setLastAccessTime(java.util.Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * 超时时间，单位为分钟
    
     * @return expire_time 超时时间，单位为分钟
     */
    public Integer getExpireTime() {
        return expireTime;
    }

    /**
     * 超时时间，单位为分钟
    
     * @param expireTime 超时时间，单位为分钟
     */
    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }
}