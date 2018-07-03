package com.eking.springboot.repository;

import com.eking.springboot.entity.Girl;
//import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 王运振 【yunzh.wang@haihangyun.com】
 * @description:
 * @date created in 2018/3/14 15:59
 */
public interface GirlRepository /*extends JpaRepository<Girl, Integer>*/{

    List<Girl> findByAge(Integer age);
}
