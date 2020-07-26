package com.ruoyi.common.bean.po;

public class SysDept {
    /**
     * 部门id dept_id
     */
    private Long deptId;

    /**
     * 父部门id parent_id
     */
    private Long parentId;

    /**
     * 祖级列表 ancestors
     */
    private String ancestors;

    /**
     * 部门名称 dept_name
     */
    private String deptName;

    /**
     * 显示顺序 order_num
     */
    private Integer orderNum;

    /**
     * 负责人 leader
     */
    private String leader;

    /**
     * 联系电话 phone
     */
    private String phone;

    /**
     * 邮箱 email
     */
    private String email;

    /**
     * 部门状态（0正常 1停用） status
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
     *
     * @mbggenerated
     */
    public SysDept(Long deptId, Long parentId, String ancestors, String deptName, Integer orderNum, String leader, String phone, String email, String status, String delFlag, String createBy, java.util.Date createTime, String updateBy, java.util.Date updateTime) {
        this.deptId = deptId;
        this.parentId = parentId;
        this.ancestors = ancestors;
        this.deptName = deptName;
        this.orderNum = orderNum;
        this.leader = leader;
        this.phone = phone;
        this.email = email;
        this.status = status;
        this.delFlag = delFlag;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
    }

    /**
     *
     * @mbggenerated
     */
    public SysDept() {
        super();
    }

    /**
     * 部门id

     * @return dept_id 部门id
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * 部门id

     * @param deptId 部门id
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * 父部门id

     * @return parent_id 父部门id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 父部门id

     * @param parentId 父部门id
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 祖级列表

     * @return ancestors 祖级列表
     */
    public String getAncestors() {
        return ancestors;
    }

    /**
     * 祖级列表

     * @param ancestors 祖级列表
     */
    public void setAncestors(String ancestors) {
        this.ancestors = ancestors == null ? null : ancestors.trim();
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
     * 显示顺序

     * @return order_num 显示顺序
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * 显示顺序

     * @param orderNum 显示顺序
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 负责人

     * @return leader 负责人
     */
    public String getLeader() {
        return leader;
    }

    /**
     * 负责人

     * @param leader 负责人
     */
    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    /**
     * 联系电话

     * @return phone 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 联系电话

     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 邮箱

     * @return email 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱

     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 部门状态（0正常 1停用）

     * @return status 部门状态（0正常 1停用）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 部门状态（0正常 1停用）

     * @param status 部门状态（0正常 1停用）
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
}