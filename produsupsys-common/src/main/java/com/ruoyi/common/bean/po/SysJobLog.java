package com.ruoyi.common.bean.po;

public class SysJobLog {
    /**
     * 任务日志ID job_log_id
     */
    private Long jobLogId;

    /**
     * 任务名称 job_name
     */
    private String jobName;

    /**
     * 任务组名 job_group
     */
    private String jobGroup;

    /**
     * 调用目标字符串 invoke_target
     */
    private String invokeTarget;

    /**
     * 日志信息 job_message
     */
    private String jobMessage;

    /**
     * 执行状态（0正常 1失败） status
     */
    private String status;

    /**
     * 异常信息 exception_info
     */
    private String exceptionInfo;

    /**
     * 创建时间 create_time
     */
    private java.util.Date createTime;

    /**
     *
     * @mbggenerated
     */
    public SysJobLog(Long jobLogId, String jobName, String jobGroup, String invokeTarget, String jobMessage, String status, String exceptionInfo, java.util.Date createTime) {
        this.jobLogId = jobLogId;
        this.jobName = jobName;
        this.jobGroup = jobGroup;
        this.invokeTarget = invokeTarget;
        this.jobMessage = jobMessage;
        this.status = status;
        this.exceptionInfo = exceptionInfo;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated
     */
    public SysJobLog() {
        super();
    }

    /**
     * 任务日志ID

     * @return job_log_id 任务日志ID
     */
    public Long getJobLogId() {
        return jobLogId;
    }

    /**
     * 任务日志ID

     * @param jobLogId 任务日志ID
     */
    public void setJobLogId(Long jobLogId) {
        this.jobLogId = jobLogId;
    }

    /**
     * 任务名称

     * @return job_name 任务名称
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * 任务名称

     * @param jobName 任务名称
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /**
     * 任务组名

     * @return job_group 任务组名
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * 任务组名

     * @param jobGroup 任务组名
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup == null ? null : jobGroup.trim();
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
     * 日志信息

     * @return job_message 日志信息
     */
    public String getJobMessage() {
        return jobMessage;
    }

    /**
     * 日志信息

     * @param jobMessage 日志信息
     */
    public void setJobMessage(String jobMessage) {
        this.jobMessage = jobMessage == null ? null : jobMessage.trim();
    }

    /**
     * 执行状态（0正常 1失败）

     * @return status 执行状态（0正常 1失败）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 执行状态（0正常 1失败）

     * @param status 执行状态（0正常 1失败）
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 异常信息

     * @return exception_info 异常信息
     */
    public String getExceptionInfo() {
        return exceptionInfo;
    }

    /**
     * 异常信息

     * @param exceptionInfo 异常信息
     */
    public void setExceptionInfo(String exceptionInfo) {
        this.exceptionInfo = exceptionInfo == null ? null : exceptionInfo.trim();
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
}