package com.ruoyi.common.bean.po;

public class SysUser {
    /**
     * 用户ID user_id
     */
    private Long userId;

    /**
     * 部门ID dept_id
     */
    private Long deptId;

    /**
     * 登录账号 login_name
     */
    private String loginName;

    /**
     * 用户昵称 user_name
     */
    private String userName;

    /**
     * 用户类型（00系统用户 01注册用户） user_type
     */
    private String userType;

    /**
     * 用户邮箱 email
     */
    private String email;

    /**
     * 手机号码 phonenumber
     */
    private String phonenumber;

    /**
     * 用户性别（0男 1女 2未知） sex
     */
    private String sex;

    /**
     * 头像路径 avatar
     */
    private String avatar;

    /**
     * 密码 password
     */
    private String password;

    /**
     * 盐加密 salt
     */
    private String salt;

    /**
     * 帐号状态（0正常 1停用） status
     */
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除） del_flag
     */
    private String delFlag;

    /**
     * 最后登陆IP login_ip
     */
    private String loginIp;

    /**
     * 最后登陆时间 login_date
     */
    private java.util.Date loginDate;

    /**
     * 账户余额 account
     */
    private Double account;

    /**
     * 创建者 create_by
     */
    private String createBy;

    /**
     * 创建时间 create_time
     */
    private java.util.Date createTime;

    /**
     * 更新者 update_by
     */
    private String updateBy;

    /**
     * 更新时间 update_time
     */
    private java.util.Date updateTime;

    /**
     * 备注 remark
     */
    private String remark;

    /**
     *
     * @mbggenerated
     */
    public SysUser(Long userId, Long deptId, String loginName, String userName, String userType, String email, String phonenumber, String sex, String avatar, String password, String salt, String status, String delFlag, String loginIp, java.util.Date loginDate, Double account, String createBy, java.util.Date createTime, String updateBy, java.util.Date updateTime, String remark) {
        this.userId = userId;
        this.deptId = deptId;
        this.loginName = loginName;
        this.userName = userName;
        this.userType = userType;
        this.email = email;
        this.phonenumber = phonenumber;
        this.sex = sex;
        this.avatar = avatar;
        this.password = password;
        this.salt = salt;
        this.status = status;
        this.delFlag = delFlag;
        this.loginIp = loginIp;
        this.loginDate = loginDate;
        this.account = account;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.remark = remark;
    }

    /**
     *
     * @mbggenerated
     */
    public SysUser() {
        super();
    }

    /**
     * 用户ID

     * @return user_id 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID

     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 部门ID

     * @return dept_id 部门ID
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * 部门ID

     * @param deptId 部门ID
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
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
     * 用户昵称

     * @return user_name 用户昵称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户昵称

     * @param userName 用户昵称
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 用户类型（00系统用户 01注册用户）

     * @return user_type 用户类型（00系统用户 01注册用户）
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 用户类型（00系统用户 01注册用户）

     * @param userType 用户类型（00系统用户 01注册用户）
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * 用户邮箱

     * @return email 用户邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 用户邮箱

     * @param email 用户邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 手机号码

     * @return phonenumber 手机号码
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * 手机号码

     * @param phonenumber 手机号码
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    /**
     * 用户性别（0男 1女 2未知）

     * @return sex 用户性别（0男 1女 2未知）
     */
    public String getSex() {
        return sex;
    }

    /**
     * 用户性别（0男 1女 2未知）

     * @param sex 用户性别（0男 1女 2未知）
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 头像路径

     * @return avatar 头像路径
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 头像路径

     * @param avatar 头像路径
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * 密码

     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码

     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 盐加密

     * @return salt 盐加密
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 盐加密

     * @param salt 盐加密
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * 帐号状态（0正常 1停用）

     * @return status 帐号状态（0正常 1停用）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 帐号状态（0正常 1停用）

     * @param status 帐号状态（0正常 1停用）
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 删除标志（0代表存在 2代表删除）

     * @return del_flag 删除标志（0代表存在 2代表删除）
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 删除标志（0代表存在 2代表删除）

     * @param delFlag 删除标志（0代表存在 2代表删除）
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    /**
     * 最后登陆IP

     * @return login_ip 最后登陆IP
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 最后登陆IP

     * @param loginIp 最后登陆IP
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * 最后登陆时间

     * @return login_date 最后登陆时间
     */
    public java.util.Date getLoginDate() {
        return loginDate;
    }

    /**
     * 最后登陆时间

     * @param loginDate 最后登陆时间
     */
    public void setLoginDate(java.util.Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * 账户余额

     * @return account 账户余额
     */
    public Double getAccount() {
        return account;
    }

    /**
     * 账户余额

     * @param account 账户余额
     */
    public void setAccount(Double account) {
        this.account = account;
    }

    /**
     * 创建者

     * @return create_by 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建者

     * @param createBy 创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
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
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新者

     * @return update_by 更新者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新者

     * @param updateBy 更新者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 更新时间

     * @return update_time 更新时间
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间

     * @param updateTime 更新时间
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 备注
    
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
    
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}