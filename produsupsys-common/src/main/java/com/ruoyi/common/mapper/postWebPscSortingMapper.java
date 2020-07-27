package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface postWebPscSortingMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from post_web_psc_sorting",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into post_web_psc_sorting (id, org_num, ",
        "org_name, sorting_name, ",
        "distribu_center, dlv_name, ",
        "area, area_num, marking, ",
        "remark, receive1, ",
        "receive2, receive3, ",
        "receive4, receive5)",
        "values (#{id,jdbcType=INTEGER}, #{orgNum,jdbcType=INTEGER}, ",
        "#{orgName,jdbcType=VARCHAR}, #{sortingName,jdbcType=VARCHAR}, ",
        "#{distribuCenter,jdbcType=VARCHAR}, #{dlvName,jdbcType=VARCHAR}, ",
        "#{area,jdbcType=VARCHAR}, #{areaNum,jdbcType=VARCHAR}, #{marking,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR}, #{receive1,jdbcType=VARCHAR}, ",
        "#{receive2,jdbcType=VARCHAR}, #{receive3,jdbcType=VARCHAR}, ",
        "#{receive4,jdbcType=VARCHAR}, #{receive5,jdbcType=VARCHAR})"
    })
    int insert(com.ruoyi.common.bean.po.postWebPscSorting record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, org_num, org_name, sorting_name, distribu_center, dlv_name, area, area_num, ",
        "marking, remark, receive1, receive2, receive3, receive4, receive5",
        "from post_web_psc_sorting",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType= Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="org_num", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="org_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sorting_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="distribu_center", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="dlv_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="area", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="area_num", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="marking", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="remark", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="receive1", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="receive2", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="receive3", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="receive4", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="receive5", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    com.ruoyi.common.bean.po.postWebPscSorting selectByPrimaryKey(Integer id);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update post_web_psc_sorting",
        "set org_num = #{orgNum,jdbcType=INTEGER},",
          "org_name = #{orgName,jdbcType=VARCHAR},",
          "sorting_name = #{sortingName,jdbcType=VARCHAR},",
          "distribu_center = #{distribuCenter,jdbcType=VARCHAR},",
          "dlv_name = #{dlvName,jdbcType=VARCHAR},",
          "area = #{area,jdbcType=VARCHAR},",
          "area_num = #{areaNum,jdbcType=VARCHAR},",
          "marking = #{marking,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "receive1 = #{receive1,jdbcType=VARCHAR},",
          "receive2 = #{receive2,jdbcType=VARCHAR},",
          "receive3 = #{receive3,jdbcType=VARCHAR},",
          "receive4 = #{receive4,jdbcType=VARCHAR},",
          "receive5 = #{receive5,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.postWebPscSorting record);
}