package com.ruoyi.common.bean.po;

public class SysRoleDeptKey {
    /**
     * 角色ID role_id
     */
    private Long roleId;

    /**
     * 部门ID dept_id
     */
    private Long deptId;

    /**
     *
     * @mbggenerated
     */
    public SysRoleDeptKey(Long roleId, Long deptId) {
        this.roleId = roleId;
        this.deptId = deptId;
    }

    /**
     *
     * @mbggenerated
     */
    public SysRoleDeptKey() {
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
}