package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface SysLogininforMapper {


    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_logininfor",
        "where info_id = #{infoId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long infoId);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_logininfor (info_id, login_name, ",
        "ipaddr, login_location, ",
        "browser, os, status, ",
        "msg, login_time)",
        "values (#{infoId,jdbcType=BIGINT}, #{loginName,jdbcType=VARCHAR}, ",
        "#{ipaddr,jdbcType=VARCHAR}, #{loginLocation,jdbcType=VARCHAR}, ",
        "#{browser,jdbcType=VARCHAR}, #{os,jdbcType=VARCHAR}, #{status,jdbcType=CHAR}, ",
        "#{msg,jdbcType=VARCHAR}, #{loginTime,jdbcType=TIMESTAMP})"
    })
    int insert(com.ruoyi.common.bean.po.SysLogininfor record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "info_id, login_name, ipaddr, login_location, browser, os, status, msg, login_time",
        "from sys_logininfor",
        "where info_id = #{infoId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="info_id", javaType= Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="login_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ipaddr", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="login_location", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="browser", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="os", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="msg", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="login_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    com.ruoyi.common.bean.po.SysLogininfor selectByPrimaryKey(Long infoId);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update sys_logininfor",
        "set login_name = #{loginName,jdbcType=VARCHAR},",
          "ipaddr = #{ipaddr,jdbcType=VARCHAR},",
          "login_location = #{loginLocation,jdbcType=VARCHAR},",
          "browser = #{browser,jdbcType=VARCHAR},",
          "os = #{os,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "msg = #{msg,jdbcType=VARCHAR},",
          "login_time = #{loginTime,jdbcType=TIMESTAMP}",
        "where info_id = #{infoId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.SysLogininfor record);
}