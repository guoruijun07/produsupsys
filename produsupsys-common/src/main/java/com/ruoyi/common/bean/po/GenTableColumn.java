package com.ruoyi.common.bean.po;

public class GenTableColumn {
    /**
     * 编号 column_id
     */
    private Long columnId;

    /**
     * 归属表编号 table_id
     */
    private String tableId;

    /**
     * 列名称 column_name
     */
    private String columnName;

    /**
     * 列描述 column_comment
     */
    private String columnComment;

    /**
     * 列类型 column_type
     */
    private String columnType;

    /**
     * JAVA类型 java_type
     */
    private String javaType;

    /**
     * JAVA字段名 java_field
     */
    private String javaField;

    /**
     * 是否主键（1是） is_pk
     */
    private String isPk;

    /**
     * 是否自增（1是） is_increment
     */
    private String isIncrement;

    /**
     * 是否必填（1是） is_required
     */
    private String isRequired;

    /**
     * 是否为插入字段（1是） is_insert
     */
    private String isInsert;

    /**
     * 是否编辑字段（1是） is_edit
     */
    private String isEdit;

    /**
     * 是否列表字段（1是） is_list
     */
    private String isList;

    /**
     * 是否查询字段（1是） is_query
     */
    private String isQuery;

    /**
     * 查询方式（等于、不等于、大于、小于、范围） query_type
     */
    private String queryType;

    /**
     * 显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件） html_type
     */
    private String htmlType;

    /**
     * 字典类型 dict_type
     */
    private String dictType;

    /**
     * 排序 sort
     */
    private Integer sort;

    /**
     * 创建者 create_by
     */
    private String createBy;

    /**
     * 创建时间 create_time
     */
    private java.util.Date createTime;

    /**
     * 更新者 update_by
     */
    private String updateBy;

    /**
     * 更新时间 update_time
     */
    private java.util.Date updateTime;

    /**
     *
     * @mbggenerated
     */
    public GenTableColumn(Long columnId, String tableId, String columnName, String columnComment, String columnType, String javaType, String javaField, String isPk, String isIncrement, String isRequired, String isInsert, String isEdit, String isList, String isQuery, String queryType, String htmlType, String dictType, Integer sort, String createBy, java.util.Date createTime, String updateBy, java.util.Date updateTime) {
        this.columnId = columnId;
        this.tableId = tableId;
        this.columnName = columnName;
        this.columnComment = columnComment;
        this.columnType = columnType;
        this.javaType = javaType;
        this.javaField = javaField;
        this.isPk = isPk;
        this.isIncrement = isIncrement;
        this.isRequired = isRequired;
        this.isInsert = isInsert;
        this.isEdit = isEdit;
        this.isList = isList;
        this.isQuery = isQuery;
        this.queryType = queryType;
        this.htmlType = htmlType;
        this.dictType = dictType;
        this.sort = sort;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
    }

    /**
     *
     * @mbggenerated
     */
    public GenTableColumn() {
        super();
    }

    /**
     * 编号

     * @return column_id 编号
     */
    public Long getColumnId() {
        return columnId;
    }

    /**
     * 编号

     * @param columnId 编号
     */
    public void setColumnId(Long columnId) {
        this.columnId = columnId;
    }

    /**
     * 归属表编号

     * @return table_id 归属表编号
     */
    public String getTableId() {
        return tableId;
    }

    /**
     * 归属表编号

     * @param tableId 归属表编号
     */
    public void setTableId(String tableId) {
        this.tableId = tableId == null ? null : tableId.trim();
    }

    /**
     * 列名称

     * @return column_name 列名称
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * 列名称

     * @param columnName 列名称
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    /**
     * 列描述

     * @return column_comment 列描述
     */
    public String getColumnComment() {
        return columnComment;
    }

    /**
     * 列描述

     * @param columnComment 列描述
     */
    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment == null ? null : columnComment.trim();
    }

    /**
     * 列类型

     * @return column_type 列类型
     */
    public String getColumnType() {
        return columnType;
    }

    /**
     * 列类型

     * @param columnType 列类型
     */
    public void setColumnType(String columnType) {
        this.columnType = columnType == null ? null : columnType.trim();
    }

    /**
     * JAVA类型

     * @return java_type JAVA类型
     */
    public String getJavaType() {
        return javaType;
    }

    /**
     * JAVA类型

     * @param javaType JAVA类型
     */
    public void setJavaType(String javaType) {
        this.javaType = javaType == null ? null : javaType.trim();
    }

    /**
     * JAVA字段名

     * @return java_field JAVA字段名
     */
    public String getJavaField() {
        return javaField;
    }

    /**
     * JAVA字段名

     * @param javaField JAVA字段名
     */
    public void setJavaField(String javaField) {
        this.javaField = javaField == null ? null : javaField.trim();
    }

    /**
     * 是否主键（1是）

     * @return is_pk 是否主键（1是）
     */
    public String getIsPk() {
        return isPk;
    }

    /**
     * 是否主键（1是）

     * @param isPk 是否主键（1是）
     */
    public void setIsPk(String isPk) {
        this.isPk = isPk == null ? null : isPk.trim();
    }

    /**
     * 是否自增（1是）

     * @return is_increment 是否自增（1是）
     */
    public String getIsIncrement() {
        return isIncrement;
    }

    /**
     * 是否自增（1是）

     * @param isIncrement 是否自增（1是）
     */
    public void setIsIncrement(String isIncrement) {
        this.isIncrement = isIncrement == null ? null : isIncrement.trim();
    }

    /**
     * 是否必填（1是）

     * @return is_required 是否必填（1是）
     */
    public String getIsRequired() {
        return isRequired;
    }

    /**
     * 是否必填（1是）

     * @param isRequired 是否必填（1是）
     */
    public void setIsRequired(String isRequired) {
        this.isRequired = isRequired == null ? null : isRequired.trim();
    }

    /**
     * 是否为插入字段（1是）

     * @return is_insert 是否为插入字段（1是）
     */
    public String getIsInsert() {
        return isInsert;
    }

    /**
     * 是否为插入字段（1是）

     * @param isInsert 是否为插入字段（1是）
     */
    public void setIsInsert(String isInsert) {
        this.isInsert = isInsert == null ? null : isInsert.trim();
    }

    /**
     * 是否编辑字段（1是）

     * @return is_edit 是否编辑字段（1是）
     */
    public String getIsEdit() {
        return isEdit;
    }

    /**
     * 是否编辑字段（1是）

     * @param isEdit 是否编辑字段（1是）
     */
    public void setIsEdit(String isEdit) {
        this.isEdit = isEdit == null ? null : isEdit.trim();
    }

    /**
     * 是否列表字段（1是）

     * @return is_list 是否列表字段（1是）
     */
    public String getIsList() {
        return isList;
    }

    /**
     * 是否列表字段（1是）

     * @param isList 是否列表字段（1是）
     */
    public void setIsList(String isList) {
        this.isList = isList == null ? null : isList.trim();
    }

    /**
     * 是否查询字段（1是）

     * @return is_query 是否查询字段（1是）
     */
    public String getIsQuery() {
        return isQuery;
    }

    /**
     * 是否查询字段（1是）

     * @param isQuery 是否查询字段（1是）
     */
    public void setIsQuery(String isQuery) {
        this.isQuery = isQuery == null ? null : isQuery.trim();
    }

    /**
     * 查询方式（等于、不等于、大于、小于、范围）

     * @return query_type 查询方式（等于、不等于、大于、小于、范围）
     */
    public String getQueryType() {
        return queryType;
    }

    /**
     * 查询方式（等于、不等于、大于、小于、范围）

     * @param queryType 查询方式（等于、不等于、大于、小于、范围）
     */
    public void setQueryType(String queryType) {
        this.queryType = queryType == null ? null : queryType.trim();
    }

    /**
     * 显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件）

     * @return html_type 显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件）
     */
    public String getHtmlType() {
        return htmlType;
    }

    /**
     * 显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件）

     * @param htmlType 显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件）
     */
    public void setHtmlType(String htmlType) {
        this.htmlType = htmlType == null ? null : htmlType.trim();
    }

    /**
     * 字典类型

     * @return dict_type 字典类型
     */
    public String getDictType() {
        return dictType;
    }

    /**
     * 字典类型

     * @param dictType 字典类型
     */
    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    /**
     * 排序

     * @return sort 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序

     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 创建者

     * @return create_by 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建者

     * @param createBy 创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 创建时间

     * @return create_time 创建时间
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间

     * @param createTime 创建时间
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新者

     * @return update_by 更新者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新者

     * @param updateBy 更新者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 更新时间

     * @return update_time 更新时间
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间

     * @param updateTime 更新时间
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }
}