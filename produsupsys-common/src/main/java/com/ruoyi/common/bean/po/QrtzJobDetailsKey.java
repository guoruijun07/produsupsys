package com.ruoyi.common.bean.po;

public class QrtzJobDetailsKey {
    /**
     *  sched_name
     */
    private String schedName;

    /**
     *  job_name
     */
    private String jobName;

    /**
     *  job_group
     */
    private String jobGroup;

    /**
     *
     * @mbggenerated
     */
    public QrtzJobDetailsKey(String schedName, String jobName, String jobGroup) {
        this.schedName = schedName;
        this.jobName = jobName;
        this.jobGroup = jobGroup;
    }

    /**
     *
     * @mbggenerated
     */
    public QrtzJobDetailsKey() {
        super();
    }

    /**
     * 
    
     * @return sched_name 
     */
    public String getSchedName() {
        return schedName;
    }

    /**
     * 
    
     * @param schedName 
     */
    public void setSchedName(String schedName) {
        this.schedName = schedName == null ? null : schedName.trim();
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
}