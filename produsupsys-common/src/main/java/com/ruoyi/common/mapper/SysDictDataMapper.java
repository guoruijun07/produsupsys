package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface SysDictDataMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_dict_data",
        "where dict_code = #{dictCode,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long dictCode);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_dict_data (dict_code, dict_sort, ",
        "dict_label, dict_value, ",
        "dict_type, css_class, ",
        "list_class, is_default, ",
        "status, create_by, create_time, ",
        "update_by, update_time, ",
        "remark)",
        "values (#{dictCode,jdbcType=BIGINT}, #{dictSort,jdbcType=INTEGER}, ",
        "#{dictLabel,jdbcType=VARCHAR}, #{dictValue,jdbcType=VARCHAR}, ",
        "#{dictType,jdbcType=VARCHAR}, #{cssClass,jdbcType=VARCHAR}, ",
        "#{listClass,jdbcType=VARCHAR}, #{isDefault,jdbcType=CHAR}, ",
        "#{status,jdbcType=CHAR}, #{createBy,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateBy,jdbcType=VARCHAR}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(com.ruoyi.common.bean.po.SysDictData record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, ",
        "is_default, status, create_by, create_time, update_by, update_time, remark",
        "from sys_dict_data",
        "where dict_code = #{dictCode,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="dict_code", javaType= Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="dict_sort", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="dict_label", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="dict_value", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="dict_type", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="css_class", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="list_class", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_default", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="status", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="create_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="update_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="update_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="remark", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    com.ruoyi.common.bean.po.SysDictData selectByPrimaryKey(Long dictCode);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update sys_dict_data",
        "set dict_sort = #{dictSort,jdbcType=INTEGER},",
          "dict_label = #{dictLabel,jdbcType=VARCHAR},",
          "dict_value = #{dictValue,jdbcType=VARCHAR},",
          "dict_type = #{dictType,jdbcType=VARCHAR},",
          "css_class = #{cssClass,jdbcType=VARCHAR},",
          "list_class = #{listClass,jdbcType=VARCHAR},",
          "is_default = #{isDefault,jdbcType=CHAR},",
          "status = #{status,jdbcType=CHAR},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_by = #{updateBy,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where dict_code = #{dictCode,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.SysDictData record);
}