package com.ruoyi.common.bean.po;

public class SysNotice {
    /**
     * 公告ID notice_id
     */
    private Integer noticeId;

    /**
     * 公告标题 notice_title
     */
    private String noticeTitle;

    /**
     * 公告类型（1通知 2公告） notice_type
     */
    private String noticeType;

    /**
     * 公告内容 notice_content
     */
    private String noticeContent;

    /**
     * 公告状态（0正常 1关闭） status
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
    public SysNotice(Integer noticeId, String noticeTitle, String noticeType, String noticeContent, String status, String createBy, java.util.Date createTime, String updateBy, java.util.Date updateTime, String remark) {
        this.noticeId = noticeId;
        this.noticeTitle = noticeTitle;
        this.noticeType = noticeType;
        this.noticeContent = noticeContent;
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
    public SysNotice() {
        super();
    }

    /**
     * 公告ID

     * @return notice_id 公告ID
     */
    public Integer getNoticeId() {
        return noticeId;
    }

    /**
     * 公告ID

     * @param noticeId 公告ID
     */
    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    /**
     * 公告标题

     * @return notice_title 公告标题
     */
    public String getNoticeTitle() {
        return noticeTitle;
    }

    /**
     * 公告标题

     * @param noticeTitle 公告标题
     */
    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    /**
     * 公告类型（1通知 2公告）

     * @return notice_type 公告类型（1通知 2公告）
     */
    public String getNoticeType() {
        return noticeType;
    }

    /**
     * 公告类型（1通知 2公告）

     * @param noticeType 公告类型（1通知 2公告）
     */
    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType == null ? null : noticeType.trim();
    }

    /**
     * 公告内容

     * @return notice_content 公告内容
     */
    public String getNoticeContent() {
        return noticeContent;
    }

    /**
     * 公告内容

     * @param noticeContent 公告内容
     */
    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent == null ? null : noticeContent.trim();
    }

    /**
     * 公告状态（0正常 1关闭）

     * @return status 公告状态（0正常 1关闭）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 公告状态（0正常 1关闭）

     * @param status 公告状态（0正常 1关闭）
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