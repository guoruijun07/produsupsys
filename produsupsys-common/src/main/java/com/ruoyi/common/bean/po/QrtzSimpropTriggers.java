package com.ruoyi.common.bean.po;

public class QrtzSimpropTriggers extends QrtzSimpropTriggersKey {
    /**
     *  str_prop_1
     */
    private String strProp1;

    /**
     *  str_prop_2
     */
    private String strProp2;

    /**
     *  str_prop_3
     */
    private String strProp3;

    /**
     *  int_prop_1
     */
    private Integer intProp1;

    /**
     *  int_prop_2
     */
    private Integer intProp2;

    /**
     *  long_prop_1
     */
    private Long longProp1;

    /**
     *  long_prop_2
     */
    private Long longProp2;

    /**
     *  dec_prop_1
     */
    private java.math.BigDecimal decProp1;

    /**
     *  dec_prop_2
     */
    private java.math.BigDecimal decProp2;

    /**
     *  bool_prop_1
     */
    private String boolProp1;

    /**
     *  bool_prop_2
     */
    private String boolProp2;

    /**
     *
     * @mbggenerated
     */
    public QrtzSimpropTriggers(String schedName, String triggerName, String triggerGroup, String strProp1, String strProp2, String strProp3, Integer intProp1, Integer intProp2, Long longProp1, Long longProp2, java.math.BigDecimal decProp1, java.math.BigDecimal decProp2, String boolProp1, String boolProp2) {
        super(schedName, triggerName, triggerGroup);
        this.strProp1 = strProp1;
        this.strProp2 = strProp2;
        this.strProp3 = strProp3;
        this.intProp1 = intProp1;
        this.intProp2 = intProp2;
        this.longProp1 = longProp1;
        this.longProp2 = longProp2;
        this.decProp1 = decProp1;
        this.decProp2 = decProp2;
        this.boolProp1 = boolProp1;
        this.boolProp2 = boolProp2;
    }

    /**
     *
     * @mbggenerated
     */
    public QrtzSimpropTriggers() {
        super();
    }

    /**
     *

     * @return str_prop_1
     */
    public String getStrProp1() {
        return strProp1;
    }

    /**
     *

     * @param strProp1
     */
    public void setStrProp1(String strProp1) {
        this.strProp1 = strProp1 == null ? null : strProp1.trim();
    }

    /**
     *

     * @return str_prop_2
     */
    public String getStrProp2() {
        return strProp2;
    }

    /**
     *

     * @param strProp2
     */
    public void setStrProp2(String strProp2) {
        this.strProp2 = strProp2 == null ? null : strProp2.trim();
    }

    /**
     *

     * @return str_prop_3
     */
    public String getStrProp3() {
        return strProp3;
    }

    /**
     *

     * @param strProp3
     */
    public void setStrProp3(String strProp3) {
        this.strProp3 = strProp3 == null ? null : strProp3.trim();
    }

    /**
     *

     * @return int_prop_1
     */
    public Integer getIntProp1() {
        return intProp1;
    }

    /**
     *

     * @param intProp1
     */
    public void setIntProp1(Integer intProp1) {
        this.intProp1 = intProp1;
    }

    /**
     *

     * @return int_prop_2
     */
    public Integer getIntProp2() {
        return intProp2;
    }

    /**
     *

     * @param intProp2
     */
    public void setIntProp2(Integer intProp2) {
        this.intProp2 = intProp2;
    }

    /**
     *

     * @return long_prop_1
     */
    public Long getLongProp1() {
        return longProp1;
    }

    /**
     *

     * @param longProp1
     */
    public void setLongProp1(Long longProp1) {
        this.longProp1 = longProp1;
    }

    /**
     *

     * @return long_prop_2
     */
    public Long getLongProp2() {
        return longProp2;
    }

    /**
     *

     * @param longProp2
     */
    public void setLongProp2(Long longProp2) {
        this.longProp2 = longProp2;
    }

    /**
     *

     * @return dec_prop_1
     */
    public java.math.BigDecimal getDecProp1() {
        return decProp1;
    }

    /**
     *

     * @param decProp1
     */
    public void setDecProp1(java.math.BigDecimal decProp1) {
        this.decProp1 = decProp1;
    }

    /**
     *

     * @return dec_prop_2
     */
    public java.math.BigDecimal getDecProp2() {
        return decProp2;
    }

    /**
     *

     * @param decProp2
     */
    public void setDecProp2(java.math.BigDecimal decProp2) {
        this.decProp2 = decProp2;
    }

    /**
     * 
    
     * @return bool_prop_1 
     */
    public String getBoolProp1() {
        return boolProp1;
    }

    /**
     * 
    
     * @param boolProp1 
     */
    public void setBoolProp1(String boolProp1) {
        this.boolProp1 = boolProp1 == null ? null : boolProp1.trim();
    }

    /**
     * 
    
     * @return bool_prop_2 
     */
    public String getBoolProp2() {
        return boolProp2;
    }

    /**
     * 
    
     * @param boolProp2 
     */
    public void setBoolProp2(String boolProp2) {
        this.boolProp2 = boolProp2 == null ? null : boolProp2.trim();
    }
}