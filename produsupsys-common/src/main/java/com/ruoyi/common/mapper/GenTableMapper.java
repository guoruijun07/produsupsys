package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import com.ruoyi.common.bean.po.GenTable;

public interface GenTableMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from gen_table",
        "where table_id = #{tableId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long tableId);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into gen_table (table_id, table_name, ",
        "table_comment, sub_table_name, ",
        "sub_table_fk_name, class_name, ",
        "tpl_category, package_name, ",
        "module_name, business_name, ",
        "function_name, function_author, ",
        "options, create_by, ",
        "create_time, update_by, ",
        "update_time, remark)",
        "values (#{tableId,jdbcType=BIGINT}, #{tableName,jdbcType=VARCHAR}, ",
        "#{tableComment,jdbcType=VARCHAR}, #{subTableName,jdbcType=VARCHAR}, ",
        "#{subTableFkName,jdbcType=VARCHAR}, #{className,jdbcType=VARCHAR}, ",
        "#{tplCategory,jdbcType=VARCHAR}, #{packageName,jdbcType=VARCHAR}, ",
        "#{moduleName,jdbcType=VARCHAR}, #{businessName,jdbcType=VARCHAR}, ",
        "#{functionName,jdbcType=VARCHAR}, #{functionAuthor,jdbcType=VARCHAR}, ",
        "#{options,jdbcType=VARCHAR}, #{createBy,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateBy,jdbcType=VARCHAR}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(GenTable record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "table_id, table_name, table_comment, sub_table_name, sub_table_fk_name, class_name, ",
        "tpl_category, package_name, module_name, business_name, function_name, function_author, ",
        "options, create_by, create_time, update_by, update_time, remark",
        "from gen_table",
        "where table_id = #{tableId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="table_id", javaType= Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="table_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="table_comment", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sub_table_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sub_table_fk_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="class_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="tpl_category", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="package_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="module_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="business_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="function_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="function_author", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="options", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="update_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="update_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="remark", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
   GenTable selectByPrimaryKey(Long tableId);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update gen_table",
        "set table_name = #{tableName,jdbcType=VARCHAR},",
          "table_comment = #{tableComment,jdbcType=VARCHAR},",
          "sub_table_name = #{subTableName,jdbcType=VARCHAR},",
          "sub_table_fk_name = #{subTableFkName,jdbcType=VARCHAR},",
          "class_name = #{className,jdbcType=VARCHAR},",
          "tpl_category = #{tplCategory,jdbcType=VARCHAR},",
          "package_name = #{packageName,jdbcType=VARCHAR},",
          "module_name = #{moduleName,jdbcType=VARCHAR},",
          "business_name = #{businessName,jdbcType=VARCHAR},",
          "function_name = #{functionName,jdbcType=VARCHAR},",
          "function_author = #{functionAuthor,jdbcType=VARCHAR},",
          "options = #{options,jdbcType=VARCHAR},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_by = #{updateBy,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where table_id = #{tableId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GenTable record);
}