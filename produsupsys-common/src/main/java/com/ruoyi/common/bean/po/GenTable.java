package com.ruoyi.common.bean.po;

public class GenTable {
    /**
     * 编号 table_id
     */
    private Long tableId;

    /**
     * 表名称 table_name
     */
    private String tableName;

    /**
     * 表描述 table_comment
     */
    private String tableComment;

    /**
     * 关联子表的表名 sub_table_name
     */
    private String subTableName;

    /**
     * 子表关联的外键名 sub_table_fk_name
     */
    private String subTableFkName;

    /**
     * 实体类名称 class_name
     */
    private String className;

    /**
     * 使用的模板（crud单表操作 tree树表操作 sub主子表操作） tpl_category
     */
    private String tplCategory;

    /**
     * 生成包路径 package_name
     */
    private String packageName;

    /**
     * 生成模块名 module_name
     */
    private String moduleName;

    /**
     * 生成业务名 business_name
     */
    private String businessName;

    /**
     * 生成功能名 function_name
     */
    private String functionName;

    /**
     * 生成功能作者 function_author
     */
    private String functionAuthor;

    /**
     * 其它生成选项 options
     */
    private String options;

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
     * 备注 remark
     */
    private String remark;

    /**
     *
     * @mbggenerated
     */
    public GenTable(Long tableId, String tableName, String tableComment, String subTableName, String subTableFkName, String className, String tplCategory, String packageName, String moduleName, String businessName, String functionName, String functionAuthor, String options, String createBy, java.util.Date createTime, String updateBy, java.util.Date updateTime, String remark) {
        this.tableId = tableId;
        this.tableName = tableName;
        this.tableComment = tableComment;
        this.subTableName = subTableName;
        this.subTableFkName = subTableFkName;
        this.className = className;
        this.tplCategory = tplCategory;
        this.packageName = packageName;
        this.moduleName = moduleName;
        this.businessName = businessName;
        this.functionName = functionName;
        this.functionAuthor = functionAuthor;
        this.options = options;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.remark = remark;
    }

    /**
     *
     * @mbggenerated
     */
    public GenTable() {
        super();
    }

    /**
     * 编号

     * @return table_id 编号
     */
    public Long getTableId() {
        return tableId;
    }

    /**
     * 编号

     * @param tableId 编号
     */
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    /**
     * 表名称

     * @return table_name 表名称
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 表名称

     * @param tableName 表名称
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * 表描述

     * @return table_comment 表描述
     */
    public String getTableComment() {
        return tableComment;
    }

    /**
     * 表描述

     * @param tableComment 表描述
     */
    public void setTableComment(String tableComment) {
        this.tableComment = tableComment == null ? null : tableComment.trim();
    }

    /**
     * 关联子表的表名

     * @return sub_table_name 关联子表的表名
     */
    public String getSubTableName() {
        return subTableName;
    }

    /**
     * 关联子表的表名

     * @param subTableName 关联子表的表名
     */
    public void setSubTableName(String subTableName) {
        this.subTableName = subTableName == null ? null : subTableName.trim();
    }

    /**
     * 子表关联的外键名

     * @return sub_table_fk_name 子表关联的外键名
     */
    public String getSubTableFkName() {
        return subTableFkName;
    }

    /**
     * 子表关联的外键名

     * @param subTableFkName 子表关联的外键名
     */
    public void setSubTableFkName(String subTableFkName) {
        this.subTableFkName = subTableFkName == null ? null : subTableFkName.trim();
    }

    /**
     * 实体类名称

     * @return class_name 实体类名称
     */
    public String getClassName() {
        return className;
    }

    /**
     * 实体类名称

     * @param className 实体类名称
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    /**
     * 使用的模板（crud单表操作 tree树表操作 sub主子表操作）

     * @return tpl_category 使用的模板（crud单表操作 tree树表操作 sub主子表操作）
     */
    public String getTplCategory() {
        return tplCategory;
    }

    /**
     * 使用的模板（crud单表操作 tree树表操作 sub主子表操作）

     * @param tplCategory 使用的模板（crud单表操作 tree树表操作 sub主子表操作）
     */
    public void setTplCategory(String tplCategory) {
        this.tplCategory = tplCategory == null ? null : tplCategory.trim();
    }

    /**
     * 生成包路径

     * @return package_name 生成包路径
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * 生成包路径

     * @param packageName 生成包路径
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    /**
     * 生成模块名

     * @return module_name 生成模块名
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * 生成模块名

     * @param moduleName 生成模块名
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    /**
     * 生成业务名

     * @return business_name 生成业务名
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * 生成业务名

     * @param businessName 生成业务名
     */
    public void setBusinessName(String businessName) {
        this.businessName = businessName == null ? null : businessName.trim();
    }

    /**
     * 生成功能名

     * @return function_name 生成功能名
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * 生成功能名

     * @param functionName 生成功能名
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName == null ? null : functionName.trim();
    }

    /**
     * 生成功能作者

     * @return function_author 生成功能作者
     */
    public String getFunctionAuthor() {
        return functionAuthor;
    }

    /**
     * 生成功能作者

     * @param functionAuthor 生成功能作者
     */
    public void setFunctionAuthor(String functionAuthor) {
        this.functionAuthor = functionAuthor == null ? null : functionAuthor.trim();
    }

    /**
     * 其它生成选项

     * @return options 其它生成选项
     */
    public String getOptions() {
        return options;
    }

    /**
     * 其它生成选项

     * @param options 其它生成选项
     */
    public void setOptions(String options) {
        this.options = options == null ? null : options.trim();
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

    /**
     * 备注
    
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
    
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}