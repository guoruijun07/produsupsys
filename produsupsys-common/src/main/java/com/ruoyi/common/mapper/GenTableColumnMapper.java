package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import com.ruoyi.common.bean.po.GenTableColumn;

public interface GenTableColumnMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from gen_table_column",
        "where column_id = #{columnId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long columnId);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into gen_table_column (column_id, table_id, ",
        "column_name, column_comment, ",
        "column_type, java_type, ",
        "java_field, is_pk, is_increment, ",
        "is_required, is_insert, ",
        "is_edit, is_list, is_query, ",
        "query_type, html_type, ",
        "dict_type, sort, ",
        "create_by, create_time, ",
        "update_by, update_time)",
        "values (#{columnId,jdbcType=BIGINT}, #{tableId,jdbcType=VARCHAR}, ",
        "#{columnName,jdbcType=VARCHAR}, #{columnComment,jdbcType=VARCHAR}, ",
        "#{columnType,jdbcType=VARCHAR}, #{javaType,jdbcType=VARCHAR}, ",
        "#{javaField,jdbcType=VARCHAR}, #{isPk,jdbcType=CHAR}, #{isIncrement,jdbcType=CHAR}, ",
        "#{isRequired,jdbcType=CHAR}, #{isInsert,jdbcType=CHAR}, ",
        "#{isEdit,jdbcType=CHAR}, #{isList,jdbcType=CHAR}, #{isQuery,jdbcType=CHAR}, ",
        "#{queryType,jdbcType=VARCHAR}, #{htmlType,jdbcType=VARCHAR}, ",
        "#{dictType,jdbcType=VARCHAR}, #{sort,jdbcType=INTEGER}, ",
        "#{createBy,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateBy,jdbcType=VARCHAR}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(GenTableColumn record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "column_id, table_id, column_name, column_comment, column_type, java_type, java_field, ",
        "is_pk, is_increment, is_required, is_insert, is_edit, is_list, is_query, query_type, ",
        "html_type, dict_type, sort, create_by, create_time, update_by, update_time",
        "from gen_table_column",
        "where column_id = #{columnId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="column_id", javaType= Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="table_id", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="column_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="column_comment", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="column_type", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="java_type", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="java_field", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_pk", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="is_increment", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="is_required", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="is_insert", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="is_edit", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="is_list", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="is_query", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="query_type", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="html_type", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="dict_type", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sort", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="create_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="update_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="update_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    GenTableColumn selectByPrimaryKey(Long columnId);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update gen_table_column",
        "set table_id = #{tableId,jdbcType=VARCHAR},",
          "column_name = #{columnName,jdbcType=VARCHAR},",
          "column_comment = #{columnComment,jdbcType=VARCHAR},",
          "column_type = #{columnType,jdbcType=VARCHAR},",
          "java_type = #{javaType,jdbcType=VARCHAR},",
          "java_field = #{javaField,jdbcType=VARCHAR},",
          "is_pk = #{isPk,jdbcType=CHAR},",
          "is_increment = #{isIncrement,jdbcType=CHAR},",
          "is_required = #{isRequired,jdbcType=CHAR},",
          "is_insert = #{isInsert,jdbcType=CHAR},",
          "is_edit = #{isEdit,jdbcType=CHAR},",
          "is_list = #{isList,jdbcType=CHAR},",
          "is_query = #{isQuery,jdbcType=CHAR},",
          "query_type = #{queryType,jdbcType=VARCHAR},",
          "html_type = #{htmlType,jdbcType=VARCHAR},",
          "dict_type = #{dictType,jdbcType=VARCHAR},",
          "sort = #{sort,jdbcType=INTEGER},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_by = #{updateBy,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where column_id = #{columnId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GenTableColumn record);
}