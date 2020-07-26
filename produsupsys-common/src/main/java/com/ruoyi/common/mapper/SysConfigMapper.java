package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface SysConfigMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_config",
        "where config_id = #{configId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer configId);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_config (config_id, config_name, ",
        "config_key, config_value, ",
        "config_type, create_by, ",
        "create_time, update_by, ",
        "update_time, remark)",
        "values (#{configId,jdbcType=INTEGER}, #{configName,jdbcType=VARCHAR}, ",
        "#{configKey,jdbcType=VARCHAR}, #{configValue,jdbcType=VARCHAR}, ",
        "#{configType,jdbcType=CHAR}, #{createBy,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateBy,jdbcType=VARCHAR}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(com.ruoyi.common.bean.po.SysConfig record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "config_id, config_name, config_key, config_value, config_type, create_by, create_time, ",
        "update_by, update_time, remark",
        "from sys_config",
        "where config_id = #{configId,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="config_id", javaType= Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="config_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="config_key", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="config_value", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="config_type", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="create_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="update_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="update_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="remark", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    com.ruoyi.common.bean.po.SysConfig selectByPrimaryKey(Integer configId);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update sys_config",
        "set config_name = #{configName,jdbcType=VARCHAR},",
          "config_key = #{configKey,jdbcType=VARCHAR},",
          "config_value = #{configValue,jdbcType=VARCHAR},",
          "config_type = #{configType,jdbcType=CHAR},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_by = #{updateBy,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where config_id = #{configId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.SysConfig record);
}