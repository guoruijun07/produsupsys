package com.ruoyi.common.bean.po;

public class QrtzBlobTriggers extends QrtzBlobTriggersKey {
    /**
     *  blob_data
     */
    private byte[] blobData;

    /**
     *
     * @mbggenerated
     */
    public QrtzBlobTriggers(String schedName, String triggerName, String triggerGroup, byte[] blobData) {
        super(schedName, triggerName, triggerGroup);
        this.blobData = blobData;
    }

    /**
     *
     * @mbggenerated
     */
    public QrtzBlobTriggers() {
        super();
    }

    /**
     * 
    
     * @return blob_data 
     */
    public byte[] getBlobData() {
        return blobData;
    }

    /**
     * 
    
     * @param blobData 
     */
    public void setBlobData(byte[] blobData) {
        this.blobData = blobData;
    }
}