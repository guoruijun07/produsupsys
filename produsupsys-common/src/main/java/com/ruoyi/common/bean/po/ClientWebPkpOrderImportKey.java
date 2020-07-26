package com.ruoyi.common.bean.po;

public class ClientWebPkpOrderImportKey {
    /**
     *  id
     */
    private Long id;

    /**
     * 付费情况 0未付费 1付费 is_fee
     */
    private String isFee;

    /**
     *
     * @mbggenerated
     */
    public ClientWebPkpOrderImportKey(Long id, String isFee) {
        this.id = id;
        this.isFee = isFee;
    }

    /**
     *
     * @mbggenerated
     */
    public ClientWebPkpOrderImportKey() {
        super();
    }

    /**
     * 
    
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
    
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 付费情况 0未付费 1付费
    
     * @return is_fee 付费情况 0未付费 1付费
     */
    public String getIsFee() {
        return isFee;
    }

    /**
     * 付费情况 0未付费 1付费
    
     * @param isFee 付费情况 0未付费 1付费
     */
    public void setIsFee(String isFee) {
        this.isFee = isFee == null ? null : isFee.trim();
    }
}