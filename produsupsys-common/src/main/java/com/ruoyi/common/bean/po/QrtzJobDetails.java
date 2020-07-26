package com.ruoyi.common.bean.po;

public class QrtzJobDetails extends QrtzJobDetailsKey {
    /**
     *  description
     */
    private String description;

    /**
     *  job_class_name
     */
    private String jobClassName;

    /**
     *  is_durable
     */
    private String isDurable;

    /**
     *  is_nonconcurrent
     */
    private String isNonconcurrent;

    /**
     *  is_update_data
     */
    private String isUpdateData;

    /**
     *  requests_recovery
     */
    private String requestsRecovery;

    /**
     *  job_data
     */
    private byte[] jobData;

    /**
     *
     * @mbggenerated
     */
    public QrtzJobDetails(String schedName, String jobName, String jobGroup, String description, String jobClassName, String isDurable, String isNonconcurrent, String isUpdateData, String requestsRecovery, byte[] jobData) {
        super(schedName, jobName, jobGroup);
        this.description = description;
        this.jobClassName = jobClassName;
        this.isDurable = isDurable;
        this.isNonconcurrent = isNonconcurrent;
        this.isUpdateData = isUpdateData;
        this.requestsRecovery = requestsRecovery;
        this.jobData = jobData;
    }

    /**
     *
     * @mbggenerated
     */
    public QrtzJobDetails() {
        super();
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
    
     * @return job_class_name 
     */
    public String getJobClassName() {
        return jobClassName;
    }

    /**
     * 
    
     * @param jobClassName 
     */
    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName == null ? null : jobClassName.trim();
    }

    /**
     * 
    
     * @return is_durable 
     */
    public String getIsDurable() {
        return isDurable;
    }

    /**
     * 
    
     * @param isDurable 
     */
    public void setIsDurable(String isDurable) {
        this.isDurable = isDurable == null ? null : isDurable.trim();
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
    
     * @return is_update_data 
     */
    public String getIsUpdateData() {
        return isUpdateData;
    }

    /**
     * 
    
     * @param isUpdateData 
     */
    public void setIsUpdateData(String isUpdateData) {
        this.isUpdateData = isUpdateData == null ? null : isUpdateData.trim();
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