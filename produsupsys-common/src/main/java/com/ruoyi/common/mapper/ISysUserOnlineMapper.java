package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface ISysUserOnlineMapper {
    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_user_online",
        "where sessionId = #{sessionid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String sessionid);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_user_online (sessionId, login_name, ",
        "dept_name, ipaddr, ",
        "login_location, browser, ",
        "os, status, start_timestamp, ",
        "last_access_time, expire_time)",
        "values (#{sessionid,jdbcType=VARCHAR}, #{loginName,jdbcType=VARCHAR}, ",
        "#{deptName,jdbcType=VARCHAR}, #{ipaddr,jdbcType=VARCHAR}, ",
        "#{loginLocation,jdbcType=VARCHAR}, #{browser,jdbcType=VARCHAR}, ",
        "#{os,jdbcType=VARCHAR}, #{status,jdbcType=VARCHAR}, #{startTimestamp,jdbcType=TIMESTAMP}, ",
        "#{lastAccessTime,jdbcType=TIMESTAMP}, #{expireTime,jdbcType=INTEGER})"
    })
    int insert(com.ruoyi.common.bean.po.SysUserOnline record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "sessionId, login_name, dept_name, ipaddr, login_location, browser, os, status, ",
        "start_timestamp, last_access_time, expire_time",
        "from sys_user_online",
        "where sessionId = #{sessionid,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="sessionId", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="login_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="dept_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ipaddr", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="login_location", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="browser", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="os", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="start_timestamp", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="last_access_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="expire_time", javaType= Integer.class, jdbcType=JdbcType.INTEGER)
    })
    com.ruoyi.common.bean.po.SysUserOnline selectByPrimaryKey(String sessionid);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update sys_user_online",
        "set login_name = #{loginName,jdbcType=VARCHAR},",
          "dept_name = #{deptName,jdbcType=VARCHAR},",
          "ipaddr = #{ipaddr,jdbcType=VARCHAR},",
          "login_location = #{loginLocation,jdbcType=VARCHAR},",
          "browser = #{browser,jdbcType=VARCHAR},",
          "os = #{os,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=VARCHAR},",
          "start_timestamp = #{startTimestamp,jdbcType=TIMESTAMP},",
          "last_access_time = #{lastAccessTime,jdbcType=TIMESTAMP},",
          "expire_time = #{expireTime,jdbcType=INTEGER}",
        "where sessionId = #{sessionid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.SysUserOnline record);
}