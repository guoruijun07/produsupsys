package com.ruoyi.common.bean.po;

public class PostWebDlvBindingRemoveRalationExample {
    /**
     * post_web_dlv_binding_remove_ralation
     */
    protected String orderByClause;

    /**
     * post_web_dlv_binding_remove_ralation
     */
    protected boolean distinct;

    /**
     * post_web_dlv_binding_remove_ralation
     */
    protected java.util.List<com.ruoyi.common.bean.po.PostWebDlvBindingRemoveRalationExample.Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public PostWebDlvBindingRemoveRalationExample() {
        oredCriteria = new java.util.ArrayList<com.ruoyi.common.bean.po.PostWebDlvBindingRemoveRalationExample.Criteria>();
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
    public java.util.List<com.ruoyi.common.bean.po.PostWebDlvBindingRemoveRalationExample.Criteria> getOredCriteria() {
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
     * post_web_dlv_binding_remove_ralation
     */
    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.ruoyi.common.bean.po.PostWebDlvBindingRemoveRalationExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.ruoyi.common.bean.po.PostWebDlvBindingRemoveRalationExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.ruoyi.common.bean.po.PostWebDlvBindingRemoveRalationExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.ruoyi.common.bean.po.PostWebDlvBindingRemoveRalationExample.Criterion> getCriteria() {
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

        public Criteria andUnitidIsNull() {
            addCriterion("unitID is null");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNotNull() {
            addCriterion("unitID is not null");
            return (Criteria) this;
        }

        public Criteria andUnitidEqualTo(Long value) {
            addCriterion("unitID =", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotEqualTo(Long value) {
            addCriterion("unitID <>", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThan(Long value) {
            addCriterion("unitID >", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThanOrEqualTo(Long value) {
            addCriterion("unitID >=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThan(Long value) {
            addCriterion("unitID <", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThanOrEqualTo(Long value) {
            addCriterion("unitID <=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidIn(java.util.List<Long> values) {
            addCriterion("unitID in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotIn(java.util.List<Long> values) {
            addCriterion("unitID not in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidBetween(Long value1, Long value2) {
            addCriterion("unitID between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotBetween(Long value1, Long value2) {
            addCriterion("unitID not between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andPrtmsIsNull() {
            addCriterion("prtms is null");
            return (Criteria) this;
        }

        public Criteria andPrtmsIsNotNull() {
            addCriterion("prtms is not null");
            return (Criteria) this;
        }

        public Criteria andPrtmsEqualTo(String value) {
            addCriterion("prtms =", value, "prtms");
            return (Criteria) this;
        }

        public Criteria andPrtmsNotEqualTo(String value) {
            addCriterion("prtms <>", value, "prtms");
            return (Criteria) this;
        }

        public Criteria andPrtmsGreaterThan(String value) {
            addCriterion("prtms >", value, "prtms");
            return (Criteria) this;
        }

        public Criteria andPrtmsGreaterThanOrEqualTo(String value) {
            addCriterion("prtms >=", value, "prtms");
            return (Criteria) this;
        }

        public Criteria andPrtmsLessThan(String value) {
            addCriterion("prtms <", value, "prtms");
            return (Criteria) this;
        }

        public Criteria andPrtmsLessThanOrEqualTo(String value) {
            addCriterion("prtms <=", value, "prtms");
            return (Criteria) this;
        }

        public Criteria andPrtmsLike(String value) {
            addCriterion("prtms like", value, "prtms");
            return (Criteria) this;
        }

        public Criteria andPrtmsNotLike(String value) {
            addCriterion("prtms not like", value, "prtms");
            return (Criteria) this;
        }

        public Criteria andPrtmsIn(java.util.List<String> values) {
            addCriterion("prtms in", values, "prtms");
            return (Criteria) this;
        }

        public Criteria andPrtmsNotIn(java.util.List<String> values) {
            addCriterion("prtms not in", values, "prtms");
            return (Criteria) this;
        }

        public Criteria andPrtmsBetween(String value1, String value2) {
            addCriterion("prtms between", value1, value2, "prtms");
            return (Criteria) this;
        }

        public Criteria andPrtmsNotBetween(String value1, String value2) {
            addCriterion("prtms not between", value1, value2, "prtms");
            return (Criteria) this;
        }

        public Criteria andSmbmsIsNull() {
            addCriterion("smbms is null");
            return (Criteria) this;
        }

        public Criteria andSmbmsIsNotNull() {
            addCriterion("smbms is not null");
            return (Criteria) this;
        }

        public Criteria andSmbmsEqualTo(String value) {
            addCriterion("smbms =", value, "smbms");
            return (Criteria) this;
        }

        public Criteria andSmbmsNotEqualTo(String value) {
            addCriterion("smbms <>", value, "smbms");
            return (Criteria) this;
        }

        public Criteria andSmbmsGreaterThan(String value) {
            addCriterion("smbms >", value, "smbms");
            return (Criteria) this;
        }

        public Criteria andSmbmsGreaterThanOrEqualTo(String value) {
            addCriterion("smbms >=", value, "smbms");
            return (Criteria) this;
        }

        public Criteria andSmbmsLessThan(String value) {
            addCriterion("smbms <", value, "smbms");
            return (Criteria) this;
        }

        public Criteria andSmbmsLessThanOrEqualTo(String value) {
            addCriterion("smbms <=", value, "smbms");
            return (Criteria) this;
        }

        public Criteria andSmbmsLike(String value) {
            addCriterion("smbms like", value, "smbms");
            return (Criteria) this;
        }

        public Criteria andSmbmsNotLike(String value) {
            addCriterion("smbms not like", value, "smbms");
            return (Criteria) this;
        }

        public Criteria andSmbmsIn(java.util.List<String> values) {
            addCriterion("smbms in", values, "smbms");
            return (Criteria) this;
        }

        public Criteria andSmbmsNotIn(java.util.List<String> values) {
            addCriterion("smbms not in", values, "smbms");
            return (Criteria) this;
        }

        public Criteria andSmbmsBetween(String value1, String value2) {
            addCriterion("smbms between", value1, value2, "smbms");
            return (Criteria) this;
        }

        public Criteria andSmbmsNotBetween(String value1, String value2) {
            addCriterion("smbms not between", value1, value2, "smbms");
            return (Criteria) this;
        }

        public Criteria andOthermsIsNull() {
            addCriterion("otherms is null");
            return (Criteria) this;
        }

        public Criteria andOthermsIsNotNull() {
            addCriterion("otherms is not null");
            return (Criteria) this;
        }

        public Criteria andOthermsEqualTo(String value) {
            addCriterion("otherms =", value, "otherms");
            return (Criteria) this;
        }

        public Criteria andOthermsNotEqualTo(String value) {
            addCriterion("otherms <>", value, "otherms");
            return (Criteria) this;
        }

        public Criteria andOthermsGreaterThan(String value) {
            addCriterion("otherms >", value, "otherms");
            return (Criteria) this;
        }

        public Criteria andOthermsGreaterThanOrEqualTo(String value) {
            addCriterion("otherms >=", value, "otherms");
            return (Criteria) this;
        }

        public Criteria andOthermsLessThan(String value) {
            addCriterion("otherms <", value, "otherms");
            return (Criteria) this;
        }

        public Criteria andOthermsLessThanOrEqualTo(String value) {
            addCriterion("otherms <=", value, "otherms");
            return (Criteria) this;
        }

        public Criteria andOthermsLike(String value) {
            addCriterion("otherms like", value, "otherms");
            return (Criteria) this;
        }

        public Criteria andOthermsNotLike(String value) {
            addCriterion("otherms not like", value, "otherms");
            return (Criteria) this;
        }

        public Criteria andOthermsIn(java.util.List<String> values) {
            addCriterion("otherms in", values, "otherms");
            return (Criteria) this;
        }

        public Criteria andOthermsNotIn(java.util.List<String> values) {
            addCriterion("otherms not in", values, "otherms");
            return (Criteria) this;
        }

        public Criteria andOthermsBetween(String value1, String value2) {
            addCriterion("otherms between", value1, value2, "otherms");
            return (Criteria) this;
        }

        public Criteria andOthermsNotBetween(String value1, String value2) {
            addCriterion("otherms not between", value1, value2, "otherms");
            return (Criteria) this;
        }

        public Criteria andSubtsIsNull() {
            addCriterion("subts is null");
            return (Criteria) this;
        }

        public Criteria andSubtsIsNotNull() {
            addCriterion("subts is not null");
            return (Criteria) this;
        }

        public Criteria andSubtsEqualTo(java.util.Date value) {
            addCriterion("subts =", value, "subts");
            return (Criteria) this;
        }

        public Criteria andSubtsNotEqualTo(java.util.Date value) {
            addCriterion("subts <>", value, "subts");
            return (Criteria) this;
        }

        public Criteria andSubtsGreaterThan(java.util.Date value) {
            addCriterion("subts >", value, "subts");
            return (Criteria) this;
        }

        public Criteria andSubtsGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("subts >=", value, "subts");
            return (Criteria) this;
        }

        public Criteria andSubtsLessThan(java.util.Date value) {
            addCriterion("subts <", value, "subts");
            return (Criteria) this;
        }

        public Criteria andSubtsLessThanOrEqualTo(java.util.Date value) {
            addCriterion("subts <=", value, "subts");
            return (Criteria) this;
        }

        public Criteria andSubtsIn(java.util.List<java.util.Date> values) {
            addCriterion("subts in", values, "subts");
            return (Criteria) this;
        }

        public Criteria andSubtsNotIn(java.util.List<java.util.Date> values) {
            addCriterion("subts not in", values, "subts");
            return (Criteria) this;
        }

        public Criteria andSubtsBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("subts between", value1, value2, "subts");
            return (Criteria) this;
        }

        public Criteria andSubtsNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("subts not between", value1, value2, "subts");
            return (Criteria) this;
        }

        public Criteria andDissubtsIsNull() {
            addCriterion("dissubts is null");
            return (Criteria) this;
        }

        public Criteria andDissubtsIsNotNull() {
            addCriterion("dissubts is not null");
            return (Criteria) this;
        }

        public Criteria andDissubtsEqualTo(java.util.Date value) {
            addCriterion("dissubts =", value, "dissubts");
            return (Criteria) this;
        }

        public Criteria andDissubtsNotEqualTo(java.util.Date value) {
            addCriterion("dissubts <>", value, "dissubts");
            return (Criteria) this;
        }

        public Criteria andDissubtsGreaterThan(java.util.Date value) {
            addCriterion("dissubts >", value, "dissubts");
            return (Criteria) this;
        }

        public Criteria andDissubtsGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("dissubts >=", value, "dissubts");
            return (Criteria) this;
        }

        public Criteria andDissubtsLessThan(java.util.Date value) {
            addCriterion("dissubts <", value, "dissubts");
            return (Criteria) this;
        }

        public Criteria andDissubtsLessThanOrEqualTo(java.util.Date value) {
            addCriterion("dissubts <=", value, "dissubts");
            return (Criteria) this;
        }

        public Criteria andDissubtsIn(java.util.List<java.util.Date> values) {
            addCriterion("dissubts in", values, "dissubts");
            return (Criteria) this;
        }

        public Criteria andDissubtsNotIn(java.util.List<java.util.Date> values) {
            addCriterion("dissubts not in", values, "dissubts");
            return (Criteria) this;
        }

        public Criteria andDissubtsBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("dissubts between", value1, value2, "dissubts");
            return (Criteria) this;
        }

        public Criteria andDissubtsNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("dissubts not between", value1, value2, "dissubts");
            return (Criteria) this;
        }

        public Criteria andCallrestrictIsNull() {
            addCriterion("callrestrict is null");
            return (Criteria) this;
        }

        public Criteria andCallrestrictIsNotNull() {
            addCriterion("callrestrict is not null");
            return (Criteria) this;
        }

        public Criteria andCallrestrictEqualTo(String value) {
            addCriterion("callrestrict =", value, "callrestrict");
            return (Criteria) this;
        }

        public Criteria andCallrestrictNotEqualTo(String value) {
            addCriterion("callrestrict <>", value, "callrestrict");
            return (Criteria) this;
        }

        public Criteria andCallrestrictGreaterThan(String value) {
            addCriterion("callrestrict >", value, "callrestrict");
            return (Criteria) this;
        }

        public Criteria andCallrestrictGreaterThanOrEqualTo(String value) {
            addCriterion("callrestrict >=", value, "callrestrict");
            return (Criteria) this;
        }

        public Criteria andCallrestrictLessThan(String value) {
            addCriterion("callrestrict <", value, "callrestrict");
            return (Criteria) this;
        }

        public Criteria andCallrestrictLessThanOrEqualTo(String value) {
            addCriterion("callrestrict <=", value, "callrestrict");
            return (Criteria) this;
        }

        public Criteria andCallrestrictLike(String value) {
            addCriterion("callrestrict like", value, "callrestrict");
            return (Criteria) this;
        }

        public Criteria andCallrestrictNotLike(String value) {
            addCriterion("callrestrict not like", value, "callrestrict");
            return (Criteria) this;
        }

        public Criteria andCallrestrictIn(java.util.List<String> values) {
            addCriterion("callrestrict in", values, "callrestrict");
            return (Criteria) this;
        }

        public Criteria andCallrestrictNotIn(java.util.List<String> values) {
            addCriterion("callrestrict not in", values, "callrestrict");
            return (Criteria) this;
        }

        public Criteria andCallrestrictBetween(String value1, String value2) {
            addCriterion("callrestrict between", value1, value2, "callrestrict");
            return (Criteria) this;
        }

        public Criteria andCallrestrictNotBetween(String value1, String value2) {
            addCriterion("callrestrict not between", value1, value2, "callrestrict");
            return (Criteria) this;
        }

        public Criteria andCalldisplayIsNull() {
            addCriterion("calldisplay is null");
            return (Criteria) this;
        }

        public Criteria andCalldisplayIsNotNull() {
            addCriterion("calldisplay is not null");
            return (Criteria) this;
        }

        public Criteria andCalldisplayEqualTo(String value) {
            addCriterion("calldisplay =", value, "calldisplay");
            return (Criteria) this;
        }

        public Criteria andCalldisplayNotEqualTo(String value) {
            addCriterion("calldisplay <>", value, "calldisplay");
            return (Criteria) this;
        }

        public Criteria andCalldisplayGreaterThan(String value) {
            addCriterion("calldisplay >", value, "calldisplay");
            return (Criteria) this;
        }

        public Criteria andCalldisplayGreaterThanOrEqualTo(String value) {
            addCriterion("calldisplay >=", value, "calldisplay");
            return (Criteria) this;
        }

        public Criteria andCalldisplayLessThan(String value) {
            addCriterion("calldisplay <", value, "calldisplay");
            return (Criteria) this;
        }

        public Criteria andCalldisplayLessThanOrEqualTo(String value) {
            addCriterion("calldisplay <=", value, "calldisplay");
            return (Criteria) this;
        }

        public Criteria andCalldisplayLike(String value) {
            addCriterion("calldisplay like", value, "calldisplay");
            return (Criteria) this;
        }

        public Criteria andCalldisplayNotLike(String value) {
            addCriterion("calldisplay not like", value, "calldisplay");
            return (Criteria) this;
        }

        public Criteria andCalldisplayIn(java.util.List<String> values) {
            addCriterion("calldisplay in", values, "calldisplay");
            return (Criteria) this;
        }

        public Criteria andCalldisplayNotIn(java.util.List<String> values) {
            addCriterion("calldisplay not in", values, "calldisplay");
            return (Criteria) this;
        }

        public Criteria andCalldisplayBetween(String value1, String value2) {
            addCriterion("calldisplay between", value1, value2, "calldisplay");
            return (Criteria) this;
        }

        public Criteria andCalldisplayNotBetween(String value1, String value2) {
            addCriterion("calldisplay not between", value1, value2, "calldisplay");
            return (Criteria) this;
        }

        public Criteria andCallrecordingIsNull() {
            addCriterion("callrecording is null");
            return (Criteria) this;
        }

        public Criteria andCallrecordingIsNotNull() {
            addCriterion("callrecording is not null");
            return (Criteria) this;
        }

        public Criteria andCallrecordingEqualTo(String value) {
            addCriterion("callrecording =", value, "callrecording");
            return (Criteria) this;
        }

        public Criteria andCallrecordingNotEqualTo(String value) {
            addCriterion("callrecording <>", value, "callrecording");
            return (Criteria) this;
        }

        public Criteria andCallrecordingGreaterThan(String value) {
            addCriterion("callrecording >", value, "callrecording");
            return (Criteria) this;
        }

        public Criteria andCallrecordingGreaterThanOrEqualTo(String value) {
            addCriterion("callrecording >=", value, "callrecording");
            return (Criteria) this;
        }

        public Criteria andCallrecordingLessThan(String value) {
            addCriterion("callrecording <", value, "callrecording");
            return (Criteria) this;
        }

        public Criteria andCallrecordingLessThanOrEqualTo(String value) {
            addCriterion("callrecording <=", value, "callrecording");
            return (Criteria) this;
        }

        public Criteria andCallrecordingLike(String value) {
            addCriterion("callrecording like", value, "callrecording");
            return (Criteria) this;
        }

        public Criteria andCallrecordingNotLike(String value) {
            addCriterion("callrecording not like", value, "callrecording");
            return (Criteria) this;
        }

        public Criteria andCallrecordingIn(java.util.List<String> values) {
            addCriterion("callrecording in", values, "callrecording");
            return (Criteria) this;
        }

        public Criteria andCallrecordingNotIn(java.util.List<String> values) {
            addCriterion("callrecording not in", values, "callrecording");
            return (Criteria) this;
        }

        public Criteria andCallrecordingBetween(String value1, String value2) {
            addCriterion("callrecording between", value1, value2, "callrecording");
            return (Criteria) this;
        }

        public Criteria andCallrecordingNotBetween(String value1, String value2) {
            addCriterion("callrecording not between", value1, value2, "callrecording");
            return (Criteria) this;
        }

        public Criteria andValiditytimeIsNull() {
            addCriterion("validitytime is null");
            return (Criteria) this;
        }

        public Criteria andValiditytimeIsNotNull() {
            addCriterion("validitytime is not null");
            return (Criteria) this;
        }

        public Criteria andValiditytimeEqualTo(java.util.Date value) {
            addCriterion("validitytime =", value, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeNotEqualTo(java.util.Date value) {
            addCriterion("validitytime <>", value, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeGreaterThan(java.util.Date value) {
            addCriterion("validitytime >", value, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("validitytime >=", value, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeLessThan(java.util.Date value) {
            addCriterion("validitytime <", value, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("validitytime <=", value, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeIn(java.util.List<java.util.Date> values) {
            addCriterion("validitytime in", values, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeNotIn(java.util.List<java.util.Date> values) {
            addCriterion("validitytime not in", values, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("validitytime between", value1, value2, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("validitytime not between", value1, value2, "validitytime");
            return (Criteria) this;
        }

        public Criteria andUuidinpartnerIsNull() {
            addCriterion("uuidinpartner is null");
            return (Criteria) this;
        }

        public Criteria andUuidinpartnerIsNotNull() {
            addCriterion("uuidinpartner is not null");
            return (Criteria) this;
        }

        public Criteria andUuidinpartnerEqualTo(String value) {
            addCriterion("uuidinpartner =", value, "uuidinpartner");
            return (Criteria) this;
        }

        public Criteria andUuidinpartnerNotEqualTo(String value) {
            addCriterion("uuidinpartner <>", value, "uuidinpartner");
            return (Criteria) this;
        }

        public Criteria andUuidinpartnerGreaterThan(String value) {
            addCriterion("uuidinpartner >", value, "uuidinpartner");
            return (Criteria) this;
        }

        public Criteria andUuidinpartnerGreaterThanOrEqualTo(String value) {
            addCriterion("uuidinpartner >=", value, "uuidinpartner");
            return (Criteria) this;
        }

        public Criteria andUuidinpartnerLessThan(String value) {
            addCriterion("uuidinpartner <", value, "uuidinpartner");
            return (Criteria) this;
        }

        public Criteria andUuidinpartnerLessThanOrEqualTo(String value) {
            addCriterion("uuidinpartner <=", value, "uuidinpartner");
            return (Criteria) this;
        }

        public Criteria andUuidinpartnerLike(String value) {
            addCriterion("uuidinpartner like", value, "uuidinpartner");
            return (Criteria) this;
        }

        public Criteria andUuidinpartnerNotLike(String value) {
            addCriterion("uuidinpartner not like", value, "uuidinpartner");
            return (Criteria) this;
        }

        public Criteria andUuidinpartnerIn(java.util.List<String> values) {
            addCriterion("uuidinpartner in", values, "uuidinpartner");
            return (Criteria) this;
        }

        public Criteria andUuidinpartnerNotIn(java.util.List<String> values) {
            addCriterion("uuidinpartner not in", values, "uuidinpartner");
            return (Criteria) this;
        }

        public Criteria andUuidinpartnerBetween(String value1, String value2) {
            addCriterion("uuidinpartner between", value1, value2, "uuidinpartner");
            return (Criteria) this;
        }

        public Criteria andUuidinpartnerNotBetween(String value1, String value2) {
            addCriterion("uuidinpartner not between", value1, value2, "uuidinpartner");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("usertype is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("usertype is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(String value) {
            addCriterion("usertype =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(String value) {
            addCriterion("usertype <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(String value) {
            addCriterion("usertype >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(String value) {
            addCriterion("usertype >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(String value) {
            addCriterion("usertype <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(String value) {
            addCriterion("usertype <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLike(String value) {
            addCriterion("usertype like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotLike(String value) {
            addCriterion("usertype not like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(java.util.List<String> values) {
            addCriterion("usertype in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(java.util.List<String> values) {
            addCriterion("usertype not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(String value1, String value2) {
            addCriterion("usertype between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(String value1, String value2) {
            addCriterion("usertype not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andRegphoneIsNull() {
            addCriterion("regphone is null");
            return (Criteria) this;
        }

        public Criteria andRegphoneIsNotNull() {
            addCriterion("regphone is not null");
            return (Criteria) this;
        }

        public Criteria andRegphoneEqualTo(String value) {
            addCriterion("regphone =", value, "regphone");
            return (Criteria) this;
        }

        public Criteria andRegphoneNotEqualTo(String value) {
            addCriterion("regphone <>", value, "regphone");
            return (Criteria) this;
        }

        public Criteria andRegphoneGreaterThan(String value) {
            addCriterion("regphone >", value, "regphone");
            return (Criteria) this;
        }

        public Criteria andRegphoneGreaterThanOrEqualTo(String value) {
            addCriterion("regphone >=", value, "regphone");
            return (Criteria) this;
        }

        public Criteria andRegphoneLessThan(String value) {
            addCriterion("regphone <", value, "regphone");
            return (Criteria) this;
        }

        public Criteria andRegphoneLessThanOrEqualTo(String value) {
            addCriterion("regphone <=", value, "regphone");
            return (Criteria) this;
        }

        public Criteria andRegphoneLike(String value) {
            addCriterion("regphone like", value, "regphone");
            return (Criteria) this;
        }

        public Criteria andRegphoneNotLike(String value) {
            addCriterion("regphone not like", value, "regphone");
            return (Criteria) this;
        }

        public Criteria andRegphoneIn(java.util.List<String> values) {
            addCriterion("regphone in", values, "regphone");
            return (Criteria) this;
        }

        public Criteria andRegphoneNotIn(java.util.List<String> values) {
            addCriterion("regphone not in", values, "regphone");
            return (Criteria) this;
        }

        public Criteria andRegphoneBetween(String value1, String value2) {
            addCriterion("regphone between", value1, value2, "regphone");
            return (Criteria) this;
        }

        public Criteria andRegphoneNotBetween(String value1, String value2) {
            addCriterion("regphone not between", value1, value2, "regphone");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(java.util.List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(java.util.List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(java.util.List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(java.util.List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andMenuIsNull() {
            addCriterion("menu is null");
            return (Criteria) this;
        }

        public Criteria andMenuIsNotNull() {
            addCriterion("menu is not null");
            return (Criteria) this;
        }

        public Criteria andMenuEqualTo(Integer value) {
            addCriterion("menu =", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuNotEqualTo(Integer value) {
            addCriterion("menu <>", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuGreaterThan(Integer value) {
            addCriterion("menu >", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu >=", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuLessThan(Integer value) {
            addCriterion("menu <", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuLessThanOrEqualTo(Integer value) {
            addCriterion("menu <=", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuIn(java.util.List<Integer> values) {
            addCriterion("menu in", values, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuNotIn(java.util.List<Integer> values) {
            addCriterion("menu not in", values, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuBetween(Integer value1, Integer value2) {
            addCriterion("menu between", value1, value2, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuNotBetween(Integer value1, Integer value2) {
            addCriterion("menu not between", value1, value2, "menu");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(java.util.List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(java.util.List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(java.util.List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(java.util.List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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
    }

    /**
     * post_web_dlv_binding_remove_ralation
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * post_web_dlv_binding_remove_ralation
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