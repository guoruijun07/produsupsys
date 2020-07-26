package com.ruoyi.common.bean.po;

public class SysOperLog {
    /**
     * 日志主键 oper_id
     */
    private Long operId;

    /**
     * 模块标题 title
     */
    private String title;

    /**
     * 业务类型（0其它 1新增 2修改 3删除） business_type
     */
    private Integer businessType;

    /**
     * 方法名称 method
     */
    private String method;

    /**
     * 请求方式 request_method
     */
    private String requestMethod;

    /**
     * 操作类别（0其它 1后台用户 2手机端用户） operator_type
     */
    private Integer operatorType;

    /**
     * 操作人员 oper_name
     */
    private String operName;

    /**
     * 部门名称 dept_name
     */
    private String deptName;

    /**
     * 请求URL oper_url
     */
    private String operUrl;

    /**
     * 主机地址 oper_ip
     */
    private String operIp;

    /**
     * 操作地点 oper_location
     */
    private String operLocation;

    /**
     * 请求参数 oper_param
     */
    private String operParam;

    /**
     * 返回参数 json_result
     */
    private String jsonResult;

    /**
     * 操作状态（0正常 1异常） status
     */
    private Integer status;

    /**
     * 错误消息 error_msg
     */
    private String errorMsg;

    /**
     * 操作时间 oper_time
     */
    private java.util.Date operTime;

    /**
     *
     * @mbggenerated
     */
    public SysOperLog(Long operId, String title, Integer businessType, String method, String requestMethod, Integer operatorType, String operName, String deptName, String operUrl, String operIp, String operLocation, String operParam, String jsonResult, Integer status, String errorMsg, java.util.Date operTime) {
        this.operId = operId;
        this.title = title;
        this.businessType = businessType;
        this.method = method;
        this.requestMethod = requestMethod;
        this.operatorType = operatorType;
        this.operName = operName;
        this.deptName = deptName;
        this.operUrl = operUrl;
        this.operIp = operIp;
        this.operLocation = operLocation;
        this.operParam = operParam;
        this.jsonResult = jsonResult;
        this.status = status;
        this.errorMsg = errorMsg;
        this.operTime = operTime;
    }

    /**
     *
     * @mbggenerated
     */
    public SysOperLog() {
        super();
    }

    /**
     * 日志主键

     * @return oper_id 日志主键
     */
    public Long getOperId() {
        return operId;
    }

    /**
     * 日志主键

     * @param operId 日志主键
     */
    public void setOperId(Long operId) {
        this.operId = operId;
    }

    /**
     * 模块标题

     * @return title 模块标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 模块标题

     * @param title 模块标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 业务类型（0其它 1新增 2修改 3删除）

     * @return business_type 业务类型（0其它 1新增 2修改 3删除）
     */
    public Integer getBusinessType() {
        return businessType;
    }

    /**
     * 业务类型（0其它 1新增 2修改 3删除）

     * @param businessType 业务类型（0其它 1新增 2修改 3删除）
     */
    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    /**
     * 方法名称

     * @return method 方法名称
     */
    public String getMethod() {
        return method;
    }

    /**
     * 方法名称

     * @param method 方法名称
     */
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    /**
     * 请求方式

     * @return request_method 请求方式
     */
    public String getRequestMethod() {
        return requestMethod;
    }

    /**
     * 请求方式

     * @param requestMethod 请求方式
     */
    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod == null ? null : requestMethod.trim();
    }

    /**
     * 操作类别（0其它 1后台用户 2手机端用户）

     * @return operator_type 操作类别（0其它 1后台用户 2手机端用户）
     */
    public Integer getOperatorType() {
        return operatorType;
    }

    /**
     * 操作类别（0其它 1后台用户 2手机端用户）

     * @param operatorType 操作类别（0其它 1后台用户 2手机端用户）
     */
    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    /**
     * 操作人员

     * @return oper_name 操作人员
     */
    public String getOperName() {
        return operName;
    }

    /**
     * 操作人员

     * @param operName 操作人员
     */
    public void setOperName(String operName) {
        this.operName = operName == null ? null : operName.trim();
    }

    /**
     * 部门名称

     * @return dept_name 部门名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 部门名称

     * @param deptName 部门名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 请求URL

     * @return oper_url 请求URL
     */
    public String getOperUrl() {
        return operUrl;
    }

    /**
     * 请求URL

     * @param operUrl 请求URL
     */
    public void setOperUrl(String operUrl) {
        this.operUrl = operUrl == null ? null : operUrl.trim();
    }

    /**
     * 主机地址

     * @return oper_ip 主机地址
     */
    public String getOperIp() {
        return operIp;
    }

    /**
     * 主机地址

     * @param operIp 主机地址
     */
    public void setOperIp(String operIp) {
        this.operIp = operIp == null ? null : operIp.trim();
    }

    /**
     * 操作地点

     * @return oper_location 操作地点
     */
    public String getOperLocation() {
        return operLocation;
    }

    /**
     * 操作地点

     * @param operLocation 操作地点
     */
    public void setOperLocation(String operLocation) {
        this.operLocation = operLocation == null ? null : operLocation.trim();
    }

    /**
     * 请求参数

     * @return oper_param 请求参数
     */
    public String getOperParam() {
        return operParam;
    }

    /**
     * 请求参数

     * @param operParam 请求参数
     */
    public void setOperParam(String operParam) {
        this.operParam = operParam == null ? null : operParam.trim();
    }

    /**
     * 返回参数

     * @return json_result 返回参数
     */
    public String getJsonResult() {
        return jsonResult;
    }

    /**
     * 返回参数

     * @param jsonResult 返回参数
     */
    public void setJsonResult(String jsonResult) {
        this.jsonResult = jsonResult == null ? null : jsonResult.trim();
    }

    /**
     * 操作状态（0正常 1异常）

     * @return status 操作状态（0正常 1异常）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 操作状态（0正常 1异常）

     * @param status 操作状态（0正常 1异常）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 错误消息

     * @return error_msg 错误消息
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * 错误消息

     * @param errorMsg 错误消息
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    /**
     * 操作时间

     * @return oper_time 操作时间
     */
    public java.util.Date getOperTime() {
        return operTime;
    }

    /**
     * 操作时间

     * @param operTime 操作时间
     */
    public void setOperTime(java.util.Date operTime) {
        this.operTime = operTime;
    }
}