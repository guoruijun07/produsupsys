package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import com.ruoyi.common.bean.po.ClientWebPscSorting;

public interface ClientWebPscSortingMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from client_web_psc_sorting",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into client_web_psc_sorting (id)",
        "values (#{id,jdbcType=INTEGER})"
    })
    int insert(ClientWebPscSorting record);

}