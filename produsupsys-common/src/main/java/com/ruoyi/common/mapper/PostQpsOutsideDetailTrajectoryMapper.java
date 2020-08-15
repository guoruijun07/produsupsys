package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import  com.ruoyi.common.bean.po.PostQpsOutsideDetailTrajectory;

public interface PostQpsOutsideDetailTrajectoryMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from post_qps_outside_detail_trajectory",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into post_qps_outside_detail_trajectory (id, traceNo, ",
        "opTime, opCode, ",
        "opName, opDesc, ",
        "opOrgProvName, opOrgCity, ",
        "opOrgCode, opOrgName, ",
        "operatorNo, operatorName)",
        "values (#{id,jdbcType=INTEGER}, #{traceno,jdbcType=VARCHAR}, ",
        "#{optime,jdbcType=TIMESTAMP}, #{opcode,jdbcType=VARCHAR}, ",
        "#{opname,jdbcType=VARCHAR}, #{opdesc,jdbcType=VARCHAR}, ",
        "#{oporgprovname,jdbcType=VARCHAR}, #{oporgcity,jdbcType=VARCHAR}, ",
        "#{oporgcode,jdbcType=VARCHAR}, #{oporgname,jdbcType=VARCHAR}, ",
        "#{operatorno,jdbcType=VARCHAR}, #{operatorname,jdbcType=VARCHAR})"
    })
    int insert(com.ruoyi.common.bean.po.PostQpsOutsideDetailTrajectory record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, traceNo, opTime, opCode, opName, opDesc, opOrgProvName, opOrgCity, opOrgCode, ",
        "opOrgName, operatorNo, operatorName",
        "from post_qps_outside_detail_trajectory",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType= Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="traceNo", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="opTime", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="opCode", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="opName", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="opDesc", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="opOrgProvName", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="opOrgCity", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="opOrgCode", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="opOrgName", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="operatorNo", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="operatorName", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    com.ruoyi.common.bean.po.PostQpsOutsideDetailTrajectory selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update post_qps_outside_detail_trajectory",
        "set traceNo = #{traceno,jdbcType=VARCHAR},",
          "opTime = #{optime,jdbcType=TIMESTAMP},",
          "opCode = #{opcode,jdbcType=VARCHAR},",
          "opName = #{opname,jdbcType=VARCHAR},",
          "opDesc = #{opdesc,jdbcType=VARCHAR},",
          "opOrgProvName = #{oporgprovname,jdbcType=VARCHAR},",
          "opOrgCity = #{oporgcity,jdbcType=VARCHAR},",
          "opOrgCode = #{oporgcode,jdbcType=VARCHAR},",
          "opOrgName = #{oporgname,jdbcType=VARCHAR},",
          "operatorNo = #{operatorno,jdbcType=VARCHAR},",
          "operatorName = #{operatorname,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.PostQpsOutsideDetailTrajectory record);
}