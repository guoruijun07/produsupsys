package com.ruoyi.common.bean.po;

public class QrtzFiredTriggers extends QrtzFiredTriggersKey {
    /**
     *  trigger_name
     */
    private String triggerName;

    /**
     *  trigger_group
     */
    private String triggerGroup;

    /**
     *  instance_name
     */
    private String instanceName;

    /**
     *  fired_time
     */
    private Long firedTime;

    /**
     *  sched_time
     */
    private Long schedTime;

    /**
     *  priority
     */
    private Integer priority;

    /**
     *  state
     */
    private String state;

    /**
     *  job_name
     */
    private String jobName;

    /**
     *  job_group
     */
    private String jobGroup;

    /**
     *  is_nonconcurrent
     */
    private String isNonconcurrent;

    /**
     *  requests_recovery
     */
    private String requestsRecovery;

    /**
     *
     * @mbggenerated
     */
    public QrtzFiredTriggers(String schedName, String entryId, String triggerName, String triggerGroup, String instanceName, Long firedTime, Long schedTime, Integer priority, String state, String jobName, String jobGroup, String isNonconcurrent, String requestsRecovery) {
        super(schedName, entryId);
        this.triggerName = triggerName;
        this.triggerGroup = triggerGroup;
        this.instanceName = instanceName;
        this.firedTime = firedTime;
        this.schedTime = schedTime;
        this.priority = priority;
        this.state = state;
        this.jobName = jobName;
        this.jobGroup = jobGroup;
        this.isNonconcurrent = isNonconcurrent;
        this.requestsRecovery = requestsRecovery;
    }

    /**
     *
     * @mbggenerated
     */
    public QrtzFiredTriggers() {
        super();
    }

    /**
     * 
    
     * @return trigger_name 
     */
    public String getTriggerName() {
        return triggerName;
    }

    /**
     * 
    
     * @param triggerName 
     */
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName == null ? null : triggerName.trim();
    }

    /**
     * 
    
     * @return trigger_group 
     */
    public String getTriggerGroup() {
        return triggerGroup;
    }

    /**
     * 
    
     * @param triggerGroup 
     */
    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup == null ? null : triggerGroup.trim();
    }

    /**
     * 
    
     * @return instance_name 
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * 
    
     * @param instanceName 
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName == null ? null : instanceName.trim();
    }

    /**
     * 
    
     * @return fired_time 
     */
    public Long getFiredTime() {
        return firedTime;
    }

    /**
     * 
    
     * @param firedTime 
     */
    public void setFiredTime(Long firedTime) {
        this.firedTime = firedTime;
    }

    /**
     * 
    
     * @return sched_time 
     */
    public Long getSchedTime() {
        return schedTime;
    }

    /**
     * 
    
     * @param schedTime 
     */
    public void setSchedTime(Long schedTime) {
        this.schedTime = schedTime;
    }

    /**
     * 
    
     * @return priority 
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * 
    
     * @param priority 
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 
    
     * @return state 
     */
    public String getState() {
        return state;
    }

    /**
     * 
    
     * @param state 
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 
    
     * @return job_name 
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * 
    
     * @param jobName 
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /**
     * 
    
     * @return job_group 
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * 
    
     * @param jobGroup 
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup == null ? null : jobGroup.trim();
    }

    /**
     * 
    
     * @return is_nonconcurrent 
     */
    public String getIsNonconcurrent() {
        return isNonconcurrent;
    }

    /**
     * 
    
     * @param isNonconcurrent 
     */
    public void setIsNonconcurrent(String isNonconcurrent) {
        this.isNonconcurrent = isNonconcurrent == null ? null : isNonconcurrent.trim();
    }

    /**
     * 
    
     * @return requests_recovery 
     */
    public String getRequestsRecovery() {
        return requestsRecovery;
    }

    /**
     * 
    
     * @param requestsRecovery 
     */
    public void setRequestsRecovery(String requestsRecovery) {
        this.requestsRecovery = requestsRecovery == null ? null : requestsRecovery.trim();
    }
}