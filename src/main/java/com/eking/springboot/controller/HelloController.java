package com.eking.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王运振 【yunzh.wang@haihangyun.com】
 * @description:hello控制器
 * @date created in 2018/3/14 14:26
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String sayHello(){
        return "Hello,World";
    }

}
