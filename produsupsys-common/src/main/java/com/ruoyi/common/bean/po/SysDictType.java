package com.ruoyi.common.bean.po;

public class SysDictType {
    /**
     * 字典主键 dict_id
     */
    private Long dictId;

    /**
     * 字典名称 dict_name
     */
    private String dictName;

    /**
     * 字典类型 dict_type
     */
    private String dictType;

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
    public SysDictType(Long dictId, String dictName, String dictType, String status, String createBy, java.util.Date createTime, String updateBy, java.util.Date updateTime, String remark) {
        this.dictId = dictId;
        this.dictName = dictName;
        this.dictType = dictType;
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
    public SysDictType() {
        super();
    }

    /**
     * 字典主键

     * @return dict_id 字典主键
     */
    public Long getDictId() {
        return dictId;
    }

    /**
     * 字典主键

     * @param dictId 字典主键
     */
    public void setDictId(Long dictId) {
        this.dictId = dictId;
    }

    /**
     * 字典名称

     * @return dict_name 字典名称
     */
    public String getDictName() {
        return dictName;
    }

    /**
     * 字典名称

     * @param dictName 字典名称
     */
    public void setDictName(String dictName) {
        this.dictName = dictName == null ? null : dictName.trim();
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