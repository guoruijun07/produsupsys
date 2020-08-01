package com.ruoyi.common.utils;


import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class CommomUtils {

//    public static Date getInvalidDate() {
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.DATE, 1);
//        Date invalidDate = calendar.getTime();
//        String formatDate = DateUtils.format(new Date(), "yyyy-MM-dd 23:59:59");
//        try {
//            invalidDate = DateUtils.parseDate(formatDate);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return invalidDate;
//    }

    /**
     * 判断版本号
     */
    public static boolean isValidVersion(String version, String currentVersion){

        if(StringUtils.isEmpty(version)){
            return false;
        }
        if(Double.valueOf(currentVersion) > Double.valueOf(version)){
            return false;
        }
        return true;
    }

    /**
     * 创建目录
     * @param basePath
     * @param fileName
     * @param mobile
     * @return
     */
    public static java.io.File MakeLogDir(String basePath, String fileName, String mobile) {

        String dirPath =  basePath + mobile;

       File folder = new File(dirPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        java.io.File file = new java.io.File(basePath + mobile + File.separator + fileName);
        if (file.exists()) {
            file.delete();
        }
        return file;
    }

    static Random random=new java.util.Random();
    //获取订单号
//    public static String getOrderNo() {
//
//        int number=random.nextInt(90000)+100000;
////        return DateUtils.format(new Date(), DateUtils.DATE_FORMAT_14) +number;
//        return DateUtils.format(new Date(), DateUtils.DATE_FORMAT_14) +number;
//
//    }

    public static String getAppVersion(){

        String version = getHeader("version");
        return version;
    }

    public static String getHeader(String headerName) {
        return getRequest().getHeader(headerName);
    }

    public static HttpServletRequest getRequest() {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        return ((ServletRequestAttributes) ra).getRequest();
    }

    public static HttpServletResponse getResponse(){
       RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        return ((ServletRequestAttributes) ra).getResponse();
    }
}
