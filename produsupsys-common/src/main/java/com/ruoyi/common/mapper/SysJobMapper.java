package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface SysJobMapper {


    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_job",
        "where job_id = #{jobId,jdbcType=BIGINT}",
          "and job_name = #{jobName,jdbcType=VARCHAR}",
          "and job_group = #{jobGroup,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(com.ruoyi.common.bean.po.SysJobKey key);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_job (job_id, job_name, ",
        "job_group, invoke_target, ",
        "cron_expression, misfire_policy, ",
        "concurrent, status, create_by, ",
        "create_time, update_by, ",
        "update_time, remark)",
        "values (#{jobId,jdbcType=BIGINT}, #{jobName,jdbcType=VARCHAR}, ",
        "#{jobGroup,jdbcType=VARCHAR}, #{invokeTarget,jdbcType=VARCHAR}, ",
        "#{cronExpression,jdbcType=VARCHAR}, #{misfirePolicy,jdbcType=VARCHAR}, ",
        "#{concurrent,jdbcType=CHAR}, #{status,jdbcType=CHAR}, #{createBy,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateBy,jdbcType=VARCHAR}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(com.ruoyi.common.bean.po.SysJob record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "job_id, job_name, job_group, invoke_target, cron_expression, misfire_policy, ",
        "concurrent, status, create_by, create_time, update_by, update_time, remark",
        "from sys_job",
        "where job_id = #{jobId,jdbcType=BIGINT}",
          "and job_name = #{jobName,jdbcType=VARCHAR}",
          "and job_group = #{jobGroup,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="job_id", javaType= Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="job_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="job_group", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="invoke_target", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="cron_expression", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="misfire_policy", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="concurrent", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="status", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="create_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="update_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="update_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="remark", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    com.ruoyi.common.bean.po.SysJob selectByPrimaryKey(com.ruoyi.common.bean.po.SysJobKey key);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update sys_job",
        "set invoke_target = #{invokeTarget,jdbcType=VARCHAR},",
          "cron_expression = #{cronExpression,jdbcType=VARCHAR},",
          "misfire_policy = #{misfirePolicy,jdbcType=VARCHAR},",
          "concurrent = #{concurrent,jdbcType=CHAR},",
          "status = #{status,jdbcType=CHAR},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_by = #{updateBy,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where job_id = #{jobId,jdbcType=BIGINT}",
          "and job_name = #{jobName,jdbcType=VARCHAR}",
          "and job_group = #{jobGroup,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.SysJob record);
}