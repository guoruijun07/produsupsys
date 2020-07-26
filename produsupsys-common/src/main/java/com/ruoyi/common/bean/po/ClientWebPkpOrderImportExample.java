package com.ruoyi.common.bean.po;

public class ClientWebPkpOrderImportExample {
    /**
     * client_web_pkp_order_import
     */
    protected String orderByClause;

    /**
     * client_web_pkp_order_import
     */
    protected boolean distinct;

    /**
     * client_web_pkp_order_import
     */
    protected java.util.List<com.ruoyi.common.bean.po.ClientWebPkpOrderImportExample.Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public ClientWebPkpOrderImportExample() {
        oredCriteria = new java.util.ArrayList<com.ruoyi.common.bean.po.ClientWebPkpOrderImportExample.Criteria>();
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
    public java.util.List<com.ruoyi.common.bean.po.ClientWebPkpOrderImportExample.Criteria> getOredCriteria() {
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
     * client_web_pkp_order_import
     */
    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.ruoyi.common.bean.po.ClientWebPkpOrderImportExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.ruoyi.common.bean.po.ClientWebPkpOrderImportExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.ruoyi.common.bean.po.ClientWebPkpOrderImportExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.ruoyi.common.bean.po.ClientWebPkpOrderImportExample.Criterion> getCriteria() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(java.util.List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(java.util.List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIsFeeIsNull() {
            addCriterion("is_fee is null");
            return (Criteria) this;
        }

        public Criteria andIsFeeIsNotNull() {
            addCriterion("is_fee is not null");
            return (Criteria) this;
        }

        public Criteria andIsFeeEqualTo(String value) {
            addCriterion("is_fee =", value, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeNotEqualTo(String value) {
            addCriterion("is_fee <>", value, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeGreaterThan(String value) {
            addCriterion("is_fee >", value, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeGreaterThanOrEqualTo(String value) {
            addCriterion("is_fee >=", value, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeLessThan(String value) {
            addCriterion("is_fee <", value, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeLessThanOrEqualTo(String value) {
            addCriterion("is_fee <=", value, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeLike(String value) {
            addCriterion("is_fee like", value, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeNotLike(String value) {
            addCriterion("is_fee not like", value, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeIn(java.util.List<String> values) {
            addCriterion("is_fee in", values, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeNotIn(java.util.List<String> values) {
            addCriterion("is_fee not in", values, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeBetween(String value1, String value2) {
            addCriterion("is_fee between", value1, value2, "isFee");
            return (Criteria) this;
        }

        public Criteria andIsFeeNotBetween(String value1, String value2) {
            addCriterion("is_fee not between", value1, value2, "isFee");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("order_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("order_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(java.util.Date value) {
            addCriterion("order_date =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(java.util.Date value) {
            addCriterion("order_date <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(java.util.Date value) {
            addCriterion("order_date >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("order_date >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(java.util.Date value) {
            addCriterion("order_date <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(java.util.Date value) {
            addCriterion("order_date <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(java.util.List<java.util.Date> values) {
            addCriterion("order_date in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(java.util.List<java.util.Date> values) {
            addCriterion("order_date not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("order_date between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("order_date not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNull() {
            addCriterion("send_date is null");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNotNull() {
            addCriterion("send_date is not null");
            return (Criteria) this;
        }

        public Criteria andSendDateEqualTo(java.util.Date value) {
            addCriterion("send_date =", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotEqualTo(java.util.Date value) {
            addCriterion("send_date <>", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThan(java.util.Date value) {
            addCriterion("send_date >", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("send_date >=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThan(java.util.Date value) {
            addCriterion("send_date <", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThanOrEqualTo(java.util.Date value) {
            addCriterion("send_date <=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateIn(java.util.List<java.util.Date> values) {
            addCriterion("send_date in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotIn(java.util.List<java.util.Date> values) {
            addCriterion("send_date not in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("send_date between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("send_date not between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(java.util.List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(java.util.List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andMailNoIsNull() {
            addCriterion("mail_no is null");
            return (Criteria) this;
        }

        public Criteria andMailNoIsNotNull() {
            addCriterion("mail_no is not null");
            return (Criteria) this;
        }

        public Criteria andMailNoEqualTo(String value) {
            addCriterion("mail_no =", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoNotEqualTo(String value) {
            addCriterion("mail_no <>", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoGreaterThan(String value) {
            addCriterion("mail_no >", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoGreaterThanOrEqualTo(String value) {
            addCriterion("mail_no >=", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoLessThan(String value) {
            addCriterion("mail_no <", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoLessThanOrEqualTo(String value) {
            addCriterion("mail_no <=", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoLike(String value) {
            addCriterion("mail_no like", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoNotLike(String value) {
            addCriterion("mail_no not like", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoIn(java.util.List<String> values) {
            addCriterion("mail_no in", values, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoNotIn(java.util.List<String> values) {
            addCriterion("mail_no not in", values, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoBetween(String value1, String value2) {
            addCriterion("mail_no between", value1, value2, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoNotBetween(String value1, String value2) {
            addCriterion("mail_no not between", value1, value2, "mailNo");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(String value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(String value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(String value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(String value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(String value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(String value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLike(String value) {
            addCriterion("fee like", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotLike(String value) {
            addCriterion("fee not like", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(java.util.List<String> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(java.util.List<String> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(String value1, String value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(String value1, String value2) {
            addCriterion("fee not between", value1, value2, "fee");
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

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(java.util.List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(java.util.List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
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

        public Criteria andOrderChannelIsNull() {
            addCriterion("order_channel is null");
            return (Criteria) this;
        }

        public Criteria andOrderChannelIsNotNull() {
            addCriterion("order_channel is not null");
            return (Criteria) this;
        }

        public Criteria andOrderChannelEqualTo(String value) {
            addCriterion("order_channel =", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelNotEqualTo(String value) {
            addCriterion("order_channel <>", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelGreaterThan(String value) {
            addCriterion("order_channel >", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelGreaterThanOrEqualTo(String value) {
            addCriterion("order_channel >=", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelLessThan(String value) {
            addCriterion("order_channel <", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelLessThanOrEqualTo(String value) {
            addCriterion("order_channel <=", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelLike(String value) {
            addCriterion("order_channel like", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelNotLike(String value) {
            addCriterion("order_channel not like", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelIn(java.util.List<String> values) {
            addCriterion("order_channel in", values, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelNotIn(java.util.List<String> values) {
            addCriterion("order_channel not in", values, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelBetween(String value1, String value2) {
            addCriterion("order_channel between", value1, value2, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelNotBetween(String value1, String value2) {
            addCriterion("order_channel not between", value1, value2, "orderChannel");
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

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(java.util.List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(java.util.List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andRealFeeIsNull() {
            addCriterion("real_fee is null");
            return (Criteria) this;
        }

        public Criteria andRealFeeIsNotNull() {
            addCriterion("real_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRealFeeEqualTo(String value) {
            addCriterion("real_fee =", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeNotEqualTo(String value) {
            addCriterion("real_fee <>", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeGreaterThan(String value) {
            addCriterion("real_fee >", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeGreaterThanOrEqualTo(String value) {
            addCriterion("real_fee >=", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeLessThan(String value) {
            addCriterion("real_fee <", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeLessThanOrEqualTo(String value) {
            addCriterion("real_fee <=", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeLike(String value) {
            addCriterion("real_fee like", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeNotLike(String value) {
            addCriterion("real_fee not like", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeIn(java.util.List<String> values) {
            addCriterion("real_fee in", values, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeNotIn(java.util.List<String> values) {
            addCriterion("real_fee not in", values, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeBetween(String value1, String value2) {
            addCriterion("real_fee between", value1, value2, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeNotBetween(String value1, String value2) {
            addCriterion("real_fee not between", value1, value2, "realFee");
            return (Criteria) this;
        }

        public Criteria andPackageFeeIsNull() {
            addCriterion("package_fee is null");
            return (Criteria) this;
        }

        public Criteria andPackageFeeIsNotNull() {
            addCriterion("package_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPackageFeeEqualTo(String value) {
            addCriterion("package_fee =", value, "packageFee");
            return (Criteria) this;
        }

        public Criteria andPackageFeeNotEqualTo(String value) {
            addCriterion("package_fee <>", value, "packageFee");
            return (Criteria) this;
        }

        public Criteria andPackageFeeGreaterThan(String value) {
            addCriterion("package_fee >", value, "packageFee");
            return (Criteria) this;
        }

        public Criteria andPackageFeeGreaterThanOrEqualTo(String value) {
            addCriterion("package_fee >=", value, "packageFee");
            return (Criteria) this;
        }

        public Criteria andPackageFeeLessThan(String value) {
            addCriterion("package_fee <", value, "packageFee");
            return (Criteria) this;
        }

        public Criteria andPackageFeeLessThanOrEqualTo(String value) {
            addCriterion("package_fee <=", value, "packageFee");
            return (Criteria) this;
        }

        public Criteria andPackageFeeLike(String value) {
            addCriterion("package_fee like", value, "packageFee");
            return (Criteria) this;
        }

        public Criteria andPackageFeeNotLike(String value) {
            addCriterion("package_fee not like", value, "packageFee");
            return (Criteria) this;
        }

        public Criteria andPackageFeeIn(java.util.List<String> values) {
            addCriterion("package_fee in", values, "packageFee");
            return (Criteria) this;
        }

        public Criteria andPackageFeeNotIn(java.util.List<String> values) {
            addCriterion("package_fee not in", values, "packageFee");
            return (Criteria) this;
        }

        public Criteria andPackageFeeBetween(String value1, String value2) {
            addCriterion("package_fee between", value1, value2, "packageFee");
            return (Criteria) this;
        }

        public Criteria andPackageFeeNotBetween(String value1, String value2) {
            addCriterion("package_fee not between", value1, value2, "packageFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNull() {
            addCriterion("total_fee is null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNotNull() {
            addCriterion("total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeEqualTo(String value) {
            addCriterion("total_fee =", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotEqualTo(String value) {
            addCriterion("total_fee <>", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThan(String value) {
            addCriterion("total_fee >", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThanOrEqualTo(String value) {
            addCriterion("total_fee >=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThan(String value) {
            addCriterion("total_fee <", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThanOrEqualTo(String value) {
            addCriterion("total_fee <=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLike(String value) {
            addCriterion("total_fee like", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotLike(String value) {
            addCriterion("total_fee not like", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIn(java.util.List<String> values) {
            addCriterion("total_fee in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotIn(java.util.List<String> values) {
            addCriterion("total_fee not in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeBetween(String value1, String value2) {
            addCriterion("total_fee between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotBetween(String value1, String value2) {
            addCriterion("total_fee not between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(String value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(String value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(String value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(String value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(String value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(String value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLike(String value) {
            addCriterion("profit like", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotLike(String value) {
            addCriterion("profit not like", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(java.util.List<String> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(java.util.List<String> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(String value1, String value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(String value1, String value2) {
            addCriterion("profit not between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitRateIsNull() {
            addCriterion("profit_rate is null");
            return (Criteria) this;
        }

        public Criteria andProfitRateIsNotNull() {
            addCriterion("profit_rate is not null");
            return (Criteria) this;
        }

        public Criteria andProfitRateEqualTo(java.math.BigDecimal value) {
            addCriterion("profit_rate =", value, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateNotEqualTo(java.math.BigDecimal value) {
            addCriterion("profit_rate <>", value, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateGreaterThan(java.math.BigDecimal value) {
            addCriterion("profit_rate >", value, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateGreaterThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("profit_rate >=", value, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateLessThan(java.math.BigDecimal value) {
            addCriterion("profit_rate <", value, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateLessThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("profit_rate <=", value, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateIn(java.util.List<java.math.BigDecimal> values) {
            addCriterion("profit_rate in", values, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateNotIn(java.util.List<java.math.BigDecimal> values) {
            addCriterion("profit_rate not in", values, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("profit_rate between", value1, value2, "profitRate");
            return (Criteria) this;
        }

        public Criteria andProfitRateNotBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("profit_rate not between", value1, value2, "profitRate");
            return (Criteria) this;
        }
    }

    /**
     * client_web_pkp_order_import
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * client_web_pkp_order_import
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