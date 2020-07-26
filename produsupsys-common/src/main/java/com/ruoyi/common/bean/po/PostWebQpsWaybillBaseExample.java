package com.ruoyi.common.bean.po;

public class PostWebQpsWaybillBaseExample {
    /**
     * post_web_qps_waybill_base
     */
    protected String orderByClause;

    /**
     * post_web_qps_waybill_base
     */
    protected boolean distinct;

    /**
     * post_web_qps_waybill_base
     */
    protected java.util.List<com.ruoyi.common.bean.po.PostWebQpsWaybillBaseExample.Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public PostWebQpsWaybillBaseExample() {
        oredCriteria = new java.util.ArrayList<com.ruoyi.common.bean.po.PostWebQpsWaybillBaseExample.Criteria>();
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
    public java.util.List<com.ruoyi.common.bean.po.PostWebQpsWaybillBaseExample.Criteria> getOredCriteria() {
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
     * post_web_qps_waybill_base
     */
    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.ruoyi.common.bean.po.PostWebQpsWaybillBaseExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.ruoyi.common.bean.po.PostWebQpsWaybillBaseExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.ruoyi.common.bean.po.PostWebQpsWaybillBaseExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.ruoyi.common.bean.po.PostWebQpsWaybillBaseExample.Criterion> getCriteria() {
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

        public Criteria andPostdateIsNull() {
            addCriterion("postDate is null");
            return (Criteria) this;
        }

        public Criteria andPostdateIsNotNull() {
            addCriterion("postDate is not null");
            return (Criteria) this;
        }

        public Criteria andPostdateEqualTo(java.util.Date value) {
            addCriterion("postDate =", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotEqualTo(java.util.Date value) {
            addCriterion("postDate <>", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateGreaterThan(java.util.Date value) {
            addCriterion("postDate >", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("postDate >=", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateLessThan(java.util.Date value) {
            addCriterion("postDate <", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateLessThanOrEqualTo(java.util.Date value) {
            addCriterion("postDate <=", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateIn(java.util.List<java.util.Date> values) {
            addCriterion("postDate in", values, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotIn(java.util.List<java.util.Date> values) {
            addCriterion("postDate not in", values, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("postDate between", value1, value2, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("postDate not between", value1, value2, "postdate");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceIsNull() {
            addCriterion("receivePlace is null");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceIsNotNull() {
            addCriterion("receivePlace is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceEqualTo(String value) {
            addCriterion("receivePlace =", value, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceNotEqualTo(String value) {
            addCriterion("receivePlace <>", value, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceGreaterThan(String value) {
            addCriterion("receivePlace >", value, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceGreaterThanOrEqualTo(String value) {
            addCriterion("receivePlace >=", value, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceLessThan(String value) {
            addCriterion("receivePlace <", value, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceLessThanOrEqualTo(String value) {
            addCriterion("receivePlace <=", value, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceLike(String value) {
            addCriterion("receivePlace like", value, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceNotLike(String value) {
            addCriterion("receivePlace not like", value, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceIn(java.util.List<String> values) {
            addCriterion("receivePlace in", values, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceNotIn(java.util.List<String> values) {
            addCriterion("receivePlace not in", values, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceBetween(String value1, String value2) {
            addCriterion("receivePlace between", value1, value2, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceNotBetween(String value1, String value2) {
            addCriterion("receivePlace not between", value1, value2, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andBizproductnameIsNull() {
            addCriterion("bizProductName is null");
            return (Criteria) this;
        }

        public Criteria andBizproductnameIsNotNull() {
            addCriterion("bizProductName is not null");
            return (Criteria) this;
        }

        public Criteria andBizproductnameEqualTo(String value) {
            addCriterion("bizProductName =", value, "bizproductname");
            return (Criteria) this;
        }

        public Criteria andBizproductnameNotEqualTo(String value) {
            addCriterion("bizProductName <>", value, "bizproductname");
            return (Criteria) this;
        }

        public Criteria andBizproductnameGreaterThan(String value) {
            addCriterion("bizProductName >", value, "bizproductname");
            return (Criteria) this;
        }

        public Criteria andBizproductnameGreaterThanOrEqualTo(String value) {
            addCriterion("bizProductName >=", value, "bizproductname");
            return (Criteria) this;
        }

        public Criteria andBizproductnameLessThan(String value) {
            addCriterion("bizProductName <", value, "bizproductname");
            return (Criteria) this;
        }

        public Criteria andBizproductnameLessThanOrEqualTo(String value) {
            addCriterion("bizProductName <=", value, "bizproductname");
            return (Criteria) this;
        }

        public Criteria andBizproductnameLike(String value) {
            addCriterion("bizProductName like", value, "bizproductname");
            return (Criteria) this;
        }

        public Criteria andBizproductnameNotLike(String value) {
            addCriterion("bizProductName not like", value, "bizproductname");
            return (Criteria) this;
        }

        public Criteria andBizproductnameIn(java.util.List<String> values) {
            addCriterion("bizProductName in", values, "bizproductname");
            return (Criteria) this;
        }

        public Criteria andBizproductnameNotIn(java.util.List<String> values) {
            addCriterion("bizProductName not in", values, "bizproductname");
            return (Criteria) this;
        }

        public Criteria andBizproductnameBetween(String value1, String value2) {
            addCriterion("bizProductName between", value1, value2, "bizproductname");
            return (Criteria) this;
        }

        public Criteria andBizproductnameNotBetween(String value1, String value2) {
            addCriterion("bizProductName not between", value1, value2, "bizproductname");
            return (Criteria) this;
        }

        public Criteria andBizproductnoIsNull() {
            addCriterion("bizProductNo is null");
            return (Criteria) this;
        }

        public Criteria andBizproductnoIsNotNull() {
            addCriterion("bizProductNo is not null");
            return (Criteria) this;
        }

        public Criteria andBizproductnoEqualTo(String value) {
            addCriterion("bizProductNo =", value, "bizproductno");
            return (Criteria) this;
        }

        public Criteria andBizproductnoNotEqualTo(String value) {
            addCriterion("bizProductNo <>", value, "bizproductno");
            return (Criteria) this;
        }

        public Criteria andBizproductnoGreaterThan(String value) {
            addCriterion("bizProductNo >", value, "bizproductno");
            return (Criteria) this;
        }

        public Criteria andBizproductnoGreaterThanOrEqualTo(String value) {
            addCriterion("bizProductNo >=", value, "bizproductno");
            return (Criteria) this;
        }

        public Criteria andBizproductnoLessThan(String value) {
            addCriterion("bizProductNo <", value, "bizproductno");
            return (Criteria) this;
        }

        public Criteria andBizproductnoLessThanOrEqualTo(String value) {
            addCriterion("bizProductNo <=", value, "bizproductno");
            return (Criteria) this;
        }

        public Criteria andBizproductnoLike(String value) {
            addCriterion("bizProductNo like", value, "bizproductno");
            return (Criteria) this;
        }

        public Criteria andBizproductnoNotLike(String value) {
            addCriterion("bizProductNo not like", value, "bizproductno");
            return (Criteria) this;
        }

        public Criteria andBizproductnoIn(java.util.List<String> values) {
            addCriterion("bizProductNo in", values, "bizproductno");
            return (Criteria) this;
        }

        public Criteria andBizproductnoNotIn(java.util.List<String> values) {
            addCriterion("bizProductNo not in", values, "bizproductno");
            return (Criteria) this;
        }

        public Criteria andBizproductnoBetween(String value1, String value2) {
            addCriterion("bizProductNo between", value1, value2, "bizproductno");
            return (Criteria) this;
        }

        public Criteria andBizproductnoNotBetween(String value1, String value2) {
            addCriterion("bizProductNo not between", value1, value2, "bizproductno");
            return (Criteria) this;
        }

        public Criteria andBaseproductnameIsNull() {
            addCriterion("baseProductName is null");
            return (Criteria) this;
        }

        public Criteria andBaseproductnameIsNotNull() {
            addCriterion("baseProductName is not null");
            return (Criteria) this;
        }

        public Criteria andBaseproductnameEqualTo(String value) {
            addCriterion("baseProductName =", value, "baseproductname");
            return (Criteria) this;
        }

        public Criteria andBaseproductnameNotEqualTo(String value) {
            addCriterion("baseProductName <>", value, "baseproductname");
            return (Criteria) this;
        }

        public Criteria andBaseproductnameGreaterThan(String value) {
            addCriterion("baseProductName >", value, "baseproductname");
            return (Criteria) this;
        }

        public Criteria andBaseproductnameGreaterThanOrEqualTo(String value) {
            addCriterion("baseProductName >=", value, "baseproductname");
            return (Criteria) this;
        }

        public Criteria andBaseproductnameLessThan(String value) {
            addCriterion("baseProductName <", value, "baseproductname");
            return (Criteria) this;
        }

        public Criteria andBaseproductnameLessThanOrEqualTo(String value) {
            addCriterion("baseProductName <=", value, "baseproductname");
            return (Criteria) this;
        }

        public Criteria andBaseproductnameLike(String value) {
            addCriterion("baseProductName like", value, "baseproductname");
            return (Criteria) this;
        }

        public Criteria andBaseproductnameNotLike(String value) {
            addCriterion("baseProductName not like", value, "baseproductname");
            return (Criteria) this;
        }

        public Criteria andBaseproductnameIn(java.util.List<String> values) {
            addCriterion("baseProductName in", values, "baseproductname");
            return (Criteria) this;
        }

        public Criteria andBaseproductnameNotIn(java.util.List<String> values) {
            addCriterion("baseProductName not in", values, "baseproductname");
            return (Criteria) this;
        }

        public Criteria andBaseproductnameBetween(String value1, String value2) {
            addCriterion("baseProductName between", value1, value2, "baseproductname");
            return (Criteria) this;
        }

        public Criteria andBaseproductnameNotBetween(String value1, String value2) {
            addCriterion("baseProductName not between", value1, value2, "baseproductname");
            return (Criteria) this;
        }

        public Criteria andServiceIsNull() {
            addCriterion("service is null");
            return (Criteria) this;
        }

        public Criteria andServiceIsNotNull() {
            addCriterion("service is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEqualTo(String value) {
            addCriterion("service =", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotEqualTo(String value) {
            addCriterion("service <>", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThan(String value) {
            addCriterion("service >", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThanOrEqualTo(String value) {
            addCriterion("service >=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThan(String value) {
            addCriterion("service <", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThanOrEqualTo(String value) {
            addCriterion("service <=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLike(String value) {
            addCriterion("service like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotLike(String value) {
            addCriterion("service not like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceIn(java.util.List<String> values) {
            addCriterion("service in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotIn(java.util.List<String> values) {
            addCriterion("service not in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceBetween(String value1, String value2) {
            addCriterion("service between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotBetween(String value1, String value2) {
            addCriterion("service not between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andPostagepaidIsNull() {
            addCriterion("postagePaid is null");
            return (Criteria) this;
        }

        public Criteria andPostagepaidIsNotNull() {
            addCriterion("postagePaid is not null");
            return (Criteria) this;
        }

        public Criteria andPostagepaidEqualTo(String value) {
            addCriterion("postagePaid =", value, "postagepaid");
            return (Criteria) this;
        }

        public Criteria andPostagepaidNotEqualTo(String value) {
            addCriterion("postagePaid <>", value, "postagepaid");
            return (Criteria) this;
        }

        public Criteria andPostagepaidGreaterThan(String value) {
            addCriterion("postagePaid >", value, "postagepaid");
            return (Criteria) this;
        }

        public Criteria andPostagepaidGreaterThanOrEqualTo(String value) {
            addCriterion("postagePaid >=", value, "postagepaid");
            return (Criteria) this;
        }

        public Criteria andPostagepaidLessThan(String value) {
            addCriterion("postagePaid <", value, "postagepaid");
            return (Criteria) this;
        }

        public Criteria andPostagepaidLessThanOrEqualTo(String value) {
            addCriterion("postagePaid <=", value, "postagepaid");
            return (Criteria) this;
        }

        public Criteria andPostagepaidLike(String value) {
            addCriterion("postagePaid like", value, "postagepaid");
            return (Criteria) this;
        }

        public Criteria andPostagepaidNotLike(String value) {
            addCriterion("postagePaid not like", value, "postagepaid");
            return (Criteria) this;
        }

        public Criteria andPostagepaidIn(java.util.List<String> values) {
            addCriterion("postagePaid in", values, "postagepaid");
            return (Criteria) this;
        }

        public Criteria andPostagepaidNotIn(java.util.List<String> values) {
            addCriterion("postagePaid not in", values, "postagepaid");
            return (Criteria) this;
        }

        public Criteria andPostagepaidBetween(String value1, String value2) {
            addCriterion("postagePaid between", value1, value2, "postagepaid");
            return (Criteria) this;
        }

        public Criteria andPostagepaidNotBetween(String value1, String value2) {
            addCriterion("postagePaid not between", value1, value2, "postagepaid");
            return (Criteria) this;
        }

        public Criteria andPostagestandardIsNull() {
            addCriterion("postageStandard is null");
            return (Criteria) this;
        }

        public Criteria andPostagestandardIsNotNull() {
            addCriterion("postageStandard is not null");
            return (Criteria) this;
        }

        public Criteria andPostagestandardEqualTo(String value) {
            addCriterion("postageStandard =", value, "postagestandard");
            return (Criteria) this;
        }

        public Criteria andPostagestandardNotEqualTo(String value) {
            addCriterion("postageStandard <>", value, "postagestandard");
            return (Criteria) this;
        }

        public Criteria andPostagestandardGreaterThan(String value) {
            addCriterion("postageStandard >", value, "postagestandard");
            return (Criteria) this;
        }

        public Criteria andPostagestandardGreaterThanOrEqualTo(String value) {
            addCriterion("postageStandard >=", value, "postagestandard");
            return (Criteria) this;
        }

        public Criteria andPostagestandardLessThan(String value) {
            addCriterion("postageStandard <", value, "postagestandard");
            return (Criteria) this;
        }

        public Criteria andPostagestandardLessThanOrEqualTo(String value) {
            addCriterion("postageStandard <=", value, "postagestandard");
            return (Criteria) this;
        }

        public Criteria andPostagestandardLike(String value) {
            addCriterion("postageStandard like", value, "postagestandard");
            return (Criteria) this;
        }

        public Criteria andPostagestandardNotLike(String value) {
            addCriterion("postageStandard not like", value, "postagestandard");
            return (Criteria) this;
        }

        public Criteria andPostagestandardIn(java.util.List<String> values) {
            addCriterion("postageStandard in", values, "postagestandard");
            return (Criteria) this;
        }

        public Criteria andPostagestandardNotIn(java.util.List<String> values) {
            addCriterion("postageStandard not in", values, "postagestandard");
            return (Criteria) this;
        }

        public Criteria andPostagestandardBetween(String value1, String value2) {
            addCriterion("postageStandard between", value1, value2, "postagestandard");
            return (Criteria) this;
        }

        public Criteria andPostagestandardNotBetween(String value1, String value2) {
            addCriterion("postageStandard not between", value1, value2, "postagestandard");
            return (Criteria) this;
        }

        public Criteria andInsuranceamountIsNull() {
            addCriterion("insuranceAmount is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceamountIsNotNull() {
            addCriterion("insuranceAmount is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceamountEqualTo(String value) {
            addCriterion("insuranceAmount =", value, "insuranceamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceamountNotEqualTo(String value) {
            addCriterion("insuranceAmount <>", value, "insuranceamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceamountGreaterThan(String value) {
            addCriterion("insuranceAmount >", value, "insuranceamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceamountGreaterThanOrEqualTo(String value) {
            addCriterion("insuranceAmount >=", value, "insuranceamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceamountLessThan(String value) {
            addCriterion("insuranceAmount <", value, "insuranceamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceamountLessThanOrEqualTo(String value) {
            addCriterion("insuranceAmount <=", value, "insuranceamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceamountLike(String value) {
            addCriterion("insuranceAmount like", value, "insuranceamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceamountNotLike(String value) {
            addCriterion("insuranceAmount not like", value, "insuranceamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceamountIn(java.util.List<String> values) {
            addCriterion("insuranceAmount in", values, "insuranceamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceamountNotIn(java.util.List<String> values) {
            addCriterion("insuranceAmount not in", values, "insuranceamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceamountBetween(String value1, String value2) {
            addCriterion("insuranceAmount between", value1, value2, "insuranceamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceamountNotBetween(String value1, String value2) {
            addCriterion("insuranceAmount not between", value1, value2, "insuranceamount");
            return (Criteria) this;
        }

        public Criteria andInsurancepremiumamoIsNull() {
            addCriterion("insurancePremiumAmo is null");
            return (Criteria) this;
        }

        public Criteria andInsurancepremiumamoIsNotNull() {
            addCriterion("insurancePremiumAmo is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancepremiumamoEqualTo(String value) {
            addCriterion("insurancePremiumAmo =", value, "insurancepremiumamo");
            return (Criteria) this;
        }

        public Criteria andInsurancepremiumamoNotEqualTo(String value) {
            addCriterion("insurancePremiumAmo <>", value, "insurancepremiumamo");
            return (Criteria) this;
        }

        public Criteria andInsurancepremiumamoGreaterThan(String value) {
            addCriterion("insurancePremiumAmo >", value, "insurancepremiumamo");
            return (Criteria) this;
        }

        public Criteria andInsurancepremiumamoGreaterThanOrEqualTo(String value) {
            addCriterion("insurancePremiumAmo >=", value, "insurancepremiumamo");
            return (Criteria) this;
        }

        public Criteria andInsurancepremiumamoLessThan(String value) {
            addCriterion("insurancePremiumAmo <", value, "insurancepremiumamo");
            return (Criteria) this;
        }

        public Criteria andInsurancepremiumamoLessThanOrEqualTo(String value) {
            addCriterion("insurancePremiumAmo <=", value, "insurancepremiumamo");
            return (Criteria) this;
        }

        public Criteria andInsurancepremiumamoLike(String value) {
            addCriterion("insurancePremiumAmo like", value, "insurancepremiumamo");
            return (Criteria) this;
        }

        public Criteria andInsurancepremiumamoNotLike(String value) {
            addCriterion("insurancePremiumAmo not like", value, "insurancepremiumamo");
            return (Criteria) this;
        }

        public Criteria andInsurancepremiumamoIn(java.util.List<String> values) {
            addCriterion("insurancePremiumAmo in", values, "insurancepremiumamo");
            return (Criteria) this;
        }

        public Criteria andInsurancepremiumamoNotIn(java.util.List<String> values) {
            addCriterion("insurancePremiumAmo not in", values, "insurancepremiumamo");
            return (Criteria) this;
        }

        public Criteria andInsurancepremiumamoBetween(String value1, String value2) {
            addCriterion("insurancePremiumAmo between", value1, value2, "insurancepremiumamo");
            return (Criteria) this;
        }

        public Criteria andInsurancepremiumamoNotBetween(String value1, String value2) {
            addCriterion("insurancePremiumAmo not between", value1, value2, "insurancepremiumamo");
            return (Criteria) this;
        }

        public Criteria andRealweightIsNull() {
            addCriterion("realWeight is null");
            return (Criteria) this;
        }

        public Criteria andRealweightIsNotNull() {
            addCriterion("realWeight is not null");
            return (Criteria) this;
        }

        public Criteria andRealweightEqualTo(String value) {
            addCriterion("realWeight =", value, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightNotEqualTo(String value) {
            addCriterion("realWeight <>", value, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightGreaterThan(String value) {
            addCriterion("realWeight >", value, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightGreaterThanOrEqualTo(String value) {
            addCriterion("realWeight >=", value, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightLessThan(String value) {
            addCriterion("realWeight <", value, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightLessThanOrEqualTo(String value) {
            addCriterion("realWeight <=", value, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightLike(String value) {
            addCriterion("realWeight like", value, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightNotLike(String value) {
            addCriterion("realWeight not like", value, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightIn(java.util.List<String> values) {
            addCriterion("realWeight in", values, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightNotIn(java.util.List<String> values) {
            addCriterion("realWeight not in", values, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightBetween(String value1, String value2) {
            addCriterion("realWeight between", value1, value2, "realweight");
            return (Criteria) this;
        }

        public Criteria andRealweightNotBetween(String value1, String value2) {
            addCriterion("realWeight not between", value1, value2, "realweight");
            return (Criteria) this;
        }

        public Criteria andRemarksendernoIsNull() {
            addCriterion("remarksenderNo is null");
            return (Criteria) this;
        }

        public Criteria andRemarksendernoIsNotNull() {
            addCriterion("remarksenderNo is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksendernoEqualTo(String value) {
            addCriterion("remarksenderNo =", value, "remarksenderno");
            return (Criteria) this;
        }

        public Criteria andRemarksendernoNotEqualTo(String value) {
            addCriterion("remarksenderNo <>", value, "remarksenderno");
            return (Criteria) this;
        }

        public Criteria andRemarksendernoGreaterThan(String value) {
            addCriterion("remarksenderNo >", value, "remarksenderno");
            return (Criteria) this;
        }

        public Criteria andRemarksendernoGreaterThanOrEqualTo(String value) {
            addCriterion("remarksenderNo >=", value, "remarksenderno");
            return (Criteria) this;
        }

        public Criteria andRemarksendernoLessThan(String value) {
            addCriterion("remarksenderNo <", value, "remarksenderno");
            return (Criteria) this;
        }

        public Criteria andRemarksendernoLessThanOrEqualTo(String value) {
            addCriterion("remarksenderNo <=", value, "remarksenderno");
            return (Criteria) this;
        }

        public Criteria andRemarksendernoLike(String value) {
            addCriterion("remarksenderNo like", value, "remarksenderno");
            return (Criteria) this;
        }

        public Criteria andRemarksendernoNotLike(String value) {
            addCriterion("remarksenderNo not like", value, "remarksenderno");
            return (Criteria) this;
        }

        public Criteria andRemarksendernoIn(java.util.List<String> values) {
            addCriterion("remarksenderNo in", values, "remarksenderno");
            return (Criteria) this;
        }

        public Criteria andRemarksendernoNotIn(java.util.List<String> values) {
            addCriterion("remarksenderNo not in", values, "remarksenderno");
            return (Criteria) this;
        }

        public Criteria andRemarksendernoBetween(String value1, String value2) {
            addCriterion("remarksenderNo between", value1, value2, "remarksenderno");
            return (Criteria) this;
        }

        public Criteria andRemarksendernoNotBetween(String value1, String value2) {
            addCriterion("remarksenderNo not between", value1, value2, "remarksenderno");
            return (Criteria) this;
        }

        public Criteria andSenderIsNull() {
            addCriterion("sender is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("sender is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(String value) {
            addCriterion("sender =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(String value) {
            addCriterion("sender <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(String value) {
            addCriterion("sender >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(String value) {
            addCriterion("sender >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(String value) {
            addCriterion("sender <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(String value) {
            addCriterion("sender <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLike(String value) {
            addCriterion("sender like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotLike(String value) {
            addCriterion("sender not like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(java.util.List<String> values) {
            addCriterion("sender in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(java.util.List<String> values) {
            addCriterion("sender not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(String value1, String value2) {
            addCriterion("sender between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(String value1, String value2) {
            addCriterion("sender not between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSendertypeIsNull() {
            addCriterion("senderType is null");
            return (Criteria) this;
        }

        public Criteria andSendertypeIsNotNull() {
            addCriterion("senderType is not null");
            return (Criteria) this;
        }

        public Criteria andSendertypeEqualTo(String value) {
            addCriterion("senderType =", value, "sendertype");
            return (Criteria) this;
        }

        public Criteria andSendertypeNotEqualTo(String value) {
            addCriterion("senderType <>", value, "sendertype");
            return (Criteria) this;
        }

        public Criteria andSendertypeGreaterThan(String value) {
            addCriterion("senderType >", value, "sendertype");
            return (Criteria) this;
        }

        public Criteria andSendertypeGreaterThanOrEqualTo(String value) {
            addCriterion("senderType >=", value, "sendertype");
            return (Criteria) this;
        }

        public Criteria andSendertypeLessThan(String value) {
            addCriterion("senderType <", value, "sendertype");
            return (Criteria) this;
        }

        public Criteria andSendertypeLessThanOrEqualTo(String value) {
            addCriterion("senderType <=", value, "sendertype");
            return (Criteria) this;
        }

        public Criteria andSendertypeLike(String value) {
            addCriterion("senderType like", value, "sendertype");
            return (Criteria) this;
        }

        public Criteria andSendertypeNotLike(String value) {
            addCriterion("senderType not like", value, "sendertype");
            return (Criteria) this;
        }

        public Criteria andSendertypeIn(java.util.List<String> values) {
            addCriterion("senderType in", values, "sendertype");
            return (Criteria) this;
        }

        public Criteria andSendertypeNotIn(java.util.List<String> values) {
            addCriterion("senderType not in", values, "sendertype");
            return (Criteria) this;
        }

        public Criteria andSendertypeBetween(String value1, String value2) {
            addCriterion("senderType between", value1, value2, "sendertype");
            return (Criteria) this;
        }

        public Criteria andSendertypeNotBetween(String value1, String value2) {
            addCriterion("senderType not between", value1, value2, "sendertype");
            return (Criteria) this;
        }

        public Criteria andSenderTelIsNull() {
            addCriterion("sender_tel is null");
            return (Criteria) this;
        }

        public Criteria andSenderTelIsNotNull() {
            addCriterion("sender_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSenderTelEqualTo(String value) {
            addCriterion("sender_tel =", value, "senderTel");
            return (Criteria) this;
        }

        public Criteria andSenderTelNotEqualTo(String value) {
            addCriterion("sender_tel <>", value, "senderTel");
            return (Criteria) this;
        }

        public Criteria andSenderTelGreaterThan(String value) {
            addCriterion("sender_tel >", value, "senderTel");
            return (Criteria) this;
        }

        public Criteria andSenderTelGreaterThanOrEqualTo(String value) {
            addCriterion("sender_tel >=", value, "senderTel");
            return (Criteria) this;
        }

        public Criteria andSenderTelLessThan(String value) {
            addCriterion("sender_tel <", value, "senderTel");
            return (Criteria) this;
        }

        public Criteria andSenderTelLessThanOrEqualTo(String value) {
            addCriterion("sender_tel <=", value, "senderTel");
            return (Criteria) this;
        }

        public Criteria andSenderTelLike(String value) {
            addCriterion("sender_tel like", value, "senderTel");
            return (Criteria) this;
        }

        public Criteria andSenderTelNotLike(String value) {
            addCriterion("sender_tel not like", value, "senderTel");
            return (Criteria) this;
        }

        public Criteria andSenderTelIn(java.util.List<String> values) {
            addCriterion("sender_tel in", values, "senderTel");
            return (Criteria) this;
        }

        public Criteria andSenderTelNotIn(java.util.List<String> values) {
            addCriterion("sender_tel not in", values, "senderTel");
            return (Criteria) this;
        }

        public Criteria andSenderTelBetween(String value1, String value2) {
            addCriterion("sender_tel between", value1, value2, "senderTel");
            return (Criteria) this;
        }

        public Criteria andSenderTelNotBetween(String value1, String value2) {
            addCriterion("sender_tel not between", value1, value2, "senderTel");
            return (Criteria) this;
        }

        public Criteria andReceiverlinkerIsNull() {
            addCriterion("receiverLinker is null");
            return (Criteria) this;
        }

        public Criteria andReceiverlinkerIsNotNull() {
            addCriterion("receiverLinker is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverlinkerEqualTo(String value) {
            addCriterion("receiverLinker =", value, "receiverlinker");
            return (Criteria) this;
        }

        public Criteria andReceiverlinkerNotEqualTo(String value) {
            addCriterion("receiverLinker <>", value, "receiverlinker");
            return (Criteria) this;
        }

        public Criteria andReceiverlinkerGreaterThan(String value) {
            addCriterion("receiverLinker >", value, "receiverlinker");
            return (Criteria) this;
        }

        public Criteria andReceiverlinkerGreaterThanOrEqualTo(String value) {
            addCriterion("receiverLinker >=", value, "receiverlinker");
            return (Criteria) this;
        }

        public Criteria andReceiverlinkerLessThan(String value) {
            addCriterion("receiverLinker <", value, "receiverlinker");
            return (Criteria) this;
        }

        public Criteria andReceiverlinkerLessThanOrEqualTo(String value) {
            addCriterion("receiverLinker <=", value, "receiverlinker");
            return (Criteria) this;
        }

        public Criteria andReceiverlinkerLike(String value) {
            addCriterion("receiverLinker like", value, "receiverlinker");
            return (Criteria) this;
        }

        public Criteria andReceiverlinkerNotLike(String value) {
            addCriterion("receiverLinker not like", value, "receiverlinker");
            return (Criteria) this;
        }

        public Criteria andReceiverlinkerIn(java.util.List<String> values) {
            addCriterion("receiverLinker in", values, "receiverlinker");
            return (Criteria) this;
        }

        public Criteria andReceiverlinkerNotIn(java.util.List<String> values) {
            addCriterion("receiverLinker not in", values, "receiverlinker");
            return (Criteria) this;
        }

        public Criteria andReceiverlinkerBetween(String value1, String value2) {
            addCriterion("receiverLinker between", value1, value2, "receiverlinker");
            return (Criteria) this;
        }

        public Criteria andReceiverlinkerNotBetween(String value1, String value2) {
            addCriterion("receiverLinker not between", value1, value2, "receiverlinker");
            return (Criteria) this;
        }

        public Criteria andReceivermobileIsNull() {
            addCriterion("receiverMobile is null");
            return (Criteria) this;
        }

        public Criteria andReceivermobileIsNotNull() {
            addCriterion("receiverMobile is not null");
            return (Criteria) this;
        }

        public Criteria andReceivermobileEqualTo(String value) {
            addCriterion("receiverMobile =", value, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileNotEqualTo(String value) {
            addCriterion("receiverMobile <>", value, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileGreaterThan(String value) {
            addCriterion("receiverMobile >", value, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileGreaterThanOrEqualTo(String value) {
            addCriterion("receiverMobile >=", value, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileLessThan(String value) {
            addCriterion("receiverMobile <", value, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileLessThanOrEqualTo(String value) {
            addCriterion("receiverMobile <=", value, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileLike(String value) {
            addCriterion("receiverMobile like", value, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileNotLike(String value) {
            addCriterion("receiverMobile not like", value, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileIn(java.util.List<String> values) {
            addCriterion("receiverMobile in", values, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileNotIn(java.util.List<String> values) {
            addCriterion("receiverMobile not in", values, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileBetween(String value1, String value2) {
            addCriterion("receiverMobile between", value1, value2, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceivermobileNotBetween(String value1, String value2) {
            addCriterion("receiverMobile not between", value1, value2, "receivermobile");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrIsNull() {
            addCriterion("receiverAddr is null");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrIsNotNull() {
            addCriterion("receiverAddr is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrEqualTo(String value) {
            addCriterion("receiverAddr =", value, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrNotEqualTo(String value) {
            addCriterion("receiverAddr <>", value, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrGreaterThan(String value) {
            addCriterion("receiverAddr >", value, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrGreaterThanOrEqualTo(String value) {
            addCriterion("receiverAddr >=", value, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrLessThan(String value) {
            addCriterion("receiverAddr <", value, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrLessThanOrEqualTo(String value) {
            addCriterion("receiverAddr <=", value, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrLike(String value) {
            addCriterion("receiverAddr like", value, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrNotLike(String value) {
            addCriterion("receiverAddr not like", value, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrIn(java.util.List<String> values) {
            addCriterion("receiverAddr in", values, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrNotIn(java.util.List<String> values) {
            addCriterion("receiverAddr not in", values, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrBetween(String value1, String value2) {
            addCriterion("receiverAddr between", value1, value2, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrNotBetween(String value1, String value2) {
            addCriterion("receiverAddr not between", value1, value2, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNull() {
            addCriterion("postalcode is null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNotNull() {
            addCriterion("postalcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeEqualTo(String value) {
            addCriterion("postalcode =", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotEqualTo(String value) {
            addCriterion("postalcode <>", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThan(String value) {
            addCriterion("postalcode >", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postalcode >=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThan(String value) {
            addCriterion("postalcode <", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThanOrEqualTo(String value) {
            addCriterion("postalcode <=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLike(String value) {
            addCriterion("postalcode like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotLike(String value) {
            addCriterion("postalcode not like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIn(java.util.List<String> values) {
            addCriterion("postalcode in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotIn(java.util.List<String> values) {
            addCriterion("postalcode not in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeBetween(String value1, String value2) {
            addCriterion("postalcode between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotBetween(String value1, String value2) {
            addCriterion("postalcode not between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andInnerNameIsNull() {
            addCriterion("inner_name is null");
            return (Criteria) this;
        }

        public Criteria andInnerNameIsNotNull() {
            addCriterion("inner_name is not null");
            return (Criteria) this;
        }

        public Criteria andInnerNameEqualTo(String value) {
            addCriterion("inner_name =", value, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameNotEqualTo(String value) {
            addCriterion("inner_name <>", value, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameGreaterThan(String value) {
            addCriterion("inner_name >", value, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("inner_name >=", value, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameLessThan(String value) {
            addCriterion("inner_name <", value, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameLessThanOrEqualTo(String value) {
            addCriterion("inner_name <=", value, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameLike(String value) {
            addCriterion("inner_name like", value, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameNotLike(String value) {
            addCriterion("inner_name not like", value, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameIn(java.util.List<String> values) {
            addCriterion("inner_name in", values, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameNotIn(java.util.List<String> values) {
            addCriterion("inner_name not in", values, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameBetween(String value1, String value2) {
            addCriterion("inner_name between", value1, value2, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameNotBetween(String value1, String value2) {
            addCriterion("inner_name not between", value1, value2, "innerName");
            return (Criteria) this;
        }

        public Criteria andReturnnIsNull() {
            addCriterion("returnn is null");
            return (Criteria) this;
        }

        public Criteria andReturnnIsNotNull() {
            addCriterion("returnn is not null");
            return (Criteria) this;
        }

        public Criteria andReturnnEqualTo(String value) {
            addCriterion("returnn =", value, "returnn");
            return (Criteria) this;
        }

        public Criteria andReturnnNotEqualTo(String value) {
            addCriterion("returnn <>", value, "returnn");
            return (Criteria) this;
        }

        public Criteria andReturnnGreaterThan(String value) {
            addCriterion("returnn >", value, "returnn");
            return (Criteria) this;
        }

        public Criteria andReturnnGreaterThanOrEqualTo(String value) {
            addCriterion("returnn >=", value, "returnn");
            return (Criteria) this;
        }

        public Criteria andReturnnLessThan(String value) {
            addCriterion("returnn <", value, "returnn");
            return (Criteria) this;
        }

        public Criteria andReturnnLessThanOrEqualTo(String value) {
            addCriterion("returnn <=", value, "returnn");
            return (Criteria) this;
        }

        public Criteria andReturnnLike(String value) {
            addCriterion("returnn like", value, "returnn");
            return (Criteria) this;
        }

        public Criteria andReturnnNotLike(String value) {
            addCriterion("returnn not like", value, "returnn");
            return (Criteria) this;
        }

        public Criteria andReturnnIn(java.util.List<String> values) {
            addCriterion("returnn in", values, "returnn");
            return (Criteria) this;
        }

        public Criteria andReturnnNotIn(java.util.List<String> values) {
            addCriterion("returnn not in", values, "returnn");
            return (Criteria) this;
        }

        public Criteria andReturnnBetween(String value1, String value2) {
            addCriterion("returnn between", value1, value2, "returnn");
            return (Criteria) this;
        }

        public Criteria andReturnnNotBetween(String value1, String value2) {
            addCriterion("returnn not between", value1, value2, "returnn");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIsNull() {
            addCriterion("return_code is null");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIsNotNull() {
            addCriterion("return_code is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCodeEqualTo(String value) {
            addCriterion("return_code =", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotEqualTo(String value) {
            addCriterion("return_code <>", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeGreaterThan(String value) {
            addCriterion("return_code >", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("return_code >=", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLessThan(String value) {
            addCriterion("return_code <", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLessThanOrEqualTo(String value) {
            addCriterion("return_code <=", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLike(String value) {
            addCriterion("return_code like", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotLike(String value) {
            addCriterion("return_code not like", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIn(java.util.List<String> values) {
            addCriterion("return_code in", values, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotIn(java.util.List<String> values) {
            addCriterion("return_code not in", values, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeBetween(String value1, String value2) {
            addCriterion("return_code between", value1, value2, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotBetween(String value1, String value2) {
            addCriterion("return_code not between", value1, value2, "returnCode");
            return (Criteria) this;
        }

        public Criteria andOptimeIsNull() {
            addCriterion("optime is null");
            return (Criteria) this;
        }

        public Criteria andOptimeIsNotNull() {
            addCriterion("optime is not null");
            return (Criteria) this;
        }

        public Criteria andOptimeEqualTo(java.util.Date value) {
            addCriterion("optime =", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotEqualTo(java.util.Date value) {
            addCriterion("optime <>", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeGreaterThan(java.util.Date value) {
            addCriterion("optime >", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("optime >=", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeLessThan(java.util.Date value) {
            addCriterion("optime <", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("optime <=", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeIn(java.util.List<java.util.Date> values) {
            addCriterion("optime in", values, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotIn(java.util.List<java.util.Date> values) {
            addCriterion("optime not in", values, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("optime between", value1, value2, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("optime not between", value1, value2, "optime");
            return (Criteria) this;
        }
    }

    /**
     * post_web_qps_waybill_base
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * post_web_qps_waybill_base
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