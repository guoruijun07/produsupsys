package com.ruoyi.common.bean.po;

public class SysJobKey {
    /**
     * 任务ID job_id
     */
    private Long jobId;

    /**
     * 任务名称 job_name
     */
    private String jobName;

    /**
     * 任务组名 job_group
     */
    private String jobGroup;

    /**
     *
     * @mbggenerated
     */
    public SysJobKey(Long jobId, String jobName, String jobGroup) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.jobGroup = jobGroup;
    }

    /**
     *
     * @mbggenerated
     */
    public SysJobKey() {
        super();
    }

    /**
     * 任务ID
    
     * @return job_id 任务ID
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * 任务ID
    
     * @param jobId 任务ID
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
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
}