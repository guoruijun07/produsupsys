package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface ISysJobLogMapper {
    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_job_log",
        "where job_log_id = #{jobLogId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long jobLogId);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_job_log (job_log_id, job_name, ",
        "job_group, invoke_target, ",
        "job_message, status, ",
        "exception_info, create_time)",
        "values (#{jobLogId,jdbcType=BIGINT}, #{jobName,jdbcType=VARCHAR}, ",
        "#{jobGroup,jdbcType=VARCHAR}, #{invokeTarget,jdbcType=VARCHAR}, ",
        "#{jobMessage,jdbcType=VARCHAR}, #{status,jdbcType=CHAR}, ",
        "#{exceptionInfo,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(com.ruoyi.common.bean.po.SysJobLog record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "job_log_id, job_name, job_group, invoke_target, job_message, status, exception_info, ",
        "create_time",
        "from sys_job_log",
        "where job_log_id = #{jobLogId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="job_log_id", javaType= Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="job_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="job_group", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="invoke_target", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="job_message", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="exception_info", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    com.ruoyi.common.bean.po.SysJobLog selectByPrimaryKey(Long jobLogId);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update sys_job_log",
        "set job_name = #{jobName,jdbcType=VARCHAR},",
          "job_group = #{jobGroup,jdbcType=VARCHAR},",
          "invoke_target = #{invokeTarget,jdbcType=VARCHAR},",
          "job_message = #{jobMessage,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "exception_info = #{exceptionInfo,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where job_log_id = #{jobLogId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.SysJobLog record);
}