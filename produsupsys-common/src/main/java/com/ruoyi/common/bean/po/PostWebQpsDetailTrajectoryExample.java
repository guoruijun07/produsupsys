package com.ruoyi.common.bean.po;

public class PostWebQpsDetailTrajectoryExample {
    /**
     * post_web_qps_detail_trajectory
     */
    protected String orderByClause;

    /**
     * post_web_qps_detail_trajectory
     */
    protected boolean distinct;

    /**
     * post_web_qps_detail_trajectory
     */
    protected java.util.List<com.ruoyi.common.bean.po.PostWebQpsDetailTrajectoryExample.Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public PostWebQpsDetailTrajectoryExample() {
        oredCriteria = new java.util.ArrayList<com.ruoyi.common.bean.po.PostWebQpsDetailTrajectoryExample.Criteria>();
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
    public java.util.List<com.ruoyi.common.bean.po.PostWebQpsDetailTrajectoryExample.Criteria> getOredCriteria() {
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
     * post_web_qps_detail_trajectory
     */
    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.ruoyi.common.bean.po.PostWebQpsDetailTrajectoryExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.ruoyi.common.bean.po.PostWebQpsDetailTrajectoryExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.ruoyi.common.bean.po.PostWebQpsDetailTrajectoryExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.ruoyi.common.bean.po.PostWebQpsDetailTrajectoryExample.Criterion> getCriteria() {
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

        public Criteria andOpcodeIsNull() {
            addCriterion("opCode is null");
            return (Criteria) this;
        }

        public Criteria andOpcodeIsNotNull() {
            addCriterion("opCode is not null");
            return (Criteria) this;
        }

        public Criteria andOpcodeEqualTo(String value) {
            addCriterion("opCode =", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotEqualTo(String value) {
            addCriterion("opCode <>", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThan(String value) {
            addCriterion("opCode >", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("opCode >=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThan(String value) {
            addCriterion("opCode <", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThanOrEqualTo(String value) {
            addCriterion("opCode <=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLike(String value) {
            addCriterion("opCode like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotLike(String value) {
            addCriterion("opCode not like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeIn(java.util.List<String> values) {
            addCriterion("opCode in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotIn(java.util.List<String> values) {
            addCriterion("opCode not in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeBetween(String value1, String value2) {
            addCriterion("opCode between", value1, value2, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotBetween(String value1, String value2) {
            addCriterion("opCode not between", value1, value2, "opcode");
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

        public Criteria andDescIsNull() {
            addCriterion("desc is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("desc is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("desc =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("desc <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("desc >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("desc >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("desc <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("desc <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("desc like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("desc not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(java.util.List<String> values) {
            addCriterion("desc in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(java.util.List<String> values) {
            addCriterion("desc not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("desc between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("desc not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNull() {
            addCriterion("operatorName is null");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNotNull() {
            addCriterion("operatorName is not null");
            return (Criteria) this;
        }

        public Criteria andOperatornameEqualTo(String value) {
            addCriterion("operatorName =", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotEqualTo(String value) {
            addCriterion("operatorName <>", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThan(String value) {
            addCriterion("operatorName >", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThanOrEqualTo(String value) {
            addCriterion("operatorName >=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThan(String value) {
            addCriterion("operatorName <", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThanOrEqualTo(String value) {
            addCriterion("operatorName <=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLike(String value) {
            addCriterion("operatorName like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotLike(String value) {
            addCriterion("operatorName not like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameIn(java.util.List<String> values) {
            addCriterion("operatorName in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotIn(java.util.List<String> values) {
            addCriterion("operatorName not in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameBetween(String value1, String value2) {
            addCriterion("operatorName between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotBetween(String value1, String value2) {
            addCriterion("operatorName not between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(java.util.List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(java.util.List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(java.util.List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(java.util.List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(java.util.List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(java.util.List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * post_web_qps_detail_trajectory
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * post_web_qps_detail_trajectory
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