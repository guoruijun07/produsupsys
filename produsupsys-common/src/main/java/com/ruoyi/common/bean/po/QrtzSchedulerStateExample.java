package com.ruoyi.common.bean.po;

public class QrtzSchedulerStateExample {
    /**
     * qrtz_scheduler_state
     */
    protected String orderByClause;

    /**
     * qrtz_scheduler_state
     */
    protected boolean distinct;

    /**
     * qrtz_scheduler_state
     */
    protected java.util.List<com.ruoyi.common.bean.po.QrtzSchedulerStateExample.Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public QrtzSchedulerStateExample() {
        oredCriteria = new java.util.ArrayList<com.ruoyi.common.bean.po.QrtzSchedulerStateExample.Criteria>();
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
    public java.util.List<com.ruoyi.common.bean.po.QrtzSchedulerStateExample.Criteria> getOredCriteria() {
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
     * qrtz_scheduler_state
     */
    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.ruoyi.common.bean.po.QrtzSchedulerStateExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.ruoyi.common.bean.po.QrtzSchedulerStateExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.ruoyi.common.bean.po.QrtzSchedulerStateExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.ruoyi.common.bean.po.QrtzSchedulerStateExample.Criterion> getCriteria() {
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

        public Criteria andInstanceNameIsNull() {
            addCriterion("instance_name is null");
            return (Criteria) this;
        }

        public Criteria andInstanceNameIsNotNull() {
            addCriterion("instance_name is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceNameEqualTo(String value) {
            addCriterion("instance_name =", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameNotEqualTo(String value) {
            addCriterion("instance_name <>", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameGreaterThan(String value) {
            addCriterion("instance_name >", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameGreaterThanOrEqualTo(String value) {
            addCriterion("instance_name >=", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameLessThan(String value) {
            addCriterion("instance_name <", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameLessThanOrEqualTo(String value) {
            addCriterion("instance_name <=", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameLike(String value) {
            addCriterion("instance_name like", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameNotLike(String value) {
            addCriterion("instance_name not like", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameIn(java.util.List<String> values) {
            addCriterion("instance_name in", values, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameNotIn(java.util.List<String> values) {
            addCriterion("instance_name not in", values, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameBetween(String value1, String value2) {
            addCriterion("instance_name between", value1, value2, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameNotBetween(String value1, String value2) {
            addCriterion("instance_name not between", value1, value2, "instanceName");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeIsNull() {
            addCriterion("last_checkin_time is null");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeIsNotNull() {
            addCriterion("last_checkin_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeEqualTo(Long value) {
            addCriterion("last_checkin_time =", value, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeNotEqualTo(Long value) {
            addCriterion("last_checkin_time <>", value, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeGreaterThan(Long value) {
            addCriterion("last_checkin_time >", value, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("last_checkin_time >=", value, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeLessThan(Long value) {
            addCriterion("last_checkin_time <", value, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeLessThanOrEqualTo(Long value) {
            addCriterion("last_checkin_time <=", value, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeIn(java.util.List<Long> values) {
            addCriterion("last_checkin_time in", values, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeNotIn(java.util.List<Long> values) {
            addCriterion("last_checkin_time not in", values, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeBetween(Long value1, Long value2) {
            addCriterion("last_checkin_time between", value1, value2, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckinTimeNotBetween(Long value1, Long value2) {
            addCriterion("last_checkin_time not between", value1, value2, "lastCheckinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinIntervalIsNull() {
            addCriterion("checkin_interval is null");
            return (Criteria) this;
        }

        public Criteria andCheckinIntervalIsNotNull() {
            addCriterion("checkin_interval is not null");
            return (Criteria) this;
        }

        public Criteria andCheckinIntervalEqualTo(Long value) {
            addCriterion("checkin_interval =", value, "checkinInterval");
            return (Criteria) this;
        }

        public Criteria andCheckinIntervalNotEqualTo(Long value) {
            addCriterion("checkin_interval <>", value, "checkinInterval");
            return (Criteria) this;
        }

        public Criteria andCheckinIntervalGreaterThan(Long value) {
            addCriterion("checkin_interval >", value, "checkinInterval");
            return (Criteria) this;
        }

        public Criteria andCheckinIntervalGreaterThanOrEqualTo(Long value) {
            addCriterion("checkin_interval >=", value, "checkinInterval");
            return (Criteria) this;
        }

        public Criteria andCheckinIntervalLessThan(Long value) {
            addCriterion("checkin_interval <", value, "checkinInterval");
            return (Criteria) this;
        }

        public Criteria andCheckinIntervalLessThanOrEqualTo(Long value) {
            addCriterion("checkin_interval <=", value, "checkinInterval");
            return (Criteria) this;
        }

        public Criteria andCheckinIntervalIn(java.util.List<Long> values) {
            addCriterion("checkin_interval in", values, "checkinInterval");
            return (Criteria) this;
        }

        public Criteria andCheckinIntervalNotIn(java.util.List<Long> values) {
            addCriterion("checkin_interval not in", values, "checkinInterval");
            return (Criteria) this;
        }

        public Criteria andCheckinIntervalBetween(Long value1, Long value2) {
            addCriterion("checkin_interval between", value1, value2, "checkinInterval");
            return (Criteria) this;
        }

        public Criteria andCheckinIntervalNotBetween(Long value1, Long value2) {
            addCriterion("checkin_interval not between", value1, value2, "checkinInterval");
            return (Criteria) this;
        }
    }

    /**
     * qrtz_scheduler_state
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * qrtz_scheduler_state
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