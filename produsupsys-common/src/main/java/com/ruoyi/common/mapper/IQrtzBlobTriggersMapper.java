package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface IQrtzBlobTriggersMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from qrtz_blob_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(com.ruoyi.common.bean.po.QrtzBlobTriggersKey key);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into qrtz_blob_triggers (sched_name, trigger_name, ",
        "trigger_group, blob_data)",
        "values (#{schedName,jdbcType=VARCHAR}, #{triggerName,jdbcType=VARCHAR}, ",
        "#{triggerGroup,jdbcType=VARCHAR}, #{blobData,jdbcType=LONGVARBINARY})"
    })
    int insert(com.ruoyi.common.bean.po.QrtzBlobTriggers record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "sched_name, trigger_name, trigger_group, blob_data",
        "from qrtz_blob_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="sched_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="trigger_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="trigger_group", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="blob_data", javaType=byte[].class, jdbcType=JdbcType.LONGVARBINARY)
    })
    com.ruoyi.common.bean.po.QrtzBlobTriggers selectByPrimaryKey(com.ruoyi.common.bean.po.QrtzBlobTriggersKey key);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update qrtz_blob_triggers",
        "set blob_data = #{blobData,jdbcType=LONGVARBINARY}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(com.ruoyi.common.bean.po.QrtzBlobTriggers record);
}