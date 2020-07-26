package com.ruoyi.common.bean.po;

public class SysJob extends SysJobKey {
    /**
     * 调用目标字符串 invoke_target
     */
    private String invokeTarget;

    /**
     * cron执行表达式 cron_expression
     */
    private String cronExpression;

    /**
     * 计划执行错误策略（1立即执行 2执行一次 3放弃执行） misfire_policy
     */
    private String misfirePolicy;

    /**
     * 是否并发执行（0允许 1禁止） concurrent
     */
    private String concurrent;

    /**
     * 状态（0正常 1暂停） status
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
     * 备注信息 remark
     */
    private String remark;

    /**
     *
     * @mbggenerated
     */
    public SysJob(Long jobId, String jobName, String jobGroup, String invokeTarget, String cronExpression, String misfirePolicy, String concurrent, String status, String createBy, java.util.Date createTime, String updateBy, java.util.Date updateTime, String remark) {
        super(jobId, jobName, jobGroup);
        this.invokeTarget = invokeTarget;
        this.cronExpression = cronExpression;
        this.misfirePolicy = misfirePolicy;
        this.concurrent = concurrent;
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
    public SysJob() {
        super();
    }

    /**
     * 调用目标字符串

     * @return invoke_target 调用目标字符串
     */
    public String getInvokeTarget() {
        return invokeTarget;
    }

    /**
     * 调用目标字符串

     * @param invokeTarget 调用目标字符串
     */
    public void setInvokeTarget(String invokeTarget) {
        this.invokeTarget = invokeTarget == null ? null : invokeTarget.trim();
    }

    /**
     * cron执行表达式

     * @return cron_expression cron执行表达式
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * cron执行表达式

     * @param cronExpression cron执行表达式
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression == null ? null : cronExpression.trim();
    }

    /**
     * 计划执行错误策略（1立即执行 2执行一次 3放弃执行）

     * @return misfire_policy 计划执行错误策略（1立即执行 2执行一次 3放弃执行）
     */
    public String getMisfirePolicy() {
        return misfirePolicy;
    }

    /**
     * 计划执行错误策略（1立即执行 2执行一次 3放弃执行）

     * @param misfirePolicy 计划执行错误策略（1立即执行 2执行一次 3放弃执行）
     */
    public void setMisfirePolicy(String misfirePolicy) {
        this.misfirePolicy = misfirePolicy == null ? null : misfirePolicy.trim();
    }

    /**
     * 是否并发执行（0允许 1禁止）

     * @return concurrent 是否并发执行（0允许 1禁止）
     */
    public String getConcurrent() {
        return concurrent;
    }

    /**
     * 是否并发执行（0允许 1禁止）

     * @param concurrent 是否并发执行（0允许 1禁止）
     */
    public void setConcurrent(String concurrent) {
        this.concurrent = concurrent == null ? null : concurrent.trim();
    }

    /**
     * 状态（0正常 1暂停）

     * @return status 状态（0正常 1暂停）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态（0正常 1暂停）

     * @param status 状态（0正常 1暂停）
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
     * 备注信息
    
     * @return remark 备注信息
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注信息
    
     * @param remark 备注信息
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}