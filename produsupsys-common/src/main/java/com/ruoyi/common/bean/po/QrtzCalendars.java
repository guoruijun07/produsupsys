package com.ruoyi.common.bean.po;

public class QrtzCalendars extends QrtzCalendarsKey {
    /**
     *  calendar
     */
    private byte[] calendar;

    /**
     *
     * @mbggenerated
     */
    public QrtzCalendars(String schedName, String calendarName, byte[] calendar) {
        super(schedName, calendarName);
        this.calendar = calendar;
    }

    /**
     *
     * @mbggenerated
     */
    public QrtzCalendars() {
        super();
    }

    /**
     * 
    
     * @return calendar 
     */
    public byte[] getCalendar() {
        return calendar;
    }

    /**
     * 
    
     * @param calendar 
     */
    public void setCalendar(byte[] calendar) {
        this.calendar = calendar;
    }
}