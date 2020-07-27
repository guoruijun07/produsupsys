package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface ISysOperLogMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_oper_log",
        "where oper_id = #{operId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long operId);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_oper_log (oper_id, title, ",
        "business_type, method, ",
        "request_method, operator_type, ",
        "oper_name, dept_name, ",
        "oper_url, oper_ip, ",
        "oper_location, oper_param, ",
        "json_result, status, ",
        "error_msg, oper_time)",
        "values (#{operId,jdbcType=BIGINT}, #{title,jdbcType=VARCHAR}, ",
        "#{businessType,jdbcType=INTEGER}, #{method,jdbcType=VARCHAR}, ",
        "#{requestMethod,jdbcType=VARCHAR}, #{operatorType,jdbcType=INTEGER}, ",
        "#{operName,jdbcType=VARCHAR}, #{deptName,jdbcType=VARCHAR}, ",
        "#{operUrl,jdbcType=VARCHAR}, #{operIp,jdbcType=VARCHAR}, ",
        "#{operLocation,jdbcType=VARCHAR}, #{operParam,jdbcType=VARCHAR}, ",
        "#{jsonResult,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, ",
        "#{errorMsg,jdbcType=VARCHAR}, #{operTime,jdbcType=TIMESTAMP})"
    })
    int insert(com.ruoyi.common.bean.po.SysOperLog record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "oper_id, title, business_type, method, request_method, operator_type, oper_name, ",
        "dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, ",
        "error_msg, oper_time",
        "from sys_oper_log",
        "where oper_id = #{operId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="oper_id", javaType= Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="title", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="business_type", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="method", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="request_method", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="operator_type", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="oper_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="dept_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="oper_url", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="oper_ip", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="oper_location", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="oper_param", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="json_result", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="error_msg", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="oper_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    com.ruoyi.common.bean.po.SysOperLog selectByPrimaryKey(Long operId);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update sys_oper_log",
        "set title = #{title,jdbcType=VARCHAR},",
          "business_type = #{businessType,jdbcType=INTEGER},",
          "method = #{method,jdbcType=VARCHAR},",
          "request_method = #{requestMethod,jdbcType=VARCHAR},",
          "operator_type = #{operatorType,jdbcType=INTEGER},",
          "oper_name = #{operName,jdbcType=VARCHAR},",
          "dept_name = #{deptName,jdbcType=VARCHAR},",
          "oper_url = #{operUrl,jdbcType=VARCHAR},",
          "oper_ip = #{operIp,jdbcType=VARCHAR},",
          "oper_location = #{operLocation,jdbcType=VARCHAR},",
          "oper_param = #{operParam,jdbcType=VARCHAR},",
          "json_result = #{jsonResult,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "error_msg = #{errorMsg,jdbcType=VARCHAR},",
          "oper_time = #{operTime,jdbcType=TIMESTAMP}",
        "where oper_id = #{operId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.SysOperLog record);
}