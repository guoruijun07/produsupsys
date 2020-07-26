package com.ruoyi.common.bean.po;

public class QrtzLocksKey {
    /**
     *  sched_name
     */
    private String schedName;

    /**
     *  lock_name
     */
    private String lockName;

    /**
     *
     * @mbggenerated
     */
    public QrtzLocksKey(String schedName, String lockName) {
        this.schedName = schedName;
        this.lockName = lockName;
    }

    /**
     *
     * @mbggenerated
     */
    public QrtzLocksKey() {
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
    
     * @return lock_name 
     */
    public String getLockName() {
        return lockName;
    }

    /**
     * 
    
     * @param lockName 
     */
    public void setLockName(String lockName) {
        this.lockName = lockName == null ? null : lockName.trim();
    }
}