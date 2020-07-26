package com.ruoyi.common.bean.po;

public class PostWebAmcAdministrativeDivisionExample {
    /**
     * post_web_amc_administrative_division
     */
    protected String orderByClause;

    /**
     * post_web_amc_administrative_division
     */
    protected boolean distinct;

    /**
     * post_web_amc_administrative_division
     */
    protected java.util.List<com.ruoyi.common.bean.po.PostWebAmcAdministrativeDivisionExample.Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public PostWebAmcAdministrativeDivisionExample() {
        oredCriteria = new java.util.ArrayList<com.ruoyi.common.bean.po.PostWebAmcAdministrativeDivisionExample.Criteria>();
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
    public java.util.List<com.ruoyi.common.bean.po.PostWebAmcAdministrativeDivisionExample.Criteria> getOredCriteria() {
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
     * post_web_amc_administrative_division
     */
    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.ruoyi.common.bean.po.PostWebAmcAdministrativeDivisionExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.ruoyi.common.bean.po.PostWebAmcAdministrativeDivisionExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.ruoyi.common.bean.po.PostWebAmcAdministrativeDivisionExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.ruoyi.common.bean.po.PostWebAmcAdministrativeDivisionExample.Criterion> getCriteria() {
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

        public Criteria andProvicneNameIsNull() {
            addCriterion("provicne_name is null");
            return (Criteria) this;
        }

        public Criteria andProvicneNameIsNotNull() {
            addCriterion("provicne_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvicneNameEqualTo(String value) {
            addCriterion("provicne_name =", value, "provicneName");
            return (Criteria) this;
        }

        public Criteria andProvicneNameNotEqualTo(String value) {
            addCriterion("provicne_name <>", value, "provicneName");
            return (Criteria) this;
        }

        public Criteria andProvicneNameGreaterThan(String value) {
            addCriterion("provicne_name >", value, "provicneName");
            return (Criteria) this;
        }

        public Criteria andProvicneNameGreaterThanOrEqualTo(String value) {
            addCriterion("provicne_name >=", value, "provicneName");
            return (Criteria) this;
        }

        public Criteria andProvicneNameLessThan(String value) {
            addCriterion("provicne_name <", value, "provicneName");
            return (Criteria) this;
        }

        public Criteria andProvicneNameLessThanOrEqualTo(String value) {
            addCriterion("provicne_name <=", value, "provicneName");
            return (Criteria) this;
        }

        public Criteria andProvicneNameLike(String value) {
            addCriterion("provicne_name like", value, "provicneName");
            return (Criteria) this;
        }

        public Criteria andProvicneNameNotLike(String value) {
            addCriterion("provicne_name not like", value, "provicneName");
            return (Criteria) this;
        }

        public Criteria andProvicneNameIn(java.util.List<String> values) {
            addCriterion("provicne_name in", values, "provicneName");
            return (Criteria) this;
        }

        public Criteria andProvicneNameNotIn(java.util.List<String> values) {
            addCriterion("provicne_name not in", values, "provicneName");
            return (Criteria) this;
        }

        public Criteria andProvicneNameBetween(String value1, String value2) {
            addCriterion("provicne_name between", value1, value2, "provicneName");
            return (Criteria) this;
        }

        public Criteria andProvicneNameNotBetween(String value1, String value2) {
            addCriterion("provicne_name not between", value1, value2, "provicneName");
            return (Criteria) this;
        }

        public Criteria andProvicneCodeIsNull() {
            addCriterion("provicne_code is null");
            return (Criteria) this;
        }

        public Criteria andProvicneCodeIsNotNull() {
            addCriterion("provicne_code is not null");
            return (Criteria) this;
        }

        public Criteria andProvicneCodeEqualTo(String value) {
            addCriterion("provicne_code =", value, "provicneCode");
            return (Criteria) this;
        }

        public Criteria andProvicneCodeNotEqualTo(String value) {
            addCriterion("provicne_code <>", value, "provicneCode");
            return (Criteria) this;
        }

        public Criteria andProvicneCodeGreaterThan(String value) {
            addCriterion("provicne_code >", value, "provicneCode");
            return (Criteria) this;
        }

        public Criteria andProvicneCodeGreaterThanOrEqualTo(String value) {
            addCriterion("provicne_code >=", value, "provicneCode");
            return (Criteria) this;
        }

        public Criteria andProvicneCodeLessThan(String value) {
            addCriterion("provicne_code <", value, "provicneCode");
            return (Criteria) this;
        }

        public Criteria andProvicneCodeLessThanOrEqualTo(String value) {
            addCriterion("provicne_code <=", value, "provicneCode");
            return (Criteria) this;
        }

        public Criteria andProvicneCodeLike(String value) {
            addCriterion("provicne_code like", value, "provicneCode");
            return (Criteria) this;
        }

        public Criteria andProvicneCodeNotLike(String value) {
            addCriterion("provicne_code not like", value, "provicneCode");
            return (Criteria) this;
        }

        public Criteria andProvicneCodeIn(java.util.List<String> values) {
            addCriterion("provicne_code in", values, "provicneCode");
            return (Criteria) this;
        }

        public Criteria andProvicneCodeNotIn(java.util.List<String> values) {
            addCriterion("provicne_code not in", values, "provicneCode");
            return (Criteria) this;
        }

        public Criteria andProvicneCodeBetween(String value1, String value2) {
            addCriterion("provicne_code between", value1, value2, "provicneCode");
            return (Criteria) this;
        }

        public Criteria andProvicneCodeNotBetween(String value1, String value2) {
            addCriterion("provicne_code not between", value1, value2, "provicneCode");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(java.util.List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(java.util.List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(java.util.List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(java.util.List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCountyNameIsNull() {
            addCriterion("county_name is null");
            return (Criteria) this;
        }

        public Criteria andCountyNameIsNotNull() {
            addCriterion("county_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountyNameEqualTo(String value) {
            addCriterion("county_name =", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotEqualTo(String value) {
            addCriterion("county_name <>", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameGreaterThan(String value) {
            addCriterion("county_name >", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameGreaterThanOrEqualTo(String value) {
            addCriterion("county_name >=", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLessThan(String value) {
            addCriterion("county_name <", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLessThanOrEqualTo(String value) {
            addCriterion("county_name <=", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLike(String value) {
            addCriterion("county_name like", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotLike(String value) {
            addCriterion("county_name not like", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameIn(java.util.List<String> values) {
            addCriterion("county_name in", values, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotIn(java.util.List<String> values) {
            addCriterion("county_name not in", values, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameBetween(String value1, String value2) {
            addCriterion("county_name between", value1, value2, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotBetween(String value1, String value2) {
            addCriterion("county_name not between", value1, value2, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIsNull() {
            addCriterion("county_code is null");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIsNotNull() {
            addCriterion("county_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountyCodeEqualTo(String value) {
            addCriterion("county_code =", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotEqualTo(String value) {
            addCriterion("county_code <>", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeGreaterThan(String value) {
            addCriterion("county_code >", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("county_code >=", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLessThan(String value) {
            addCriterion("county_code <", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLessThanOrEqualTo(String value) {
            addCriterion("county_code <=", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLike(String value) {
            addCriterion("county_code like", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotLike(String value) {
            addCriterion("county_code not like", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIn(java.util.List<String> values) {
            addCriterion("county_code in", values, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotIn(java.util.List<String> values) {
            addCriterion("county_code not in", values, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeBetween(String value1, String value2) {
            addCriterion("county_code between", value1, value2, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotBetween(String value1, String value2) {
            addCriterion("county_code not between", value1, value2, "countyCode");
            return (Criteria) this;
        }
    }

    /**
     * post_web_amc_administrative_division
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * post_web_amc_administrative_division
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