package com.ruoyi.common.mapper;

import com.ruoyi.common.bean.po.PostPscSortingMatchingExport;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface PostPscSortingMatchingExportMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
            "delete from post_psc_sorting_matching_export",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
            "insert into post_psc_sorting_matching_export (id, user_id, ",
            "file_name, total_num, ",
            "sucess_num, money, ",
            "create_time, remark)",
            "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=BIGINT}, ",
            "#{fileName,jdbcType=VARCHAR}, #{totalNum,jdbcType=INTEGER}, ",
            "#{sucessNum,jdbcType=INTEGER}, #{money,jdbcType=DOUBLE}, ",
            "#{createTime,jdbcType=TIMESTAMP}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(PostPscSortingMatchingExport record);

    /**
     *
     * @mbggenerated
     */
    @Select({
            "select",
            "id, user_id, file_name, total_num, sucess_num, money, create_time, remark",
            "from post_psc_sorting_matching_export",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
            @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
            @Arg(column="user_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
            @Arg(column="file_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="total_num", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="sucess_num", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="money", javaType=Double.class, jdbcType=JdbcType.DOUBLE),
            @Arg(column="create_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
            @Arg(column="remark", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    PostPscSortingMatchingExport selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Update({
            "update post_psc_sorting_matching_export",
            "set user_id = #{userId,jdbcType=BIGINT},",
            "file_name = #{fileName,jdbcType=VARCHAR},",
            "total_num = #{totalNum,jdbcType=INTEGER},",
            "sucess_num = #{sucessNum,jdbcType=INTEGER},",
            "money = #{money,jdbcType=DOUBLE},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "remark = #{remark,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PostPscSortingMatchingExport record);

    /**
     *
     * @mbggenerated
     */
    @Select({
            "select",
            "id, user_id, file_name, total_num, sucess_num, money, create_time, remark",
            "from post_psc_sorting_matching_export",
            "where user_id = #{userId,jdbcType=BIGINT} "
    })
    @ConstructorArgs({
            @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
            @Arg(column="user_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
            @Arg(column="file_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="total_num", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="sucess_num", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="money", javaType=Double.class, jdbcType=JdbcType.DOUBLE),
            @Arg(column="create_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
            @Arg(column="remark", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<PostPscSortingMatchingExport> selectByUserId(Long userId);
}