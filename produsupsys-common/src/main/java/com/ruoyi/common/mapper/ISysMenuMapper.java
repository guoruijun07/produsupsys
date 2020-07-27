package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface ISysMenuMapper {


    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_menu",
        "where menu_id = #{menuId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long menuId);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_menu (menu_id, menu_name, ",
        "parent_id, order_num, ",
        "url, target, menu_type, ",
        "visible, perms, icon, ",
        "create_by, create_time, ",
        "update_by, update_time, ",
        "remark)",
        "values (#{menuId,jdbcType=BIGINT}, #{menuName,jdbcType=VARCHAR}, ",
        "#{parentId,jdbcType=BIGINT}, #{orderNum,jdbcType=INTEGER}, ",
        "#{url,jdbcType=VARCHAR}, #{target,jdbcType=VARCHAR}, #{menuType,jdbcType=CHAR}, ",
        "#{visible,jdbcType=CHAR}, #{perms,jdbcType=VARCHAR}, #{icon,jdbcType=VARCHAR}, ",
        "#{createBy,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateBy,jdbcType=VARCHAR}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(com.ruoyi.common.bean.po.SysMenu record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "menu_id, menu_name, parent_id, order_num, url, target, menu_type, visible, perms, ",
        "icon, create_by, create_time, update_by, update_time, remark",
        "from sys_menu",
        "where menu_id = #{menuId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="menu_id", javaType= Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="menu_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parent_id", javaType= Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_num", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="url", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="target", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="menu_type", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="visible", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="perms", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="icon", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="update_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="update_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="remark", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    com.ruoyi.common.bean.po.SysMenu selectByPrimaryKey(Long menuId);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update sys_menu",
        "set menu_name = #{menuName,jdbcType=VARCHAR},",
          "parent_id = #{parentId,jdbcType=BIGINT},",
          "order_num = #{orderNum,jdbcType=INTEGER},",
          "url = #{url,jdbcType=VARCHAR},",
          "target = #{target,jdbcType=VARCHAR},",
          "menu_type = #{menuType,jdbcType=CHAR},",
          "visible = #{visible,jdbcType=CHAR},",
          "perms = #{perms,jdbcType=VARCHAR},",
          "icon = #{icon,jdbcType=VARCHAR},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_by = #{updateBy,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where menu_id = #{menuId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.SysMenu record);
}