package com.ruoyi.common.bean.po;

public class PostWebQpsEndTrajectory {
    /**
     *  id
     */
    private Integer id;

    /**
     *  traceNo
     */
    private String traceno;

    /**
     *  opTime
     */
    private java.util.Date optime;

    /**
     *  opName
     */
    private String opname;

    /**
     *  opOrgSimpleName
     */
    private String oporgsimplename;

    /**
     *  record_length
     */
    private String recordLength;

    /**
     *
     * @mbggenerated
     */
    public PostWebQpsEndTrajectory(Integer id, String traceno, java.util.Date optime, String opname, String oporgsimplename, String recordLength) {
        this.id = id;
        this.traceno = traceno;
        this.optime = optime;
        this.opname = opname;
        this.oporgsimplename = oporgsimplename;
        this.recordLength = recordLength;
    }

    /**
     *
     * @mbggenerated
     */
    public PostWebQpsEndTrajectory() {
        super();
    }

    /**
     *

     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     *

     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *

     * @return traceNo
     */
    public String getTraceno() {
        return traceno;
    }

    /**
     *

     * @param traceno
     */
    public void setTraceno(String traceno) {
        this.traceno = traceno == null ? null : traceno.trim();
    }

    /**
     *

     * @return opTime
     */
    public java.util.Date getOptime() {
        return optime;
    }

    /**
     *

     * @param optime
     */
    public void setOptime(java.util.Date optime) {
        this.optime = optime;
    }

    /**
     * 
    
     * @return opName 
     */
    public String getOpname() {
        return opname;
    }

    /**
     * 
    
     * @param opname 
     */
    public void setOpname(String opname) {
        this.opname = opname == null ? null : opname.trim();
    }

    /**
     * 
    
     * @return opOrgSimpleName 
     */
    public String getOporgsimplename() {
        return oporgsimplename;
    }

    /**
     * 
    
     * @param oporgsimplename 
     */
    public void setOporgsimplename(String oporgsimplename) {
        this.oporgsimplename = oporgsimplename == null ? null : oporgsimplename.trim();
    }

    /**
     * 
    
     * @return record_length 
     */
    public String getRecordLength() {
        return recordLength;
    }

    /**
     * 
    
     * @param recordLength 
     */
    public void setRecordLength(String recordLength) {
        this.recordLength = recordLength == null ? null : recordLength.trim();
    }
}