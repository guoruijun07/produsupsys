package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface PostWebBicUserProjectMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from post_web_bic_user_project",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into post_web_bic_user_project (id)",
        "values (#{id,jdbcType=INTEGER})"
    })
    int insert(com.ruoyi.common.bean.po.PostWebBicUserProject record);

}