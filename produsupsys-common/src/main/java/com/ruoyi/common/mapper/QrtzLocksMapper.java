package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface QrtzLocksMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from qrtz_locks",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and lock_name = #{lockName,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(com.ruoyi.common.bean.po.QrtzLocksKey key);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into qrtz_locks (sched_name, lock_name)",
        "values (#{schedName,jdbcType=VARCHAR}, #{lockName,jdbcType=VARCHAR})"
    })
    int insert(com.ruoyi.common.bean.po.QrtzLocksKey record);


}