package com.ruoyi.common.mapper;

import com.ruoyi.common.bean.po.PostBicUserBinding;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface PostBicUserBindingMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from post_bic_user_binding",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into post_bic_user_binding (id, userid, ",
        "unitID, validitytime, ",
        "callrestrict, calldisplay, ",
        "callrecording)",
        "values (#{id,jdbcType=INTEGER}, #{userid,jdbcType=INTEGER}, ",
        "#{unitid,jdbcType=INTEGER}, #{validitytime,jdbcType=INTEGER}, ",
        "#{callrestrict,jdbcType=VARCHAR}, #{calldisplay,jdbcType=VARCHAR}, ",
        "#{callrecording,jdbcType=VARCHAR})"
    })
    int insert(PostBicUserBinding record);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, userid, unitID, validitytime, callrestrict, calldisplay, callrecording",
        "from post_bic_user_binding",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType= Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="userid", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="unitID", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="validitytime", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="callrestrict", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="calldisplay", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="callrecording", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    PostBicUserBinding selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update post_bic_user_binding",
        "set userid = #{userid,jdbcType=INTEGER},",
          "unitID = #{unitid,jdbcType=INTEGER},",
          "validitytime = #{validitytime,jdbcType=INTEGER},",
          "callrestrict = #{callrestrict,jdbcType=VARCHAR},",
          "calldisplay = #{calldisplay,jdbcType=VARCHAR},",
          "callrecording = #{callrecording,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PostBicUserBinding record);
}