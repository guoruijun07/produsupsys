package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import com.ruoyi.common.bean.po.PostWebPscOrderOriginal;

public interface PostWebPscOrderOriginalMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from post_web_psc_order_original",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into post_web_psc_order_original (id, batch_no, ",
        "order_no, sender_name, ",
        "sender_mobile_one, sender_mobile_two, ",
        "sender_province, sender_city, ",
        "sender_county, sender_address, ",
        "reciver_name, reciver_mobile_one, ",
        "reciver_mobile_two, reciver_province, ",
        "reciver_city, reciver_county, ",
        "reciver_address, operation_no, ",
        "operation_name, operation_time, ",
        "city_wide_flag, sorting_status, ",
        "remark, modify_time, ",
        "create_time)",
        "values (#{id,jdbcType=INTEGER}, #{batchNo,jdbcType=VARCHAR}, ",
        "#{orderNo,jdbcType=VARCHAR}, #{senderName,jdbcType=VARCHAR}, ",
        "#{senderMobileOne,jdbcType=VARCHAR}, #{senderMobileTwo,jdbcType=VARCHAR}, ",
        "#{senderProvince,jdbcType=VARCHAR}, #{senderCity,jdbcType=VARCHAR}, ",
        "#{senderCounty,jdbcType=VARCHAR}, #{senderAddress,jdbcType=VARCHAR}, ",
        "#{reciverName,jdbcType=VARCHAR}, #{reciverMobileOne,jdbcType=VARCHAR}, ",
        "#{reciverMobileTwo,jdbcType=VARCHAR}, #{reciverProvince,jdbcType=VARCHAR}, ",
        "#{reciverCity,jdbcType=VARCHAR}, #{reciverCounty,jdbcType=VARCHAR}, ",
        "#{reciverAddress,jdbcType=VARCHAR}, #{operationNo,jdbcType=VARCHAR}, ",
        "#{operationName,jdbcType=VARCHAR}, #{operationTime,jdbcType=TIMESTAMP}, ",
        "#{cityWideFlag,jdbcType=INTEGER}, #{sortingStatus,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=VARCHAR}, #{modifyTime,jdbcType=TIMESTAMP}, ",
        "#{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(PostWebPscOrderOriginal record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, batch_no, order_no, sender_name, sender_mobile_one, sender_mobile_two, sender_province, ",
        "sender_city, sender_county, sender_address, reciver_name, reciver_mobile_one, ",
        "reciver_mobile_two, reciver_province, reciver_city, reciver_county, reciver_address, ",
        "operation_no, operation_name, operation_time, city_wide_flag, sorting_status, ",
        "remark, modify_time, create_time",
        "from post_web_psc_order_original",
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
        @Arg(column="operation_no", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="operation_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="operation_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="city_wide_flag", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="sorting_status", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="remark", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="modify_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    PostWebPscOrderOriginal selectByPrimaryKey(Integer id);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update post_web_psc_order_original",
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
          "operation_no = #{operationNo,jdbcType=VARCHAR},",
          "operation_name = #{operationName,jdbcType=VARCHAR},",
          "operation_time = #{operationTime,jdbcType=TIMESTAMP},",
          "city_wide_flag = #{cityWideFlag,jdbcType=INTEGER},",
          "sorting_status = #{sortingStatus,jdbcType=INTEGER},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PostWebPscOrderOriginal record);
}