package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface QrtzSchedulerStateMapper {


    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from qrtz_scheduler_state",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and instance_name = #{instanceName,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(com.ruoyi.common.bean.po.QrtzSchedulerStateKey key);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into qrtz_scheduler_state (sched_name, instance_name, ",
        "last_checkin_time, checkin_interval)",
        "values (#{schedName,jdbcType=VARCHAR}, #{instanceName,jdbcType=VARCHAR}, ",
        "#{lastCheckinTime,jdbcType=BIGINT}, #{checkinInterval,jdbcType=BIGINT})"
    })
    int insert(com.ruoyi.common.bean.po.QrtzSchedulerState record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "sched_name, instance_name, last_checkin_time, checkin_interval",
        "from qrtz_scheduler_state",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and instance_name = #{instanceName,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="sched_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="instance_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="last_checkin_time", javaType= Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="checkin_interval", javaType= Long.class, jdbcType=JdbcType.BIGINT)
    })
    com.ruoyi.common.bean.po.QrtzSchedulerState selectByPrimaryKey(com.ruoyi.common.bean.po.QrtzSchedulerStateKey key);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update qrtz_scheduler_state",
        "set last_checkin_time = #{lastCheckinTime,jdbcType=BIGINT},",
          "checkin_interval = #{checkinInterval,jdbcType=BIGINT}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and instance_name = #{instanceName,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.QrtzSchedulerState record);
}