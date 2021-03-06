package com.ruoyi.common.mapper;

import com.ruoyi.common.bean.po.PostPscAddressMatchingExport;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface PostPscAddressMatchingExportMapper {
    /**
     *
     * @mbggenerated
     */
    @Delete({
            "delete from post_psc_address_matching_export",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
            "insert into post_psc_address_matching_export (id, batch_no, ",
            "file_name, total_num, ",
            "success_num, money, ",
            "status, user_id, modify_time, ",
            "create_time)",
            "values (#{id,jdbcType=INTEGER}, #{batchNo,jdbcType=VARCHAR}, ",
            "#{fileName,jdbcType=VARCHAR}, #{totalNum,jdbcType=INTEGER}, ",
            "#{successNum,jdbcType=INTEGER}, #{money,jdbcType=DECIMAL}, ",
            "#{status,jdbcType=INTEGER}, #{userId,jdbcType=BIGINT}, #{modifyTime,jdbcType=TIMESTAMP}, ",
            "#{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(PostPscAddressMatchingExport record);

    /**
     *
     * @mbggenerated
     */
    @Select({
            "select",
            "id, batch_no, file_name, total_num, success_num, money, status, user_id, modify_time, ",
            "create_time",
            "from post_psc_address_matching_export",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
            @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
            @Arg(column="batch_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="file_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="total_num", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="success_num", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="money", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
            @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="user_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
            @Arg(column="modify_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
            @Arg(column="create_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    PostPscAddressMatchingExport selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Update({
            "update post_psc_address_matching_export",
            "set batch_no = #{batchNo,jdbcType=VARCHAR},",
            "file_name = #{fileName,jdbcType=VARCHAR},",
            "total_num = #{totalNum,jdbcType=INTEGER},",
            "success_num = #{successNum,jdbcType=INTEGER},",
            "money = #{money,jdbcType=DECIMAL},",
            "status = #{status,jdbcType=INTEGER},",
            "user_id = #{userId,jdbcType=BIGINT},",
            "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
            "create_time = #{createTime,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PostPscAddressMatchingExport record);

    /**
     *
     * @mbggenerated
     */
    @Select({
            "select",
            "id, batch_no, file_name, total_num, success_num, money, status,user_id, modify_time, ",
            "create_time",
            "from post_psc_address_matching_export",
            "where user_id = #{userId,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
            @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
            @Arg(column="batch_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="file_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="total_num", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="success_num", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="money", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
            @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="user_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
            @Arg(column="modify_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
            @Arg(column="create_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<PostPscAddressMatchingExport> selectByUserId(Long userId);

    /**
     *
     * @mbggenerated
     */
    @Select({
            "select",
            "id, batch_no, file_name, total_num, success_num, money, status,user_id, modify_time, ",
            "create_time",
            "from post_psc_address_matching_export",
            "where batch_no = #{batchNo,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
            @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
            @Arg(column="batch_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="file_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="total_num", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="success_num", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="money", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
            @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="user_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
            @Arg(column="modify_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
            @Arg(column="create_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    PostPscAddressMatchingExport selectByBatchNo(String batchNo);
}