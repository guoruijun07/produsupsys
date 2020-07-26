package com.ruoyi.common.bean.po;

public class PostWebPscOrderOriginalExample {
    /**
     * post_web_psc_order_original
     */
    protected String orderByClause;

    /**
     * post_web_psc_order_original
     */
    protected boolean distinct;

    /**
     * post_web_psc_order_original
     */
    protected java.util.List<com.ruoyi.common.bean.po.PostWebPscOrderOriginalExample.Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public PostWebPscOrderOriginalExample() {
        oredCriteria = new java.util.ArrayList<com.ruoyi.common.bean.po.PostWebPscOrderOriginalExample.Criteria>();
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
    public java.util.List<com.ruoyi.common.bean.po.PostWebPscOrderOriginalExample.Criteria> getOredCriteria() {
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
     * post_web_psc_order_original
     */
    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.ruoyi.common.bean.po.PostWebPscOrderOriginalExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.ruoyi.common.bean.po.PostWebPscOrderOriginalExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.ruoyi.common.bean.po.PostWebPscOrderOriginalExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.ruoyi.common.bean.po.PostWebPscOrderOriginalExample.Criterion> getCriteria() {
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

        public Criteria andBatchNoIsNull() {
            addCriterion("batch_no is null");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNotNull() {
            addCriterion("batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNoEqualTo(String value) {
            addCriterion("batch_no =", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotEqualTo(String value) {
            addCriterion("batch_no <>", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThan(String value) {
            addCriterion("batch_no >", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("batch_no >=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThan(String value) {
            addCriterion("batch_no <", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThanOrEqualTo(String value) {
            addCriterion("batch_no <=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLike(String value) {
            addCriterion("batch_no like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotLike(String value) {
            addCriterion("batch_no not like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIn(java.util.List<String> values) {
            addCriterion("batch_no in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotIn(java.util.List<String> values) {
            addCriterion("batch_no not in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoBetween(String value1, String value2) {
            addCriterion("batch_no between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotBetween(String value1, String value2) {
            addCriterion("batch_no not between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(java.util.List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(java.util.List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andSenderNameIsNull() {
            addCriterion("sender_name is null");
            return (Criteria) this;
        }

        public Criteria andSenderNameIsNotNull() {
            addCriterion("sender_name is not null");
            return (Criteria) this;
        }

        public Criteria andSenderNameEqualTo(String value) {
            addCriterion("sender_name =", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotEqualTo(String value) {
            addCriterion("sender_name <>", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameGreaterThan(String value) {
            addCriterion("sender_name >", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameGreaterThanOrEqualTo(String value) {
            addCriterion("sender_name >=", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLessThan(String value) {
            addCriterion("sender_name <", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLessThanOrEqualTo(String value) {
            addCriterion("sender_name <=", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLike(String value) {
            addCriterion("sender_name like", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotLike(String value) {
            addCriterion("sender_name not like", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameIn(java.util.List<String> values) {
            addCriterion("sender_name in", values, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotIn(java.util.List<String> values) {
            addCriterion("sender_name not in", values, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameBetween(String value1, String value2) {
            addCriterion("sender_name between", value1, value2, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotBetween(String value1, String value2) {
            addCriterion("sender_name not between", value1, value2, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderMobileOneIsNull() {
            addCriterion("sender_mobile_one is null");
            return (Criteria) this;
        }

        public Criteria andSenderMobileOneIsNotNull() {
            addCriterion("sender_mobile_one is not null");
            return (Criteria) this;
        }

        public Criteria andSenderMobileOneEqualTo(String value) {
            addCriterion("sender_mobile_one =", value, "senderMobileOne");
            return (Criteria) this;
        }

        public Criteria andSenderMobileOneNotEqualTo(String value) {
            addCriterion("sender_mobile_one <>", value, "senderMobileOne");
            return (Criteria) this;
        }

        public Criteria andSenderMobileOneGreaterThan(String value) {
            addCriterion("sender_mobile_one >", value, "senderMobileOne");
            return (Criteria) this;
        }

        public Criteria andSenderMobileOneGreaterThanOrEqualTo(String value) {
            addCriterion("sender_mobile_one >=", value, "senderMobileOne");
            return (Criteria) this;
        }

        public Criteria andSenderMobileOneLessThan(String value) {
            addCriterion("sender_mobile_one <", value, "senderMobileOne");
            return (Criteria) this;
        }

        public Criteria andSenderMobileOneLessThanOrEqualTo(String value) {
            addCriterion("sender_mobile_one <=", value, "senderMobileOne");
            return (Criteria) this;
        }

        public Criteria andSenderMobileOneLike(String value) {
            addCriterion("sender_mobile_one like", value, "senderMobileOne");
            return (Criteria) this;
        }

        public Criteria andSenderMobileOneNotLike(String value) {
            addCriterion("sender_mobile_one not like", value, "senderMobileOne");
            return (Criteria) this;
        }

        public Criteria andSenderMobileOneIn(java.util.List<String> values) {
            addCriterion("sender_mobile_one in", values, "senderMobileOne");
            return (Criteria) this;
        }

        public Criteria andSenderMobileOneNotIn(java.util.List<String> values) {
            addCriterion("sender_mobile_one not in", values, "senderMobileOne");
            return (Criteria) this;
        }

        public Criteria andSenderMobileOneBetween(String value1, String value2) {
            addCriterion("sender_mobile_one between", value1, value2, "senderMobileOne");
            return (Criteria) this;
        }

        public Criteria andSenderMobileOneNotBetween(String value1, String value2) {
            addCriterion("sender_mobile_one not between", value1, value2, "senderMobileOne");
            return (Criteria) this;
        }

        public Criteria andSenderMobileTwoIsNull() {
            addCriterion("sender_mobile_two is null");
            return (Criteria) this;
        }

        public Criteria andSenderMobileTwoIsNotNull() {
            addCriterion("sender_mobile_two is not null");
            return (Criteria) this;
        }

        public Criteria andSenderMobileTwoEqualTo(String value) {
            addCriterion("sender_mobile_two =", value, "senderMobileTwo");
            return (Criteria) this;
        }

        public Criteria andSenderMobileTwoNotEqualTo(String value) {
            addCriterion("sender_mobile_two <>", value, "senderMobileTwo");
            return (Criteria) this;
        }

        public Criteria andSenderMobileTwoGreaterThan(String value) {
            addCriterion("sender_mobile_two >", value, "senderMobileTwo");
            return (Criteria) this;
        }

        public Criteria andSenderMobileTwoGreaterThanOrEqualTo(String value) {
            addCriterion("sender_mobile_two >=", value, "senderMobileTwo");
            return (Criteria) this;
        }

        public Criteria andSenderMobileTwoLessThan(String value) {
            addCriterion("sender_mobile_two <", value, "senderMobileTwo");
            return (Criteria) this;
        }

        public Criteria andSenderMobileTwoLessThanOrEqualTo(String value) {
            addCriterion("sender_mobile_two <=", value, "senderMobileTwo");
            return (Criteria) this;
        }

        public Criteria andSenderMobileTwoLike(String value) {
            addCriterion("sender_mobile_two like", value, "senderMobileTwo");
            return (Criteria) this;
        }

        public Criteria andSenderMobileTwoNotLike(String value) {
            addCriterion("sender_mobile_two not like", value, "senderMobileTwo");
            return (Criteria) this;
        }

        public Criteria andSenderMobileTwoIn(java.util.List<String> values) {
            addCriterion("sender_mobile_two in", values, "senderMobileTwo");
            return (Criteria) this;
        }

        public Criteria andSenderMobileTwoNotIn(java.util.List<String> values) {
            addCriterion("sender_mobile_two not in", values, "senderMobileTwo");
            return (Criteria) this;
        }

        public Criteria andSenderMobileTwoBetween(String value1, String value2) {
            addCriterion("sender_mobile_two between", value1, value2, "senderMobileTwo");
            return (Criteria) this;
        }

        public Criteria andSenderMobileTwoNotBetween(String value1, String value2) {
            addCriterion("sender_mobile_two not between", value1, value2, "senderMobileTwo");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceIsNull() {
            addCriterion("sender_province is null");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceIsNotNull() {
            addCriterion("sender_province is not null");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceEqualTo(String value) {
            addCriterion("sender_province =", value, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceNotEqualTo(String value) {
            addCriterion("sender_province <>", value, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceGreaterThan(String value) {
            addCriterion("sender_province >", value, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("sender_province >=", value, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceLessThan(String value) {
            addCriterion("sender_province <", value, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceLessThanOrEqualTo(String value) {
            addCriterion("sender_province <=", value, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceLike(String value) {
            addCriterion("sender_province like", value, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceNotLike(String value) {
            addCriterion("sender_province not like", value, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceIn(java.util.List<String> values) {
            addCriterion("sender_province in", values, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceNotIn(java.util.List<String> values) {
            addCriterion("sender_province not in", values, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceBetween(String value1, String value2) {
            addCriterion("sender_province between", value1, value2, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceNotBetween(String value1, String value2) {
            addCriterion("sender_province not between", value1, value2, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderCityIsNull() {
            addCriterion("sender_city is null");
            return (Criteria) this;
        }

        public Criteria andSenderCityIsNotNull() {
            addCriterion("sender_city is not null");
            return (Criteria) this;
        }

        public Criteria andSenderCityEqualTo(String value) {
            addCriterion("sender_city =", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityNotEqualTo(String value) {
            addCriterion("sender_city <>", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityGreaterThan(String value) {
            addCriterion("sender_city >", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityGreaterThanOrEqualTo(String value) {
            addCriterion("sender_city >=", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityLessThan(String value) {
            addCriterion("sender_city <", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityLessThanOrEqualTo(String value) {
            addCriterion("sender_city <=", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityLike(String value) {
            addCriterion("sender_city like", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityNotLike(String value) {
            addCriterion("sender_city not like", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityIn(java.util.List<String> values) {
            addCriterion("sender_city in", values, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityNotIn(java.util.List<String> values) {
            addCriterion("sender_city not in", values, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityBetween(String value1, String value2) {
            addCriterion("sender_city between", value1, value2, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityNotBetween(String value1, String value2) {
            addCriterion("sender_city not between", value1, value2, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCountyIsNull() {
            addCriterion("sender_county is null");
            return (Criteria) this;
        }

        public Criteria andSenderCountyIsNotNull() {
            addCriterion("sender_county is not null");
            return (Criteria) this;
        }

        public Criteria andSenderCountyEqualTo(String value) {
            addCriterion("sender_county =", value, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyNotEqualTo(String value) {
            addCriterion("sender_county <>", value, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyGreaterThan(String value) {
            addCriterion("sender_county >", value, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyGreaterThanOrEqualTo(String value) {
            addCriterion("sender_county >=", value, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyLessThan(String value) {
            addCriterion("sender_county <", value, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyLessThanOrEqualTo(String value) {
            addCriterion("sender_county <=", value, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyLike(String value) {
            addCriterion("sender_county like", value, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyNotLike(String value) {
            addCriterion("sender_county not like", value, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyIn(java.util.List<String> values) {
            addCriterion("sender_county in", values, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyNotIn(java.util.List<String> values) {
            addCriterion("sender_county not in", values, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyBetween(String value1, String value2) {
            addCriterion("sender_county between", value1, value2, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyNotBetween(String value1, String value2) {
            addCriterion("sender_county not between", value1, value2, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIsNull() {
            addCriterion("sender_address is null");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIsNotNull() {
            addCriterion("sender_address is not null");
            return (Criteria) this;
        }

        public Criteria andSenderAddressEqualTo(String value) {
            addCriterion("sender_address =", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotEqualTo(String value) {
            addCriterion("sender_address <>", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressGreaterThan(String value) {
            addCriterion("sender_address >", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sender_address >=", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLessThan(String value) {
            addCriterion("sender_address <", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLessThanOrEqualTo(String value) {
            addCriterion("sender_address <=", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLike(String value) {
            addCriterion("sender_address like", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotLike(String value) {
            addCriterion("sender_address not like", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIn(java.util.List<String> values) {
            addCriterion("sender_address in", values, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotIn(java.util.List<String> values) {
            addCriterion("sender_address not in", values, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressBetween(String value1, String value2) {
            addCriterion("sender_address between", value1, value2, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotBetween(String value1, String value2) {
            addCriterion("sender_address not between", value1, value2, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andReciverNameIsNull() {
            addCriterion("reciver_name is null");
            return (Criteria) this;
        }

        public Criteria andReciverNameIsNotNull() {
            addCriterion("reciver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReciverNameEqualTo(String value) {
            addCriterion("reciver_name =", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameNotEqualTo(String value) {
            addCriterion("reciver_name <>", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameGreaterThan(String value) {
            addCriterion("reciver_name >", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameGreaterThanOrEqualTo(String value) {
            addCriterion("reciver_name >=", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameLessThan(String value) {
            addCriterion("reciver_name <", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameLessThanOrEqualTo(String value) {
            addCriterion("reciver_name <=", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameLike(String value) {
            addCriterion("reciver_name like", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameNotLike(String value) {
            addCriterion("reciver_name not like", value, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameIn(java.util.List<String> values) {
            addCriterion("reciver_name in", values, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameNotIn(java.util.List<String> values) {
            addCriterion("reciver_name not in", values, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameBetween(String value1, String value2) {
            addCriterion("reciver_name between", value1, value2, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverNameNotBetween(String value1, String value2) {
            addCriterion("reciver_name not between", value1, value2, "reciverName");
            return (Criteria) this;
        }

        public Criteria andReciverMobileOneIsNull() {
            addCriterion("reciver_mobile_one is null");
            return (Criteria) this;
        }

        public Criteria andReciverMobileOneIsNotNull() {
            addCriterion("reciver_mobile_one is not null");
            return (Criteria) this;
        }

        public Criteria andReciverMobileOneEqualTo(String value) {
            addCriterion("reciver_mobile_one =", value, "reciverMobileOne");
            return (Criteria) this;
        }

        public Criteria andReciverMobileOneNotEqualTo(String value) {
            addCriterion("reciver_mobile_one <>", value, "reciverMobileOne");
            return (Criteria) this;
        }

        public Criteria andReciverMobileOneGreaterThan(String value) {
            addCriterion("reciver_mobile_one >", value, "reciverMobileOne");
            return (Criteria) this;
        }

        public Criteria andReciverMobileOneGreaterThanOrEqualTo(String value) {
            addCriterion("reciver_mobile_one >=", value, "reciverMobileOne");
            return (Criteria) this;
        }

        public Criteria andReciverMobileOneLessThan(String value) {
            addCriterion("reciver_mobile_one <", value, "reciverMobileOne");
            return (Criteria) this;
        }

        public Criteria andReciverMobileOneLessThanOrEqualTo(String value) {
            addCriterion("reciver_mobile_one <=", value, "reciverMobileOne");
            return (Criteria) this;
        }

        public Criteria andReciverMobileOneLike(String value) {
            addCriterion("reciver_mobile_one like", value, "reciverMobileOne");
            return (Criteria) this;
        }

        public Criteria andReciverMobileOneNotLike(String value) {
            addCriterion("reciver_mobile_one not like", value, "reciverMobileOne");
            return (Criteria) this;
        }

        public Criteria andReciverMobileOneIn(java.util.List<String> values) {
            addCriterion("reciver_mobile_one in", values, "reciverMobileOne");
            return (Criteria) this;
        }

        public Criteria andReciverMobileOneNotIn(java.util.List<String> values) {
            addCriterion("reciver_mobile_one not in", values, "reciverMobileOne");
            return (Criteria) this;
        }

        public Criteria andReciverMobileOneBetween(String value1, String value2) {
            addCriterion("reciver_mobile_one between", value1, value2, "reciverMobileOne");
            return (Criteria) this;
        }

        public Criteria andReciverMobileOneNotBetween(String value1, String value2) {
            addCriterion("reciver_mobile_one not between", value1, value2, "reciverMobileOne");
            return (Criteria) this;
        }

        public Criteria andReciverMobileTwoIsNull() {
            addCriterion("reciver_mobile_two is null");
            return (Criteria) this;
        }

        public Criteria andReciverMobileTwoIsNotNull() {
            addCriterion("reciver_mobile_two is not null");
            return (Criteria) this;
        }

        public Criteria andReciverMobileTwoEqualTo(String value) {
            addCriterion("reciver_mobile_two =", value, "reciverMobileTwo");
            return (Criteria) this;
        }

        public Criteria andReciverMobileTwoNotEqualTo(String value) {
            addCriterion("reciver_mobile_two <>", value, "reciverMobileTwo");
            return (Criteria) this;
        }

        public Criteria andReciverMobileTwoGreaterThan(String value) {
            addCriterion("reciver_mobile_two >", value, "reciverMobileTwo");
            return (Criteria) this;
        }

        public Criteria andReciverMobileTwoGreaterThanOrEqualTo(String value) {
            addCriterion("reciver_mobile_two >=", value, "reciverMobileTwo");
            return (Criteria) this;
        }

        public Criteria andReciverMobileTwoLessThan(String value) {
            addCriterion("reciver_mobile_two <", value, "reciverMobileTwo");
            return (Criteria) this;
        }

        public Criteria andReciverMobileTwoLessThanOrEqualTo(String value) {
            addCriterion("reciver_mobile_two <=", value, "reciverMobileTwo");
            return (Criteria) this;
        }

        public Criteria andReciverMobileTwoLike(String value) {
            addCriterion("reciver_mobile_two like", value, "reciverMobileTwo");
            return (Criteria) this;
        }

        public Criteria andReciverMobileTwoNotLike(String value) {
            addCriterion("reciver_mobile_two not like", value, "reciverMobileTwo");
            return (Criteria) this;
        }

        public Criteria andReciverMobileTwoIn(java.util.List<String> values) {
            addCriterion("reciver_mobile_two in", values, "reciverMobileTwo");
            return (Criteria) this;
        }

        public Criteria andReciverMobileTwoNotIn(java.util.List<String> values) {
            addCriterion("reciver_mobile_two not in", values, "reciverMobileTwo");
            return (Criteria) this;
        }

        public Criteria andReciverMobileTwoBetween(String value1, String value2) {
            addCriterion("reciver_mobile_two between", value1, value2, "reciverMobileTwo");
            return (Criteria) this;
        }

        public Criteria andReciverMobileTwoNotBetween(String value1, String value2) {
            addCriterion("reciver_mobile_two not between", value1, value2, "reciverMobileTwo");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceIsNull() {
            addCriterion("reciver_province is null");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceIsNotNull() {
            addCriterion("reciver_province is not null");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceEqualTo(String value) {
            addCriterion("reciver_province =", value, "reciverProvince");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceNotEqualTo(String value) {
            addCriterion("reciver_province <>", value, "reciverProvince");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceGreaterThan(String value) {
            addCriterion("reciver_province >", value, "reciverProvince");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("reciver_province >=", value, "reciverProvince");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceLessThan(String value) {
            addCriterion("reciver_province <", value, "reciverProvince");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceLessThanOrEqualTo(String value) {
            addCriterion("reciver_province <=", value, "reciverProvince");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceLike(String value) {
            addCriterion("reciver_province like", value, "reciverProvince");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceNotLike(String value) {
            addCriterion("reciver_province not like", value, "reciverProvince");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceIn(java.util.List<String> values) {
            addCriterion("reciver_province in", values, "reciverProvince");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceNotIn(java.util.List<String> values) {
            addCriterion("reciver_province not in", values, "reciverProvince");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceBetween(String value1, String value2) {
            addCriterion("reciver_province between", value1, value2, "reciverProvince");
            return (Criteria) this;
        }

        public Criteria andReciverProvinceNotBetween(String value1, String value2) {
            addCriterion("reciver_province not between", value1, value2, "reciverProvince");
            return (Criteria) this;
        }

        public Criteria andReciverCityIsNull() {
            addCriterion("reciver_city is null");
            return (Criteria) this;
        }

        public Criteria andReciverCityIsNotNull() {
            addCriterion("reciver_city is not null");
            return (Criteria) this;
        }

        public Criteria andReciverCityEqualTo(String value) {
            addCriterion("reciver_city =", value, "reciverCity");
            return (Criteria) this;
        }

        public Criteria andReciverCityNotEqualTo(String value) {
            addCriterion("reciver_city <>", value, "reciverCity");
            return (Criteria) this;
        }

        public Criteria andReciverCityGreaterThan(String value) {
            addCriterion("reciver_city >", value, "reciverCity");
            return (Criteria) this;
        }

        public Criteria andReciverCityGreaterThanOrEqualTo(String value) {
            addCriterion("reciver_city >=", value, "reciverCity");
            return (Criteria) this;
        }

        public Criteria andReciverCityLessThan(String value) {
            addCriterion("reciver_city <", value, "reciverCity");
            return (Criteria) this;
        }

        public Criteria andReciverCityLessThanOrEqualTo(String value) {
            addCriterion("reciver_city <=", value, "reciverCity");
            return (Criteria) this;
        }

        public Criteria andReciverCityLike(String value) {
            addCriterion("reciver_city like", value, "reciverCity");
            return (Criteria) this;
        }

        public Criteria andReciverCityNotLike(String value) {
            addCriterion("reciver_city not like", value, "reciverCity");
            return (Criteria) this;
        }

        public Criteria andReciverCityIn(java.util.List<String> values) {
            addCriterion("reciver_city in", values, "reciverCity");
            return (Criteria) this;
        }

        public Criteria andReciverCityNotIn(java.util.List<String> values) {
            addCriterion("reciver_city not in", values, "reciverCity");
            return (Criteria) this;
        }

        public Criteria andReciverCityBetween(String value1, String value2) {
            addCriterion("reciver_city between", value1, value2, "reciverCity");
            return (Criteria) this;
        }

        public Criteria andReciverCityNotBetween(String value1, String value2) {
            addCriterion("reciver_city not between", value1, value2, "reciverCity");
            return (Criteria) this;
        }

        public Criteria andReciverCountyIsNull() {
            addCriterion("reciver_county is null");
            return (Criteria) this;
        }

        public Criteria andReciverCountyIsNotNull() {
            addCriterion("reciver_county is not null");
            return (Criteria) this;
        }

        public Criteria andReciverCountyEqualTo(String value) {
            addCriterion("reciver_county =", value, "reciverCounty");
            return (Criteria) this;
        }

        public Criteria andReciverCountyNotEqualTo(String value) {
            addCriterion("reciver_county <>", value, "reciverCounty");
            return (Criteria) this;
        }

        public Criteria andReciverCountyGreaterThan(String value) {
            addCriterion("reciver_county >", value, "reciverCounty");
            return (Criteria) this;
        }

        public Criteria andReciverCountyGreaterThanOrEqualTo(String value) {
            addCriterion("reciver_county >=", value, "reciverCounty");
            return (Criteria) this;
        }

        public Criteria andReciverCountyLessThan(String value) {
            addCriterion("reciver_county <", value, "reciverCounty");
            return (Criteria) this;
        }

        public Criteria andReciverCountyLessThanOrEqualTo(String value) {
            addCriterion("reciver_county <=", value, "reciverCounty");
            return (Criteria) this;
        }

        public Criteria andReciverCountyLike(String value) {
            addCriterion("reciver_county like", value, "reciverCounty");
            return (Criteria) this;
        }

        public Criteria andReciverCountyNotLike(String value) {
            addCriterion("reciver_county not like", value, "reciverCounty");
            return (Criteria) this;
        }

        public Criteria andReciverCountyIn(java.util.List<String> values) {
            addCriterion("reciver_county in", values, "reciverCounty");
            return (Criteria) this;
        }

        public Criteria andReciverCountyNotIn(java.util.List<String> values) {
            addCriterion("reciver_county not in", values, "reciverCounty");
            return (Criteria) this;
        }

        public Criteria andReciverCountyBetween(String value1, String value2) {
            addCriterion("reciver_county between", value1, value2, "reciverCounty");
            return (Criteria) this;
        }

        public Criteria andReciverCountyNotBetween(String value1, String value2) {
            addCriterion("reciver_county not between", value1, value2, "reciverCounty");
            return (Criteria) this;
        }

        public Criteria andReciverAddressIsNull() {
            addCriterion("reciver_address is null");
            return (Criteria) this;
        }

        public Criteria andReciverAddressIsNotNull() {
            addCriterion("reciver_address is not null");
            return (Criteria) this;
        }

        public Criteria andReciverAddressEqualTo(String value) {
            addCriterion("reciver_address =", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressNotEqualTo(String value) {
            addCriterion("reciver_address <>", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressGreaterThan(String value) {
            addCriterion("reciver_address >", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("reciver_address >=", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressLessThan(String value) {
            addCriterion("reciver_address <", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressLessThanOrEqualTo(String value) {
            addCriterion("reciver_address <=", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressLike(String value) {
            addCriterion("reciver_address like", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressNotLike(String value) {
            addCriterion("reciver_address not like", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressIn(java.util.List<String> values) {
            addCriterion("reciver_address in", values, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressNotIn(java.util.List<String> values) {
            addCriterion("reciver_address not in", values, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressBetween(String value1, String value2) {
            addCriterion("reciver_address between", value1, value2, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressNotBetween(String value1, String value2) {
            addCriterion("reciver_address not between", value1, value2, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andOperationNoIsNull() {
            addCriterion("operation_no is null");
            return (Criteria) this;
        }

        public Criteria andOperationNoIsNotNull() {
            addCriterion("operation_no is not null");
            return (Criteria) this;
        }

        public Criteria andOperationNoEqualTo(String value) {
            addCriterion("operation_no =", value, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoNotEqualTo(String value) {
            addCriterion("operation_no <>", value, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoGreaterThan(String value) {
            addCriterion("operation_no >", value, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoGreaterThanOrEqualTo(String value) {
            addCriterion("operation_no >=", value, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoLessThan(String value) {
            addCriterion("operation_no <", value, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoLessThanOrEqualTo(String value) {
            addCriterion("operation_no <=", value, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoLike(String value) {
            addCriterion("operation_no like", value, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoNotLike(String value) {
            addCriterion("operation_no not like", value, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoIn(java.util.List<String> values) {
            addCriterion("operation_no in", values, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoNotIn(java.util.List<String> values) {
            addCriterion("operation_no not in", values, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoBetween(String value1, String value2) {
            addCriterion("operation_no between", value1, value2, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNoNotBetween(String value1, String value2) {
            addCriterion("operation_no not between", value1, value2, "operationNo");
            return (Criteria) this;
        }

        public Criteria andOperationNameIsNull() {
            addCriterion("operation_name is null");
            return (Criteria) this;
        }

        public Criteria andOperationNameIsNotNull() {
            addCriterion("operation_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperationNameEqualTo(String value) {
            addCriterion("operation_name =", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotEqualTo(String value) {
            addCriterion("operation_name <>", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameGreaterThan(String value) {
            addCriterion("operation_name >", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameGreaterThanOrEqualTo(String value) {
            addCriterion("operation_name >=", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLessThan(String value) {
            addCriterion("operation_name <", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLessThanOrEqualTo(String value) {
            addCriterion("operation_name <=", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLike(String value) {
            addCriterion("operation_name like", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotLike(String value) {
            addCriterion("operation_name not like", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameIn(java.util.List<String> values) {
            addCriterion("operation_name in", values, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotIn(java.util.List<String> values) {
            addCriterion("operation_name not in", values, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameBetween(String value1, String value2) {
            addCriterion("operation_name between", value1, value2, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotBetween(String value1, String value2) {
            addCriterion("operation_name not between", value1, value2, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNull() {
            addCriterion("operation_time is null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNotNull() {
            addCriterion("operation_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeEqualTo(java.util.Date value) {
            addCriterion("operation_time =", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotEqualTo(java.util.Date value) {
            addCriterion("operation_time <>", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThan(java.util.Date value) {
            addCriterion("operation_time >", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("operation_time >=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThan(java.util.Date value) {
            addCriterion("operation_time <", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("operation_time <=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIn(java.util.List<java.util.Date> values) {
            addCriterion("operation_time in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotIn(java.util.List<java.util.Date> values) {
            addCriterion("operation_time not in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("operation_time between", value1, value2, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("operation_time not between", value1, value2, "operationTime");
            return (Criteria) this;
        }

        public Criteria andCityWideFlagIsNull() {
            addCriterion("city_wide_flag is null");
            return (Criteria) this;
        }

        public Criteria andCityWideFlagIsNotNull() {
            addCriterion("city_wide_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCityWideFlagEqualTo(Integer value) {
            addCriterion("city_wide_flag =", value, "cityWideFlag");
            return (Criteria) this;
        }

        public Criteria andCityWideFlagNotEqualTo(Integer value) {
            addCriterion("city_wide_flag <>", value, "cityWideFlag");
            return (Criteria) this;
        }

        public Criteria andCityWideFlagGreaterThan(Integer value) {
            addCriterion("city_wide_flag >", value, "cityWideFlag");
            return (Criteria) this;
        }

        public Criteria andCityWideFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_wide_flag >=", value, "cityWideFlag");
            return (Criteria) this;
        }

        public Criteria andCityWideFlagLessThan(Integer value) {
            addCriterion("city_wide_flag <", value, "cityWideFlag");
            return (Criteria) this;
        }

        public Criteria andCityWideFlagLessThanOrEqualTo(Integer value) {
            addCriterion("city_wide_flag <=", value, "cityWideFlag");
            return (Criteria) this;
        }

        public Criteria andCityWideFlagIn(java.util.List<Integer> values) {
            addCriterion("city_wide_flag in", values, "cityWideFlag");
            return (Criteria) this;
        }

        public Criteria andCityWideFlagNotIn(java.util.List<Integer> values) {
            addCriterion("city_wide_flag not in", values, "cityWideFlag");
            return (Criteria) this;
        }

        public Criteria andCityWideFlagBetween(Integer value1, Integer value2) {
            addCriterion("city_wide_flag between", value1, value2, "cityWideFlag");
            return (Criteria) this;
        }

        public Criteria andCityWideFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("city_wide_flag not between", value1, value2, "cityWideFlag");
            return (Criteria) this;
        }

        public Criteria andSortingStatusIsNull() {
            addCriterion("sorting_status is null");
            return (Criteria) this;
        }

        public Criteria andSortingStatusIsNotNull() {
            addCriterion("sorting_status is not null");
            return (Criteria) this;
        }

        public Criteria andSortingStatusEqualTo(Integer value) {
            addCriterion("sorting_status =", value, "sortingStatus");
            return (Criteria) this;
        }

        public Criteria andSortingStatusNotEqualTo(Integer value) {
            addCriterion("sorting_status <>", value, "sortingStatus");
            return (Criteria) this;
        }

        public Criteria andSortingStatusGreaterThan(Integer value) {
            addCriterion("sorting_status >", value, "sortingStatus");
            return (Criteria) this;
        }

        public Criteria andSortingStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sorting_status >=", value, "sortingStatus");
            return (Criteria) this;
        }

        public Criteria andSortingStatusLessThan(Integer value) {
            addCriterion("sorting_status <", value, "sortingStatus");
            return (Criteria) this;
        }

        public Criteria andSortingStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sorting_status <=", value, "sortingStatus");
            return (Criteria) this;
        }

        public Criteria andSortingStatusIn(java.util.List<Integer> values) {
            addCriterion("sorting_status in", values, "sortingStatus");
            return (Criteria) this;
        }

        public Criteria andSortingStatusNotIn(java.util.List<Integer> values) {
            addCriterion("sorting_status not in", values, "sortingStatus");
            return (Criteria) this;
        }

        public Criteria andSortingStatusBetween(Integer value1, Integer value2) {
            addCriterion("sorting_status between", value1, value2, "sortingStatus");
            return (Criteria) this;
        }

        public Criteria andSortingStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sorting_status not between", value1, value2, "sortingStatus");
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(java.util.Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(java.util.Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(java.util.Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(java.util.Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(java.util.List<java.util.Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(java.util.List<java.util.Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(java.util.Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(java.util.Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(java.util.Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(java.util.Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(java.util.List<java.util.Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(java.util.List<java.util.Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * post_web_psc_order_original
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * post_web_psc_order_original
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