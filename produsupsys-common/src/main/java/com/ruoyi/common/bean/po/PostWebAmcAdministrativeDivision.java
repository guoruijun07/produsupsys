package com.ruoyi.common.bean.po;

public class PostWebAmcAdministrativeDivision {
    /**
     *  id
     */
    private Integer id;

    /**
     * 省名称 provicne_name
     */
    private String provicneName;

    /**
     * 省代码 provicne_code
     */
    private String provicneCode;

    /**
     * 市名称 city_name
     */
    private String cityName;

    /**
     * 市代码 city_code
     */
    private String cityCode;

    /**
     * 区名称 county_name
     */
    private String countyName;

    /**
     *  county_code
     */
    private String countyCode;

    /**
     *
     * @mbggenerated
     */
    public PostWebAmcAdministrativeDivision(Integer id, String provicneName, String provicneCode, String cityName, String cityCode, String countyName, String countyCode) {
        this.id = id;
        this.provicneName = provicneName;
        this.provicneCode = provicneCode;
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.countyName = countyName;
        this.countyCode = countyCode;
    }

    /**
     *
     * @mbggenerated
     */
    public PostWebAmcAdministrativeDivision() {
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
     * 省名称
    
     * @return provicne_name 省名称
     */
    public String getProvicneName() {
        return provicneName;
    }

    /**
     * 省名称
    
     * @param provicneName 省名称
     */
    public void setProvicneName(String provicneName) {
        this.provicneName = provicneName == null ? null : provicneName.trim();
    }

    /**
     * 省代码
    
     * @return provicne_code 省代码
     */
    public String getProvicneCode() {
        return provicneCode;
    }

    /**
     * 省代码
    
     * @param provicneCode 省代码
     */
    public void setProvicneCode(String provicneCode) {
        this.provicneCode = provicneCode == null ? null : provicneCode.trim();
    }

    /**
     * 市名称
    
     * @return city_name 市名称
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 市名称
    
     * @param cityName 市名称
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * 市代码
    
     * @return city_code 市代码
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 市代码
    
     * @param cityCode 市代码
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * 区名称
    
     * @return county_name 区名称
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * 区名称
    
     * @param countyName 区名称
     */
    public void setCountyName(String countyName) {
        this.countyName = countyName == null ? null : countyName.trim();
    }

    /**
     * 
    
     * @return county_code 
     */
    public String getCountyCode() {
        return countyCode;
    }

    /**
     * 
    
     * @param countyCode 
     */
    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode == null ? null : countyCode.trim();
    }
}