package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import com.ruoyi.common.bean.po.ClientWebPkpOrderImportKey;
import com.ruoyi.common.bean.po.ClientWebPkpOrderImport;

public interface ClientWebPkpOrderImportMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from client_web_pkp_order_import",
        "where id = #{id,jdbcType=BIGINT}",
          "and is_fee = #{isFee,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(ClientWebPkpOrderImportKey key);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into client_web_pkp_order_import (id, is_fee, order_date, ",
        "send_date, company, ",
        "mail_no, fee, inner_name, ",
        "count, reciver_name, ",
        "reciver_mobile_one, reciver_province, ",
        "reciver_city, reciver_county, ",
        "reciver_address, sender_name, ",
        "sender_mobile_one, order_channel, ",
        "order_no, weight, ",
        "real_fee, package_fee, ",
        "total_fee, profit, ",
        "profit_rate)",
        "values (#{id,jdbcType=BIGINT}, #{isFee,jdbcType=CHAR}, #{orderDate,jdbcType=TIMESTAMP}, ",
        "#{sendDate,jdbcType=TIMESTAMP}, #{company,jdbcType=VARCHAR}, ",
        "#{mailNo,jdbcType=VARCHAR}, #{fee,jdbcType=VARCHAR}, #{innerName,jdbcType=VARCHAR}, ",
        "#{count,jdbcType=INTEGER}, #{reciverName,jdbcType=VARCHAR}, ",
        "#{reciverMobileOne,jdbcType=VARCHAR}, #{reciverProvince,jdbcType=VARCHAR}, ",
        "#{reciverCity,jdbcType=VARCHAR}, #{reciverCounty,jdbcType=VARCHAR}, ",
        "#{reciverAddress,jdbcType=VARCHAR}, #{senderName,jdbcType=VARCHAR}, ",
        "#{senderMobileOne,jdbcType=VARCHAR}, #{orderChannel,jdbcType=VARCHAR}, ",
        "#{orderNo,jdbcType=VARCHAR}, #{weight,jdbcType=VARCHAR}, ",
        "#{realFee,jdbcType=VARCHAR}, #{packageFee,jdbcType=VARCHAR}, ",
        "#{totalFee,jdbcType=VARCHAR}, #{profit,jdbcType=VARCHAR}, ",
        "#{profitRate,jdbcType=DECIMAL})"
    })
    int insert(ClientWebPkpOrderImport record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, is_fee, order_date, send_date, company, mail_no, fee, inner_name, count, ",
        "reciver_name, reciver_mobile_one, reciver_province, reciver_city, reciver_county, ",
        "reciver_address, sender_name, sender_mobile_one, order_channel, order_no, weight, ",
        "real_fee, package_fee, total_fee, profit, profit_rate",
        "from client_web_pkp_order_import",
        "where id = #{id,jdbcType=BIGINT}",
          "and is_fee = #{isFee,jdbcType=CHAR}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType= Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_fee", javaType= String.class, jdbcType=JdbcType.CHAR, id=true),
        @Arg(column="order_date", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="send_date", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="company", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="mail_no", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="fee", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="inner_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="count", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="reciver_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reciver_mobile_one", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reciver_province", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reciver_city", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reciver_county", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="reciver_address", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sender_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sender_mobile_one", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="order_channel", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="order_no", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="weight", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="real_fee", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="package_fee", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="total_fee", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="profit", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="profit_rate", javaType= java.math.BigDecimal.class, jdbcType=JdbcType.DECIMAL)
    })
    ClientWebPkpOrderImport selectByPrimaryKey(ClientWebPkpOrderImportKey key);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update client_web_pkp_order_import",
        "set order_date = #{orderDate,jdbcType=TIMESTAMP},",
          "send_date = #{sendDate,jdbcType=TIMESTAMP},",
          "company = #{company,jdbcType=VARCHAR},",
          "mail_no = #{mailNo,jdbcType=VARCHAR},",
          "fee = #{fee,jdbcType=VARCHAR},",
          "inner_name = #{innerName,jdbcType=VARCHAR},",
          "count = #{count,jdbcType=INTEGER},",
          "reciver_name = #{reciverName,jdbcType=VARCHAR},",
          "reciver_mobile_one = #{reciverMobileOne,jdbcType=VARCHAR},",
          "reciver_province = #{reciverProvince,jdbcType=VARCHAR},",
          "reciver_city = #{reciverCity,jdbcType=VARCHAR},",
          "reciver_county = #{reciverCounty,jdbcType=VARCHAR},",
          "reciver_address = #{reciverAddress,jdbcType=VARCHAR},",
          "sender_name = #{senderName,jdbcType=VARCHAR},",
          "sender_mobile_one = #{senderMobileOne,jdbcType=VARCHAR},",
          "order_channel = #{orderChannel,jdbcType=VARCHAR},",
          "order_no = #{orderNo,jdbcType=VARCHAR},",
          "weight = #{weight,jdbcType=VARCHAR},",
          "real_fee = #{realFee,jdbcType=VARCHAR},",
          "package_fee = #{packageFee,jdbcType=VARCHAR},",
          "total_fee = #{totalFee,jdbcType=VARCHAR},",
          "profit = #{profit,jdbcType=VARCHAR},",
          "profit_rate = #{profitRate,jdbcType=DECIMAL}",
        "where id = #{id,jdbcType=BIGINT}",
          "and is_fee = #{isFee,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(ClientWebPkpOrderImport record);
}