package com.ruoyi.common.bean.po;

public class SysMenu {
    /**
     * 菜单ID menu_id
     */
    private Long menuId;

    /**
     * 菜单名称 menu_name
     */
    private String menuName;

    /**
     * 父菜单ID parent_id
     */
    private Long parentId;

    /**
     * 显示顺序 order_num
     */
    private Integer orderNum;

    /**
     * 请求地址 url
     */
    private String url;

    /**
     * 打开方式（menuItem页签 menuBlank新窗口） target
     */
    private String target;

    /**
     * 菜单类型（M目录 C菜单 F按钮） menu_type
     */
    private String menuType;

    /**
     * 菜单状态（0显示 1隐藏） visible
     */
    private String visible;

    /**
     * 权限标识 perms
     */
    private String perms;

    /**
     * 菜单图标 icon
     */
    private String icon;

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
    public SysMenu(Long menuId, String menuName, Long parentId, Integer orderNum, String url, String target, String menuType, String visible, String perms, String icon, String createBy, java.util.Date createTime, String updateBy, java.util.Date updateTime, String remark) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.parentId = parentId;
        this.orderNum = orderNum;
        this.url = url;
        this.target = target;
        this.menuType = menuType;
        this.visible = visible;
        this.perms = perms;
        this.icon = icon;
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
    public SysMenu() {
        super();
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

    /**
     * 菜单名称

     * @return menu_name 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 菜单名称

     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * 父菜单ID

     * @return parent_id 父菜单ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 父菜单ID

     * @param parentId 父菜单ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
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
     * 请求地址

     * @return url 请求地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 请求地址

     * @param url 请求地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 打开方式（menuItem页签 menuBlank新窗口）

     * @return target 打开方式（menuItem页签 menuBlank新窗口）
     */
    public String getTarget() {
        return target;
    }

    /**
     * 打开方式（menuItem页签 menuBlank新窗口）

     * @param target 打开方式（menuItem页签 menuBlank新窗口）
     */
    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    /**
     * 菜单类型（M目录 C菜单 F按钮）

     * @return menu_type 菜单类型（M目录 C菜单 F按钮）
     */
    public String getMenuType() {
        return menuType;
    }

    /**
     * 菜单类型（M目录 C菜单 F按钮）

     * @param menuType 菜单类型（M目录 C菜单 F按钮）
     */
    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    /**
     * 菜单状态（0显示 1隐藏）

     * @return visible 菜单状态（0显示 1隐藏）
     */
    public String getVisible() {
        return visible;
    }

    /**
     * 菜单状态（0显示 1隐藏）

     * @param visible 菜单状态（0显示 1隐藏）
     */
    public void setVisible(String visible) {
        this.visible = visible == null ? null : visible.trim();
    }

    /**
     * 权限标识

     * @return perms 权限标识
     */
    public String getPerms() {
        return perms;
    }

    /**
     * 权限标识

     * @param perms 权限标识
     */
    public void setPerms(String perms) {
        this.perms = perms == null ? null : perms.trim();
    }

    /**
     * 菜单图标

     * @return icon 菜单图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 菜单图标

     * @param icon 菜单图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
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