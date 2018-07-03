package com.eking.springboot.controller;

import com.eking.springboot.entity.Girl;
import com.eking.springboot.entity.HttpResponseResult;
import com.eking.springboot.repository.GirlRepository;
import com.eking.springboot.service.GirlService;
import com.eking.springboot.utils.HttpReponseResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author 王运振 【yunzh.wang@haihangyun.com】
 * @description:
 * @date created in 2018/3/14 15:55
 */
@RestController
public class GirlController {
/*
    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;
    *//**
    * <p>todo:获取女生列表</p>
    * @params
    * @return
    * @throws
    * @author 王运振 【yunzh.wang@haihangyun.com】
    * @date 2018/3/14 16:11
    **//*
    @GetMapping(value = "/girls/list")
    public List<Girl> girlList(){
        return  girlRepository.findAll();
    }

    *//**
    * <p>todo:添加女生</p>
    * @params
    * @return
    * @throws
    * @author 王运振 【yunzh.wang@haihangyun.com】
    * @date 2018/3/14 16:18
    **//*
    @PostMapping(value = "/girls")
    public HttpResponseResult save(@Valid Girl girl, BindingResult bindingResult){
        HttpResponseResult<Girl> result = new HttpResponseResult<Girl>();
        if(bindingResult.hasErrors()){
            return HttpReponseResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        return HttpReponseResultUtil.success( girlRepository.save(girl));
    }

    *//**
    * <p>todo:删除女生</p>
    * @params
    * @return
    * @throws
    * @author 王运振 【yunzh.wang@haihangyun.com】
    * @date 2018/3/14 16:42
    **//*
    @DeleteMapping(value = "/girls")
    public void delete(@RequestParam("id") Integer id){
         girlRepository.delete(id);
    }

    *//**
    * <p>todo:更新女生</p>
    * @params
    * @return
    * @throws
    * @author 王运振 【yunzh.wang@haihangyun.com】
    * @date 2018/3/14 16:49
    **//*
    @PutMapping(value = "putGirl")
    public void update(@RequestParam("id") Integer id,
                       @RequestParam("age") Integer age,
                       @RequestParam("cupSize") String cupSize){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        girlRepository.save(girl);
    }

    @GetMapping(value = "/getGirlsByAge/{age}")
    public List<Girl> getGirlsByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    @PostMapping(value = "/insertTwoGirls")
    public void insertTwoGirls(){
        girlService.insertTwoGirls();
    }

    @GetMapping(value = "/girls/getAge")
    public void getAge(@RequestParam Integer id) throws Exception {
        girlService.getAge(id);
    }*/
}
