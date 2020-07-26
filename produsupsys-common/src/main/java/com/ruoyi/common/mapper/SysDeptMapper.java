package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface SysDeptMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_dept",
        "where dept_id = #{deptId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long deptId);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_dept (dept_id, parent_id, ",
        "ancestors, dept_name, ",
        "order_num, leader, ",
        "phone, email, status, ",
        "del_flag, create_by, ",
        "create_time, update_by, ",
        "update_time)",
        "values (#{deptId,jdbcType=BIGINT}, #{parentId,jdbcType=BIGINT}, ",
        "#{ancestors,jdbcType=VARCHAR}, #{deptName,jdbcType=VARCHAR}, ",
        "#{orderNum,jdbcType=INTEGER}, #{leader,jdbcType=VARCHAR}, ",
        "#{phone,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, #{status,jdbcType=CHAR}, ",
        "#{delFlag,jdbcType=CHAR}, #{createBy,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateBy,jdbcType=VARCHAR}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(com.ruoyi.common.bean.po.SysDept record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "dept_id, parent_id, ancestors, dept_name, order_num, leader, phone, email, status, ",
        "del_flag, create_by, create_time, update_by, update_time",
        "from sys_dept",
        "where dept_id = #{deptId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="dept_id", javaType= Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="parent_id", javaType= Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ancestors", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="dept_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="order_num", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="leader", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="phone", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="email", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="del_flag", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="create_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="update_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="update_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    com.ruoyi.common.bean.po.SysDept selectByPrimaryKey(Long deptId);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update sys_dept",
        "set parent_id = #{parentId,jdbcType=BIGINT},",
          "ancestors = #{ancestors,jdbcType=VARCHAR},",
          "dept_name = #{deptName,jdbcType=VARCHAR},",
          "order_num = #{orderNum,jdbcType=INTEGER},",
          "leader = #{leader,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "del_flag = #{delFlag,jdbcType=CHAR},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_by = #{updateBy,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where dept_id = #{deptId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.SysDept record);
}