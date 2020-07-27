package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface IQrtzSimpleTriggersMapper {


    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from qrtz_simple_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(com.ruoyi.common.bean.po.QrtzSimpleTriggersKey key);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into qrtz_simple_triggers (sched_name, trigger_name, ",
        "trigger_group, repeat_count, ",
        "repeat_interval, times_triggered)",
        "values (#{schedName,jdbcType=VARCHAR}, #{triggerName,jdbcType=VARCHAR}, ",
        "#{triggerGroup,jdbcType=VARCHAR}, #{repeatCount,jdbcType=BIGINT}, ",
        "#{repeatInterval,jdbcType=BIGINT}, #{timesTriggered,jdbcType=BIGINT})"
    })
    int insert(com.ruoyi.common.bean.po.QrtzSimpleTriggers record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "sched_name, trigger_name, trigger_group, repeat_count, repeat_interval, times_triggered",
        "from qrtz_simple_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="sched_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="trigger_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="trigger_group", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="repeat_count", javaType= Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="repeat_interval", javaType= Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="times_triggered", javaType= Long.class, jdbcType=JdbcType.BIGINT)
    })
    com.ruoyi.common.bean.po.QrtzSimpleTriggers selectByPrimaryKey(com.ruoyi.common.bean.po.QrtzSimpleTriggersKey key);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update qrtz_simple_triggers",
        "set repeat_count = #{repeatCount,jdbcType=BIGINT},",
          "repeat_interval = #{repeatInterval,jdbcType=BIGINT},",
          "times_triggered = #{timesTriggered,jdbcType=BIGINT}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.QrtzSimpleTriggers record);
}