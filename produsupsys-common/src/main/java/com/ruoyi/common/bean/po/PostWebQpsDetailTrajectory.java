package com.ruoyi.common.bean.po;

public class PostWebQpsDetailTrajectory {
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
     *  opOrgSimpleName
     */
    private String oporgsimplename;

    /**
     * 操作码 opCode
     */
    private String opcode;

    /**
     * 操作名 opName
     */
    private String opname;

    /**
     * 操作描述 desc
     */
    private String desc;

    /**
     *  operatorName
     */
    private String operatorname;

    /**
     * 电话 telephone
     */
    private String telephone;

    /**
     *  source
     */
    private String source;

    /**
     * 备注 remark
     */
    private String remark;

    /**
     *
     * @mbggenerated
     */
    public PostWebQpsDetailTrajectory(Integer id, String traceno, java.util.Date optime, String oporgsimplename, String opcode, String opname, String desc, String operatorname, String telephone, String source, String remark) {
        this.id = id;
        this.traceno = traceno;
        this.optime = optime;
        this.oporgsimplename = oporgsimplename;
        this.opcode = opcode;
        this.opname = opname;
        this.desc = desc;
        this.operatorname = operatorname;
        this.telephone = telephone;
        this.source = source;
        this.remark = remark;
    }

    /**
     *
     * @mbggenerated
     */
    public PostWebQpsDetailTrajectory() {
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
    
     * @return desc 操作描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 操作描述
    
     * @param desc 操作描述
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * 
    
     * @return operatorName 
     */
    public String getOperatorname() {
        return operatorname;
    }

    /**
     * 
    
     * @param operatorname 
     */
    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname == null ? null : operatorname.trim();
    }

    /**
     * 电话
    
     * @return telephone 电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 电话
    
     * @param telephone 电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * 
    
     * @return source 
     */
    public String getSource() {
        return source;
    }

    /**
     * 
    
     * @param source 
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * 备注
    
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
    
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}