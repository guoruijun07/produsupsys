package com.ruoyi.common.bean.po;

public class postWebPscSortingExample {
    /**
     * post_web_psc_sorting
     */
    protected String orderByClause;

    /**
     * post_web_psc_sorting
     */
    protected boolean distinct;

    /**
     * post_web_psc_sorting
     */
    protected java.util.List<com.ruoyi.common.bean.po.postWebPscSortingExample.Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public postWebPscSortingExample() {
        oredCriteria = new java.util.ArrayList<com.ruoyi.common.bean.po.postWebPscSortingExample.Criteria>();
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
    public java.util.List<com.ruoyi.common.bean.po.postWebPscSortingExample.Criteria> getOredCriteria() {
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
     * post_web_psc_sorting
     */
    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.ruoyi.common.bean.po.postWebPscSortingExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.ruoyi.common.bean.po.postWebPscSortingExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.ruoyi.common.bean.po.postWebPscSortingExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.ruoyi.common.bean.po.postWebPscSortingExample.Criterion> getCriteria() {
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

        public Criteria andOrgNumIsNull() {
            addCriterion("org_num is null");
            return (Criteria) this;
        }

        public Criteria andOrgNumIsNotNull() {
            addCriterion("org_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNumEqualTo(Integer value) {
            addCriterion("org_num =", value, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumNotEqualTo(Integer value) {
            addCriterion("org_num <>", value, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumGreaterThan(Integer value) {
            addCriterion("org_num >", value, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_num >=", value, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumLessThan(Integer value) {
            addCriterion("org_num <", value, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumLessThanOrEqualTo(Integer value) {
            addCriterion("org_num <=", value, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumIn(java.util.List<Integer> values) {
            addCriterion("org_num in", values, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumNotIn(java.util.List<Integer> values) {
            addCriterion("org_num not in", values, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumBetween(Integer value1, Integer value2) {
            addCriterion("org_num between", value1, value2, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNumNotBetween(Integer value1, Integer value2) {
            addCriterion("org_num not between", value1, value2, "orgNum");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(java.util.List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(java.util.List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andSortingNameIsNull() {
            addCriterion("sorting_name is null");
            return (Criteria) this;
        }

        public Criteria andSortingNameIsNotNull() {
            addCriterion("sorting_name is not null");
            return (Criteria) this;
        }

        public Criteria andSortingNameEqualTo(String value) {
            addCriterion("sorting_name =", value, "sortingName");
            return (Criteria) this;
        }

        public Criteria andSortingNameNotEqualTo(String value) {
            addCriterion("sorting_name <>", value, "sortingName");
            return (Criteria) this;
        }

        public Criteria andSortingNameGreaterThan(String value) {
            addCriterion("sorting_name >", value, "sortingName");
            return (Criteria) this;
        }

        public Criteria andSortingNameGreaterThanOrEqualTo(String value) {
            addCriterion("sorting_name >=", value, "sortingName");
            return (Criteria) this;
        }

        public Criteria andSortingNameLessThan(String value) {
            addCriterion("sorting_name <", value, "sortingName");
            return (Criteria) this;
        }

        public Criteria andSortingNameLessThanOrEqualTo(String value) {
            addCriterion("sorting_name <=", value, "sortingName");
            return (Criteria) this;
        }

        public Criteria andSortingNameLike(String value) {
            addCriterion("sorting_name like", value, "sortingName");
            return (Criteria) this;
        }

        public Criteria andSortingNameNotLike(String value) {
            addCriterion("sorting_name not like", value, "sortingName");
            return (Criteria) this;
        }

        public Criteria andSortingNameIn(java.util.List<String> values) {
            addCriterion("sorting_name in", values, "sortingName");
            return (Criteria) this;
        }

        public Criteria andSortingNameNotIn(java.util.List<String> values) {
            addCriterion("sorting_name not in", values, "sortingName");
            return (Criteria) this;
        }

        public Criteria andSortingNameBetween(String value1, String value2) {
            addCriterion("sorting_name between", value1, value2, "sortingName");
            return (Criteria) this;
        }

        public Criteria andSortingNameNotBetween(String value1, String value2) {
            addCriterion("sorting_name not between", value1, value2, "sortingName");
            return (Criteria) this;
        }

        public Criteria andDistribuCenterIsNull() {
            addCriterion("distribu_center is null");
            return (Criteria) this;
        }

        public Criteria andDistribuCenterIsNotNull() {
            addCriterion("distribu_center is not null");
            return (Criteria) this;
        }

        public Criteria andDistribuCenterEqualTo(String value) {
            addCriterion("distribu_center =", value, "distribuCenter");
            return (Criteria) this;
        }

        public Criteria andDistribuCenterNotEqualTo(String value) {
            addCriterion("distribu_center <>", value, "distribuCenter");
            return (Criteria) this;
        }

        public Criteria andDistribuCenterGreaterThan(String value) {
            addCriterion("distribu_center >", value, "distribuCenter");
            return (Criteria) this;
        }

        public Criteria andDistribuCenterGreaterThanOrEqualTo(String value) {
            addCriterion("distribu_center >=", value, "distribuCenter");
            return (Criteria) this;
        }

        public Criteria andDistribuCenterLessThan(String value) {
            addCriterion("distribu_center <", value, "distribuCenter");
            return (Criteria) this;
        }

        public Criteria andDistribuCenterLessThanOrEqualTo(String value) {
            addCriterion("distribu_center <=", value, "distribuCenter");
            return (Criteria) this;
        }

        public Criteria andDistribuCenterLike(String value) {
            addCriterion("distribu_center like", value, "distribuCenter");
            return (Criteria) this;
        }

        public Criteria andDistribuCenterNotLike(String value) {
            addCriterion("distribu_center not like", value, "distribuCenter");
            return (Criteria) this;
        }

        public Criteria andDistribuCenterIn(java.util.List<String> values) {
            addCriterion("distribu_center in", values, "distribuCenter");
            return (Criteria) this;
        }

        public Criteria andDistribuCenterNotIn(java.util.List<String> values) {
            addCriterion("distribu_center not in", values, "distribuCenter");
            return (Criteria) this;
        }

        public Criteria andDistribuCenterBetween(String value1, String value2) {
            addCriterion("distribu_center between", value1, value2, "distribuCenter");
            return (Criteria) this;
        }

        public Criteria andDistribuCenterNotBetween(String value1, String value2) {
            addCriterion("distribu_center not between", value1, value2, "distribuCenter");
            return (Criteria) this;
        }

        public Criteria andDlvNameIsNull() {
            addCriterion("dlv_name is null");
            return (Criteria) this;
        }

        public Criteria andDlvNameIsNotNull() {
            addCriterion("dlv_name is not null");
            return (Criteria) this;
        }

        public Criteria andDlvNameEqualTo(String value) {
            addCriterion("dlv_name =", value, "dlvName");
            return (Criteria) this;
        }

        public Criteria andDlvNameNotEqualTo(String value) {
            addCriterion("dlv_name <>", value, "dlvName");
            return (Criteria) this;
        }

        public Criteria andDlvNameGreaterThan(String value) {
            addCriterion("dlv_name >", value, "dlvName");
            return (Criteria) this;
        }

        public Criteria andDlvNameGreaterThanOrEqualTo(String value) {
            addCriterion("dlv_name >=", value, "dlvName");
            return (Criteria) this;
        }

        public Criteria andDlvNameLessThan(String value) {
            addCriterion("dlv_name <", value, "dlvName");
            return (Criteria) this;
        }

        public Criteria andDlvNameLessThanOrEqualTo(String value) {
            addCriterion("dlv_name <=", value, "dlvName");
            return (Criteria) this;
        }

        public Criteria andDlvNameLike(String value) {
            addCriterion("dlv_name like", value, "dlvName");
            return (Criteria) this;
        }

        public Criteria andDlvNameNotLike(String value) {
            addCriterion("dlv_name not like", value, "dlvName");
            return (Criteria) this;
        }

        public Criteria andDlvNameIn(java.util.List<String> values) {
            addCriterion("dlv_name in", values, "dlvName");
            return (Criteria) this;
        }

        public Criteria andDlvNameNotIn(java.util.List<String> values) {
            addCriterion("dlv_name not in", values, "dlvName");
            return (Criteria) this;
        }

        public Criteria andDlvNameBetween(String value1, String value2) {
            addCriterion("dlv_name between", value1, value2, "dlvName");
            return (Criteria) this;
        }

        public Criteria andDlvNameNotBetween(String value1, String value2) {
            addCriterion("dlv_name not between", value1, value2, "dlvName");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(java.util.List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(java.util.List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNumIsNull() {
            addCriterion("area_num is null");
            return (Criteria) this;
        }

        public Criteria andAreaNumIsNotNull() {
            addCriterion("area_num is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNumEqualTo(String value) {
            addCriterion("area_num =", value, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumNotEqualTo(String value) {
            addCriterion("area_num <>", value, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumGreaterThan(String value) {
            addCriterion("area_num >", value, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumGreaterThanOrEqualTo(String value) {
            addCriterion("area_num >=", value, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumLessThan(String value) {
            addCriterion("area_num <", value, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumLessThanOrEqualTo(String value) {
            addCriterion("area_num <=", value, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumLike(String value) {
            addCriterion("area_num like", value, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumNotLike(String value) {
            addCriterion("area_num not like", value, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumIn(java.util.List<String> values) {
            addCriterion("area_num in", values, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumNotIn(java.util.List<String> values) {
            addCriterion("area_num not in", values, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumBetween(String value1, String value2) {
            addCriterion("area_num between", value1, value2, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumNotBetween(String value1, String value2) {
            addCriterion("area_num not between", value1, value2, "areaNum");
            return (Criteria) this;
        }

        public Criteria andMarkingIsNull() {
            addCriterion("marking is null");
            return (Criteria) this;
        }

        public Criteria andMarkingIsNotNull() {
            addCriterion("marking is not null");
            return (Criteria) this;
        }

        public Criteria andMarkingEqualTo(String value) {
            addCriterion("marking =", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotEqualTo(String value) {
            addCriterion("marking <>", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingGreaterThan(String value) {
            addCriterion("marking >", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingGreaterThanOrEqualTo(String value) {
            addCriterion("marking >=", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLessThan(String value) {
            addCriterion("marking <", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLessThanOrEqualTo(String value) {
            addCriterion("marking <=", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLike(String value) {
            addCriterion("marking like", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotLike(String value) {
            addCriterion("marking not like", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingIn(java.util.List<String> values) {
            addCriterion("marking in", values, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotIn(java.util.List<String> values) {
            addCriterion("marking not in", values, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingBetween(String value1, String value2) {
            addCriterion("marking between", value1, value2, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotBetween(String value1, String value2) {
            addCriterion("marking not between", value1, value2, "marking");
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

        public Criteria andReceive1IsNull() {
            addCriterion("receive1 is null");
            return (Criteria) this;
        }

        public Criteria andReceive1IsNotNull() {
            addCriterion("receive1 is not null");
            return (Criteria) this;
        }

        public Criteria andReceive1EqualTo(String value) {
            addCriterion("receive1 =", value, "receive1");
            return (Criteria) this;
        }

        public Criteria andReceive1NotEqualTo(String value) {
            addCriterion("receive1 <>", value, "receive1");
            return (Criteria) this;
        }

        public Criteria andReceive1GreaterThan(String value) {
            addCriterion("receive1 >", value, "receive1");
            return (Criteria) this;
        }

        public Criteria andReceive1GreaterThanOrEqualTo(String value) {
            addCriterion("receive1 >=", value, "receive1");
            return (Criteria) this;
        }

        public Criteria andReceive1LessThan(String value) {
            addCriterion("receive1 <", value, "receive1");
            return (Criteria) this;
        }

        public Criteria andReceive1LessThanOrEqualTo(String value) {
            addCriterion("receive1 <=", value, "receive1");
            return (Criteria) this;
        }

        public Criteria andReceive1Like(String value) {
            addCriterion("receive1 like", value, "receive1");
            return (Criteria) this;
        }

        public Criteria andReceive1NotLike(String value) {
            addCriterion("receive1 not like", value, "receive1");
            return (Criteria) this;
        }

        public Criteria andReceive1In(java.util.List<String> values) {
            addCriterion("receive1 in", values, "receive1");
            return (Criteria) this;
        }

        public Criteria andReceive1NotIn(java.util.List<String> values) {
            addCriterion("receive1 not in", values, "receive1");
            return (Criteria) this;
        }

        public Criteria andReceive1Between(String value1, String value2) {
            addCriterion("receive1 between", value1, value2, "receive1");
            return (Criteria) this;
        }

        public Criteria andReceive1NotBetween(String value1, String value2) {
            addCriterion("receive1 not between", value1, value2, "receive1");
            return (Criteria) this;
        }

        public Criteria andReceive2IsNull() {
            addCriterion("receive2 is null");
            return (Criteria) this;
        }

        public Criteria andReceive2IsNotNull() {
            addCriterion("receive2 is not null");
            return (Criteria) this;
        }

        public Criteria andReceive2EqualTo(String value) {
            addCriterion("receive2 =", value, "receive2");
            return (Criteria) this;
        }

        public Criteria andReceive2NotEqualTo(String value) {
            addCriterion("receive2 <>", value, "receive2");
            return (Criteria) this;
        }

        public Criteria andReceive2GreaterThan(String value) {
            addCriterion("receive2 >", value, "receive2");
            return (Criteria) this;
        }

        public Criteria andReceive2GreaterThanOrEqualTo(String value) {
            addCriterion("receive2 >=", value, "receive2");
            return (Criteria) this;
        }

        public Criteria andReceive2LessThan(String value) {
            addCriterion("receive2 <", value, "receive2");
            return (Criteria) this;
        }

        public Criteria andReceive2LessThanOrEqualTo(String value) {
            addCriterion("receive2 <=", value, "receive2");
            return (Criteria) this;
        }

        public Criteria andReceive2Like(String value) {
            addCriterion("receive2 like", value, "receive2");
            return (Criteria) this;
        }

        public Criteria andReceive2NotLike(String value) {
            addCriterion("receive2 not like", value, "receive2");
            return (Criteria) this;
        }

        public Criteria andReceive2In(java.util.List<String> values) {
            addCriterion("receive2 in", values, "receive2");
            return (Criteria) this;
        }

        public Criteria andReceive2NotIn(java.util.List<String> values) {
            addCriterion("receive2 not in", values, "receive2");
            return (Criteria) this;
        }

        public Criteria andReceive2Between(String value1, String value2) {
            addCriterion("receive2 between", value1, value2, "receive2");
            return (Criteria) this;
        }

        public Criteria andReceive2NotBetween(String value1, String value2) {
            addCriterion("receive2 not between", value1, value2, "receive2");
            return (Criteria) this;
        }

        public Criteria andReceive3IsNull() {
            addCriterion("receive3 is null");
            return (Criteria) this;
        }

        public Criteria andReceive3IsNotNull() {
            addCriterion("receive3 is not null");
            return (Criteria) this;
        }

        public Criteria andReceive3EqualTo(String value) {
            addCriterion("receive3 =", value, "receive3");
            return (Criteria) this;
        }

        public Criteria andReceive3NotEqualTo(String value) {
            addCriterion("receive3 <>", value, "receive3");
            return (Criteria) this;
        }

        public Criteria andReceive3GreaterThan(String value) {
            addCriterion("receive3 >", value, "receive3");
            return (Criteria) this;
        }

        public Criteria andReceive3GreaterThanOrEqualTo(String value) {
            addCriterion("receive3 >=", value, "receive3");
            return (Criteria) this;
        }

        public Criteria andReceive3LessThan(String value) {
            addCriterion("receive3 <", value, "receive3");
            return (Criteria) this;
        }

        public Criteria andReceive3LessThanOrEqualTo(String value) {
            addCriterion("receive3 <=", value, "receive3");
            return (Criteria) this;
        }

        public Criteria andReceive3Like(String value) {
            addCriterion("receive3 like", value, "receive3");
            return (Criteria) this;
        }

        public Criteria andReceive3NotLike(String value) {
            addCriterion("receive3 not like", value, "receive3");
            return (Criteria) this;
        }

        public Criteria andReceive3In(java.util.List<String> values) {
            addCriterion("receive3 in", values, "receive3");
            return (Criteria) this;
        }

        public Criteria andReceive3NotIn(java.util.List<String> values) {
            addCriterion("receive3 not in", values, "receive3");
            return (Criteria) this;
        }

        public Criteria andReceive3Between(String value1, String value2) {
            addCriterion("receive3 between", value1, value2, "receive3");
            return (Criteria) this;
        }

        public Criteria andReceive3NotBetween(String value1, String value2) {
            addCriterion("receive3 not between", value1, value2, "receive3");
            return (Criteria) this;
        }

        public Criteria andReceive4IsNull() {
            addCriterion("receive4 is null");
            return (Criteria) this;
        }

        public Criteria andReceive4IsNotNull() {
            addCriterion("receive4 is not null");
            return (Criteria) this;
        }

        public Criteria andReceive4EqualTo(String value) {
            addCriterion("receive4 =", value, "receive4");
            return (Criteria) this;
        }

        public Criteria andReceive4NotEqualTo(String value) {
            addCriterion("receive4 <>", value, "receive4");
            return (Criteria) this;
        }

        public Criteria andReceive4GreaterThan(String value) {
            addCriterion("receive4 >", value, "receive4");
            return (Criteria) this;
        }

        public Criteria andReceive4GreaterThanOrEqualTo(String value) {
            addCriterion("receive4 >=", value, "receive4");
            return (Criteria) this;
        }

        public Criteria andReceive4LessThan(String value) {
            addCriterion("receive4 <", value, "receive4");
            return (Criteria) this;
        }

        public Criteria andReceive4LessThanOrEqualTo(String value) {
            addCriterion("receive4 <=", value, "receive4");
            return (Criteria) this;
        }

        public Criteria andReceive4Like(String value) {
            addCriterion("receive4 like", value, "receive4");
            return (Criteria) this;
        }

        public Criteria andReceive4NotLike(String value) {
            addCriterion("receive4 not like", value, "receive4");
            return (Criteria) this;
        }

        public Criteria andReceive4In(java.util.List<String> values) {
            addCriterion("receive4 in", values, "receive4");
            return (Criteria) this;
        }

        public Criteria andReceive4NotIn(java.util.List<String> values) {
            addCriterion("receive4 not in", values, "receive4");
            return (Criteria) this;
        }

        public Criteria andReceive4Between(String value1, String value2) {
            addCriterion("receive4 between", value1, value2, "receive4");
            return (Criteria) this;
        }

        public Criteria andReceive4NotBetween(String value1, String value2) {
            addCriterion("receive4 not between", value1, value2, "receive4");
            return (Criteria) this;
        }

        public Criteria andReceive5IsNull() {
            addCriterion("receive5 is null");
            return (Criteria) this;
        }

        public Criteria andReceive5IsNotNull() {
            addCriterion("receive5 is not null");
            return (Criteria) this;
        }

        public Criteria andReceive5EqualTo(String value) {
            addCriterion("receive5 =", value, "receive5");
            return (Criteria) this;
        }

        public Criteria andReceive5NotEqualTo(String value) {
            addCriterion("receive5 <>", value, "receive5");
            return (Criteria) this;
        }

        public Criteria andReceive5GreaterThan(String value) {
            addCriterion("receive5 >", value, "receive5");
            return (Criteria) this;
        }

        public Criteria andReceive5GreaterThanOrEqualTo(String value) {
            addCriterion("receive5 >=", value, "receive5");
            return (Criteria) this;
        }

        public Criteria andReceive5LessThan(String value) {
            addCriterion("receive5 <", value, "receive5");
            return (Criteria) this;
        }

        public Criteria andReceive5LessThanOrEqualTo(String value) {
            addCriterion("receive5 <=", value, "receive5");
            return (Criteria) this;
        }

        public Criteria andReceive5Like(String value) {
            addCriterion("receive5 like", value, "receive5");
            return (Criteria) this;
        }

        public Criteria andReceive5NotLike(String value) {
            addCriterion("receive5 not like", value, "receive5");
            return (Criteria) this;
        }

        public Criteria andReceive5In(java.util.List<String> values) {
            addCriterion("receive5 in", values, "receive5");
            return (Criteria) this;
        }

        public Criteria andReceive5NotIn(java.util.List<String> values) {
            addCriterion("receive5 not in", values, "receive5");
            return (Criteria) this;
        }

        public Criteria andReceive5Between(String value1, String value2) {
            addCriterion("receive5 between", value1, value2, "receive5");
            return (Criteria) this;
        }

        public Criteria andReceive5NotBetween(String value1, String value2) {
            addCriterion("receive5 not between", value1, value2, "receive5");
            return (Criteria) this;
        }
    }

    /**
     * post_web_psc_sorting
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * post_web_psc_sorting
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