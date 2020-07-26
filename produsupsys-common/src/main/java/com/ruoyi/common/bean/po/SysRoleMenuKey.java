package com.ruoyi.common.bean.po;

public class SysRoleMenuKey {
    /**
     * 角色ID role_id
     */
    private Long roleId;

    /**
     * 菜单ID menu_id
     */
    private Long menuId;

    /**
     *
     * @mbggenerated
     */
    public SysRoleMenuKey(Long roleId, Long menuId) {
        this.roleId = roleId;
        this.menuId = menuId;
    }

    /**
     *
     * @mbggenerated
     */
    public SysRoleMenuKey() {
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
     * 菜单ID
    
     * @return menu_id 菜单ID
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * 菜单ID
    
     * @param menuId 菜单ID
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}