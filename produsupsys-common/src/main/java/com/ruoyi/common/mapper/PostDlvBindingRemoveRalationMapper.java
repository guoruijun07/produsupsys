package com.ruoyi.common.mapper;

import com.ruoyi.common.bean.po.PostDlvBindingRemoveRalation;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface PostDlvBindingRemoveRalationMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from post_dlv_binding_remove_ralation",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into post_dlv_binding_remove_ralation (id, unitID, ",
        "prtms, smbms, otherms, ",
        "subts, dissubts, ",
        "callrestrict, calldisplay, ",
        "callrecording, validitytime, ",
        "uuidinpartner, usertype, ",
        "regphone, status, ",
        "source, menu, userid, ",
        "username, create_time, ",
        "modify_time)",
        "values (#{id,jdbcType=INTEGER}, #{unitid,jdbcType=BIGINT}, ",
        "#{prtms,jdbcType=VARCHAR}, #{smbms,jdbcType=VARCHAR}, #{otherms,jdbcType=VARCHAR}, ",
        "#{subts,jdbcType=TIMESTAMP}, #{dissubts,jdbcType=TIMESTAMP}, ",
        "#{callrestrict,jdbcType=VARCHAR}, #{calldisplay,jdbcType=VARCHAR}, ",
        "#{callrecording,jdbcType=VARCHAR}, #{validitytime,jdbcType=TIMESTAMP}, ",
        "#{uuidinpartner,jdbcType=VARCHAR}, #{usertype,jdbcType=VARCHAR}, ",
        "#{regphone,jdbcType=VARCHAR}, #{status,jdbcType=VARCHAR}, ",
        "#{source,jdbcType=INTEGER}, #{menu,jdbcType=INTEGER}, #{userid,jdbcType=INTEGER}, ",
        "#{username,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{modifyTime,jdbcType=TIMESTAMP})"
    })
    int insert(PostDlvBindingRemoveRalation record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, unitID, prtms, smbms, otherms, subts, dissubts, callrestrict, calldisplay, ",
        "callrecording, validitytime, uuidinpartner, usertype, regphone, status, source, ",
        "menu, userid, username, create_time, modify_time",
        "from post_dlv_binding_remove_ralation",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType= Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="unitID", javaType= Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="prtms", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="smbms", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="otherms", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="subts", javaType= Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="dissubts", javaType= Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="callrestrict", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="calldisplay", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="callrecording", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="validitytime", javaType= Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="uuidinpartner", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="usertype", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="regphone", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="source", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="menu", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="userid", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="username", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_time", javaType= Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="modify_time", javaType= Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    PostDlvBindingRemoveRalation selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update post_dlv_binding_remove_ralation",
        "set unitID = #{unitid,jdbcType=BIGINT},",
          "prtms = #{prtms,jdbcType=VARCHAR},",
          "smbms = #{smbms,jdbcType=VARCHAR},",
          "otherms = #{otherms,jdbcType=VARCHAR},",
          "subts = #{subts,jdbcType=TIMESTAMP},",
          "dissubts = #{dissubts,jdbcType=TIMESTAMP},",
          "callrestrict = #{callrestrict,jdbcType=VARCHAR},",
          "calldisplay = #{calldisplay,jdbcType=VARCHAR},",
          "callrecording = #{callrecording,jdbcType=VARCHAR},",
          "validitytime = #{validitytime,jdbcType=TIMESTAMP},",
          "uuidinpartner = #{uuidinpartner,jdbcType=VARCHAR},",
          "usertype = #{usertype,jdbcType=VARCHAR},",
          "regphone = #{regphone,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=VARCHAR},",
          "source = #{source,jdbcType=INTEGER},",
          "menu = #{menu,jdbcType=INTEGER},",
          "userid = #{userid,jdbcType=INTEGER},",
          "username = #{username,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PostDlvBindingRemoveRalation record);
}