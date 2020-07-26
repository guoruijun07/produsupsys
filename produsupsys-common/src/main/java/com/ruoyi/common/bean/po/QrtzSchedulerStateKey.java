package com.ruoyi.common.bean.po;

public class QrtzSchedulerStateKey {
    /**
     *  sched_name
     */
    private String schedName;

    /**
     *  instance_name
     */
    private String instanceName;

    /**
     *
     * @mbggenerated
     */
    public QrtzSchedulerStateKey(String schedName, String instanceName) {
        this.schedName = schedName;
        this.instanceName = instanceName;
    }

    /**
     *
     * @mbggenerated
     */
    public QrtzSchedulerStateKey() {
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
}