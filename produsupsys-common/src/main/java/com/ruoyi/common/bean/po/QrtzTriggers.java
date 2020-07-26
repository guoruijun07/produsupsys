package com.ruoyi.common.bean.po;

public class QrtzTriggers extends QrtzTriggersKey {
    /**
     *  job_name
     */
    private String jobName;

    /**
     *  job_group
     */
    private String jobGroup;

    /**
     *  description
     */
    private String description;

    /**
     *  next_fire_time
     */
    private Long nextFireTime;

    /**
     *  prev_fire_time
     */
    private Long prevFireTime;

    /**
     *  priority
     */
    private Integer priority;

    /**
     *  trigger_state
     */
    private String triggerState;

    /**
     *  trigger_type
     */
    private String triggerType;

    /**
     *  start_time
     */
    private Long startTime;

    /**
     *  end_time
     */
    private Long endTime;

    /**
     *  calendar_name
     */
    private String calendarName;

    /**
     *  misfire_instr
     */
    private Short misfireInstr;

    /**
     *  job_data
     */
    private byte[] jobData;

    /**
     *
     * @mbggenerated
     */
    public QrtzTriggers(String schedName, String triggerName, String triggerGroup, String jobName, String jobGroup, String description, Long nextFireTime, Long prevFireTime, Integer priority, String triggerState, String triggerType, Long startTime, Long endTime, String calendarName, Short misfireInstr, byte[] jobData) {
        super(schedName, triggerName, triggerGroup);
        this.jobName = jobName;
        this.jobGroup = jobGroup;
        this.description = description;
        this.nextFireTime = nextFireTime;
        this.prevFireTime = prevFireTime;
        this.priority = priority;
        this.triggerState = triggerState;
        this.triggerType = triggerType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.calendarName = calendarName;
        this.misfireInstr = misfireInstr;
        this.jobData = jobData;
    }

    /**
     *
     * @mbggenerated
     */
    public QrtzTriggers() {
        super();
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
    
     * @return description 
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
    
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 
    
     * @return next_fire_time 
     */
    public Long getNextFireTime() {
        return nextFireTime;
    }

    /**
     * 
    
     * @param nextFireTime 
     */
    public void setNextFireTime(Long nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    /**
     * 
    
     * @return prev_fire_time 
     */
    public Long getPrevFireTime() {
        return prevFireTime;
    }

    /**
     * 
    
     * @param prevFireTime 
     */
    public void setPrevFireTime(Long prevFireTime) {
        this.prevFireTime = prevFireTime;
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
    
     * @return trigger_state 
     */
    public String getTriggerState() {
        return triggerState;
    }

    /**
     * 
    
     * @param triggerState 
     */
    public void setTriggerState(String triggerState) {
        this.triggerState = triggerState == null ? null : triggerState.trim();
    }

    /**
     * 
    
     * @return trigger_type 
     */
    public String getTriggerType() {
        return triggerType;
    }

    /**
     * 
    
     * @param triggerType 
     */
    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType == null ? null : triggerType.trim();
    }

    /**
     * 
    
     * @return start_time 
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * 
    
     * @param startTime 
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * 
    
     * @return end_time 
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * 
    
     * @param endTime 
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * 
    
     * @return calendar_name 
     */
    public String getCalendarName() {
        return calendarName;
    }

    /**
     * 
    
     * @param calendarName 
     */
    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName == null ? null : calendarName.trim();
    }

    /**
     * 
    
     * @return misfire_instr 
     */
    public Short getMisfireInstr() {
        return misfireInstr;
    }

    /**
     * 
    
     * @param misfireInstr 
     */
    public void setMisfireInstr(Short misfireInstr) {
        this.misfireInstr = misfireInstr;
    }

    /**
     * 
    
     * @return job_data 
     */
    public byte[] getJobData() {
        return jobData;
    }

    /**
     * 
    
     * @param jobData 
     */
    public void setJobData(byte[] jobData) {
        this.jobData = jobData;
    }
}