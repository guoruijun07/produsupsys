package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface SysRoleMenuMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_role_menu",
        "where role_id = #{roleId,jdbcType=BIGINT}",
          "and menu_id = #{menuId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(com.ruoyi.common.bean.po.SysRoleMenuKey key);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_role_menu (role_id, menu_id)",
        "values (#{roleId,jdbcType=BIGINT}, #{menuId,jdbcType=BIGINT})"
    })
    int insert(com.ruoyi.common.bean.po.SysRoleMenuKey record);

}