package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface ISysDictTypeMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_dict_type",
        "where dict_id = #{dictId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long dictId);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_dict_type (dict_id, dict_name, ",
        "dict_type, status, create_by, ",
        "create_time, update_by, ",
        "update_time, remark)",
        "values (#{dictId,jdbcType=BIGINT}, #{dictName,jdbcType=VARCHAR}, ",
        "#{dictType,jdbcType=VARCHAR}, #{status,jdbcType=CHAR}, #{createBy,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateBy,jdbcType=VARCHAR}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(com.ruoyi.common.bean.po.SysDictType record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "dict_id, dict_name, dict_type, status, create_by, create_time, update_by, update_time, ",
        "remark",
        "from sys_dict_type",
        "where dict_id = #{dictId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="dict_id", javaType= Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="dict_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="dict_type", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="create_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="update_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="update_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="remark", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    com.ruoyi.common.bean.po.SysDictType selectByPrimaryKey(Long dictId);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update sys_dict_type",
        "set dict_name = #{dictName,jdbcType=VARCHAR},",
          "dict_type = #{dictType,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_by = #{updateBy,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where dict_id = #{dictId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.SysDictType record);
}