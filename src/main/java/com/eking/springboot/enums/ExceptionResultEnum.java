package com.eking.springboot.enums;

import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 * @author 王运振 【yunzh.wang@haihangyun.com】
 * @description:
 * @date created in 2018/3/15 14:58
 */
public enum ExceptionResultEnum {
    UNKOWN_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(100,"还在上小学"),
    MIDDLE_SCHOOL(101,"在上中学");

    private Integer code;
    private String message;

    ExceptionResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
