package com.ruoyi.common.bean.po;

public class PostWebBicUserExample {
    /**
     * post_web_bic_user
     */
    protected String orderByClause;

    /**
     * post_web_bic_user
     */
    protected boolean distinct;

    /**
     * post_web_bic_user
     */
    protected java.util.List<com.ruoyi.common.bean.po.PostWebBicUserExample.Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public PostWebBicUserExample() {
        oredCriteria = new java.util.ArrayList<com.ruoyi.common.bean.po.PostWebBicUserExample.Criteria>();
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
    public java.util.List<com.ruoyi.common.bean.po.PostWebBicUserExample.Criteria> getOredCriteria() {
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
     * post_web_bic_user
     */
    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.ruoyi.common.bean.po.PostWebBicUserExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.ruoyi.common.bean.po.PostWebBicUserExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.ruoyi.common.bean.po.PostWebBicUserExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.ruoyi.common.bean.po.PostWebBicUserExample.Criterion> getCriteria() {
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

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(java.util.List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(java.util.List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(java.util.List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(java.util.List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(java.util.List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(java.util.List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(java.util.List<String> values) {
            addCriterion("imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(java.util.List<String> values) {
            addCriterion("imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("mac is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("mac is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("mac =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("mac <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("mac >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("mac >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("mac <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("mac <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("mac like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("mac not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(java.util.List<String> values) {
            addCriterion("mac in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(java.util.List<String> values) {
            addCriterion("mac not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("mac between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("mac not between", value1, value2, "mac");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(java.util.List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(java.util.List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(java.util.List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(java.util.List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIsNull() {
            addCriterion("invalid_date is null");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIsNotNull() {
            addCriterion("invalid_date is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidDateEqualTo(java.util.Date value) {
            addCriterion("invalid_date =", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotEqualTo(java.util.Date value) {
            addCriterion("invalid_date <>", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateGreaterThan(java.util.Date value) {
            addCriterion("invalid_date >", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("invalid_date >=", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateLessThan(java.util.Date value) {
            addCriterion("invalid_date <", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateLessThanOrEqualTo(java.util.Date value) {
            addCriterion("invalid_date <=", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIn(java.util.List<java.util.Date> values) {
            addCriterion("invalid_date in", values, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotIn(java.util.List<java.util.Date> values) {
            addCriterion("invalid_date not in", values, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("invalid_date between", value1, value2, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("invalid_date not between", value1, value2, "invalidDate");
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

        public Criteria andRemainingSumIsNull() {
            addCriterion("remaining_sum is null");
            return (Criteria) this;
        }

        public Criteria andRemainingSumIsNotNull() {
            addCriterion("remaining_sum is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingSumEqualTo(Double value) {
            addCriterion("remaining_sum =", value, "remainingSum");
            return (Criteria) this;
        }

        public Criteria andRemainingSumNotEqualTo(Double value) {
            addCriterion("remaining_sum <>", value, "remainingSum");
            return (Criteria) this;
        }

        public Criteria andRemainingSumGreaterThan(Double value) {
            addCriterion("remaining_sum >", value, "remainingSum");
            return (Criteria) this;
        }

        public Criteria andRemainingSumGreaterThanOrEqualTo(Double value) {
            addCriterion("remaining_sum >=", value, "remainingSum");
            return (Criteria) this;
        }

        public Criteria andRemainingSumLessThan(Double value) {
            addCriterion("remaining_sum <", value, "remainingSum");
            return (Criteria) this;
        }

        public Criteria andRemainingSumLessThanOrEqualTo(Double value) {
            addCriterion("remaining_sum <=", value, "remainingSum");
            return (Criteria) this;
        }

        public Criteria andRemainingSumIn(java.util.List<Double> values) {
            addCriterion("remaining_sum in", values, "remainingSum");
            return (Criteria) this;
        }

        public Criteria andRemainingSumNotIn(java.util.List<Double> values) {
            addCriterion("remaining_sum not in", values, "remainingSum");
            return (Criteria) this;
        }

        public Criteria andRemainingSumBetween(Double value1, Double value2) {
            addCriterion("remaining_sum between", value1, value2, "remainingSum");
            return (Criteria) this;
        }

        public Criteria andRemainingSumNotBetween(Double value1, Double value2) {
            addCriterion("remaining_sum not between", value1, value2, "remainingSum");
            return (Criteria) this;
        }

        public Criteria andProjectBaseIsNull() {
            addCriterion("project_base is null");
            return (Criteria) this;
        }

        public Criteria andProjectBaseIsNotNull() {
            addCriterion("project_base is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBaseEqualTo(String value) {
            addCriterion("project_base =", value, "projectBase");
            return (Criteria) this;
        }

        public Criteria andProjectBaseNotEqualTo(String value) {
            addCriterion("project_base <>", value, "projectBase");
            return (Criteria) this;
        }

        public Criteria andProjectBaseGreaterThan(String value) {
            addCriterion("project_base >", value, "projectBase");
            return (Criteria) this;
        }

        public Criteria andProjectBaseGreaterThanOrEqualTo(String value) {
            addCriterion("project_base >=", value, "projectBase");
            return (Criteria) this;
        }

        public Criteria andProjectBaseLessThan(String value) {
            addCriterion("project_base <", value, "projectBase");
            return (Criteria) this;
        }

        public Criteria andProjectBaseLessThanOrEqualTo(String value) {
            addCriterion("project_base <=", value, "projectBase");
            return (Criteria) this;
        }

        public Criteria andProjectBaseLike(String value) {
            addCriterion("project_base like", value, "projectBase");
            return (Criteria) this;
        }

        public Criteria andProjectBaseNotLike(String value) {
            addCriterion("project_base not like", value, "projectBase");
            return (Criteria) this;
        }

        public Criteria andProjectBaseIn(java.util.List<String> values) {
            addCriterion("project_base in", values, "projectBase");
            return (Criteria) this;
        }

        public Criteria andProjectBaseNotIn(java.util.List<String> values) {
            addCriterion("project_base not in", values, "projectBase");
            return (Criteria) this;
        }

        public Criteria andProjectBaseBetween(String value1, String value2) {
            addCriterion("project_base between", value1, value2, "projectBase");
            return (Criteria) this;
        }

        public Criteria andProjectBaseNotBetween(String value1, String value2) {
            addCriterion("project_base not between", value1, value2, "projectBase");
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Long value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Long value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Long value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Long value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(java.util.List<Long> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(java.util.List<Long> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Long value1, Long value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
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
     * post_web_bic_user
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * post_web_bic_user
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