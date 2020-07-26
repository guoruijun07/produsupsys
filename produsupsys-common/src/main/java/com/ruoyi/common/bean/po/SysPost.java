package com.ruoyi.common.bean.po;

public class SysPost {
    /**
     * 岗位ID post_id
     */
    private Long postId;

    /**
     * 岗位编码 post_code
     */
    private String postCode;

    /**
     * 岗位名称 post_name
     */
    private String postName;

    /**
     * 显示顺序 post_sort
     */
    private Integer postSort;

    /**
     * 状态（0正常 1停用） status
     */
    private String status;

    /**
     * 创建者 create_by
     */
    private String createBy;

    /**
     * 创建时间 create_time
     */
    private java.util.Date createTime;

    /**
     * 更新者 update_by
     */
    private String updateBy;

    /**
     * 更新时间 update_time
     */
    private java.util.Date updateTime;

    /**
     * 备注 remark
     */
    private String remark;

    /**
     *
     * @mbggenerated
     */
    public SysPost(Long postId, String postCode, String postName, Integer postSort, String status, String createBy, java.util.Date createTime, String updateBy, java.util.Date updateTime, String remark) {
        this.postId = postId;
        this.postCode = postCode;
        this.postName = postName;
        this.postSort = postSort;
        this.status = status;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.remark = remark;
    }

    /**
     *
     * @mbggenerated
     */
    public SysPost() {
        super();
    }

    /**
     * 岗位ID

     * @return post_id 岗位ID
     */
    public Long getPostId() {
        return postId;
    }

    /**
     * 岗位ID

     * @param postId 岗位ID
     */
    public void setPostId(Long postId) {
        this.postId = postId;
    }

    /**
     * 岗位编码

     * @return post_code 岗位编码
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * 岗位编码

     * @param postCode 岗位编码
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    /**
     * 岗位名称

     * @return post_name 岗位名称
     */
    public String getPostName() {
        return postName;
    }

    /**
     * 岗位名称

     * @param postName 岗位名称
     */
    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    /**
     * 显示顺序

     * @return post_sort 显示顺序
     */
    public Integer getPostSort() {
        return postSort;
    }

    /**
     * 显示顺序

     * @param postSort 显示顺序
     */
    public void setPostSort(Integer postSort) {
        this.postSort = postSort;
    }

    /**
     * 状态（0正常 1停用）

     * @return status 状态（0正常 1停用）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态（0正常 1停用）

     * @param status 状态（0正常 1停用）
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 创建者

     * @return create_by 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建者

     * @param createBy 创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
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

    /**
     * 更新者

     * @return update_by 更新者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新者

     * @param updateBy 更新者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 更新时间

     * @return update_time 更新时间
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间

     * @param updateTime 更新时间
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
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