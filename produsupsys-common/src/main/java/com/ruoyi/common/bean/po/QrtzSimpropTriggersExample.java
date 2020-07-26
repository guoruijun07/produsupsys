package com.ruoyi.common.bean.po;

public class QrtzSimpropTriggersExample {
    /**
     * qrtz_simprop_triggers
     */
    protected String orderByClause;

    /**
     * qrtz_simprop_triggers
     */
    protected boolean distinct;

    /**
     * qrtz_simprop_triggers
     */
    protected java.util.List<com.ruoyi.common.bean.po.QrtzSimpropTriggersExample.Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public QrtzSimpropTriggersExample() {
        oredCriteria = new java.util.ArrayList<com.ruoyi.common.bean.po.QrtzSimpropTriggersExample.Criteria>();
    }

    /**
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public java.util.List<com.ruoyi.common.bean.po.QrtzSimpropTriggersExample.Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * qrtz_simprop_triggers
     */
    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.ruoyi.common.bean.po.QrtzSimpropTriggersExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.ruoyi.common.bean.po.QrtzSimpropTriggersExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.ruoyi.common.bean.po.QrtzSimpropTriggersExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.ruoyi.common.bean.po.QrtzSimpropTriggersExample.Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSchedNameIsNull() {
            addCriterion("sched_name is null");
            return (Criteria) this;
        }

        public Criteria andSchedNameIsNotNull() {
            addCriterion("sched_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchedNameEqualTo(String value) {
            addCriterion("sched_name =", value, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameNotEqualTo(String value) {
            addCriterion("sched_name <>", value, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameGreaterThan(String value) {
            addCriterion("sched_name >", value, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameGreaterThanOrEqualTo(String value) {
            addCriterion("sched_name >=", value, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameLessThan(String value) {
            addCriterion("sched_name <", value, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameLessThanOrEqualTo(String value) {
            addCriterion("sched_name <=", value, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameLike(String value) {
            addCriterion("sched_name like", value, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameNotLike(String value) {
            addCriterion("sched_name not like", value, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameIn(java.util.List<String> values) {
            addCriterion("sched_name in", values, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameNotIn(java.util.List<String> values) {
            addCriterion("sched_name not in", values, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameBetween(String value1, String value2) {
            addCriterion("sched_name between", value1, value2, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameNotBetween(String value1, String value2) {
            addCriterion("sched_name not between", value1, value2, "schedName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameIsNull() {
            addCriterion("trigger_name is null");
            return (Criteria) this;
        }

        public Criteria andTriggerNameIsNotNull() {
            addCriterion("trigger_name is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerNameEqualTo(String value) {
            addCriterion("trigger_name =", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameNotEqualTo(String value) {
            addCriterion("trigger_name <>", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameGreaterThan(String value) {
            addCriterion("trigger_name >", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameGreaterThanOrEqualTo(String value) {
            addCriterion("trigger_name >=", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameLessThan(String value) {
            addCriterion("trigger_name <", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameLessThanOrEqualTo(String value) {
            addCriterion("trigger_name <=", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameLike(String value) {
            addCriterion("trigger_name like", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameNotLike(String value) {
            addCriterion("trigger_name not like", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameIn(java.util.List<String> values) {
            addCriterion("trigger_name in", values, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameNotIn(java.util.List<String> values) {
            addCriterion("trigger_name not in", values, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameBetween(String value1, String value2) {
            addCriterion("trigger_name between", value1, value2, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameNotBetween(String value1, String value2) {
            addCriterion("trigger_name not between", value1, value2, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupIsNull() {
            addCriterion("trigger_group is null");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupIsNotNull() {
            addCriterion("trigger_group is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupEqualTo(String value) {
            addCriterion("trigger_group =", value, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupNotEqualTo(String value) {
            addCriterion("trigger_group <>", value, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupGreaterThan(String value) {
            addCriterion("trigger_group >", value, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupGreaterThanOrEqualTo(String value) {
            addCriterion("trigger_group >=", value, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupLessThan(String value) {
            addCriterion("trigger_group <", value, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupLessThanOrEqualTo(String value) {
            addCriterion("trigger_group <=", value, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupLike(String value) {
            addCriterion("trigger_group like", value, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupNotLike(String value) {
            addCriterion("trigger_group not like", value, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupIn(java.util.List<String> values) {
            addCriterion("trigger_group in", values, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupNotIn(java.util.List<String> values) {
            addCriterion("trigger_group not in", values, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupBetween(String value1, String value2) {
            addCriterion("trigger_group between", value1, value2, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupNotBetween(String value1, String value2) {
            addCriterion("trigger_group not between", value1, value2, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andStrProp1IsNull() {
            addCriterion("str_prop_1 is null");
            return (Criteria) this;
        }

        public Criteria andStrProp1IsNotNull() {
            addCriterion("str_prop_1 is not null");
            return (Criteria) this;
        }

        public Criteria andStrProp1EqualTo(String value) {
            addCriterion("str_prop_1 =", value, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1NotEqualTo(String value) {
            addCriterion("str_prop_1 <>", value, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1GreaterThan(String value) {
            addCriterion("str_prop_1 >", value, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1GreaterThanOrEqualTo(String value) {
            addCriterion("str_prop_1 >=", value, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1LessThan(String value) {
            addCriterion("str_prop_1 <", value, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1LessThanOrEqualTo(String value) {
            addCriterion("str_prop_1 <=", value, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1Like(String value) {
            addCriterion("str_prop_1 like", value, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1NotLike(String value) {
            addCriterion("str_prop_1 not like", value, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1In(java.util.List<String> values) {
            addCriterion("str_prop_1 in", values, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1NotIn(java.util.List<String> values) {
            addCriterion("str_prop_1 not in", values, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1Between(String value1, String value2) {
            addCriterion("str_prop_1 between", value1, value2, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1NotBetween(String value1, String value2) {
            addCriterion("str_prop_1 not between", value1, value2, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp2IsNull() {
            addCriterion("str_prop_2 is null");
            return (Criteria) this;
        }

        public Criteria andStrProp2IsNotNull() {
            addCriterion("str_prop_2 is not null");
            return (Criteria) this;
        }

        public Criteria andStrProp2EqualTo(String value) {
            addCriterion("str_prop_2 =", value, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2NotEqualTo(String value) {
            addCriterion("str_prop_2 <>", value, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2GreaterThan(String value) {
            addCriterion("str_prop_2 >", value, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2GreaterThanOrEqualTo(String value) {
            addCriterion("str_prop_2 >=", value, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2LessThan(String value) {
            addCriterion("str_prop_2 <", value, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2LessThanOrEqualTo(String value) {
            addCriterion("str_prop_2 <=", value, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2Like(String value) {
            addCriterion("str_prop_2 like", value, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2NotLike(String value) {
            addCriterion("str_prop_2 not like", value, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2In(java.util.List<String> values) {
            addCriterion("str_prop_2 in", values, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2NotIn(java.util.List<String> values) {
            addCriterion("str_prop_2 not in", values, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2Between(String value1, String value2) {
            addCriterion("str_prop_2 between", value1, value2, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2NotBetween(String value1, String value2) {
            addCriterion("str_prop_2 not between", value1, value2, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp3IsNull() {
            addCriterion("str_prop_3 is null");
            return (Criteria) this;
        }

        public Criteria andStrProp3IsNotNull() {
            addCriterion("str_prop_3 is not null");
            return (Criteria) this;
        }

        public Criteria andStrProp3EqualTo(String value) {
            addCriterion("str_prop_3 =", value, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3NotEqualTo(String value) {
            addCriterion("str_prop_3 <>", value, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3GreaterThan(String value) {
            addCriterion("str_prop_3 >", value, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3GreaterThanOrEqualTo(String value) {
            addCriterion("str_prop_3 >=", value, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3LessThan(String value) {
            addCriterion("str_prop_3 <", value, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3LessThanOrEqualTo(String value) {
            addCriterion("str_prop_3 <=", value, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3Like(String value) {
            addCriterion("str_prop_3 like", value, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3NotLike(String value) {
            addCriterion("str_prop_3 not like", value, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3In(java.util.List<String> values) {
            addCriterion("str_prop_3 in", values, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3NotIn(java.util.List<String> values) {
            addCriterion("str_prop_3 not in", values, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3Between(String value1, String value2) {
            addCriterion("str_prop_3 between", value1, value2, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3NotBetween(String value1, String value2) {
            addCriterion("str_prop_3 not between", value1, value2, "strProp3");
            return (Criteria) this;
        }

        public Criteria andIntProp1IsNull() {
            addCriterion("int_prop_1 is null");
            return (Criteria) this;
        }

        public Criteria andIntProp1IsNotNull() {
            addCriterion("int_prop_1 is not null");
            return (Criteria) this;
        }

        public Criteria andIntProp1EqualTo(Integer value) {
            addCriterion("int_prop_1 =", value, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1NotEqualTo(Integer value) {
            addCriterion("int_prop_1 <>", value, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1GreaterThan(Integer value) {
            addCriterion("int_prop_1 >", value, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1GreaterThanOrEqualTo(Integer value) {
            addCriterion("int_prop_1 >=", value, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1LessThan(Integer value) {
            addCriterion("int_prop_1 <", value, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1LessThanOrEqualTo(Integer value) {
            addCriterion("int_prop_1 <=", value, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1In(java.util.List<Integer> values) {
            addCriterion("int_prop_1 in", values, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1NotIn(java.util.List<Integer> values) {
            addCriterion("int_prop_1 not in", values, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1Between(Integer value1, Integer value2) {
            addCriterion("int_prop_1 between", value1, value2, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1NotBetween(Integer value1, Integer value2) {
            addCriterion("int_prop_1 not between", value1, value2, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp2IsNull() {
            addCriterion("int_prop_2 is null");
            return (Criteria) this;
        }

        public Criteria andIntProp2IsNotNull() {
            addCriterion("int_prop_2 is not null");
            return (Criteria) this;
        }

        public Criteria andIntProp2EqualTo(Integer value) {
            addCriterion("int_prop_2 =", value, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2NotEqualTo(Integer value) {
            addCriterion("int_prop_2 <>", value, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2GreaterThan(Integer value) {
            addCriterion("int_prop_2 >", value, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2GreaterThanOrEqualTo(Integer value) {
            addCriterion("int_prop_2 >=", value, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2LessThan(Integer value) {
            addCriterion("int_prop_2 <", value, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2LessThanOrEqualTo(Integer value) {
            addCriterion("int_prop_2 <=", value, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2In(java.util.List<Integer> values) {
            addCriterion("int_prop_2 in", values, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2NotIn(java.util.List<Integer> values) {
            addCriterion("int_prop_2 not in", values, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2Between(Integer value1, Integer value2) {
            addCriterion("int_prop_2 between", value1, value2, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2NotBetween(Integer value1, Integer value2) {
            addCriterion("int_prop_2 not between", value1, value2, "intProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp1IsNull() {
            addCriterion("long_prop_1 is null");
            return (Criteria) this;
        }

        public Criteria andLongProp1IsNotNull() {
            addCriterion("long_prop_1 is not null");
            return (Criteria) this;
        }

        public Criteria andLongProp1EqualTo(Long value) {
            addCriterion("long_prop_1 =", value, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1NotEqualTo(Long value) {
            addCriterion("long_prop_1 <>", value, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1GreaterThan(Long value) {
            addCriterion("long_prop_1 >", value, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1GreaterThanOrEqualTo(Long value) {
            addCriterion("long_prop_1 >=", value, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1LessThan(Long value) {
            addCriterion("long_prop_1 <", value, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1LessThanOrEqualTo(Long value) {
            addCriterion("long_prop_1 <=", value, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1In(java.util.List<Long> values) {
            addCriterion("long_prop_1 in", values, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1NotIn(java.util.List<Long> values) {
            addCriterion("long_prop_1 not in", values, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1Between(Long value1, Long value2) {
            addCriterion("long_prop_1 between", value1, value2, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1NotBetween(Long value1, Long value2) {
            addCriterion("long_prop_1 not between", value1, value2, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp2IsNull() {
            addCriterion("long_prop_2 is null");
            return (Criteria) this;
        }

        public Criteria andLongProp2IsNotNull() {
            addCriterion("long_prop_2 is not null");
            return (Criteria) this;
        }

        public Criteria andLongProp2EqualTo(Long value) {
            addCriterion("long_prop_2 =", value, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2NotEqualTo(Long value) {
            addCriterion("long_prop_2 <>", value, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2GreaterThan(Long value) {
            addCriterion("long_prop_2 >", value, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2GreaterThanOrEqualTo(Long value) {
            addCriterion("long_prop_2 >=", value, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2LessThan(Long value) {
            addCriterion("long_prop_2 <", value, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2LessThanOrEqualTo(Long value) {
            addCriterion("long_prop_2 <=", value, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2In(java.util.List<Long> values) {
            addCriterion("long_prop_2 in", values, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2NotIn(java.util.List<Long> values) {
            addCriterion("long_prop_2 not in", values, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2Between(Long value1, Long value2) {
            addCriterion("long_prop_2 between", value1, value2, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2NotBetween(Long value1, Long value2) {
            addCriterion("long_prop_2 not between", value1, value2, "longProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp1IsNull() {
            addCriterion("dec_prop_1 is null");
            return (Criteria) this;
        }

        public Criteria andDecProp1IsNotNull() {
            addCriterion("dec_prop_1 is not null");
            return (Criteria) this;
        }

        public Criteria andDecProp1EqualTo(java.math.BigDecimal value) {
            addCriterion("dec_prop_1 =", value, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1NotEqualTo(java.math.BigDecimal value) {
            addCriterion("dec_prop_1 <>", value, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1GreaterThan(java.math.BigDecimal value) {
            addCriterion("dec_prop_1 >", value, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1GreaterThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("dec_prop_1 >=", value, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1LessThan(java.math.BigDecimal value) {
            addCriterion("dec_prop_1 <", value, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1LessThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("dec_prop_1 <=", value, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1In(java.util.List<java.math.BigDecimal> values) {
            addCriterion("dec_prop_1 in", values, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1NotIn(java.util.List<java.math.BigDecimal> values) {
            addCriterion("dec_prop_1 not in", values, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1Between(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("dec_prop_1 between", value1, value2, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1NotBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("dec_prop_1 not between", value1, value2, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp2IsNull() {
            addCriterion("dec_prop_2 is null");
            return (Criteria) this;
        }

        public Criteria andDecProp2IsNotNull() {
            addCriterion("dec_prop_2 is not null");
            return (Criteria) this;
        }

        public Criteria andDecProp2EqualTo(java.math.BigDecimal value) {
            addCriterion("dec_prop_2 =", value, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2NotEqualTo(java.math.BigDecimal value) {
            addCriterion("dec_prop_2 <>", value, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2GreaterThan(java.math.BigDecimal value) {
            addCriterion("dec_prop_2 >", value, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2GreaterThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("dec_prop_2 >=", value, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2LessThan(java.math.BigDecimal value) {
            addCriterion("dec_prop_2 <", value, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2LessThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("dec_prop_2 <=", value, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2In(java.util.List<java.math.BigDecimal> values) {
            addCriterion("dec_prop_2 in", values, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2NotIn(java.util.List<java.math.BigDecimal> values) {
            addCriterion("dec_prop_2 not in", values, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2Between(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("dec_prop_2 between", value1, value2, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2NotBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("dec_prop_2 not between", value1, value2, "decProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp1IsNull() {
            addCriterion("bool_prop_1 is null");
            return (Criteria) this;
        }

        public Criteria andBoolProp1IsNotNull() {
            addCriterion("bool_prop_1 is not null");
            return (Criteria) this;
        }

        public Criteria andBoolProp1EqualTo(String value) {
            addCriterion("bool_prop_1 =", value, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1NotEqualTo(String value) {
            addCriterion("bool_prop_1 <>", value, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1GreaterThan(String value) {
            addCriterion("bool_prop_1 >", value, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1GreaterThanOrEqualTo(String value) {
            addCriterion("bool_prop_1 >=", value, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1LessThan(String value) {
            addCriterion("bool_prop_1 <", value, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1LessThanOrEqualTo(String value) {
            addCriterion("bool_prop_1 <=", value, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1Like(String value) {
            addCriterion("bool_prop_1 like", value, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1NotLike(String value) {
            addCriterion("bool_prop_1 not like", value, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1In(java.util.List<String> values) {
            addCriterion("bool_prop_1 in", values, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1NotIn(java.util.List<String> values) {
            addCriterion("bool_prop_1 not in", values, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1Between(String value1, String value2) {
            addCriterion("bool_prop_1 between", value1, value2, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1NotBetween(String value1, String value2) {
            addCriterion("bool_prop_1 not between", value1, value2, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp2IsNull() {
            addCriterion("bool_prop_2 is null");
            return (Criteria) this;
        }

        public Criteria andBoolProp2IsNotNull() {
            addCriterion("bool_prop_2 is not null");
            return (Criteria) this;
        }

        public Criteria andBoolProp2EqualTo(String value) {
            addCriterion("bool_prop_2 =", value, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2NotEqualTo(String value) {
            addCriterion("bool_prop_2 <>", value, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2GreaterThan(String value) {
            addCriterion("bool_prop_2 >", value, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2GreaterThanOrEqualTo(String value) {
            addCriterion("bool_prop_2 >=", value, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2LessThan(String value) {
            addCriterion("bool_prop_2 <", value, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2LessThanOrEqualTo(String value) {
            addCriterion("bool_prop_2 <=", value, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2Like(String value) {
            addCriterion("bool_prop_2 like", value, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2NotLike(String value) {
            addCriterion("bool_prop_2 not like", value, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2In(java.util.List<String> values) {
            addCriterion("bool_prop_2 in", values, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2NotIn(java.util.List<String> values) {
            addCriterion("bool_prop_2 not in", values, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2Between(String value1, String value2) {
            addCriterion("bool_prop_2 between", value1, value2, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2NotBetween(String value1, String value2) {
            addCriterion("bool_prop_2 not between", value1, value2, "boolProp2");
            return (Criteria) this;
        }
    }

    /**
     * qrtz_simprop_triggers
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * qrtz_simprop_triggers
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof java.util.List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}