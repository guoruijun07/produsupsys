package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface QrtzPausedTriggerGrpsMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from qrtz_paused_trigger_grps",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(com.ruoyi.common.bean.po.QrtzPausedTriggerGrpsKey key);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into qrtz_paused_trigger_grps (sched_name, trigger_group)",
        "values (#{schedName,jdbcType=VARCHAR}, #{triggerGroup,jdbcType=VARCHAR})"
    })
    int insert(com.ruoyi.common.bean.po.QrtzPausedTriggerGrpsKey record);

}