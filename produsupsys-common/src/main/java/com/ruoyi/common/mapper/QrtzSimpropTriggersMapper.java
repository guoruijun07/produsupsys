package com.ruoyi.common.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface QrtzSimpropTriggersMapper {

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from qrtz_simprop_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(com.ruoyi.common.bean.po.QrtzSimpropTriggersKey key);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into qrtz_simprop_triggers (sched_name, trigger_name, ",
        "trigger_group, str_prop_1, ",
        "str_prop_2, str_prop_3, ",
        "int_prop_1, int_prop_2, ",
        "long_prop_1, long_prop_2, ",
        "dec_prop_1, dec_prop_2, ",
        "bool_prop_1, bool_prop_2)",
        "values (#{schedName,jdbcType=VARCHAR}, #{triggerName,jdbcType=VARCHAR}, ",
        "#{triggerGroup,jdbcType=VARCHAR}, #{strProp1,jdbcType=VARCHAR}, ",
        "#{strProp2,jdbcType=VARCHAR}, #{strProp3,jdbcType=VARCHAR}, ",
        "#{intProp1,jdbcType=INTEGER}, #{intProp2,jdbcType=INTEGER}, ",
        "#{longProp1,jdbcType=BIGINT}, #{longProp2,jdbcType=BIGINT}, ",
        "#{decProp1,jdbcType=DECIMAL}, #{decProp2,jdbcType=DECIMAL}, ",
        "#{boolProp1,jdbcType=VARCHAR}, #{boolProp2,jdbcType=VARCHAR})"
    })
    int insert(com.ruoyi.common.bean.po.QrtzSimpropTriggers record);


    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "sched_name, trigger_name, trigger_group, str_prop_1, str_prop_2, str_prop_3, ",
        "int_prop_1, int_prop_2, long_prop_1, long_prop_2, dec_prop_1, dec_prop_2, bool_prop_1, ",
        "bool_prop_2",
        "from qrtz_simprop_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="sched_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="trigger_name", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="trigger_group", javaType= String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="str_prop_1", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="str_prop_2", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="str_prop_3", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="int_prop_1", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="int_prop_2", javaType= Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="long_prop_1", javaType= Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="long_prop_2", javaType= Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="dec_prop_1", javaType= java.math.BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="dec_prop_2", javaType= java.math.BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="bool_prop_1", javaType= String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bool_prop_2", javaType= String.class, jdbcType=JdbcType.VARCHAR)
    })
    com.ruoyi.common.bean.po.QrtzSimpropTriggers selectByPrimaryKey(com.ruoyi.common.bean.po.QrtzSimpropTriggersKey key);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update qrtz_simprop_triggers",
        "set str_prop_1 = #{strProp1,jdbcType=VARCHAR},",
          "str_prop_2 = #{strProp2,jdbcType=VARCHAR},",
          "str_prop_3 = #{strProp3,jdbcType=VARCHAR},",
          "int_prop_1 = #{intProp1,jdbcType=INTEGER},",
          "int_prop_2 = #{intProp2,jdbcType=INTEGER},",
          "long_prop_1 = #{longProp1,jdbcType=BIGINT},",
          "long_prop_2 = #{longProp2,jdbcType=BIGINT},",
          "dec_prop_1 = #{decProp1,jdbcType=DECIMAL},",
          "dec_prop_2 = #{decProp2,jdbcType=DECIMAL},",
          "bool_prop_1 = #{boolProp1,jdbcType=VARCHAR},",
          "bool_prop_2 = #{boolProp2,jdbcType=VARCHAR}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(com.ruoyi.common.bean.po.QrtzSimpropTriggers record);
}