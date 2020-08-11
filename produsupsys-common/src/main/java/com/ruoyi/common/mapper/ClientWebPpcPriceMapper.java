package com.ruoyi.common.mapper;

import com.ruoyi.common.bean.po.ClientWebPpcPrice;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface ClientWebPpcPriceMapper {

    /**
     * @mbggenerated
     */
    @Delete({
            "delete from client_web_ppc_price",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbggenerated
     */
    @Insert({
            "insert into client_web_ppc_price (id)",
            "values (#{id,jdbcType=INTEGER})"
    })
    int insert(ClientWebPpcPrice record);



}