package com.ruoyi.common.bean.po;

public class SysRole {
    /**
     * 角色ID role_id
     */
    private Long roleId;

    /**
     * 角色名称 role_name
     */
    private String roleName;

    /**
     * 角色权限字符串 role_key
     */
    private String roleKey;

    /**
     * 显示顺序 role_sort
     */
    private Integer roleSort;

    /**
     * 数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限） data_scope
     */
    private String dataScope;

    /**
     * 角色状态（0正常 1停用） status
     */
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除） del_flag
     */
    private String delFlag;

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
    public SysRole(Long roleId, String roleName, String roleKey, Integer roleSort, String dataScope, String status, String delFlag, String createBy, java.util.Date createTime, String updateBy, java.util.Date updateTime, String remark) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleKey = roleKey;
        this.roleSort = roleSort;
        this.dataScope = dataScope;
        this.status = status;
        this.delFlag = delFlag;
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
    public SysRole() {
        super();
    }

    /**
     * 角色ID

     * @return role_id 角色ID
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 角色ID

     * @param roleId 角色ID
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 角色名称

     * @return role_name 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名称

     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 角色权限字符串

     * @return role_key 角色权限字符串
     */
    public String getRoleKey() {
        return roleKey;
    }

    /**
     * 角色权限字符串

     * @param roleKey 角色权限字符串
     */
    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey == null ? null : roleKey.trim();
    }

    /**
     * 显示顺序

     * @return role_sort 显示顺序
     */
    public Integer getRoleSort() {
        return roleSort;
    }

    /**
     * 显示顺序

     * @param roleSort 显示顺序
     */
    public void setRoleSort(Integer roleSort) {
        this.roleSort = roleSort;
    }

    /**
     * 数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）

     * @return data_scope 数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）
     */
    public String getDataScope() {
        return dataScope;
    }

    /**
     * 数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）

     * @param dataScope 数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）
     */
    public void setDataScope(String dataScope) {
        this.dataScope = dataScope == null ? null : dataScope.trim();
    }

    /**
     * 角色状态（0正常 1停用）

     * @return status 角色状态（0正常 1停用）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 角色状态（0正常 1停用）

     * @param status 角色状态（0正常 1停用）
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