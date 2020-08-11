package com.ruoyi.common.mapper;

import com.ruoyi.common.bean.po.SysUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface ISysUserMapper {

    /**
     * @mbggenerated
     */
    @Delete({
            "delete from sys_user",
            "where user_id = #{userId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long userId);

    /**
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
            @Arg(column = "user_id", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "dept_id", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "login_name", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "user_name", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "user_type", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "email", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "phonenumber", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "sex", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "avatar", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "password", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "salt", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "status", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "del_flag", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "login_ip", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "login_date", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "account", javaType = Double.class, jdbcType = JdbcType.DOUBLE),
            @Arg(column = "create_by", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "create_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "update_by", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "update_time", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "remark", javaType = String.class, jdbcType = JdbcType.VARCHAR)
    })
    SysUser selectByPrimaryKey(Long userId);

//    /**
//     * @mbggenerated
//     */
//    @Update({
//            "update sys_user",
//            "set ",
//            "<if test='deptId != null'>",
//            "dept_id = #{deptId,jdbcType=BIGINT},",
//            "</if>",
//            "<if test='loginName != null and loginName != \'\''>",
//            "login_name = #{loginName,jdbcType=VARCHAR},",
//            "</if>",
//            "<if test='userName != null and userName != \'\''>",
//            "user_name = #{userName,jdbcType=VARCHAR},",
//            "</if>",
//            "<if test='userType != null and userType != \'\''>",
//            "user_type = #{userType,jdbcType=VARCHAR},",
//            "</if>",
//            "<if test='email != null and email != \'\''>",
//            "email = #{email,jdbcType=VARCHAR},",
//            "</if>",
//            "<if test='phonenumber != null and phonenumber != \'\''>",
//            "phonenumber = #{phonenumber,jdbcType=VARCHAR},",
//            "</if>",
//            "<if test='sex != null and sex != \'\''>",
//            "sex = #{sex,jdbcType=CHAR},",
//            "</if>",
//            "<if test='avatar != null and avatar != \'\''>",
//            "avatar = #{avatar,jdbcType=VARCHAR},",
//            "</if>",
//            "<if test='password != null and password != \'\''>",
//            "password = #{password,jdbcType=VARCHAR},",
//            "</if>",
//            "<if test='salt != null and salt != \'\''>",
//            "salt = #{salt,jdbcType=VARCHAR},",
//            "</if>",
//            "<if test='status != null and status != \'\''>",
//            "status = #{status,jdbcType=CHAR},",
//            "</if>",
//            "<if test='delFlag != null and delFlag != \'\''>",
//            "del_flag = #{delFlag,jdbcType=CHAR},",
//            "</if>",
//            "<if test='loginIp != null and loginIp != \'\''>",
//            "login_ip = #{loginIp,jdbcType=VARCHAR},",
//            "</if>",
//            "<if test='loginDate != null '>",
//            "login_date = #{loginDate,jdbcType=TIMESTAMP},",
//            "</if>",
//            "<if test='account != null'>",
//            "account = #{account,jdbcType=DOUBLE},",
//            "</if>",
//            "<if test='updateBy != null and updateBy != \'\''>",
//            "update_by = #{updateBy,jdbcType=VARCHAR},",
//            "</if>",
//            "<if test='remark != null and remark != \'\''>",
//            "remark = #{remark,jdbcType=VARCHAR},",
//            "</if>",
//            "update_time=now()",
//            "where user_id = #{userId,jdbcType=BIGINT}"
//    })
//    int updateByPrimaryKey(SysUser record);

    @Update({
            "update sys_user",
            "set ",
            "account = #{account,jdbcType=DOUBLE}",
            "where user_id = #{userId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SysUser record);
}