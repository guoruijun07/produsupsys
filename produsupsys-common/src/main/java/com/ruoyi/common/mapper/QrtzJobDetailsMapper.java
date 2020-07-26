package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface QrtzJobDetailsMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from qrtz_job_details",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and job_name = #{jobName,jdbcType=VARCHAR}",
          "and job_group = #{jobGroup,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(com.ruoyi.common.bean.po.QrtzJobDetailsKey key);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into qrtz_job_details (sched_name, job_name, ",
        "job_group, description, ",
        "job_class_name, is_durable, ",
        "is_nonconcurrent, is_update_data, ",
        "requests_recovery, job_data)",
        "values (#{schedName,jdbcType=VARCHAR}, #{jobName,jdbcType=VARCHAR}, ",
        "#{jobGroup,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{jobClassName,jdbcType=VARCHAR}, #{isDurable,jdbcType=VARCHAR}, ",
        "#{isNonconcurrent,jdbcType=VARCHAR}, #{isUpdateData,jdbcType=VARCHAR}, ",
        "#{requestsRecovery,jdbcType=VARCHAR}, #{jobData,jdbcType=LONGVARBINARY})"
    })
    int insert(com.ruoyi.common.bean.po.QrtzJobDetails record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "sched_name, job_name, job_group, description, job_class_name, is_durable, is_nonconcurrent, ",
        "is_update_data, requests_recovery, job_data",
        "from qrtz_job_details",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and job_name = #{jobName,jdbcType=VARCHAR}",
          "and job_group = #{jobGroup,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="sched_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="job_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="job_group", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="description", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="job_class_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_durable", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_nonconcurrent", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_update_data", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="requests_recovery", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="job_data", javaType=byte[].class, jdbcType=JdbcType.LONGVARBINARY)
    })
    com.ruoyi.common.bean.po.QrtzJobDetails selectByPrimaryKey(com.ruoyi.common.bean.po.QrtzJobDetailsKey key);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update qrtz_job_details",
        "set description = #{description,jdbcType=VARCHAR},",
          "job_class_name = #{jobClassName,jdbcType=VARCHAR},",
          "is_durable = #{isDurable,jdbcType=VARCHAR},",
          "is_nonconcurrent = #{isNonconcurrent,jdbcType=VARCHAR},",
          "is_update_data = #{isUpdateData,jdbcType=VARCHAR},",
          "requests_recovery = #{requestsRecovery,jdbcType=VARCHAR},",
          "job_data = #{jobData,jdbcType=LONGVARBINARY}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and job_name = #{jobName,jdbcType=VARCHAR}",
          "and job_group = #{jobGroup,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(com.ruoyi.common.bean.po.QrtzJobDetails record);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update qrtz_job_details",
        "set description = #{description,jdbcType=VARCHAR},",
          "job_class_name = #{jobClassName,jdbcType=VARCHAR},",
          "is_durable = #{isDurable,jdbcType=VARCHAR},",
          "is_nonconcurrent = #{isNonconcurrent,jdbcType=VARCHAR},",
          "is_update_data = #{isUpdateData,jdbcType=VARCHAR},",
          "requests_recovery = #{requestsRecovery,jdbcType=VARCHAR}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and job_name = #{jobName,jdbcType=VARCHAR}",
          "and job_group = #{jobGroup,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.QrtzJobDetails record);
}