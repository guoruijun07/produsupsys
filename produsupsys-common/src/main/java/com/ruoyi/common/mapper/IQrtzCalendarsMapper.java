package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface IQrtzCalendarsMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from qrtz_calendars",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and calendar_name = #{calendarName,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(com.ruoyi.common.bean.po.QrtzCalendarsKey key);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into qrtz_calendars (sched_name, calendar_name, ",
        "calendar)",
        "values (#{schedName,jdbcType=VARCHAR}, #{calendarName,jdbcType=VARCHAR}, ",
        "#{calendar,jdbcType=LONGVARBINARY})"
    })
    int insert(com.ruoyi.common.bean.po.QrtzCalendars record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "sched_name, calendar_name, calendar",
        "from qrtz_calendars",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and calendar_name = #{calendarName,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="sched_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="calendar_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="calendar", javaType=byte[].class, jdbcType=JdbcType.LONGVARBINARY)
    })
    com.ruoyi.common.bean.po.QrtzCalendars selectByPrimaryKey(com.ruoyi.common.bean.po.QrtzCalendarsKey key);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update qrtz_calendars",
        "set calendar = #{calendar,jdbcType=LONGVARBINARY}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and calendar_name = #{calendarName,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(com.ruoyi.common.bean.po.QrtzCalendars record);
}