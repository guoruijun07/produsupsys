package com.ruoyi.common.mapper;


import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface IQrtzFiredTriggersMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from qrtz_fired_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and entry_id = #{entryId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(com.ruoyi.common.bean.po.QrtzFiredTriggersKey key);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into qrtz_fired_triggers (sched_name, entry_id, ",
        "trigger_name, trigger_group, ",
        "instance_name, fired_time, ",
        "sched_time, priority, ",
        "state, job_name, ",
        "job_group, is_nonconcurrent, ",
        "requests_recovery)",
        "values (#{schedName,jdbcType=VARCHAR}, #{entryId,jdbcType=VARCHAR}, ",
        "#{triggerName,jdbcType=VARCHAR}, #{triggerGroup,jdbcType=VARCHAR}, ",
        "#{instanceName,jdbcType=VARCHAR}, #{firedTime,jdbcType=BIGINT}, ",
        "#{schedTime,jdbcType=BIGINT}, #{priority,jdbcType=INTEGER}, ",
        "#{state,jdbcType=VARCHAR}, #{jobName,jdbcType=VARCHAR}, ",
        "#{jobGroup,jdbcType=VARCHAR}, #{isNonconcurrent,jdbcType=VARCHAR}, ",
        "#{requestsRecovery,jdbcType=VARCHAR})"
    })
    int insert(com.ruoyi.common.bean.po.QrtzFiredTriggers record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "sched_name, entry_id, trigger_name, trigger_group, instance_name, fired_time, ",
        "sched_time, priority, state, job_name, job_group, is_nonconcurrent, requests_recovery",
        "from qrtz_fired_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and entry_id = #{entryId,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="sched_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="entry_id", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="trigger_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="trigger_group", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="instance_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="fired_time", javaType= Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sched_time", javaType= Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="priority", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="state", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="job_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="job_group", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_nonconcurrent", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="requests_recovery", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    com.ruoyi.common.bean.po.QrtzFiredTriggers selectByPrimaryKey(com.ruoyi.common.bean.po.QrtzFiredTriggersKey key);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update qrtz_fired_triggers",
        "set trigger_name = #{triggerName,jdbcType=VARCHAR},",
          "trigger_group = #{triggerGroup,jdbcType=VARCHAR},",
          "instance_name = #{instanceName,jdbcType=VARCHAR},",
          "fired_time = #{firedTime,jdbcType=BIGINT},",
          "sched_time = #{schedTime,jdbcType=BIGINT},",
          "priority = #{priority,jdbcType=INTEGER},",
          "state = #{state,jdbcType=VARCHAR},",
          "job_name = #{jobName,jdbcType=VARCHAR},",
          "job_group = #{jobGroup,jdbcType=VARCHAR},",
          "is_nonconcurrent = #{isNonconcurrent,jdbcType=VARCHAR},",
          "requests_recovery = #{requestsRecovery,jdbcType=VARCHAR}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and entry_id = #{entryId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.QrtzFiredTriggers record);
}