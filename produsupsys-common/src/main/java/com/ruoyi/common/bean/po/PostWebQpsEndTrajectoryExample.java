package com.ruoyi.common.bean.po;

public class PostWebQpsEndTrajectoryExample {
    /**
     * post_web_qps_end_trajectory
     */
    protected String orderByClause;

    /**
     * post_web_qps_end_trajectory
     */
    protected boolean distinct;

    /**
     * post_web_qps_end_trajectory
     */
    protected java.util.List<com.ruoyi.common.bean.po.PostWebQpsEndTrajectoryExample.Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public PostWebQpsEndTrajectoryExample() {
        oredCriteria = new java.util.ArrayList<com.ruoyi.common.bean.po.PostWebQpsEndTrajectoryExample.Criteria>();
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
    public java.util.List<com.ruoyi.common.bean.po.PostWebQpsEndTrajectoryExample.Criteria> getOredCriteria() {
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
     * post_web_qps_end_trajectory
     */
    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.ruoyi.common.bean.po.PostWebQpsEndTrajectoryExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.ruoyi.common.bean.po.PostWebQpsEndTrajectoryExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.ruoyi.common.bean.po.PostWebQpsEndTrajectoryExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.ruoyi.common.bean.po.PostWebQpsEndTrajectoryExample.Criterion> getCriteria() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(java.util.List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(java.util.List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTracenoIsNull() {
            addCriterion("traceNo is null");
            return (Criteria) this;
        }

        public Criteria andTracenoIsNotNull() {
            addCriterion("traceNo is not null");
            return (Criteria) this;
        }

        public Criteria andTracenoEqualTo(String value) {
            addCriterion("traceNo =", value, "traceno");
            return (Criteria) this;
        }

        public Criteria andTracenoNotEqualTo(String value) {
            addCriterion("traceNo <>", value, "traceno");
            return (Criteria) this;
        }

        public Criteria andTracenoGreaterThan(String value) {
            addCriterion("traceNo >", value, "traceno");
            return (Criteria) this;
        }

        public Criteria andTracenoGreaterThanOrEqualTo(String value) {
            addCriterion("traceNo >=", value, "traceno");
            return (Criteria) this;
        }

        public Criteria andTracenoLessThan(String value) {
            addCriterion("traceNo <", value, "traceno");
            return (Criteria) this;
        }

        public Criteria andTracenoLessThanOrEqualTo(String value) {
            addCriterion("traceNo <=", value, "traceno");
            return (Criteria) this;
        }

        public Criteria andTracenoLike(String value) {
            addCriterion("traceNo like", value, "traceno");
            return (Criteria) this;
        }

        public Criteria andTracenoNotLike(String value) {
            addCriterion("traceNo not like", value, "traceno");
            return (Criteria) this;
        }

        public Criteria andTracenoIn(java.util.List<String> values) {
            addCriterion("traceNo in", values, "traceno");
            return (Criteria) this;
        }

        public Criteria andTracenoNotIn(java.util.List<String> values) {
            addCriterion("traceNo not in", values, "traceno");
            return (Criteria) this;
        }

        public Criteria andTracenoBetween(String value1, String value2) {
            addCriterion("traceNo between", value1, value2, "traceno");
            return (Criteria) this;
        }

        public Criteria andTracenoNotBetween(String value1, String value2) {
            addCriterion("traceNo not between", value1, value2, "traceno");
            return (Criteria) this;
        }

        public Criteria andOptimeIsNull() {
            addCriterion("opTime is null");
            return (Criteria) this;
        }

        public Criteria andOptimeIsNotNull() {
            addCriterion("opTime is not null");
            return (Criteria) this;
        }

        public Criteria andOptimeEqualTo(java.util.Date value) {
            addCriterion("opTime =", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotEqualTo(java.util.Date value) {
            addCriterion("opTime <>", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeGreaterThan(java.util.Date value) {
            addCriterion("opTime >", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("opTime >=", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeLessThan(java.util.Date value) {
            addCriterion("opTime <", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("opTime <=", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeIn(java.util.List<java.util.Date> values) {
            addCriterion("opTime in", values, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotIn(java.util.List<java.util.Date> values) {
            addCriterion("opTime not in", values, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("opTime between", value1, value2, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("opTime not between", value1, value2, "optime");
            return (Criteria) this;
        }

        public Criteria andOpnameIsNull() {
            addCriterion("opName is null");
            return (Criteria) this;
        }

        public Criteria andOpnameIsNotNull() {
            addCriterion("opName is not null");
            return (Criteria) this;
        }

        public Criteria andOpnameEqualTo(String value) {
            addCriterion("opName =", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameNotEqualTo(String value) {
            addCriterion("opName <>", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameGreaterThan(String value) {
            addCriterion("opName >", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameGreaterThanOrEqualTo(String value) {
            addCriterion("opName >=", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameLessThan(String value) {
            addCriterion("opName <", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameLessThanOrEqualTo(String value) {
            addCriterion("opName <=", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameLike(String value) {
            addCriterion("opName like", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameNotLike(String value) {
            addCriterion("opName not like", value, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameIn(java.util.List<String> values) {
            addCriterion("opName in", values, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameNotIn(java.util.List<String> values) {
            addCriterion("opName not in", values, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameBetween(String value1, String value2) {
            addCriterion("opName between", value1, value2, "opname");
            return (Criteria) this;
        }

        public Criteria andOpnameNotBetween(String value1, String value2) {
            addCriterion("opName not between", value1, value2, "opname");
            return (Criteria) this;
        }

        public Criteria andOporgsimplenameIsNull() {
            addCriterion("opOrgSimpleName is null");
            return (Criteria) this;
        }

        public Criteria andOporgsimplenameIsNotNull() {
            addCriterion("opOrgSimpleName is not null");
            return (Criteria) this;
        }

        public Criteria andOporgsimplenameEqualTo(String value) {
            addCriterion("opOrgSimpleName =", value, "oporgsimplename");
            return (Criteria) this;
        }

        public Criteria andOporgsimplenameNotEqualTo(String value) {
            addCriterion("opOrgSimpleName <>", value, "oporgsimplename");
            return (Criteria) this;
        }

        public Criteria andOporgsimplenameGreaterThan(String value) {
            addCriterion("opOrgSimpleName >", value, "oporgsimplename");
            return (Criteria) this;
        }

        public Criteria andOporgsimplenameGreaterThanOrEqualTo(String value) {
            addCriterion("opOrgSimpleName >=", value, "oporgsimplename");
            return (Criteria) this;
        }

        public Criteria andOporgsimplenameLessThan(String value) {
            addCriterion("opOrgSimpleName <", value, "oporgsimplename");
            return (Criteria) this;
        }

        public Criteria andOporgsimplenameLessThanOrEqualTo(String value) {
            addCriterion("opOrgSimpleName <=", value, "oporgsimplename");
            return (Criteria) this;
        }

        public Criteria andOporgsimplenameLike(String value) {
            addCriterion("opOrgSimpleName like", value, "oporgsimplename");
            return (Criteria) this;
        }

        public Criteria andOporgsimplenameNotLike(String value) {
            addCriterion("opOrgSimpleName not like", value, "oporgsimplename");
            return (Criteria) this;
        }

        public Criteria andOporgsimplenameIn(java.util.List<String> values) {
            addCriterion("opOrgSimpleName in", values, "oporgsimplename");
            return (Criteria) this;
        }

        public Criteria andOporgsimplenameNotIn(java.util.List<String> values) {
            addCriterion("opOrgSimpleName not in", values, "oporgsimplename");
            return (Criteria) this;
        }

        public Criteria andOporgsimplenameBetween(String value1, String value2) {
            addCriterion("opOrgSimpleName between", value1, value2, "oporgsimplename");
            return (Criteria) this;
        }

        public Criteria andOporgsimplenameNotBetween(String value1, String value2) {
            addCriterion("opOrgSimpleName not between", value1, value2, "oporgsimplename");
            return (Criteria) this;
        }

        public Criteria andRecordLengthIsNull() {
            addCriterion("record_length is null");
            return (Criteria) this;
        }

        public Criteria andRecordLengthIsNotNull() {
            addCriterion("record_length is not null");
            return (Criteria) this;
        }

        public Criteria andRecordLengthEqualTo(String value) {
            addCriterion("record_length =", value, "recordLength");
            return (Criteria) this;
        }

        public Criteria andRecordLengthNotEqualTo(String value) {
            addCriterion("record_length <>", value, "recordLength");
            return (Criteria) this;
        }

        public Criteria andRecordLengthGreaterThan(String value) {
            addCriterion("record_length >", value, "recordLength");
            return (Criteria) this;
        }

        public Criteria andRecordLengthGreaterThanOrEqualTo(String value) {
            addCriterion("record_length >=", value, "recordLength");
            return (Criteria) this;
        }

        public Criteria andRecordLengthLessThan(String value) {
            addCriterion("record_length <", value, "recordLength");
            return (Criteria) this;
        }

        public Criteria andRecordLengthLessThanOrEqualTo(String value) {
            addCriterion("record_length <=", value, "recordLength");
            return (Criteria) this;
        }

        public Criteria andRecordLengthLike(String value) {
            addCriterion("record_length like", value, "recordLength");
            return (Criteria) this;
        }

        public Criteria andRecordLengthNotLike(String value) {
            addCriterion("record_length not like", value, "recordLength");
            return (Criteria) this;
        }

        public Criteria andRecordLengthIn(java.util.List<String> values) {
            addCriterion("record_length in", values, "recordLength");
            return (Criteria) this;
        }

        public Criteria andRecordLengthNotIn(java.util.List<String> values) {
            addCriterion("record_length not in", values, "recordLength");
            return (Criteria) this;
        }

        public Criteria andRecordLengthBetween(String value1, String value2) {
            addCriterion("record_length between", value1, value2, "recordLength");
            return (Criteria) this;
        }

        public Criteria andRecordLengthNotBetween(String value1, String value2) {
            addCriterion("record_length not between", value1, value2, "recordLength");
            return (Criteria) this;
        }
    }

    /**
     * post_web_qps_end_trajectory
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * post_web_qps_end_trajectory
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