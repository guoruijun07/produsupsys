package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface ISysRoleMapper {


    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_role",
        "where role_id = #{roleId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long roleId);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_role (role_id, role_name, ",
        "role_key, role_sort, ",
        "data_scope, status, del_flag, ",
        "create_by, create_time, ",
        "update_by, update_time, ",
        "remark)",
        "values (#{roleId,jdbcType=BIGINT}, #{roleName,jdbcType=VARCHAR}, ",
        "#{roleKey,jdbcType=VARCHAR}, #{roleSort,jdbcType=INTEGER}, ",
        "#{dataScope,jdbcType=CHAR}, #{status,jdbcType=CHAR}, #{delFlag,jdbcType=CHAR}, ",
        "#{createBy,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateBy,jdbcType=VARCHAR}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(com.ruoyi.common.bean.po.SysRole record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "role_id, role_name, role_key, role_sort, data_scope, status, del_flag, create_by, ",
        "create_time, update_by, update_time, remark",
        "from sys_role",
        "where role_id = #{roleId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="role_id", javaType= Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="role_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="role_key", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="role_sort", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="data_scope", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="status", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="del_flag", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="create_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="update_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="update_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="remark", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    com.ruoyi.common.bean.po.SysRole selectByPrimaryKey(Long roleId);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update sys_role",
        "set role_name = #{roleName,jdbcType=VARCHAR},",
          "role_key = #{roleKey,jdbcType=VARCHAR},",
          "role_sort = #{roleSort,jdbcType=INTEGER},",
          "data_scope = #{dataScope,jdbcType=CHAR},",
          "status = #{status,jdbcType=CHAR},",
          "del_flag = #{delFlag,jdbcType=CHAR},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_by = #{updateBy,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where role_id = #{roleId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.SysRole record);
}