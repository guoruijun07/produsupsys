package com.ruoyi.common.mapper;

import com.ruoyi.common.bean.po.ClientWebPpcPrice;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

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

    /**
     * @mbggenerated
     */
    @Select({
            "select",
            "id, user_id, menu, source, price",
            "from tb_price_info",
            "where user_id = #{userId,jdbcType=BIGINT} and menu = #{device,jdbcType=INTEGER} and source = #{device,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
            @Arg(column = "id", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "user_id", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "menu", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "source", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "price", javaType = Double.class, jdbcType = JdbcType.DOUBLE)
    })
    ClientWebPpcPrice selectPriceByUserId(Long userId, Integer meunu, Integer device);

}