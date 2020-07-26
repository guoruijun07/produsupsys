package com.ruoyi.common.bean.po;

public class postWebBicUserBindingExample {
    /**
     * post_web_bic_user_binding
     */
    protected String orderByClause;

    /**
     * post_web_bic_user_binding
     */
    protected boolean distinct;

    /**
     * post_web_bic_user_binding
     */
    protected java.util.List<com.ruoyi.common.bean.po.postWebBicUserBindingExample.Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public postWebBicUserBindingExample() {
        oredCriteria = new java.util.ArrayList<com.ruoyi.common.bean.po.postWebBicUserBindingExample.Criteria>();
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
    public java.util.List<com.ruoyi.common.bean.po.postWebBicUserBindingExample.Criteria> getOredCriteria() {
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
     * post_web_bic_user_binding
     */
    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.ruoyi.common.bean.po.postWebBicUserBindingExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.ruoyi.common.bean.po.postWebBicUserBindingExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.ruoyi.common.bean.po.postWebBicUserBindingExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.ruoyi.common.bean.po.postWebBicUserBindingExample.Criterion> getCriteria() {
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

        public Criteria andUnitidIsNull() {
            addCriterion("unitID is null");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNotNull() {
            addCriterion("unitID is not null");
            return (Criteria) this;
        }

        public Criteria andUnitidEqualTo(Integer value) {
            addCriterion("unitID =", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotEqualTo(Integer value) {
            addCriterion("unitID <>", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThan(Integer value) {
            addCriterion("unitID >", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("unitID >=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThan(Integer value) {
            addCriterion("unitID <", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThanOrEqualTo(Integer value) {
            addCriterion("unitID <=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidIn(java.util.List<Integer> values) {
            addCriterion("unitID in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotIn(java.util.List<Integer> values) {
            addCriterion("unitID not in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidBetween(Integer value1, Integer value2) {
            addCriterion("unitID between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotBetween(Integer value1, Integer value2) {
            addCriterion("unitID not between", value1, value2, "unitid");
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

        public Criteria andValiditytimeEqualTo(Integer value) {
            addCriterion("validitytime =", value, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeNotEqualTo(Integer value) {
            addCriterion("validitytime <>", value, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeGreaterThan(Integer value) {
            addCriterion("validitytime >", value, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("validitytime >=", value, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeLessThan(Integer value) {
            addCriterion("validitytime <", value, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeLessThanOrEqualTo(Integer value) {
            addCriterion("validitytime <=", value, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeIn(java.util.List<Integer> values) {
            addCriterion("validitytime in", values, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeNotIn(java.util.List<Integer> values) {
            addCriterion("validitytime not in", values, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeBetween(Integer value1, Integer value2) {
            addCriterion("validitytime between", value1, value2, "validitytime");
            return (Criteria) this;
        }

        public Criteria andValiditytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("validitytime not between", value1, value2, "validitytime");
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
    }

    /**
     * post_web_bic_user_binding
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * post_web_bic_user_binding
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