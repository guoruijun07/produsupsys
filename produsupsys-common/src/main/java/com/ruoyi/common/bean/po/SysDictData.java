package com.ruoyi.common.bean.po;

public class SysDictData {
    /**
     * 字典编码 dict_code
     */
    private Long dictCode;

    /**
     * 字典排序 dict_sort
     */
    private Integer dictSort;

    /**
     * 字典标签 dict_label
     */
    private String dictLabel;

    /**
     * 字典键值 dict_value
     */
    private String dictValue;

    /**
     * 字典类型 dict_type
     */
    private String dictType;

    /**
     * 样式属性（其他样式扩展） css_class
     */
    private String cssClass;

    /**
     * 表格回显样式 list_class
     */
    private String listClass;

    /**
     * 是否默认（Y是 N否） is_default
     */
    private String isDefault;

    /**
     * 状态（0正常 1停用） status
     */
    private String status;

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
    public SysDictData(Long dictCode, Integer dictSort, String dictLabel, String dictValue, String dictType, String cssClass, String listClass, String isDefault, String status, String createBy, java.util.Date createTime, String updateBy, java.util.Date updateTime, String remark) {
        this.dictCode = dictCode;
        this.dictSort = dictSort;
        this.dictLabel = dictLabel;
        this.dictValue = dictValue;
        this.dictType = dictType;
        this.cssClass = cssClass;
        this.listClass = listClass;
        this.isDefault = isDefault;
        this.status = status;
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
    public SysDictData() {
        super();
    }

    /**
     * 字典编码

     * @return dict_code 字典编码
     */
    public Long getDictCode() {
        return dictCode;
    }

    /**
     * 字典编码

     * @param dictCode 字典编码
     */
    public void setDictCode(Long dictCode) {
        this.dictCode = dictCode;
    }

    /**
     * 字典排序

     * @return dict_sort 字典排序
     */
    public Integer getDictSort() {
        return dictSort;
    }

    /**
     * 字典排序

     * @param dictSort 字典排序
     */
    public void setDictSort(Integer dictSort) {
        this.dictSort = dictSort;
    }

    /**
     * 字典标签

     * @return dict_label 字典标签
     */
    public String getDictLabel() {
        return dictLabel;
    }

    /**
     * 字典标签

     * @param dictLabel 字典标签
     */
    public void setDictLabel(String dictLabel) {
        this.dictLabel = dictLabel == null ? null : dictLabel.trim();
    }

    /**
     * 字典键值

     * @return dict_value 字典键值
     */
    public String getDictValue() {
        return dictValue;
    }

    /**
     * 字典键值

     * @param dictValue 字典键值
     */
    public void setDictValue(String dictValue) {
        this.dictValue = dictValue == null ? null : dictValue.trim();
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
     * 样式属性（其他样式扩展）

     * @return css_class 样式属性（其他样式扩展）
     */
    public String getCssClass() {
        return cssClass;
    }

    /**
     * 样式属性（其他样式扩展）

     * @param cssClass 样式属性（其他样式扩展）
     */
    public void setCssClass(String cssClass) {
        this.cssClass = cssClass == null ? null : cssClass.trim();
    }

    /**
     * 表格回显样式

     * @return list_class 表格回显样式
     */
    public String getListClass() {
        return listClass;
    }

    /**
     * 表格回显样式

     * @param listClass 表格回显样式
     */
    public void setListClass(String listClass) {
        this.listClass = listClass == null ? null : listClass.trim();
    }

    /**
     * 是否默认（Y是 N否）

     * @return is_default 是否默认（Y是 N否）
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * 是否默认（Y是 N否）

     * @param isDefault 是否默认（Y是 N否）
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    /**
     * 状态（0正常 1停用）

     * @return status 状态（0正常 1停用）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态（0正常 1停用）

     * @param status 状态（0正常 1停用）
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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