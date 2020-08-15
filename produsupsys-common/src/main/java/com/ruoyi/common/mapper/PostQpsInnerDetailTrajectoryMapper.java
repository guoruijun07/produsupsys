package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import com.ruoyi.common.bean.po.PostQpsInnerDetailTrajectory;

public interface PostQpsInnerDetailTrajectoryMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from post_qps_inner_detail_trajectory",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into post_qps_inner_detail_trajectory (id, traceNo, ",
        "opTime, opOrgSimpleName, ",
        "opCode, opName, ",
        "desc, operatorName, ",
        "telephone, source, ",
        "remark)",
        "values (#{id,jdbcType=INTEGER}, #{traceno,jdbcType=VARCHAR}, ",
        "#{optime,jdbcType=TIMESTAMP}, #{oporgsimplename,jdbcType=VARCHAR}, ",
        "#{opcode,jdbcType=VARCHAR}, #{opname,jdbcType=VARCHAR}, ",
        "#{desc,jdbcType=VARCHAR}, #{operatorname,jdbcType=VARCHAR}, ",
        "#{telephone,jdbcType=VARCHAR}, #{source,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(com.ruoyi.common.bean.po.PostQpsInnerDetailTrajectory record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, traceNo, opTime, opOrgSimpleName, opCode, opName, desc, operatorName, telephone, ",
        "source, remark",
        "from post_qps_inner_detail_trajectory",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType= Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="traceNo", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="opTime", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="opOrgSimpleName", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="opCode", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="opName", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="desc", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="operatorName", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="telephone", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="source", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="remark", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    com.ruoyi.common.bean.po.PostQpsInnerDetailTrajectory selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update post_qps_inner_detail_trajectory",
        "set traceNo = #{traceno,jdbcType=VARCHAR},",
          "opTime = #{optime,jdbcType=TIMESTAMP},",
          "opOrgSimpleName = #{oporgsimplename,jdbcType=VARCHAR},",
          "opCode = #{opcode,jdbcType=VARCHAR},",
          "opName = #{opname,jdbcType=VARCHAR},",
          "desc = #{desc,jdbcType=VARCHAR},",
          "operatorName = #{operatorname,jdbcType=VARCHAR},",
          "telephone = #{telephone,jdbcType=VARCHAR},",
          "source = #{source,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.PostQpsInnerDetailTrajectory record);
}