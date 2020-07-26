package com.ruoyi.common.bean.po;

public class QrtzCronTriggers extends QrtzCronTriggersKey {
    /**
     *  cron_expression
     */
    private String cronExpression;

    /**
     *  time_zone_id
     */
    private String timeZoneId;

    /**
     *
     * @mbggenerated
     */
    public QrtzCronTriggers(String schedName, String triggerName, String triggerGroup, String cronExpression, String timeZoneId) {
        super(schedName, triggerName, triggerGroup);
        this.cronExpression = cronExpression;
        this.timeZoneId = timeZoneId;
    }

    /**
     *
     * @mbggenerated
     */
    public QrtzCronTriggers() {
        super();
    }

    /**
     * 
    
     * @return cron_expression 
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * 
    
     * @param cronExpression 
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression == null ? null : cronExpression.trim();
    }

    /**
     * 
    
     * @return time_zone_id 
     */
    public String getTimeZoneId() {
        return timeZoneId;
    }

    /**
     * 
    
     * @param timeZoneId 
     */
    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId == null ? null : timeZoneId.trim();
    }
}