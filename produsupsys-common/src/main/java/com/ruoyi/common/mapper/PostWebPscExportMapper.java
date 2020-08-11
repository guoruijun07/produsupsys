package com.ruoyi.common.mapper;

import com.ruoyi.common.bean.po.PostWebPscExport;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface PostWebPscExportMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from post_web_psc_export",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into post_web_psc_export (user_id, ",
        "file_name, total_num, ",
        "sucess_num, money, ",
        "create_time, remark)",
        "values (#{userId,jdbcType=BIGINT}, ",
        "#{fileName,jdbcType=VARCHAR}, #{totalNum,jdbcType=INTEGER}, ",
        "#{sucessNum,jdbcType=INTEGER}, #{money,jdbcType=DOUBLE}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(PostWebPscExport record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, user_id, file_name, total_num, sucess_num, money, create_time, remark",
        "from post_web_psc_export",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType= Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="user_id", javaType= Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="file_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="total_num", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="sucess_num", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="money", javaType= Double.class, jdbcType=JdbcType.DOUBLE),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="remark", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
   PostWebPscExport selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update post_web_psc_export",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "file_name = #{fileName,jdbcType=VARCHAR},",
          "total_num = #{totalNum,jdbcType=INTEGER},",
          "sucess_num = #{sucessNum,jdbcType=INTEGER},",
          "money = #{money,jdbcType=DOUBLE},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(PostWebPscExport record);

    /**
     *
     * @mbggenerated
     */
    @Select({
            "select",
            "id, user_id, file_name, total_num, sucess_num, money, create_time, remark",
            "from post_web_psc_export",
            "where user_id = #{id,jdbcType=BIGINT} "
    })
    @ConstructorArgs({
            @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
            @Arg(column="user_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
            @Arg(column="file_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="total_num", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="sucess_num", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Arg(column="money", javaType=Double.class, jdbcType=JdbcType.DOUBLE),
            @Arg(column="create_time", javaType= Date.class, jdbcType=JdbcType.TIMESTAMP),
            @Arg(column="remark", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<PostWebPscExport> selectByUserId(Long userId);
}