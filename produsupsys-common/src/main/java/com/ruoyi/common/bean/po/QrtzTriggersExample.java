package com.ruoyi.common.bean.po;

public class QrtzTriggersExample {
    /**
     * qrtz_triggers
     */
    protected String orderByClause;

    /**
     * qrtz_triggers
     */
    protected boolean distinct;

    /**
     * qrtz_triggers
     */
    protected java.util.List<com.ruoyi.common.bean.po.QrtzTriggersExample.Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public QrtzTriggersExample() {
        oredCriteria = new java.util.ArrayList<com.ruoyi.common.bean.po.QrtzTriggersExample.Criteria>();
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
    public java.util.List<com.ruoyi.common.bean.po.QrtzTriggersExample.Criteria> getOredCriteria() {
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
     * qrtz_triggers
     */
    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.ruoyi.common.bean.po.QrtzTriggersExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.ruoyi.common.bean.po.QrtzTriggersExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.ruoyi.common.bean.po.QrtzTriggersExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.ruoyi.common.bean.po.QrtzTriggersExample.Criterion> getCriteria() {
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

        public Criteria andJobNameIsNull() {
            addCriterion("job_name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job_name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job_name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job_name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job_name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job_name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job_name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job_name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(java.util.List<String> values) {
            addCriterion("job_name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(java.util.List<String> values) {
            addCriterion("job_name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job_name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job_name not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobGroupIsNull() {
            addCriterion("job_group is null");
            return (Criteria) this;
        }

        public Criteria andJobGroupIsNotNull() {
            addCriterion("job_group is not null");
            return (Criteria) this;
        }

        public Criteria andJobGroupEqualTo(String value) {
            addCriterion("job_group =", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotEqualTo(String value) {
            addCriterion("job_group <>", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThan(String value) {
            addCriterion("job_group >", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThanOrEqualTo(String value) {
            addCriterion("job_group >=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThan(String value) {
            addCriterion("job_group <", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThanOrEqualTo(String value) {
            addCriterion("job_group <=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLike(String value) {
            addCriterion("job_group like", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotLike(String value) {
            addCriterion("job_group not like", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupIn(java.util.List<String> values) {
            addCriterion("job_group in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotIn(java.util.List<String> values) {
            addCriterion("job_group not in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupBetween(String value1, String value2) {
            addCriterion("job_group between", value1, value2, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotBetween(String value1, String value2) {
            addCriterion("job_group not between", value1, value2, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(java.util.List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(java.util.List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeIsNull() {
            addCriterion("next_fire_time is null");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeIsNotNull() {
            addCriterion("next_fire_time is not null");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeEqualTo(Long value) {
            addCriterion("next_fire_time =", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeNotEqualTo(Long value) {
            addCriterion("next_fire_time <>", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeGreaterThan(Long value) {
            addCriterion("next_fire_time >", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("next_fire_time >=", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeLessThan(Long value) {
            addCriterion("next_fire_time <", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeLessThanOrEqualTo(Long value) {
            addCriterion("next_fire_time <=", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeIn(java.util.List<Long> values) {
            addCriterion("next_fire_time in", values, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeNotIn(java.util.List<Long> values) {
            addCriterion("next_fire_time not in", values, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeBetween(Long value1, Long value2) {
            addCriterion("next_fire_time between", value1, value2, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeNotBetween(Long value1, Long value2) {
            addCriterion("next_fire_time not between", value1, value2, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeIsNull() {
            addCriterion("prev_fire_time is null");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeIsNotNull() {
            addCriterion("prev_fire_time is not null");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeEqualTo(Long value) {
            addCriterion("prev_fire_time =", value, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeNotEqualTo(Long value) {
            addCriterion("prev_fire_time <>", value, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeGreaterThan(Long value) {
            addCriterion("prev_fire_time >", value, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("prev_fire_time >=", value, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeLessThan(Long value) {
            addCriterion("prev_fire_time <", value, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeLessThanOrEqualTo(Long value) {
            addCriterion("prev_fire_time <=", value, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeIn(java.util.List<Long> values) {
            addCriterion("prev_fire_time in", values, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeNotIn(java.util.List<Long> values) {
            addCriterion("prev_fire_time not in", values, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeBetween(Long value1, Long value2) {
            addCriterion("prev_fire_time between", value1, value2, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeNotBetween(Long value1, Long value2) {
            addCriterion("prev_fire_time not between", value1, value2, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(java.util.List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(java.util.List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andTriggerStateIsNull() {
            addCriterion("trigger_state is null");
            return (Criteria) this;
        }

        public Criteria andTriggerStateIsNotNull() {
            addCriterion("trigger_state is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerStateEqualTo(String value) {
            addCriterion("trigger_state =", value, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateNotEqualTo(String value) {
            addCriterion("trigger_state <>", value, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateGreaterThan(String value) {
            addCriterion("trigger_state >", value, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateGreaterThanOrEqualTo(String value) {
            addCriterion("trigger_state >=", value, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateLessThan(String value) {
            addCriterion("trigger_state <", value, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateLessThanOrEqualTo(String value) {
            addCriterion("trigger_state <=", value, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateLike(String value) {
            addCriterion("trigger_state like", value, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateNotLike(String value) {
            addCriterion("trigger_state not like", value, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateIn(java.util.List<String> values) {
            addCriterion("trigger_state in", values, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateNotIn(java.util.List<String> values) {
            addCriterion("trigger_state not in", values, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateBetween(String value1, String value2) {
            addCriterion("trigger_state between", value1, value2, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateNotBetween(String value1, String value2) {
            addCriterion("trigger_state not between", value1, value2, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeIsNull() {
            addCriterion("trigger_type is null");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeIsNotNull() {
            addCriterion("trigger_type is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeEqualTo(String value) {
            addCriterion("trigger_type =", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeNotEqualTo(String value) {
            addCriterion("trigger_type <>", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeGreaterThan(String value) {
            addCriterion("trigger_type >", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("trigger_type >=", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeLessThan(String value) {
            addCriterion("trigger_type <", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeLessThanOrEqualTo(String value) {
            addCriterion("trigger_type <=", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeLike(String value) {
            addCriterion("trigger_type like", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeNotLike(String value) {
            addCriterion("trigger_type not like", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeIn(java.util.List<String> values) {
            addCriterion("trigger_type in", values, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeNotIn(java.util.List<String> values) {
            addCriterion("trigger_type not in", values, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeBetween(String value1, String value2) {
            addCriterion("trigger_type between", value1, value2, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeNotBetween(String value1, String value2) {
            addCriterion("trigger_type not between", value1, value2, "triggerType");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Long value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Long value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Long value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Long value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Long value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(java.util.List<Long> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(java.util.List<Long> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Long value1, Long value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Long value1, Long value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Long value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Long value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Long value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Long value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(java.util.List<Long> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(java.util.List<Long> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Long value1, Long value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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

        public Criteria andMisfireInstrIsNull() {
            addCriterion("misfire_instr is null");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrIsNotNull() {
            addCriterion("misfire_instr is not null");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrEqualTo(Short value) {
            addCriterion("misfire_instr =", value, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrNotEqualTo(Short value) {
            addCriterion("misfire_instr <>", value, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrGreaterThan(Short value) {
            addCriterion("misfire_instr >", value, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrGreaterThanOrEqualTo(Short value) {
            addCriterion("misfire_instr >=", value, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrLessThan(Short value) {
            addCriterion("misfire_instr <", value, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrLessThanOrEqualTo(Short value) {
            addCriterion("misfire_instr <=", value, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrIn(java.util.List<Short> values) {
            addCriterion("misfire_instr in", values, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrNotIn(java.util.List<Short> values) {
            addCriterion("misfire_instr not in", values, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrBetween(Short value1, Short value2) {
            addCriterion("misfire_instr between", value1, value2, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrNotBetween(Short value1, Short value2) {
            addCriterion("misfire_instr not between", value1, value2, "misfireInstr");
            return (Criteria) this;
        }
    }

    /**
     * qrtz_triggers
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * qrtz_triggers
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