package com.ruoyi.common.bean.po;

public class GenTableExample {
    /**
     * gen_table
     */
    protected String orderByClause;

    /**
     * gen_table
     */
    protected boolean distinct;

    /**
     * gen_table
     */
    protected java.util.List<com.ruoyi.common.bean.po.GenTableExample.Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public GenTableExample() {
        oredCriteria = new java.util.ArrayList<com.ruoyi.common.bean.po.GenTableExample.Criteria>();
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
    public java.util.List<com.ruoyi.common.bean.po.GenTableExample.Criteria> getOredCriteria() {
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
     * gen_table
     */
    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.ruoyi.common.bean.po.GenTableExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.ruoyi.common.bean.po.GenTableExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.ruoyi.common.bean.po.GenTableExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.ruoyi.common.bean.po.GenTableExample.Criterion> getCriteria() {
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

        public Criteria andTableIdIsNull() {
            addCriterion("table_id is null");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNotNull() {
            addCriterion("table_id is not null");
            return (Criteria) this;
        }

        public Criteria andTableIdEqualTo(Long value) {
            addCriterion("table_id =", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotEqualTo(Long value) {
            addCriterion("table_id <>", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThan(Long value) {
            addCriterion("table_id >", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThanOrEqualTo(Long value) {
            addCriterion("table_id >=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThan(Long value) {
            addCriterion("table_id <", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThanOrEqualTo(Long value) {
            addCriterion("table_id <=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdIn(java.util.List<Long> values) {
            addCriterion("table_id in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotIn(java.util.List<Long> values) {
            addCriterion("table_id not in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdBetween(Long value1, Long value2) {
            addCriterion("table_id between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotBetween(Long value1, Long value2) {
            addCriterion("table_id not between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(java.util.List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(java.util.List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableCommentIsNull() {
            addCriterion("table_comment is null");
            return (Criteria) this;
        }

        public Criteria andTableCommentIsNotNull() {
            addCriterion("table_comment is not null");
            return (Criteria) this;
        }

        public Criteria andTableCommentEqualTo(String value) {
            addCriterion("table_comment =", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentNotEqualTo(String value) {
            addCriterion("table_comment <>", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentGreaterThan(String value) {
            addCriterion("table_comment >", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentGreaterThanOrEqualTo(String value) {
            addCriterion("table_comment >=", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentLessThan(String value) {
            addCriterion("table_comment <", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentLessThanOrEqualTo(String value) {
            addCriterion("table_comment <=", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentLike(String value) {
            addCriterion("table_comment like", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentNotLike(String value) {
            addCriterion("table_comment not like", value, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentIn(java.util.List<String> values) {
            addCriterion("table_comment in", values, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentNotIn(java.util.List<String> values) {
            addCriterion("table_comment not in", values, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentBetween(String value1, String value2) {
            addCriterion("table_comment between", value1, value2, "tableComment");
            return (Criteria) this;
        }

        public Criteria andTableCommentNotBetween(String value1, String value2) {
            addCriterion("table_comment not between", value1, value2, "tableComment");
            return (Criteria) this;
        }

        public Criteria andSubTableNameIsNull() {
            addCriterion("sub_table_name is null");
            return (Criteria) this;
        }

        public Criteria andSubTableNameIsNotNull() {
            addCriterion("sub_table_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubTableNameEqualTo(String value) {
            addCriterion("sub_table_name =", value, "subTableName");
            return (Criteria) this;
        }

        public Criteria andSubTableNameNotEqualTo(String value) {
            addCriterion("sub_table_name <>", value, "subTableName");
            return (Criteria) this;
        }

        public Criteria andSubTableNameGreaterThan(String value) {
            addCriterion("sub_table_name >", value, "subTableName");
            return (Criteria) this;
        }

        public Criteria andSubTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_table_name >=", value, "subTableName");
            return (Criteria) this;
        }

        public Criteria andSubTableNameLessThan(String value) {
            addCriterion("sub_table_name <", value, "subTableName");
            return (Criteria) this;
        }

        public Criteria andSubTableNameLessThanOrEqualTo(String value) {
            addCriterion("sub_table_name <=", value, "subTableName");
            return (Criteria) this;
        }

        public Criteria andSubTableNameLike(String value) {
            addCriterion("sub_table_name like", value, "subTableName");
            return (Criteria) this;
        }

        public Criteria andSubTableNameNotLike(String value) {
            addCriterion("sub_table_name not like", value, "subTableName");
            return (Criteria) this;
        }

        public Criteria andSubTableNameIn(java.util.List<String> values) {
            addCriterion("sub_table_name in", values, "subTableName");
            return (Criteria) this;
        }

        public Criteria andSubTableNameNotIn(java.util.List<String> values) {
            addCriterion("sub_table_name not in", values, "subTableName");
            return (Criteria) this;
        }

        public Criteria andSubTableNameBetween(String value1, String value2) {
            addCriterion("sub_table_name between", value1, value2, "subTableName");
            return (Criteria) this;
        }

        public Criteria andSubTableNameNotBetween(String value1, String value2) {
            addCriterion("sub_table_name not between", value1, value2, "subTableName");
            return (Criteria) this;
        }

        public Criteria andSubTableFkNameIsNull() {
            addCriterion("sub_table_fk_name is null");
            return (Criteria) this;
        }

        public Criteria andSubTableFkNameIsNotNull() {
            addCriterion("sub_table_fk_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubTableFkNameEqualTo(String value) {
            addCriterion("sub_table_fk_name =", value, "subTableFkName");
            return (Criteria) this;
        }

        public Criteria andSubTableFkNameNotEqualTo(String value) {
            addCriterion("sub_table_fk_name <>", value, "subTableFkName");
            return (Criteria) this;
        }

        public Criteria andSubTableFkNameGreaterThan(String value) {
            addCriterion("sub_table_fk_name >", value, "subTableFkName");
            return (Criteria) this;
        }

        public Criteria andSubTableFkNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_table_fk_name >=", value, "subTableFkName");
            return (Criteria) this;
        }

        public Criteria andSubTableFkNameLessThan(String value) {
            addCriterion("sub_table_fk_name <", value, "subTableFkName");
            return (Criteria) this;
        }

        public Criteria andSubTableFkNameLessThanOrEqualTo(String value) {
            addCriterion("sub_table_fk_name <=", value, "subTableFkName");
            return (Criteria) this;
        }

        public Criteria andSubTableFkNameLike(String value) {
            addCriterion("sub_table_fk_name like", value, "subTableFkName");
            return (Criteria) this;
        }

        public Criteria andSubTableFkNameNotLike(String value) {
            addCriterion("sub_table_fk_name not like", value, "subTableFkName");
            return (Criteria) this;
        }

        public Criteria andSubTableFkNameIn(java.util.List<String> values) {
            addCriterion("sub_table_fk_name in", values, "subTableFkName");
            return (Criteria) this;
        }

        public Criteria andSubTableFkNameNotIn(java.util.List<String> values) {
            addCriterion("sub_table_fk_name not in", values, "subTableFkName");
            return (Criteria) this;
        }

        public Criteria andSubTableFkNameBetween(String value1, String value2) {
            addCriterion("sub_table_fk_name between", value1, value2, "subTableFkName");
            return (Criteria) this;
        }

        public Criteria andSubTableFkNameNotBetween(String value1, String value2) {
            addCriterion("sub_table_fk_name not between", value1, value2, "subTableFkName");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(java.util.List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(java.util.List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andTplCategoryIsNull() {
            addCriterion("tpl_category is null");
            return (Criteria) this;
        }

        public Criteria andTplCategoryIsNotNull() {
            addCriterion("tpl_category is not null");
            return (Criteria) this;
        }

        public Criteria andTplCategoryEqualTo(String value) {
            addCriterion("tpl_category =", value, "tplCategory");
            return (Criteria) this;
        }

        public Criteria andTplCategoryNotEqualTo(String value) {
            addCriterion("tpl_category <>", value, "tplCategory");
            return (Criteria) this;
        }

        public Criteria andTplCategoryGreaterThan(String value) {
            addCriterion("tpl_category >", value, "tplCategory");
            return (Criteria) this;
        }

        public Criteria andTplCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("tpl_category >=", value, "tplCategory");
            return (Criteria) this;
        }

        public Criteria andTplCategoryLessThan(String value) {
            addCriterion("tpl_category <", value, "tplCategory");
            return (Criteria) this;
        }

        public Criteria andTplCategoryLessThanOrEqualTo(String value) {
            addCriterion("tpl_category <=", value, "tplCategory");
            return (Criteria) this;
        }

        public Criteria andTplCategoryLike(String value) {
            addCriterion("tpl_category like", value, "tplCategory");
            return (Criteria) this;
        }

        public Criteria andTplCategoryNotLike(String value) {
            addCriterion("tpl_category not like", value, "tplCategory");
            return (Criteria) this;
        }

        public Criteria andTplCategoryIn(java.util.List<String> values) {
            addCriterion("tpl_category in", values, "tplCategory");
            return (Criteria) this;
        }

        public Criteria andTplCategoryNotIn(java.util.List<String> values) {
            addCriterion("tpl_category not in", values, "tplCategory");
            return (Criteria) this;
        }

        public Criteria andTplCategoryBetween(String value1, String value2) {
            addCriterion("tpl_category between", value1, value2, "tplCategory");
            return (Criteria) this;
        }

        public Criteria andTplCategoryNotBetween(String value1, String value2) {
            addCriterion("tpl_category not between", value1, value2, "tplCategory");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNull() {
            addCriterion("package_name is null");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNotNull() {
            addCriterion("package_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNameEqualTo(String value) {
            addCriterion("package_name =", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotEqualTo(String value) {
            addCriterion("package_name <>", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThan(String value) {
            addCriterion("package_name >", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("package_name >=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThan(String value) {
            addCriterion("package_name <", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThanOrEqualTo(String value) {
            addCriterion("package_name <=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLike(String value) {
            addCriterion("package_name like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotLike(String value) {
            addCriterion("package_name not like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameIn(java.util.List<String> values) {
            addCriterion("package_name in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotIn(java.util.List<String> values) {
            addCriterion("package_name not in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameBetween(String value1, String value2) {
            addCriterion("package_name between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotBetween(String value1, String value2) {
            addCriterion("package_name not between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNull() {
            addCriterion("module_name is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("module_name is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("module_name =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("module_name <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("module_name >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("module_name >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("module_name <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("module_name <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("module_name like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("module_name not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(java.util.List<String> values) {
            addCriterion("module_name in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(java.util.List<String> values) {
            addCriterion("module_name not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("module_name between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("module_name not between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNull() {
            addCriterion("business_name is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNotNull() {
            addCriterion("business_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameEqualTo(String value) {
            addCriterion("business_name =", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotEqualTo(String value) {
            addCriterion("business_name <>", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThan(String value) {
            addCriterion("business_name >", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThanOrEqualTo(String value) {
            addCriterion("business_name >=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThan(String value) {
            addCriterion("business_name <", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThanOrEqualTo(String value) {
            addCriterion("business_name <=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLike(String value) {
            addCriterion("business_name like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotLike(String value) {
            addCriterion("business_name not like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIn(java.util.List<String> values) {
            addCriterion("business_name in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotIn(java.util.List<String> values) {
            addCriterion("business_name not in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameBetween(String value1, String value2) {
            addCriterion("business_name between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotBetween(String value1, String value2) {
            addCriterion("business_name not between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNull() {
            addCriterion("function_name is null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNotNull() {
            addCriterion("function_name is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameEqualTo(String value) {
            addCriterion("function_name =", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotEqualTo(String value) {
            addCriterion("function_name <>", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThan(String value) {
            addCriterion("function_name >", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("function_name >=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThan(String value) {
            addCriterion("function_name <", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("function_name <=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLike(String value) {
            addCriterion("function_name like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotLike(String value) {
            addCriterion("function_name not like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIn(java.util.List<String> values) {
            addCriterion("function_name in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotIn(java.util.List<String> values) {
            addCriterion("function_name not in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameBetween(String value1, String value2) {
            addCriterion("function_name between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotBetween(String value1, String value2) {
            addCriterion("function_name not between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorIsNull() {
            addCriterion("function_author is null");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorIsNotNull() {
            addCriterion("function_author is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorEqualTo(String value) {
            addCriterion("function_author =", value, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorNotEqualTo(String value) {
            addCriterion("function_author <>", value, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorGreaterThan(String value) {
            addCriterion("function_author >", value, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("function_author >=", value, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorLessThan(String value) {
            addCriterion("function_author <", value, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorLessThanOrEqualTo(String value) {
            addCriterion("function_author <=", value, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorLike(String value) {
            addCriterion("function_author like", value, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorNotLike(String value) {
            addCriterion("function_author not like", value, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorIn(java.util.List<String> values) {
            addCriterion("function_author in", values, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorNotIn(java.util.List<String> values) {
            addCriterion("function_author not in", values, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorBetween(String value1, String value2) {
            addCriterion("function_author between", value1, value2, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorNotBetween(String value1, String value2) {
            addCriterion("function_author not between", value1, value2, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andOptionsIsNull() {
            addCriterion("options is null");
            return (Criteria) this;
        }

        public Criteria andOptionsIsNotNull() {
            addCriterion("options is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsEqualTo(String value) {
            addCriterion("options =", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotEqualTo(String value) {
            addCriterion("options <>", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsGreaterThan(String value) {
            addCriterion("options >", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsGreaterThanOrEqualTo(String value) {
            addCriterion("options >=", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLessThan(String value) {
            addCriterion("options <", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLessThanOrEqualTo(String value) {
            addCriterion("options <=", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLike(String value) {
            addCriterion("options like", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotLike(String value) {
            addCriterion("options not like", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsIn(java.util.List<String> values) {
            addCriterion("options in", values, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotIn(java.util.List<String> values) {
            addCriterion("options not in", values, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsBetween(String value1, String value2) {
            addCriterion("options between", value1, value2, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotBetween(String value1, String value2) {
            addCriterion("options not between", value1, value2, "options");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(java.util.List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(java.util.List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
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

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(java.util.List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(java.util.List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(java.util.Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(java.util.Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(java.util.Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(java.util.Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(java.util.List<java.util.Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(java.util.List<java.util.Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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
     * gen_table
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * gen_table
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