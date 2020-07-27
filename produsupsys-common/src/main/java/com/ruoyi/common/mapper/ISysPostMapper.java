package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface ISysPostMapper {


    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_post",
        "where post_id = #{postId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long postId);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_post (post_id, post_code, ",
        "post_name, post_sort, ",
        "status, create_by, create_time, ",
        "update_by, update_time, ",
        "remark)",
        "values (#{postId,jdbcType=BIGINT}, #{postCode,jdbcType=VARCHAR}, ",
        "#{postName,jdbcType=VARCHAR}, #{postSort,jdbcType=INTEGER}, ",
        "#{status,jdbcType=CHAR}, #{createBy,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateBy,jdbcType=VARCHAR}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(com.ruoyi.common.bean.po.SysPost record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "post_id, post_code, post_name, post_sort, status, create_by, create_time, update_by, ",
        "update_time, remark",
        "from sys_post",
        "where post_id = #{postId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="post_id", javaType= Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="post_code", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="post_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="post_sort", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="status", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="create_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="update_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="update_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="remark", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    com.ruoyi.common.bean.po.SysPost selectByPrimaryKey(Long postId);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update sys_post",
        "set post_code = #{postCode,jdbcType=VARCHAR},",
          "post_name = #{postName,jdbcType=VARCHAR},",
          "post_sort = #{postSort,jdbcType=INTEGER},",
          "status = #{status,jdbcType=CHAR},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_by = #{updateBy,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where post_id = #{postId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.SysPost record);
}