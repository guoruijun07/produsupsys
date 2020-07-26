package com.ruoyi.common.bean.po;

public class QrtzPausedTriggerGrpsKey {
    /**
     *  sched_name
     */
    private String schedName;

    /**
     *  trigger_group
     */
    private String triggerGroup;

    /**
     *
     * @mbggenerated
     */
    public QrtzPausedTriggerGrpsKey(String schedName, String triggerGroup) {
        this.schedName = schedName;
        this.triggerGroup = triggerGroup;
    }

    /**
     *
     * @mbggenerated
     */
    public QrtzPausedTriggerGrpsKey() {
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