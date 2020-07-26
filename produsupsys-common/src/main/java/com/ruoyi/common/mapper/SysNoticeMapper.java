package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface SysNoticeMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_notice",
        "where notice_id = #{noticeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer noticeId);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_notice (notice_id, notice_title, ",
        "notice_type, notice_content, ",
        "status, create_by, create_time, ",
        "update_by, update_time, ",
        "remark)",
        "values (#{noticeId,jdbcType=INTEGER}, #{noticeTitle,jdbcType=VARCHAR}, ",
        "#{noticeType,jdbcType=CHAR}, #{noticeContent,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=CHAR}, #{createBy,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateBy,jdbcType=VARCHAR}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(com.ruoyi.common.bean.po.SysNotice record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "notice_id, notice_title, notice_type, notice_content, status, create_by, create_time, ",
        "update_by, update_time, remark",
        "from sys_notice",
        "where notice_id = #{noticeId,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="notice_id", javaType= Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="notice_title", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="notice_type", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="notice_content", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="create_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="update_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="update_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="remark", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    com.ruoyi.common.bean.po.SysNotice selectByPrimaryKey(Integer noticeId);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update sys_notice",
        "set notice_title = #{noticeTitle,jdbcType=VARCHAR},",
          "notice_type = #{noticeType,jdbcType=CHAR},",
          "notice_content = #{noticeContent,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_by = #{updateBy,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where notice_id = #{noticeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.SysNotice record);
}