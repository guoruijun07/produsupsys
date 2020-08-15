package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import com.ruoyi.common.bean.po.PostQpsWaybillInnerTrajectory;

public interface PostQpsWaybillInnerTrajectoryMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from post_qps_waybill_inner_trajectory",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into post_qps_waybill_inner_trajectory (id, trace_no, ",
        "post_date, receive_place, ",
        "biz_product_name, biz_product_no, ",
        "base_product_name, service, ",
        "postage_paid, postage_standard, ",
        "insurance_amount, insurance_premium_amo, ",
        "real_weight, remarksender_no, ",
        "sender, sender_type, ",
        "sender_tel, receiver_linker, ",
        "receiver_mobile, receiver_addr, ",
        "postal_code, inner_name, ",
        "returnn, return_code, ",
        "optime)",
        "values (#{id,jdbcType=INTEGER}, #{traceNo,jdbcType=VARCHAR}, ",
        "#{postDate,jdbcType=TIMESTAMP}, #{receivePlace,jdbcType=VARCHAR}, ",
        "#{bizProductName,jdbcType=VARCHAR}, #{bizProductNo,jdbcType=VARCHAR}, ",
        "#{baseProductName,jdbcType=VARCHAR}, #{service,jdbcType=VARCHAR}, ",
        "#{postagePaid,jdbcType=VARCHAR}, #{postageStandard,jdbcType=VARCHAR}, ",
        "#{insuranceAmount,jdbcType=VARCHAR}, #{insurancePremiumAmo,jdbcType=VARCHAR}, ",
        "#{realWeight,jdbcType=VARCHAR}, #{remarksenderNo,jdbcType=VARCHAR}, ",
        "#{sender,jdbcType=VARCHAR}, #{senderType,jdbcType=VARCHAR}, ",
        "#{senderTel,jdbcType=VARCHAR}, #{receiverLinker,jdbcType=VARCHAR}, ",
        "#{receiverMobile,jdbcType=VARCHAR}, #{receiverAddr,jdbcType=VARCHAR}, ",
        "#{postalCode,jdbcType=VARCHAR}, #{innerName,jdbcType=VARCHAR}, ",
        "#{returnn,jdbcType=VARCHAR}, #{returnCode,jdbcType=VARCHAR}, ",
        "#{optime,jdbcType=TIMESTAMP})"
    })
    int insert(PostQpsWaybillInnerTrajectory record);
    

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, trace_no, post_date, receive_place, biz_product_name, biz_product_no, base_product_name, ",
        "service, postage_paid, postage_standard, insurance_amount, insurance_premium_amo, ",
        "real_weight, remarksender_no, sender, sender_type, sender_tel, receiver_linker, ",
        "receiver_mobile, receiver_addr, postal_code, inner_name, returnn, return_code, ",
        "optime",
        "from post_qps_waybill_inner_trajectory",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType= Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="trace_no", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="post_date", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="receive_place", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="biz_product_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="biz_product_no", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="base_product_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="service", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="postage_paid", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="postage_standard", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="insurance_amount", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="insurance_premium_amo", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="real_weight", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="remarksender_no", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sender", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sender_type", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sender_tel", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="receiver_linker", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="receiver_mobile", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="receiver_addr", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="postal_code", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="inner_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="returnn", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="return_code", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="optime", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    PostQpsWaybillInnerTrajectory selectByPrimaryKey(Integer id);
    
    /**
     *
     * @mbggenerated
     */
    @Update({
        "update post_qps_waybill_inner_trajectory",
        "set trace_no = #{traceNo,jdbcType=VARCHAR},",
          "post_date = #{postDate,jdbcType=TIMESTAMP},",
          "receive_place = #{receivePlace,jdbcType=VARCHAR},",
          "biz_product_name = #{bizProductName,jdbcType=VARCHAR},",
          "biz_product_no = #{bizProductNo,jdbcType=VARCHAR},",
          "base_product_name = #{baseProductName,jdbcType=VARCHAR},",
          "service = #{service,jdbcType=VARCHAR},",
          "postage_paid = #{postagePaid,jdbcType=VARCHAR},",
          "postage_standard = #{postageStandard,jdbcType=VARCHAR},",
          "insurance_amount = #{insuranceAmount,jdbcType=VARCHAR},",
          "insurance_premium_amo = #{insurancePremiumAmo,jdbcType=VARCHAR},",
          "real_weight = #{realWeight,jdbcType=VARCHAR},",
          "remarksender_no = #{remarksenderNo,jdbcType=VARCHAR},",
          "sender = #{sender,jdbcType=VARCHAR},",
          "sender_type = #{senderType,jdbcType=VARCHAR},",
          "sender_tel = #{senderTel,jdbcType=VARCHAR},",
          "receiver_linker = #{receiverLinker,jdbcType=VARCHAR},",
          "receiver_mobile = #{receiverMobile,jdbcType=VARCHAR},",
          "receiver_addr = #{receiverAddr,jdbcType=VARCHAR},",
          "postal_code = #{postalCode,jdbcType=VARCHAR},",
          "inner_name = #{innerName,jdbcType=VARCHAR},",
          "returnn = #{returnn,jdbcType=VARCHAR},",
          "return_code = #{returnCode,jdbcType=VARCHAR},",
          "optime = #{optime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PostQpsWaybillInnerTrajectory record);
}