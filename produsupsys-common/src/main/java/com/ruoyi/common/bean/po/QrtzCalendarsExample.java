package com.ruoyi.common.bean.po;

public class QrtzCalendarsExample {
    /**
     * qrtz_calendars
     */
    protected String orderByClause;

    /**
     * qrtz_calendars
     */
    protected boolean distinct;

    /**
     * qrtz_calendars
     */
    protected java.util.List<com.ruoyi.common.bean.po.QrtzCalendarsExample.Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public QrtzCalendarsExample() {
        oredCriteria = new java.util.ArrayList<com.ruoyi.common.bean.po.QrtzCalendarsExample.Criteria>();
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
    public java.util.List<com.ruoyi.common.bean.po.QrtzCalendarsExample.Criteria> getOredCriteria() {
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
     * qrtz_calendars
     */
    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.ruoyi.common.bean.po.QrtzCalendarsExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.ruoyi.common.bean.po.QrtzCalendarsExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.ruoyi.common.bean.po.QrtzCalendarsExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.ruoyi.common.bean.po.QrtzCalendarsExample.Criterion> getCriteria() {
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

        public Criteria andCalendarNameIsNull() {
            addCriterion("calendar_name is null");
            return (Criteria) this;
        }

        public Criteria andCalendarNameIsNotNull() {
            addCriterion("calendar_name is not null");
            return (Criteria) this;
        }

        public Criteria andCalendarNameEqualTo(String value) {
            addCriterion("calendar_name =", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameNotEqualTo(String value) {
            addCriterion("calendar_name <>", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameGreaterThan(String value) {
            addCriterion("calendar_name >", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameGreaterThanOrEqualTo(String value) {
            addCriterion("calendar_name >=", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameLessThan(String value) {
            addCriterion("calendar_name <", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameLessThanOrEqualTo(String value) {
            addCriterion("calendar_name <=", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameLike(String value) {
            addCriterion("calendar_name like", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameNotLike(String value) {
            addCriterion("calendar_name not like", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameIn(java.util.List<String> values) {
            addCriterion("calendar_name in", values, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameNotIn(java.util.List<String> values) {
            addCriterion("calendar_name not in", values, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameBetween(String value1, String value2) {
            addCriterion("calendar_name between", value1, value2, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameNotBetween(String value1, String value2) {
            addCriterion("calendar_name not between", value1, value2, "calendarName");
            return (Criteria) this;
        }
    }

    /**
     * qrtz_calendars
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * qrtz_calendars
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