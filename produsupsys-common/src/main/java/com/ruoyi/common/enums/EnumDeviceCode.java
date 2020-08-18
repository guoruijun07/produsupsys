package com.ruoyi.common.enums;

import java.util.Arrays;

public enum EnumDeviceCode {

    PC(1, "PC单价", "pc"),
    APP(2, "APP单价", "app"),
    UNKOWN_ERROR(2, "未知系统错误", "Unknown error");

    private int code;
    private String explainChInfo;
    private String explainEnInfo;

    EnumDeviceCode(int code, String explainChInfo, String explainEnInfo) {
        this.code = code;
        this.explainChInfo = explainChInfo;
        this.explainEnInfo = explainEnInfo;
    }

    public String getExplainChInfo() {
        return explainChInfo;
    }

    public String getExplainEnInfo() {
        return explainEnInfo;
    }

    public int getCode() {
        return code;
    }

    public static EnumDeviceCode getByCode(int code) {
        EnumDeviceCode[] enumResultCodes = EnumDeviceCode.values();
        EnumDeviceCode result = Arrays.asList(enumResultCodes).stream()
                .filter(enumResCode -> enumResCode.getCode() == code)
                .findFirst().orElse(EnumDeviceCode.UNKOWN_ERROR);
        return result;
    }

    public static EnumDeviceCode getByCode(String codeStr) {
        int code = 10001;
        try{
            code = Integer.parseInt(codeStr);
        }catch (Exception e){
            return EnumDeviceCode.UNKOWN_ERROR;
        }
        return getByCode(code);
    }
}
