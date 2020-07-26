package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface SysUserPostMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_user_post",
        "where user_id = #{userId,jdbcType=BIGINT}",
          "and post_id = #{postId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(com.ruoyi.common.bean.po.SysUserPostKey key);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_user_post (user_id, post_id)",
        "values (#{userId,jdbcType=BIGINT}, #{postId,jdbcType=BIGINT})"
    })
    int insert(com.ruoyi.common.bean.po.SysUserPostKey record);

}