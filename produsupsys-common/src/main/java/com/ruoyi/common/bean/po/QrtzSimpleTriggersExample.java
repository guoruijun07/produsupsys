package com.ruoyi.common.bean.po;

public class QrtzSimpleTriggersExample {
    /**
     * qrtz_simple_triggers
     */
    protected String orderByClause;

    /**
     * qrtz_simple_triggers
     */
    protected boolean distinct;

    /**
     * qrtz_simple_triggers
     */
    protected java.util.List<com.ruoyi.common.bean.po.QrtzSimpleTriggersExample.Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public QrtzSimpleTriggersExample() {
        oredCriteria = new java.util.ArrayList<com.ruoyi.common.bean.po.QrtzSimpleTriggersExample.Criteria>();
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
    public java.util.List<com.ruoyi.common.bean.po.QrtzSimpleTriggersExample.Criteria> getOredCriteria() {
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
     * qrtz_simple_triggers
     */
    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.ruoyi.common.bean.po.QrtzSimpleTriggersExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.ruoyi.common.bean.po.QrtzSimpleTriggersExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.ruoyi.common.bean.po.QrtzSimpleTriggersExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.ruoyi.common.bean.po.QrtzSimpleTriggersExample.Criterion> getCriteria() {
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

        public Criteria andRepeatCountIsNull() {
            addCriterion("repeat_count is null");
            return (Criteria) this;
        }

        public Criteria andRepeatCountIsNotNull() {
            addCriterion("repeat_count is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatCountEqualTo(Long value) {
            addCriterion("repeat_count =", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountNotEqualTo(Long value) {
            addCriterion("repeat_count <>", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountGreaterThan(Long value) {
            addCriterion("repeat_count >", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountGreaterThanOrEqualTo(Long value) {
            addCriterion("repeat_count >=", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountLessThan(Long value) {
            addCriterion("repeat_count <", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountLessThanOrEqualTo(Long value) {
            addCriterion("repeat_count <=", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountIn(java.util.List<Long> values) {
            addCriterion("repeat_count in", values, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountNotIn(java.util.List<Long> values) {
            addCriterion("repeat_count not in", values, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountBetween(Long value1, Long value2) {
            addCriterion("repeat_count between", value1, value2, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountNotBetween(Long value1, Long value2) {
            addCriterion("repeat_count not between", value1, value2, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatIntervalIsNull() {
            addCriterion("repeat_interval is null");
            return (Criteria) this;
        }

        public Criteria andRepeatIntervalIsNotNull() {
            addCriterion("repeat_interval is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatIntervalEqualTo(Long value) {
            addCriterion("repeat_interval =", value, "repeatInterval");
            return (Criteria) this;
        }

        public Criteria andRepeatIntervalNotEqualTo(Long value) {
            addCriterion("repeat_interval <>", value, "repeatInterval");
            return (Criteria) this;
        }

        public Criteria andRepeatIntervalGreaterThan(Long value) {
            addCriterion("repeat_interval >", value, "repeatInterval");
            return (Criteria) this;
        }

        public Criteria andRepeatIntervalGreaterThanOrEqualTo(Long value) {
            addCriterion("repeat_interval >=", value, "repeatInterval");
            return (Criteria) this;
        }

        public Criteria andRepeatIntervalLessThan(Long value) {
            addCriterion("repeat_interval <", value, "repeatInterval");
            return (Criteria) this;
        }

        public Criteria andRepeatIntervalLessThanOrEqualTo(Long value) {
            addCriterion("repeat_interval <=", value, "repeatInterval");
            return (Criteria) this;
        }

        public Criteria andRepeatIntervalIn(java.util.List<Long> values) {
            addCriterion("repeat_interval in", values, "repeatInterval");
            return (Criteria) this;
        }

        public Criteria andRepeatIntervalNotIn(java.util.List<Long> values) {
            addCriterion("repeat_interval not in", values, "repeatInterval");
            return (Criteria) this;
        }

        public Criteria andRepeatIntervalBetween(Long value1, Long value2) {
            addCriterion("repeat_interval between", value1, value2, "repeatInterval");
            return (Criteria) this;
        }

        public Criteria andRepeatIntervalNotBetween(Long value1, Long value2) {
            addCriterion("repeat_interval not between", value1, value2, "repeatInterval");
            return (Criteria) this;
        }

        public Criteria andTimesTriggeredIsNull() {
            addCriterion("times_triggered is null");
            return (Criteria) this;
        }

        public Criteria andTimesTriggeredIsNotNull() {
            addCriterion("times_triggered is not null");
            return (Criteria) this;
        }

        public Criteria andTimesTriggeredEqualTo(Long value) {
            addCriterion("times_triggered =", value, "timesTriggered");
            return (Criteria) this;
        }

        public Criteria andTimesTriggeredNotEqualTo(Long value) {
            addCriterion("times_triggered <>", value, "timesTriggered");
            return (Criteria) this;
        }

        public Criteria andTimesTriggeredGreaterThan(Long value) {
            addCriterion("times_triggered >", value, "timesTriggered");
            return (Criteria) this;
        }

        public Criteria andTimesTriggeredGreaterThanOrEqualTo(Long value) {
            addCriterion("times_triggered >=", value, "timesTriggered");
            return (Criteria) this;
        }

        public Criteria andTimesTriggeredLessThan(Long value) {
            addCriterion("times_triggered <", value, "timesTriggered");
            return (Criteria) this;
        }

        public Criteria andTimesTriggeredLessThanOrEqualTo(Long value) {
            addCriterion("times_triggered <=", value, "timesTriggered");
            return (Criteria) this;
        }

        public Criteria andTimesTriggeredIn(java.util.List<Long> values) {
            addCriterion("times_triggered in", values, "timesTriggered");
            return (Criteria) this;
        }

        public Criteria andTimesTriggeredNotIn(java.util.List<Long> values) {
            addCriterion("times_triggered not in", values, "timesTriggered");
            return (Criteria) this;
        }

        public Criteria andTimesTriggeredBetween(Long value1, Long value2) {
            addCriterion("times_triggered between", value1, value2, "timesTriggered");
            return (Criteria) this;
        }

        public Criteria andTimesTriggeredNotBetween(Long value1, Long value2) {
            addCriterion("times_triggered not between", value1, value2, "timesTriggered");
            return (Criteria) this;
        }
    }

    /**
     * qrtz_simple_triggers
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * qrtz_simple_triggers
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