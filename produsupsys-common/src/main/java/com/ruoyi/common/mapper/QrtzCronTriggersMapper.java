package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface QrtzCronTriggersMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from qrtz_cron_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(com.ruoyi.common.bean.po.QrtzCronTriggersKey key);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into qrtz_cron_triggers (sched_name, trigger_name, ",
        "trigger_group, cron_expression, ",
        "time_zone_id)",
        "values (#{schedName,jdbcType=VARCHAR}, #{triggerName,jdbcType=VARCHAR}, ",
        "#{triggerGroup,jdbcType=VARCHAR}, #{cronExpression,jdbcType=VARCHAR}, ",
        "#{timeZoneId,jdbcType=VARCHAR})"
    })
    int insert(com.ruoyi.common.bean.po.QrtzCronTriggers record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "sched_name, trigger_name, trigger_group, cron_expression, time_zone_id",
        "from qrtz_cron_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="sched_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="trigger_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="trigger_group", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="cron_expression", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="time_zone_id", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    com.ruoyi.common.bean.po.QrtzCronTriggers selectByPrimaryKey(com.ruoyi.common.bean.po.QrtzCronTriggersKey key);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update qrtz_cron_triggers",
        "set cron_expression = #{cronExpression,jdbcType=VARCHAR},",
          "time_zone_id = #{timeZoneId,jdbcType=VARCHAR}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.QrtzCronTriggers record);
}