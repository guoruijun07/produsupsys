package com.ruoyi.common.bean.po;

public class QrtzFiredTriggersKey {
    /**
     *  sched_name
     */
    private String schedName;

    /**
     *  entry_id
     */
    private String entryId;

    /**
     *
     * @mbggenerated
     */
    public QrtzFiredTriggersKey(String schedName, String entryId) {
        this.schedName = schedName;
        this.entryId = entryId;
    }

    /**
     *
     * @mbggenerated
     */
    public QrtzFiredTriggersKey() {
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
    
     * @return entry_id 
     */
    public String getEntryId() {
        return entryId;
    }

    /**
     * 
    
     * @param entryId 
     */
    public void setEntryId(String entryId) {
        this.entryId = entryId == null ? null : entryId.trim();
    }
}