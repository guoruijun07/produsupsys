package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface ISysRoleDeptMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_role_dept",
        "where role_id = #{roleId,jdbcType=BIGINT}",
          "and dept_id = #{deptId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(com.ruoyi.common.bean.po.SysRoleDeptKey key);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_role_dept (role_id, dept_id)",
        "values (#{roleId,jdbcType=BIGINT}, #{deptId,jdbcType=BIGINT})"
    })
    int insert(com.ruoyi.common.bean.po.SysRoleDeptKey record);

}