package com.eking.springboot.utils;

import com.eking.springboot.entity.HttpResponseResult;
import com.eking.springboot.enums.ExceptionResultEnum;

/**
 * @author 王运振 【yunzh.wang@haihangyun.com】
 * @description:
 * @date created in 2018/3/15 11:15
 */
public class HttpReponseResultUtil {
    public final static HttpResponseResult  success(Object object){
            HttpResponseResult result = new HttpResponseResult();
            result.setCode(ExceptionResultEnum.SUCCESS.getCode());
            result.setMsg(ExceptionResultEnum.SUCCESS.getMessage());
            result.setData(object);
            return result;
    }

    public final static HttpResponseResult error(Integer code, String msg){
        HttpResponseResult result = new HttpResponseResult();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }
}
