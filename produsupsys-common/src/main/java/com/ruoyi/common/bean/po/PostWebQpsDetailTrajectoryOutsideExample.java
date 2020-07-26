package com.ruoyi.common.bean.po;

public class PostWebQpsDetailTrajectoryOutsideExample {
    /**
     * post_web_qps_detail_trajectory_outside
     */
    protected String orderByClause;

    /**
     * post_web_qps_detail_trajectory_outside
     */
    protected boolean distinct;

    /**
     * post_web_qps_detail_trajectory_outside
     */
    protected java.util.List<com.ruoyi.common.bean.po.PostWebQpsDetailTrajectoryOutsideExample.Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public PostWebQpsDetailTrajectoryOutsideExample() {
        oredCriteria = new java.util.ArrayList<com.ruoyi.common.bean.po.PostWebQpsDetailTrajectoryOutsideExample.Criteria>();
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
    public java.util.List<com.ruoyi.common.bean.po.PostWebQpsDetailTrajectoryOutsideExample.Criteria> getOredCriteria() {
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
     * post_web_qps_detail_trajectory_outside
     */
    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.ruoyi.common.bean.po.PostWebQpsDetailTrajectoryOutsideExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.ruoyi.common.bean.po.PostWebQpsDetailTrajectoryOutsideExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.ruoyi.common.bean.po.PostWebQpsDetailTrajectoryOutsideExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.ruoyi.common.bean.po.PostWebQpsDetailTrajectoryOutsideExample.Criterion> getCriteria() {
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

        public Criteria andOpdescIsNull() {
            addCriterion("opDesc is null");
            return (Criteria) this;
        }

        public Criteria andOpdescIsNotNull() {
            addCriterion("opDesc is not null");
            return (Criteria) this;
        }

        public Criteria andOpdescEqualTo(String value) {
            addCriterion("opDesc =", value, "opdesc");
            return (Criteria) this;
        }

        public Criteria andOpdescNotEqualTo(String value) {
            addCriterion("opDesc <>", value, "opdesc");
            return (Criteria) this;
        }

        public Criteria andOpdescGreaterThan(String value) {
            addCriterion("opDesc >", value, "opdesc");
            return (Criteria) this;
        }

        public Criteria andOpdescGreaterThanOrEqualTo(String value) {
            addCriterion("opDesc >=", value, "opdesc");
            return (Criteria) this;
        }

        public Criteria andOpdescLessThan(String value) {
            addCriterion("opDesc <", value, "opdesc");
            return (Criteria) this;
        }

        public Criteria andOpdescLessThanOrEqualTo(String value) {
            addCriterion("opDesc <=", value, "opdesc");
            return (Criteria) this;
        }

        public Criteria andOpdescLike(String value) {
            addCriterion("opDesc like", value, "opdesc");
            return (Criteria) this;
        }

        public Criteria andOpdescNotLike(String value) {
            addCriterion("opDesc not like", value, "opdesc");
            return (Criteria) this;
        }

        public Criteria andOpdescIn(java.util.List<String> values) {
            addCriterion("opDesc in", values, "opdesc");
            return (Criteria) this;
        }

        public Criteria andOpdescNotIn(java.util.List<String> values) {
            addCriterion("opDesc not in", values, "opdesc");
            return (Criteria) this;
        }

        public Criteria andOpdescBetween(String value1, String value2) {
            addCriterion("opDesc between", value1, value2, "opdesc");
            return (Criteria) this;
        }

        public Criteria andOpdescNotBetween(String value1, String value2) {
            addCriterion("opDesc not between", value1, value2, "opdesc");
            return (Criteria) this;
        }

        public Criteria andOporgprovnameIsNull() {
            addCriterion("opOrgProvName is null");
            return (Criteria) this;
        }

        public Criteria andOporgprovnameIsNotNull() {
            addCriterion("opOrgProvName is not null");
            return (Criteria) this;
        }

        public Criteria andOporgprovnameEqualTo(String value) {
            addCriterion("opOrgProvName =", value, "oporgprovname");
            return (Criteria) this;
        }

        public Criteria andOporgprovnameNotEqualTo(String value) {
            addCriterion("opOrgProvName <>", value, "oporgprovname");
            return (Criteria) this;
        }

        public Criteria andOporgprovnameGreaterThan(String value) {
            addCriterion("opOrgProvName >", value, "oporgprovname");
            return (Criteria) this;
        }

        public Criteria andOporgprovnameGreaterThanOrEqualTo(String value) {
            addCriterion("opOrgProvName >=", value, "oporgprovname");
            return (Criteria) this;
        }

        public Criteria andOporgprovnameLessThan(String value) {
            addCriterion("opOrgProvName <", value, "oporgprovname");
            return (Criteria) this;
        }

        public Criteria andOporgprovnameLessThanOrEqualTo(String value) {
            addCriterion("opOrgProvName <=", value, "oporgprovname");
            return (Criteria) this;
        }

        public Criteria andOporgprovnameLike(String value) {
            addCriterion("opOrgProvName like", value, "oporgprovname");
            return (Criteria) this;
        }

        public Criteria andOporgprovnameNotLike(String value) {
            addCriterion("opOrgProvName not like", value, "oporgprovname");
            return (Criteria) this;
        }

        public Criteria andOporgprovnameIn(java.util.List<String> values) {
            addCriterion("opOrgProvName in", values, "oporgprovname");
            return (Criteria) this;
        }

        public Criteria andOporgprovnameNotIn(java.util.List<String> values) {
            addCriterion("opOrgProvName not in", values, "oporgprovname");
            return (Criteria) this;
        }

        public Criteria andOporgprovnameBetween(String value1, String value2) {
            addCriterion("opOrgProvName between", value1, value2, "oporgprovname");
            return (Criteria) this;
        }

        public Criteria andOporgprovnameNotBetween(String value1, String value2) {
            addCriterion("opOrgProvName not between", value1, value2, "oporgprovname");
            return (Criteria) this;
        }

        public Criteria andOporgcityIsNull() {
            addCriterion("opOrgCity is null");
            return (Criteria) this;
        }

        public Criteria andOporgcityIsNotNull() {
            addCriterion("opOrgCity is not null");
            return (Criteria) this;
        }

        public Criteria andOporgcityEqualTo(String value) {
            addCriterion("opOrgCity =", value, "oporgcity");
            return (Criteria) this;
        }

        public Criteria andOporgcityNotEqualTo(String value) {
            addCriterion("opOrgCity <>", value, "oporgcity");
            return (Criteria) this;
        }

        public Criteria andOporgcityGreaterThan(String value) {
            addCriterion("opOrgCity >", value, "oporgcity");
            return (Criteria) this;
        }

        public Criteria andOporgcityGreaterThanOrEqualTo(String value) {
            addCriterion("opOrgCity >=", value, "oporgcity");
            return (Criteria) this;
        }

        public Criteria andOporgcityLessThan(String value) {
            addCriterion("opOrgCity <", value, "oporgcity");
            return (Criteria) this;
        }

        public Criteria andOporgcityLessThanOrEqualTo(String value) {
            addCriterion("opOrgCity <=", value, "oporgcity");
            return (Criteria) this;
        }

        public Criteria andOporgcityLike(String value) {
            addCriterion("opOrgCity like", value, "oporgcity");
            return (Criteria) this;
        }

        public Criteria andOporgcityNotLike(String value) {
            addCriterion("opOrgCity not like", value, "oporgcity");
            return (Criteria) this;
        }

        public Criteria andOporgcityIn(java.util.List<String> values) {
            addCriterion("opOrgCity in", values, "oporgcity");
            return (Criteria) this;
        }

        public Criteria andOporgcityNotIn(java.util.List<String> values) {
            addCriterion("opOrgCity not in", values, "oporgcity");
            return (Criteria) this;
        }

        public Criteria andOporgcityBetween(String value1, String value2) {
            addCriterion("opOrgCity between", value1, value2, "oporgcity");
            return (Criteria) this;
        }

        public Criteria andOporgcityNotBetween(String value1, String value2) {
            addCriterion("opOrgCity not between", value1, value2, "oporgcity");
            return (Criteria) this;
        }

        public Criteria andOporgcodeIsNull() {
            addCriterion("opOrgCode is null");
            return (Criteria) this;
        }

        public Criteria andOporgcodeIsNotNull() {
            addCriterion("opOrgCode is not null");
            return (Criteria) this;
        }

        public Criteria andOporgcodeEqualTo(String value) {
            addCriterion("opOrgCode =", value, "oporgcode");
            return (Criteria) this;
        }

        public Criteria andOporgcodeNotEqualTo(String value) {
            addCriterion("opOrgCode <>", value, "oporgcode");
            return (Criteria) this;
        }

        public Criteria andOporgcodeGreaterThan(String value) {
            addCriterion("opOrgCode >", value, "oporgcode");
            return (Criteria) this;
        }

        public Criteria andOporgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("opOrgCode >=", value, "oporgcode");
            return (Criteria) this;
        }

        public Criteria andOporgcodeLessThan(String value) {
            addCriterion("opOrgCode <", value, "oporgcode");
            return (Criteria) this;
        }

        public Criteria andOporgcodeLessThanOrEqualTo(String value) {
            addCriterion("opOrgCode <=", value, "oporgcode");
            return (Criteria) this;
        }

        public Criteria andOporgcodeLike(String value) {
            addCriterion("opOrgCode like", value, "oporgcode");
            return (Criteria) this;
        }

        public Criteria andOporgcodeNotLike(String value) {
            addCriterion("opOrgCode not like", value, "oporgcode");
            return (Criteria) this;
        }

        public Criteria andOporgcodeIn(java.util.List<String> values) {
            addCriterion("opOrgCode in", values, "oporgcode");
            return (Criteria) this;
        }

        public Criteria andOporgcodeNotIn(java.util.List<String> values) {
            addCriterion("opOrgCode not in", values, "oporgcode");
            return (Criteria) this;
        }

        public Criteria andOporgcodeBetween(String value1, String value2) {
            addCriterion("opOrgCode between", value1, value2, "oporgcode");
            return (Criteria) this;
        }

        public Criteria andOporgcodeNotBetween(String value1, String value2) {
            addCriterion("opOrgCode not between", value1, value2, "oporgcode");
            return (Criteria) this;
        }

        public Criteria andOporgnameIsNull() {
            addCriterion("opOrgName is null");
            return (Criteria) this;
        }

        public Criteria andOporgnameIsNotNull() {
            addCriterion("opOrgName is not null");
            return (Criteria) this;
        }

        public Criteria andOporgnameEqualTo(String value) {
            addCriterion("opOrgName =", value, "oporgname");
            return (Criteria) this;
        }

        public Criteria andOporgnameNotEqualTo(String value) {
            addCriterion("opOrgName <>", value, "oporgname");
            return (Criteria) this;
        }

        public Criteria andOporgnameGreaterThan(String value) {
            addCriterion("opOrgName >", value, "oporgname");
            return (Criteria) this;
        }

        public Criteria andOporgnameGreaterThanOrEqualTo(String value) {
            addCriterion("opOrgName >=", value, "oporgname");
            return (Criteria) this;
        }

        public Criteria andOporgnameLessThan(String value) {
            addCriterion("opOrgName <", value, "oporgname");
            return (Criteria) this;
        }

        public Criteria andOporgnameLessThanOrEqualTo(String value) {
            addCriterion("opOrgName <=", value, "oporgname");
            return (Criteria) this;
        }

        public Criteria andOporgnameLike(String value) {
            addCriterion("opOrgName like", value, "oporgname");
            return (Criteria) this;
        }

        public Criteria andOporgnameNotLike(String value) {
            addCriterion("opOrgName not like", value, "oporgname");
            return (Criteria) this;
        }

        public Criteria andOporgnameIn(java.util.List<String> values) {
            addCriterion("opOrgName in", values, "oporgname");
            return (Criteria) this;
        }

        public Criteria andOporgnameNotIn(java.util.List<String> values) {
            addCriterion("opOrgName not in", values, "oporgname");
            return (Criteria) this;
        }

        public Criteria andOporgnameBetween(String value1, String value2) {
            addCriterion("opOrgName between", value1, value2, "oporgname");
            return (Criteria) this;
        }

        public Criteria andOporgnameNotBetween(String value1, String value2) {
            addCriterion("opOrgName not between", value1, value2, "oporgname");
            return (Criteria) this;
        }

        public Criteria andOperatornoIsNull() {
            addCriterion("operatorNo is null");
            return (Criteria) this;
        }

        public Criteria andOperatornoIsNotNull() {
            addCriterion("operatorNo is not null");
            return (Criteria) this;
        }

        public Criteria andOperatornoEqualTo(String value) {
            addCriterion("operatorNo =", value, "operatorno");
            return (Criteria) this;
        }

        public Criteria andOperatornoNotEqualTo(String value) {
            addCriterion("operatorNo <>", value, "operatorno");
            return (Criteria) this;
        }

        public Criteria andOperatornoGreaterThan(String value) {
            addCriterion("operatorNo >", value, "operatorno");
            return (Criteria) this;
        }

        public Criteria andOperatornoGreaterThanOrEqualTo(String value) {
            addCriterion("operatorNo >=", value, "operatorno");
            return (Criteria) this;
        }

        public Criteria andOperatornoLessThan(String value) {
            addCriterion("operatorNo <", value, "operatorno");
            return (Criteria) this;
        }

        public Criteria andOperatornoLessThanOrEqualTo(String value) {
            addCriterion("operatorNo <=", value, "operatorno");
            return (Criteria) this;
        }

        public Criteria andOperatornoLike(String value) {
            addCriterion("operatorNo like", value, "operatorno");
            return (Criteria) this;
        }

        public Criteria andOperatornoNotLike(String value) {
            addCriterion("operatorNo not like", value, "operatorno");
            return (Criteria) this;
        }

        public Criteria andOperatornoIn(java.util.List<String> values) {
            addCriterion("operatorNo in", values, "operatorno");
            return (Criteria) this;
        }

        public Criteria andOperatornoNotIn(java.util.List<String> values) {
            addCriterion("operatorNo not in", values, "operatorno");
            return (Criteria) this;
        }

        public Criteria andOperatornoBetween(String value1, String value2) {
            addCriterion("operatorNo between", value1, value2, "operatorno");
            return (Criteria) this;
        }

        public Criteria andOperatornoNotBetween(String value1, String value2) {
            addCriterion("operatorNo not between", value1, value2, "operatorno");
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
    }

    /**
     * post_web_qps_detail_trajectory_outside
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * post_web_qps_detail_trajectory_outside
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