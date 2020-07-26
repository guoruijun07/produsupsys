package com.ruoyi.common.bean.po;

public class SysConfig {
    /**
     * 参数主键 config_id
     */
    private Integer configId;

    /**
     * 参数名称 config_name
     */
    private String configName;

    /**
     * 参数键名 config_key
     */
    private String configKey;

    /**
     * 参数键值 config_value
     */
    private String configValue;

    /**
     * 系统内置（Y是 N否） config_type
     */
    private String configType;

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
    public SysConfig(Integer configId, String configName, String configKey, String configValue, String configType, String createBy, java.util.Date createTime, String updateBy, java.util.Date updateTime, String remark) {
        this.configId = configId;
        this.configName = configName;
        this.configKey = configKey;
        this.configValue = configValue;
        this.configType = configType;
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
    public SysConfig() {
        super();
    }

    /**
     * 参数主键

     * @return config_id 参数主键
     */
    public Integer getConfigId() {
        return configId;
    }

    /**
     * 参数主键

     * @param configId 参数主键
     */
    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    /**
     * 参数名称

     * @return config_name 参数名称
     */
    public String getConfigName() {
        return configName;
    }

    /**
     * 参数名称

     * @param configName 参数名称
     */
    public void setConfigName(String configName) {
        this.configName = configName == null ? null : configName.trim();
    }

    /**
     * 参数键名

     * @return config_key 参数键名
     */
    public String getConfigKey() {
        return configKey;
    }

    /**
     * 参数键名

     * @param configKey 参数键名
     */
    public void setConfigKey(String configKey) {
        this.configKey = configKey == null ? null : configKey.trim();
    }

    /**
     * 参数键值

     * @return config_value 参数键值
     */
    public String getConfigValue() {
        return configValue;
    }

    /**
     * 参数键值

     * @param configValue 参数键值
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue == null ? null : configValue.trim();
    }

    /**
     * 系统内置（Y是 N否）

     * @return config_type 系统内置（Y是 N否）
     */
    public String getConfigType() {
        return configType;
    }

    /**
     * 系统内置（Y是 N否）

     * @param configType 系统内置（Y是 N否）
     */
    public void setConfigType(String configType) {
        this.configType = configType == null ? null : configType.trim();
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