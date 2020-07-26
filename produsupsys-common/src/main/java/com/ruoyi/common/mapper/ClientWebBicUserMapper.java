package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import com.ruoyi.common.bean.po.ClientWebBicUser;

public interface ClientWebBicUserMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from client_web_bic_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into client_web_bic_user (id)",
        "values (#{id,jdbcType=INTEGER})"
    })
    int insert(ClientWebBicUser record);


}