package com.ruoyi.common.bean.po;

public class SysUserPostKey {
    /**
     * 用户ID user_id
     */
    private Long userId;

    /**
     * 岗位ID post_id
     */
    private Long postId;

    /**
     *
     * @mbggenerated
     */
    public SysUserPostKey(Long userId, Long postId) {
        this.userId = userId;
        this.postId = postId;
    }

    /**
     *
     * @mbggenerated
     */
    public SysUserPostKey() {
        super();
    }

    /**
     * 用户ID
    
     * @return user_id 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID
    
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
}