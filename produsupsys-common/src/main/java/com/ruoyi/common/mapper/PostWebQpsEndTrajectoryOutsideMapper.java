package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface PostWebQpsEndTrajectoryOutsideMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from post_web_qps_end_trajectory_outside",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into post_web_qps_end_trajectory_outside (id, traceNo, ",
        "opTime, opName, ",
        "opOrgSimpleName, record_length)",
        "values (#{id,jdbcType=INTEGER}, #{traceno,jdbcType=VARCHAR}, ",
        "#{optime,jdbcType=TIMESTAMP}, #{opname,jdbcType=VARCHAR}, ",
        "#{oporgsimplename,jdbcType=VARCHAR}, #{recordLength,jdbcType=VARCHAR})"
    })
    int insert(com.ruoyi.common.bean.po.PostWebQpsEndTrajectoryOutside record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, traceNo, opTime, opName, opOrgSimpleName, record_length",
        "from post_web_qps_end_trajectory_outside",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType= Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="traceNo", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="opTime", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="opName", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="opOrgSimpleName", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="record_length", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    com.ruoyi.common.bean.po.PostWebQpsEndTrajectoryOutside selectByPrimaryKey(Integer id);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update post_web_qps_end_trajectory_outside",
        "set traceNo = #{traceno,jdbcType=VARCHAR},",
          "opTime = #{optime,jdbcType=TIMESTAMP},",
          "opName = #{opname,jdbcType=VARCHAR},",
          "opOrgSimpleName = #{oporgsimplename,jdbcType=VARCHAR},",
          "record_length = #{recordLength,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.PostWebQpsEndTrajectoryOutside record);
}