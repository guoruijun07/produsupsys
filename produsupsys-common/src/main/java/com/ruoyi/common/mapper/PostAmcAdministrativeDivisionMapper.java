package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import com.ruoyi.common.bean.po.PostAmcAdministrativeDivision;

public interface PostAmcAdministrativeDivisionMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from post_amc_administrative_division",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into post_amc_administrative_division (id, provicne_name, ",
        "provicne_code, city_name, ",
        "city_code, county_name, ",
        "county_code)",
        "values (#{id,jdbcType=INTEGER}, #{provicneName,jdbcType=VARCHAR}, ",
        "#{provicneCode,jdbcType=VARCHAR}, #{cityName,jdbcType=VARCHAR}, ",
        "#{cityCode,jdbcType=VARCHAR}, #{countyName,jdbcType=VARCHAR}, ",
        "#{countyCode,jdbcType=VARCHAR})"
    })
    int insert(PostAmcAdministrativeDivision record);

   
    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, provicne_name, provicne_code, city_name, city_code, county_name, county_code",
        "from post_amc_administrative_division",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType= Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="provicne_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="provicne_code", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="city_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="city_code", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="county_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="county_code", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    PostAmcAdministrativeDivision selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update post_amc_administrative_division",
        "set provicne_name = #{provicneName,jdbcType=VARCHAR},",
          "provicne_code = #{provicneCode,jdbcType=VARCHAR},",
          "city_name = #{cityName,jdbcType=VARCHAR},",
          "city_code = #{cityCode,jdbcType=VARCHAR},",
          "county_name = #{countyName,jdbcType=VARCHAR},",
          "county_code = #{countyCode,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PostAmcAdministrativeDivision record);
}