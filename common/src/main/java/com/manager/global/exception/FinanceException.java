package com.manager.global.exception;

public class FinanceException extends RuntimeException {

    private Integer code = 888;  //错误码,随便定义(不要和 http的响应码重复即可)

    private String message;  //异常信息

    private String method;   //发生的方法，位置等


    public FinanceException(String message) {
        this.message=message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }


}
