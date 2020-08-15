package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import com.ruoyi.common.bean.po.PostPpcPrice;

public interface PostPpcPriceMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from post_ppc_price",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into post_ppc_price (id, user_id, ",
        "menu, source, price)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{menu,jdbcType=INTEGER}, #{source,jdbcType=INTEGER}, #{price,jdbcType=DOUBLE})"
    })
    int insert(PostPpcPrice record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, user_id, menu, source, price",
        "from post_ppc_price",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType= Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="user_id", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="menu", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="source", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="price", javaType= Double.class, jdbcType=JdbcType.DOUBLE)
    })
    PostPpcPrice selectByPrimaryKey(Integer id);
    

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update post_ppc_price",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "menu = #{menu,jdbcType=INTEGER},",
          "source = #{source,jdbcType=INTEGER},",
          "price = #{price,jdbcType=DOUBLE}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PostPpcPrice record);

    /**
     * @mbggenerated
     */
    @Select({
            "select",
            "id, user_id, menu, source, price",
            "from post_ppc_price",
            "where user_id = #{userId,jdbcType=BIGINT} and menu = #{menu,jdbcType=INTEGER} and source = #{source,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
            @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
            @Arg(column="user_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
            @Arg(column="menu", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="source", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="price", javaType=Double.class, jdbcType=JdbcType.DOUBLE)
    })
    PostPpcPrice selectPriceByUserId(@Param("userId") Long userId, @Param("menu") Integer menu,  @Param("source") Integer source);
}