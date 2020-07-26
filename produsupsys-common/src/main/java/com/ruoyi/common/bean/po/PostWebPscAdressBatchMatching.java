package com.ruoyi.common.bean.po;

public class PostWebPscAdressBatchMatching {
    /**
     * 主键 id
     */
    private Integer id;

    /**
     * 批次号 batch_no
     */
    private String batchNo;

    /**
     * 文件名 file_name
     */
    private String fileName;

    /**
     * 总记录数 total_num
     */
    private Integer totalNum;

    /**
     * 匹配成功数 success_num
     */
    private Integer successNum;

    /**
     * 金额 money
     */
    private java.math.BigDecimal money;

    /**
     * 匹配状态:0,未匹配1,已匹配 status
     */
    private Integer status;

    /**
     * 用户id user_id
     */
    private Integer userId;

    /**
     * 修改时间 modify_time
     */
    private java.util.Date modifyTime;

    /**
     * 创建时间 create_time
     */
    private java.util.Date createTime;

    /**
     *
     * @mbggenerated
     */
    public PostWebPscAdressBatchMatching(Integer id, String batchNo, String fileName, Integer totalNum, Integer successNum, java.math.BigDecimal money, Integer status, Integer userId, java.util.Date modifyTime, java.util.Date createTime) {
        this.id = id;
        this.batchNo = batchNo;
        this.fileName = fileName;
        this.totalNum = totalNum;
        this.successNum = successNum;
        this.money = money;
        this.status = status;
        this.userId = userId;
        this.modifyTime = modifyTime;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated
     */
    public PostWebPscAdressBatchMatching() {
        super();
    }

    /**
     * 主键

     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键

     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 批次号

     * @return batch_no 批次号
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * 批次号

     * @param batchNo 批次号
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    /**
     * 文件名

     * @return file_name 文件名
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 文件名

     * @param fileName 文件名
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * 总记录数

     * @return total_num 总记录数
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    /**
     * 总记录数

     * @param totalNum 总记录数
     */
    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    /**
     * 匹配成功数

     * @return success_num 匹配成功数
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    /**
     * 匹配成功数

     * @param successNum 匹配成功数
     */
    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    /**
     * 金额

     * @return money 金额
     */
    public java.math.BigDecimal getMoney() {
        return money;
    }

    /**
     * 金额

     * @param money 金额
     */
    public void setMoney(java.math.BigDecimal money) {
        this.money = money;
    }

    /**
     * 匹配状态:0,未匹配1,已匹配

     * @return status 匹配状态:0,未匹配1,已匹配
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 匹配状态:0,未匹配1,已匹配

     * @param status 匹配状态:0,未匹配1,已匹配
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 用户id

     * @return user_id 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户id

     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 修改时间

     * @return modify_time 修改时间
     */
    public java.util.Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间

     * @param modifyTime 修改时间
     */
    public void setModifyTime(java.util.Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 创建时间

     * @return create_time 创建时间
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间

     * @param createTime 创建时间
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }
}