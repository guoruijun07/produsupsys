package com.ruoyi.common.bean.po;

public class QrtzTriggersKey {
    /**
     *  sched_name
     */
    private String schedName;

    /**
     *  trigger_name
     */
    private String triggerName;

    /**
     *  trigger_group
     */
    private String triggerGroup;

    /**
     *
     * @mbggenerated
     */
    public QrtzTriggersKey(String schedName, String triggerName, String triggerGroup) {
        this.schedName = schedName;
        this.triggerName = triggerName;
        this.triggerGroup = triggerGroup;
    }

    /**
     *
     * @mbggenerated
     */
    public QrtzTriggersKey() {
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
}