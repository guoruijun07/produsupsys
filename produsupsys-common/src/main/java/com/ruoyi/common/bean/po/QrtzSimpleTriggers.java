package com.ruoyi.common.bean.po;

public class QrtzSimpleTriggers extends QrtzSimpleTriggersKey {
    /**
     *  repeat_count
     */
    private Long repeatCount;

    /**
     *  repeat_interval
     */
    private Long repeatInterval;

    /**
     *  times_triggered
     */
    private Long timesTriggered;

    /**
     *
     * @mbggenerated
     */
    public QrtzSimpleTriggers(String schedName, String triggerName, String triggerGroup, Long repeatCount, Long repeatInterval, Long timesTriggered) {
        super(schedName, triggerName, triggerGroup);
        this.repeatCount = repeatCount;
        this.repeatInterval = repeatInterval;
        this.timesTriggered = timesTriggered;
    }

    /**
     *
     * @mbggenerated
     */
    public QrtzSimpleTriggers() {
        super();
    }

    /**
     * 
    
     * @return repeat_count 
     */
    public Long getRepeatCount() {
        return repeatCount;
    }

    /**
     * 
    
     * @param repeatCount 
     */
    public void setRepeatCount(Long repeatCount) {
        this.repeatCount = repeatCount;
    }

    /**
     * 
    
     * @return repeat_interval 
     */
    public Long getRepeatInterval() {
        return repeatInterval;
    }

    /**
     * 
    
     * @param repeatInterval 
     */
    public void setRepeatInterval(Long repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    /**
     * 
    
     * @return times_triggered 
     */
    public Long getTimesTriggered() {
        return timesTriggered;
    }

    /**
     * 
    
     * @param timesTriggered 
     */
    public void setTimesTriggered(Long timesTriggered) {
        this.timesTriggered = timesTriggered;
    }
}