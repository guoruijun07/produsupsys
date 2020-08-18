package com.ruoyi.common.enums;

import java.util.Arrays;

public enum EnumMenuCode {

    MENU_SORTING(1, "分拣码批量匹配", "sorting"),
    MENU_ADDRESS(2, "地址批量匹配", "address"),
    UNKOWN_ERROR(2, "未知系统错误", "Unknown error");

    private int code;
    private String explainChInfo;
    private String explainEnInfo;

    EnumMenuCode(int code, String explainChInfo, String explainEnInfo) {
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

    public static EnumMenuCode getByCode(int code) {
        EnumMenuCode[] enumResultCodes = EnumMenuCode.values();
        EnumMenuCode result = Arrays.asList(enumResultCodes).stream()
                .filter(enumResCode -> enumResCode.getCode() == code)
                .findFirst().orElse(EnumMenuCode.UNKOWN_ERROR);
        return result;
    }

    public static EnumMenuCode getByCode(String codeStr) {
        int code = 10001;
        try{
            code = Integer.parseInt(codeStr);
        }catch (Exception e){
            return EnumMenuCode.UNKOWN_ERROR;
        }
        return getByCode(code);
    }
}
