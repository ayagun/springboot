package com.eking.springboot.handle;

import com.eking.springboot.entity.HttpResponseResult;
import com.eking.springboot.exception.GirlException;
import com.eking.springboot.utils.HttpReponseResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 王运振 【yunzh.wang@haihangyun.com】
 * @description:
 * @date created in 2018/3/15 14:13
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public HttpResponseResult handle(Exception e){
        if(e instanceof GirlException){
            return HttpReponseResultUtil.error(((GirlException) e).getCode(), e.getMessage());
        }else{
            logger.error("【系统异常】{}",e.getMessage());
            return HttpReponseResultUtil.error(-1, e.getMessage());
        }

    }
}
