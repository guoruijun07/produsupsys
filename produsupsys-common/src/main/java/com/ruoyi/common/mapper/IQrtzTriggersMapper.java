package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface IQrtzTriggersMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from qrtz_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(com.ruoyi.common.bean.po.QrtzTriggersKey key);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into qrtz_triggers (sched_name, trigger_name, ",
        "trigger_group, job_name, ",
        "job_group, description, ",
        "next_fire_time, prev_fire_time, ",
        "priority, trigger_state, ",
        "trigger_type, start_time, ",
        "end_time, calendar_name, ",
        "misfire_instr, job_data)",
        "values (#{schedName,jdbcType=VARCHAR}, #{triggerName,jdbcType=VARCHAR}, ",
        "#{triggerGroup,jdbcType=VARCHAR}, #{jobName,jdbcType=VARCHAR}, ",
        "#{jobGroup,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{nextFireTime,jdbcType=BIGINT}, #{prevFireTime,jdbcType=BIGINT}, ",
        "#{priority,jdbcType=INTEGER}, #{triggerState,jdbcType=VARCHAR}, ",
        "#{triggerType,jdbcType=VARCHAR}, #{startTime,jdbcType=BIGINT}, ",
        "#{endTime,jdbcType=BIGINT}, #{calendarName,jdbcType=VARCHAR}, ",
        "#{misfireInstr,jdbcType=SMALLINT}, #{jobData,jdbcType=LONGVARBINARY})"
    })
    int insert(com.ruoyi.common.bean.po.QrtzTriggers record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "sched_name, trigger_name, trigger_group, job_name, job_group, description, next_fire_time, ",
        "prev_fire_time, priority, trigger_state, trigger_type, start_time, end_time, ",
        "calendar_name, misfire_instr, job_data",
        "from qrtz_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="sched_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="trigger_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="trigger_group", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="job_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="job_group", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="description", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="next_fire_time", javaType= Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="prev_fire_time", javaType= Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="priority", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="trigger_state", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="trigger_type", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="start_time", javaType= Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="end_time", javaType= Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="calendar_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="misfire_instr", javaType= Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="job_data", javaType=byte[].class, jdbcType=JdbcType.LONGVARBINARY)
    })
    com.ruoyi.common.bean.po.QrtzTriggers selectByPrimaryKey(com.ruoyi.common.bean.po.QrtzTriggersKey key);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update qrtz_triggers",
        "set job_name = #{jobName,jdbcType=VARCHAR},",
          "job_group = #{jobGroup,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "next_fire_time = #{nextFireTime,jdbcType=BIGINT},",
          "prev_fire_time = #{prevFireTime,jdbcType=BIGINT},",
          "priority = #{priority,jdbcType=INTEGER},",
          "trigger_state = #{triggerState,jdbcType=VARCHAR},",
          "trigger_type = #{triggerType,jdbcType=VARCHAR},",
          "start_time = #{startTime,jdbcType=BIGINT},",
          "end_time = #{endTime,jdbcType=BIGINT},",
          "calendar_name = #{calendarName,jdbcType=VARCHAR},",
          "misfire_instr = #{misfireInstr,jdbcType=SMALLINT},",
          "job_data = #{jobData,jdbcType=LONGVARBINARY}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(com.ruoyi.common.bean.po.QrtzTriggers record);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update qrtz_triggers",
        "set job_name = #{jobName,jdbcType=VARCHAR},",
          "job_group = #{jobGroup,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "next_fire_time = #{nextFireTime,jdbcType=BIGINT},",
          "prev_fire_time = #{prevFireTime,jdbcType=BIGINT},",
          "priority = #{priority,jdbcType=INTEGER},",
          "trigger_state = #{triggerState,jdbcType=VARCHAR},",
          "trigger_type = #{triggerType,jdbcType=VARCHAR},",
          "start_time = #{startTime,jdbcType=BIGINT},",
          "end_time = #{endTime,jdbcType=BIGINT},",
          "calendar_name = #{calendarName,jdbcType=VARCHAR},",
          "misfire_instr = #{misfireInstr,jdbcType=SMALLINT}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.QrtzTriggers record);
}