package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import com.ruoyi.common.bean.po.SysUser;

public interface ISysUserMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_user",
        "where user_id = #{userId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long userId);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_user (user_id, dept_id, ",
        "login_name, user_name, ",
        "user_type, email, ",
        "phonenumber, sex, avatar, ",
        "password, salt, ",
        "status, del_flag, login_ip, ",
        "login_date, account, ",
        "create_by, create_time, ",
        "update_by, update_time, ",
        "remark)",
        "values (#{userId,jdbcType=BIGINT}, #{deptId,jdbcType=BIGINT}, ",
        "#{loginName,jdbcType=VARCHAR}, #{userName,jdbcType=VARCHAR}, ",
        "#{userType,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{phonenumber,jdbcType=VARCHAR}, #{sex,jdbcType=CHAR}, #{avatar,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{salt,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=CHAR}, #{delFlag,jdbcType=CHAR}, #{loginIp,jdbcType=VARCHAR}, ",
        "#{loginDate,jdbcType=TIMESTAMP}, #{account,jdbcType=DOUBLE}, ",
        "#{createBy,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateBy,jdbcType=VARCHAR}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(SysUser record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "user_id, dept_id, login_name, user_name, user_type, email, phonenumber, sex, ",
        "avatar, password, salt, status, del_flag, login_ip, login_date, account, create_by, ",
        "create_time, update_by, update_time, remark",
        "from sys_user",
        "where user_id = #{userId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="user_id", javaType= Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="dept_id", javaType= Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="login_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_name", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="user_type", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="email", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="phonenumber", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sex", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="avatar", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="password", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="salt", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="del_flag", javaType= String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="login_ip", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="login_date", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="account", javaType= Double.class, jdbcType=JdbcType.DOUBLE),
        @Arg(column="create_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="update_by", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="update_time", javaType= java.util.Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="remark", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
     SysUser selectByPrimaryKey(Long userId);


    /**
     *
     * @mbggenerated
     */
    @Update({
        "update sys_user",
        "set dept_id = #{deptId,jdbcType=BIGINT},",
          "login_name = #{loginName,jdbcType=VARCHAR},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "user_type = #{userType,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "phonenumber = #{phonenumber,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=CHAR},",
          "avatar = #{avatar,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "salt = #{salt,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "del_flag = #{delFlag,jdbcType=CHAR},",
          "login_ip = #{loginIp,jdbcType=VARCHAR},",
          "login_date = #{loginDate,jdbcType=TIMESTAMP},",
          "account = #{account,jdbcType=DOUBLE},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_by = #{updateBy,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where user_id = #{userId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SysUser record);
}