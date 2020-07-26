package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import com.ruoyi.common.bean.po.PostWebPscAddressBatchExport;

public interface PostWebPscAddressBatchExportMapper {
    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from post_web_psc_address_batch_export",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into post_web_psc_address_batch_export (id, batch_no, ",
        "file_name, total_num, ",
        "success_num, money, ",
        "status, user_id, ",
        "modify_time, create_time)",
        "values (#{id,jdbcType=INTEGER}, #{batchNo,jdbcType=VARCHAR}, ",
        "#{fileName,jdbcType=VARCHAR}, #{totalNum,jdbcType=INTEGER}, ",
        "#{successNum,jdbcType=INTEGER}, #{money,jdbcType=DECIMAL}, ",
        "#{status,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{modifyTime,jdbcType=TIMESTAMP}, #{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(PostWebPscAddressBatchExport record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, batch_no, file_name, total_num, success_num, money, status, user_id, modify_time, ",
        "create_time",
        "from post_web_psc_address_batch_export",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType= Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="batch_no", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="file_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="total_num", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="success_num", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="money", javaType= java.math.BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="status", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="user_id", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="modify_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    PostWebPscAddressBatchExport selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update post_web_psc_address_batch_export",
        "set batch_no = #{batchNo,jdbcType=VARCHAR},",
          "file_name = #{fileName,jdbcType=VARCHAR},",
          "total_num = #{totalNum,jdbcType=INTEGER},",
          "success_num = #{successNum,jdbcType=INTEGER},",
          "money = #{money,jdbcType=DECIMAL},",
          "status = #{status,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PostWebPscAddressBatchExport record);
}