package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface PostWebQpsWaybillBaseMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from post_web_qps_waybill_base",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into post_web_qps_waybill_base (id, traceNo, ",
        "postDate, receivePlace, ",
        "bizProductName, bizProductNo, ",
        "baseProductName, service, ",
        "postagePaid, postageStandard, ",
        "insuranceAmount, insurancePremiumAmo, ",
        "realWeight, remarksenderNo, ",
        "sender, senderType, ",
        "sender_tel, receiverLinker, ",
        "receiverMobile, receiverAddr, ",
        "postalcode, inner_name, ",
        "returnn, return_code, ",
        "optime)",
        "values (#{id,jdbcType=INTEGER}, #{traceno,jdbcType=VARCHAR}, ",
        "#{postdate,jdbcType=TIMESTAMP}, #{receiveplace,jdbcType=VARCHAR}, ",
        "#{bizproductname,jdbcType=VARCHAR}, #{bizproductno,jdbcType=VARCHAR}, ",
        "#{baseproductname,jdbcType=VARCHAR}, #{service,jdbcType=VARCHAR}, ",
        "#{postagepaid,jdbcType=VARCHAR}, #{postagestandard,jdbcType=VARCHAR}, ",
        "#{insuranceamount,jdbcType=VARCHAR}, #{insurancepremiumamo,jdbcType=VARCHAR}, ",
        "#{realweight,jdbcType=VARCHAR}, #{remarksenderno,jdbcType=VARCHAR}, ",
        "#{sender,jdbcType=VARCHAR}, #{sendertype,jdbcType=VARCHAR}, ",
        "#{senderTel,jdbcType=VARCHAR}, #{receiverlinker,jdbcType=VARCHAR}, ",
        "#{receivermobile,jdbcType=VARCHAR}, #{receiveraddr,jdbcType=VARCHAR}, ",
        "#{postalcode,jdbcType=VARCHAR}, #{innerName,jdbcType=VARCHAR}, ",
        "#{returnn,jdbcType=VARCHAR}, #{returnCode,jdbcType=VARCHAR}, ",
        "#{optime,jdbcType=TIMESTAMP})"
    })
    int insert(com.ruoyi.common.bean.po.PostWebQpsWaybillBase record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, traceNo, postDate, receivePlace, bizProductName, bizProductNo, baseProductName, ",
        "service, postagePaid, postageStandard, insuranceAmount, insurancePremiumAmo, ",
        "realWeight, remarksenderNo, sender, senderType, sender_tel, receiverLinker, ",
        "receiverMobile, receiverAddr, postalcode, inner_name, returnn, return_code, ",
        "optime",
        "from post_web_qps_waybill_base",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType= Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="traceNo", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="postDate", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="receivePlace", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bizProductName", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bizProductNo", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="baseProductName", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="service", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="postagePaid", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="postageStandard", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="insuranceAmount", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="insurancePremiumAmo", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="realWeight", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="remarksenderNo", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sender", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="senderType", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sender_tel", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="receiverLinker", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="receiverMobile", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="receiverAddr", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="postalcode", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="inner_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="returnn", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="return_code", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="optime", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    com.ruoyi.common.bean.po.PostWebQpsWaybillBase selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update post_web_qps_waybill_base",
        "set traceNo = #{traceno,jdbcType=VARCHAR},",
          "postDate = #{postdate,jdbcType=TIMESTAMP},",
          "receivePlace = #{receiveplace,jdbcType=VARCHAR},",
          "bizProductName = #{bizproductname,jdbcType=VARCHAR},",
          "bizProductNo = #{bizproductno,jdbcType=VARCHAR},",
          "baseProductName = #{baseproductname,jdbcType=VARCHAR},",
          "service = #{service,jdbcType=VARCHAR},",
          "postagePaid = #{postagepaid,jdbcType=VARCHAR},",
          "postageStandard = #{postagestandard,jdbcType=VARCHAR},",
          "insuranceAmount = #{insuranceamount,jdbcType=VARCHAR},",
          "insurancePremiumAmo = #{insurancepremiumamo,jdbcType=VARCHAR},",
          "realWeight = #{realweight,jdbcType=VARCHAR},",
          "remarksenderNo = #{remarksenderno,jdbcType=VARCHAR},",
          "sender = #{sender,jdbcType=VARCHAR},",
          "senderType = #{sendertype,jdbcType=VARCHAR},",
          "sender_tel = #{senderTel,jdbcType=VARCHAR},",
          "receiverLinker = #{receiverlinker,jdbcType=VARCHAR},",
          "receiverMobile = #{receivermobile,jdbcType=VARCHAR},",
          "receiverAddr = #{receiveraddr,jdbcType=VARCHAR},",
          "postalcode = #{postalcode,jdbcType=VARCHAR},",
          "inner_name = #{innerName,jdbcType=VARCHAR},",
          "returnn = #{returnn,jdbcType=VARCHAR},",
          "return_code = #{returnCode,jdbcType=VARCHAR},",
          "optime = #{optime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.PostWebQpsWaybillBase record);
}