package com.ruoyi.common.bean.po;

public class QrtzCalendarsKey {
    /**
     *  sched_name
     */
    private String schedName;

    /**
     *  calendar_name
     */
    private String calendarName;

    /**
     *
     * @mbggenerated
     */
    public QrtzCalendarsKey(String schedName, String calendarName) {
        this.schedName = schedName;
        this.calendarName = calendarName;
    }

    /**
     *
     * @mbggenerated
     */
    public QrtzCalendarsKey() {
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
    
     * @return calendar_name 
     */
    public String getCalendarName() {
        return calendarName;
    }

    /**
     * 
    
     * @param calendarName 
     */
    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName == null ? null : calendarName.trim();
    }
}