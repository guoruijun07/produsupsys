package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface PostWebPscSortingMatchingMapper {


    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from post_web_psc_sorting_matching",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into post_web_psc_sorting_matching (id, batch_no, ",
        "order_no, sender_name, ",
        "sender_mobile_one, sender_mobile_two, ",
        "sender_province, sender_city, ",
        "sender_county, sender_address, ",
        "reciver_name, reciver_mobile_one, ",
        "reciver_mobile_two, reciver_province, ",
        "reciver_city, reciver_county, ",
        "reciver_address, datoubi, ",
        "datoubi_code, consolidation_name, ",
        "consolidation_code, level_four_sorting_name, ",
        "sorting_name, marking, ",
        "distribu_center, dlv_no, ",
        "dlv_name, org_no, ",
        "org_name, operation_no, ",
        "operation_name, operation_time, ",
        "matching_distribu_center_status, city_wide_flag, ",
        "sorting_status, remark, ",
        "modify_time, create_time)",
        "values (#{id,jdbcType=INTEGER}, #{batchNo,jdbcType=VARCHAR}, ",
        "#{orderNo,jdbcType=VARCHAR}, #{senderName,jdbcType=VARCHAR}, ",
        "#{senderMobileOne,jdbcType=VARCHAR}, #{senderMobileTwo,jdbcType=VARCHAR}, ",
        "#{senderProvince,jdbcType=VARCHAR}, #{senderCity,jdbcType=VARCHAR}, ",
        "#{senderCounty,jdbcType=VARCHAR}, #{senderAddress,jdbcType=VARCHAR}, ",
        "#{reciverName,jdbcType=VARCHAR}, #{reciverMobileOne,jdbcType=VARCHAR}, ",
        "#{reciverMobileTwo,jdbcType=VARCHAR}, #{reciverProvince,jdbcType=VARCHAR}, ",
        "#{reciverCity,jdbcType=VARCHAR}, #{reciverCounty,jdbcType=VARCHAR}, ",
        "#{reciverAddress,jdbcType=VARCHAR}, #{datoubi,jdbcType=VARCHAR}, ",
        "#{datoubiCode,jdbcType=VARCHAR}, #{consolidationName,jdbcType=VARCHAR}, ",
        "#{consolidationCode,jdbcType=VARCHAR}, #{levelFourSortingName,jdbcType=VARCHAR}, ",
        "#{sortingName,jdbcType=VARCHAR}, #{marking,jdbcType=VARCHAR}, ",
        "#{distribuCenter,jdbcType=VARCHAR}, #{dlvNo,jdbcType=VARCHAR}, ",
        "#{dlvName,jdbcType=VARCHAR}, #{orgNo,jdbcType=VARCHAR}, ",
        "#{orgName,jdbcType=VARCHAR}, #{operationNo,jdbcType=VARCHAR}, ",
        "#{operationName,jdbcType=VARCHAR}, #{operationTime,jdbcType=TIMESTAMP}, ",
        "#{matchingDistribuCenterStatus,jdbcType=INTEGER}, #{cityWideFlag,jdbcType=INTEGER}, ",
        "#{sortingStatus,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR}, ",
        "#{modifyTime,jdbcType=TIMESTAMP}, #{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(com.ruoyi.common.bean.po.PostWebPscSortingMatching record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, batch_no, order_no, sender_name, sender_mobile_one, sender_mobile_two, sender_province, ",
        "sender_city, sender_county, sender_address, reciver_name, reciver_mobile_one, ",
        "reciver_mobile_two, reciver_province, reciver_city, reciver_county, reciver_address, ",
        "datoubi, datoubi_code, consolidation_name, consolidation_code, level_four_sorting_name, ",
        "sorting_name, marking, distribu_center, dlv_no, dlv_name, org_no, org_name, ",
        "operation_no, operation_name, operation_time, matching_distribu_center_status, ",
        "city_wide_flag, sorting_status, remark, modify_time, create_time",
        "from post_web_psc_sorting_matching",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType= Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="batch_no", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="order_no", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sender_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sender_mobile_one", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sender_mobile_two", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sender_province", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sender_city", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sender_county", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sender_address", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reciver_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reciver_mobile_one", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reciver_mobile_two", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reciver_province", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reciver_city", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reciver_county", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reciver_address", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="datoubi", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="datoubi_code", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="consolidation_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="consolidation_code", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="level_four_sorting_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sorting_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="marking", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="distribu_center", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="dlv_no", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="dlv_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_no", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="org_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="operation_no", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="operation_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="operation_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="matching_distribu_center_status", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="city_wide_flag", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="sorting_status", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="remark", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="modify_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    com.ruoyi.common.bean.po.PostWebPscSortingMatching selectByPrimaryKey(Integer id);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update post_web_psc_sorting_matching",
        "set batch_no = #{batchNo,jdbcType=VARCHAR},",
          "order_no = #{orderNo,jdbcType=VARCHAR},",
          "sender_name = #{senderName,jdbcType=VARCHAR},",
          "sender_mobile_one = #{senderMobileOne,jdbcType=VARCHAR},",
          "sender_mobile_two = #{senderMobileTwo,jdbcType=VARCHAR},",
          "sender_province = #{senderProvince,jdbcType=VARCHAR},",
          "sender_city = #{senderCity,jdbcType=VARCHAR},",
          "sender_county = #{senderCounty,jdbcType=VARCHAR},",
          "sender_address = #{senderAddress,jdbcType=VARCHAR},",
          "reciver_name = #{reciverName,jdbcType=VARCHAR},",
          "reciver_mobile_one = #{reciverMobileOne,jdbcType=VARCHAR},",
          "reciver_mobile_two = #{reciverMobileTwo,jdbcType=VARCHAR},",
          "reciver_province = #{reciverProvince,jdbcType=VARCHAR},",
          "reciver_city = #{reciverCity,jdbcType=VARCHAR},",
          "reciver_county = #{reciverCounty,jdbcType=VARCHAR},",
          "reciver_address = #{reciverAddress,jdbcType=VARCHAR},",
          "datoubi = #{datoubi,jdbcType=VARCHAR},",
          "datoubi_code = #{datoubiCode,jdbcType=VARCHAR},",
          "consolidation_name = #{consolidationName,jdbcType=VARCHAR},",
          "consolidation_code = #{consolidationCode,jdbcType=VARCHAR},",
          "level_four_sorting_name = #{levelFourSortingName,jdbcType=VARCHAR},",
          "sorting_name = #{sortingName,jdbcType=VARCHAR},",
          "marking = #{marking,jdbcType=VARCHAR},",
          "distribu_center = #{distribuCenter,jdbcType=VARCHAR},",
          "dlv_no = #{dlvNo,jdbcType=VARCHAR},",
          "dlv_name = #{dlvName,jdbcType=VARCHAR},",
          "org_no = #{orgNo,jdbcType=VARCHAR},",
          "org_name = #{orgName,jdbcType=VARCHAR},",
          "operation_no = #{operationNo,jdbcType=VARCHAR},",
          "operation_name = #{operationName,jdbcType=VARCHAR},",
          "operation_time = #{operationTime,jdbcType=TIMESTAMP},",
          "matching_distribu_center_status = #{matchingDistribuCenterStatus,jdbcType=INTEGER},",
          "city_wide_flag = #{cityWideFlag,jdbcType=INTEGER},",
          "sorting_status = #{sortingStatus,jdbcType=INTEGER},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.PostWebPscSortingMatching record);
}