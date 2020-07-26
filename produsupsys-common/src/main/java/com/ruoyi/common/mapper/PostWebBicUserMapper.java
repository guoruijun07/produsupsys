package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import com.ruoyi.common.bean.po.PostWebBicUser;

public interface PostWebBicUserMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from post_web_bic_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into post_web_bic_user (id, username, ",
        "password, real_name, ",
        "mobile, imei, mac, ",
        "status, token, invalid_date, ",
        "org_num, org_name, ",
        "remaining_sum, project_base, ",
        "remark, role_id, modify_time, ",
        "create_time, receive1, ",
        "receive3, receive2, ",
        "receive4, receive5)",
        "values (#{id,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{realName,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=VARCHAR}, #{imei,jdbcType=VARCHAR}, #{mac,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER}, #{token,jdbcType=VARCHAR}, #{invalidDate,jdbcType=TIMESTAMP}, ",
        "#{orgNum,jdbcType=INTEGER}, #{orgName,jdbcType=VARCHAR}, ",
        "#{remainingSum,jdbcType=DOUBLE}, #{projectBase,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR}, #{roleId,jdbcType=BIGINT}, #{modifyTime,jdbcType=TIMESTAMP}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{receive1,jdbcType=VARCHAR}, ",
        "#{receive3,jdbcType=VARCHAR}, #{receive2,jdbcType=VARCHAR}, ",
        "#{receive4,jdbcType=VARCHAR}, #{receive5,jdbcType=VARCHAR})"
    })
    int insert(PostWebBicUser record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, username, password, real_name, mobile, imei, mac, status, token, invalid_date, ",
        "org_num, org_name, remaining_sum, project_base, remark, role_id, modify_time, ",
        "create_time, receive1, receive3, receive2, receive4, receive5",
        "from post_web_bic_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType= Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="username", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="password", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="real_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="mobile", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="imei", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="mac", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="token", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="invalid_date", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="org_num", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="org_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="remaining_sum", javaType= Double.class, jdbcType=JdbcType.DOUBLE),
        @Arg(column="project_base", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="remark", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="role_id", javaType= Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="modify_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="receive1", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="receive3", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="receive2", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="receive4", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="receive5", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    PostWebBicUser selectByPrimaryKey(Integer id);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update post_web_bic_user",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "real_name = #{realName,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "imei = #{imei,jdbcType=VARCHAR},",
          "mac = #{mac,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "token = #{token,jdbcType=VARCHAR},",
          "invalid_date = #{invalidDate,jdbcType=TIMESTAMP},",
          "org_num = #{orgNum,jdbcType=INTEGER},",
          "org_name = #{orgName,jdbcType=VARCHAR},",
          "remaining_sum = #{remainingSum,jdbcType=DOUBLE},",
          "project_base = #{projectBase,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "role_id = #{roleId,jdbcType=BIGINT},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "receive1 = #{receive1,jdbcType=VARCHAR},",
          "receive3 = #{receive3,jdbcType=VARCHAR},",
          "receive2 = #{receive2,jdbcType=VARCHAR},",
          "receive4 = #{receive4,jdbcType=VARCHAR},",
          "receive5 = #{receive5,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PostWebBicUser record);
}