package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import com.ruoyi.common.bean.po.ClientWebBicUserProject;

public interface ClientWebBicUserProjectMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from client_web_bic_user_project",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into client_web_bic_user_project (id)",
        "values (#{id,jdbcType=INTEGER})"
    })
    int insert(ClientWebBicUserProject record);

}