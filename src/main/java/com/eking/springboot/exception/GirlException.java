package com.eking.springboot.exception;

/**
 * @author 王运振 【yunzh.wang@haihangyun.com】
 * @description:
 * @date created in 2018/3/15 14:38
 */
public class GirlException extends RuntimeException{
    private Integer code;

    public GirlException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
