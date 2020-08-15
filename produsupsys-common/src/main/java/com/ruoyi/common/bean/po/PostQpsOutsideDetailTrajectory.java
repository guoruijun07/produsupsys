package com.ruoyi.common.bean.po;

public class PostQpsOutsideDetailTrajectory {
    /**
     *  id
     */
    private Integer id;

    /**
     * 运单号 traceNo
     */
    private String traceno;

    /**
     * 操作时间 opTime
     */
    private java.util.Date optime;

    /**
     * 操作码 opCode
     */
    private String opcode;

    /**
     * 操作名 opName
     */
    private String opname;

    /**
     * 操作描述 opDesc
     */
    private String opdesc;

    /**
     * 操作网点省名 opOrgProvName
     */
    private String oporgprovname;

    /**
     * 操作网点城市 opOrgCity
     */
    private String oporgcity;

    /**
     * 操作网点编码 opOrgCode
     */
    private String oporgcode;

    /**
     * 操作网点名称 opOrgName
     */
    private String oporgname;

    /**
     * 操作员工号 operatorNo
     */
    private String operatorno;

    /**
     * 操作员工名称 operatorName
     */
    private String operatorname;

    /**
     *
     * @mbggenerated
     */
    public PostQpsOutsideDetailTrajectory(Integer id, String traceno, java.util.Date optime, String opcode, String opname, String opdesc, String oporgprovname, String oporgcity, String oporgcode, String oporgname, String operatorno, String operatorname) {
        this.id = id;
        this.traceno = traceno;
        this.optime = optime;
        this.opcode = opcode;
        this.opname = opname;
        this.opdesc = opdesc;
        this.oporgprovname = oporgprovname;
        this.oporgcity = oporgcity;
        this.oporgcode = oporgcode;
        this.oporgname = oporgname;
        this.operatorno = operatorno;
        this.operatorname = operatorname;
    }

    /**
     *
     * @mbggenerated
     */
    public PostQpsOutsideDetailTrajectory() {
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
     * 运单号

     * @return traceNo 运单号
     */
    public String getTraceno() {
        return traceno;
    }

    /**
     * 运单号

     * @param traceno 运单号
     */
    public void setTraceno(String traceno) {
        this.traceno = traceno == null ? null : traceno.trim();
    }

    /**
     * 操作时间

     * @return opTime 操作时间
     */
    public java.util.Date getOptime() {
        return optime;
    }

    /**
     * 操作时间

     * @param optime 操作时间
     */
    public void setOptime(java.util.Date optime) {
        this.optime = optime;
    }

    /**
     * 操作码
    
     * @return opCode 操作码
     */
    public String getOpcode() {
        return opcode;
    }

    /**
     * 操作码
    
     * @param opcode 操作码
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode == null ? null : opcode.trim();
    }

    /**
     * 操作名
    
     * @return opName 操作名
     */
    public String getOpname() {
        return opname;
    }

    /**
     * 操作名
    
     * @param opname 操作名
     */
    public void setOpname(String opname) {
        this.opname = opname == null ? null : opname.trim();
    }

    /**
     * 操作描述
    
     * @return opDesc 操作描述
     */
    public String getOpdesc() {
        return opdesc;
    }

    /**
     * 操作描述
    
     * @param opdesc 操作描述
     */
    public void setOpdesc(String opdesc) {
        this.opdesc = opdesc == null ? null : opdesc.trim();
    }

    /**
     * 操作网点省名
    
     * @return opOrgProvName 操作网点省名
     */
    public String getOporgprovname() {
        return oporgprovname;
    }

    /**
     * 操作网点省名
    
     * @param oporgprovname 操作网点省名
     */
    public void setOporgprovname(String oporgprovname) {
        this.oporgprovname = oporgprovname == null ? null : oporgprovname.trim();
    }

    /**
     * 操作网点城市
    
     * @return opOrgCity 操作网点城市
     */
    public String getOporgcity() {
        return oporgcity;
    }

    /**
     * 操作网点城市
    
     * @param oporgcity 操作网点城市
     */
    public void setOporgcity(String oporgcity) {
        this.oporgcity = oporgcity == null ? null : oporgcity.trim();
    }

    /**
     * 操作网点编码
    
     * @return opOrgCode 操作网点编码
     */
    public String getOporgcode() {
        return oporgcode;
    }

    /**
     * 操作网点编码
    
     * @param oporgcode 操作网点编码
     */
    public void setOporgcode(String oporgcode) {
        this.oporgcode = oporgcode == null ? null : oporgcode.trim();
    }

    /**
     * 操作网点名称
    
     * @return opOrgName 操作网点名称
     */
    public String getOporgname() {
        return oporgname;
    }

    /**
     * 操作网点名称
    
     * @param oporgname 操作网点名称
     */
    public void setOporgname(String oporgname) {
        this.oporgname = oporgname == null ? null : oporgname.trim();
    }

    /**
     * 操作员工号
    
     * @return operatorNo 操作员工号
     */
    public String getOperatorno() {
        return operatorno;
    }

    /**
     * 操作员工号
    
     * @param operatorno 操作员工号
     */
    public void setOperatorno(String operatorno) {
        this.operatorno = operatorno == null ? null : operatorno.trim();
    }

    /**
     * 操作员工名称
    
     * @return operatorName 操作员工名称
     */
    public String getOperatorname() {
        return operatorname;
    }

    /**
     * 操作员工名称
    
     * @param operatorname 操作员工名称
     */
    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname == null ? null : operatorname.trim();
    }
}