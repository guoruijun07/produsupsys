package com.ruoyi.common.bean.po;

public class QrtzSchedulerState extends QrtzSchedulerStateKey {
    /**
     *  last_checkin_time
     */
    private Long lastCheckinTime;

    /**
     *  checkin_interval
     */
    private Long checkinInterval;

    /**
     *
     * @mbggenerated
     */
    public QrtzSchedulerState(String schedName, String instanceName, Long lastCheckinTime, Long checkinInterval) {
        super(schedName, instanceName);
        this.lastCheckinTime = lastCheckinTime;
        this.checkinInterval = checkinInterval;
    }

    /**
     *
     * @mbggenerated
     */
    public QrtzSchedulerState() {
        super();
    }

    /**
     * 
    
     * @return last_checkin_time 
     */
    public Long getLastCheckinTime() {
        return lastCheckinTime;
    }

    /**
     * 
    
     * @param lastCheckinTime 
     */
    public void setLastCheckinTime(Long lastCheckinTime) {
        this.lastCheckinTime = lastCheckinTime;
    }

    /**
     * 
    
     * @return checkin_interval 
     */
    public Long getCheckinInterval() {
        return checkinInterval;
    }

    /**
     * 
    
     * @param checkinInterval 
     */
    public void setCheckinInterval(Long checkinInterval) {
        this.checkinInterval = checkinInterval;
    }
}