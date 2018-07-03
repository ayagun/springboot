package com.eking.springboot.service;

import com.eking.springboot.entity.Girl;
import com.eking.springboot.enums.ExceptionResultEnum;
import com.eking.springboot.exception.GirlException;
import com.eking.springboot.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//import javax.transaction.Transactional;


/**
 * @author 王运振 【yunzh.wang@haihangyun.com】
 * @description:
 * @date created in 2018/3/14 17:22
 */
@Service
public class GirlService {

/*    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwoGirls(){
        Girl girlA = new Girl();
        girlA.setAge(18);
        girlA.setCupSize("A");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(19);
        girlB.setCupSize("BBB");
        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws GirlException {


        Integer age = girlRepository.getOne(id).getAge();
        if(age < 10){
                throw new GirlException(ExceptionResultEnum.PRIMARY_SCHOOL.getCode(),
                        ExceptionResultEnum.PRIMARY_SCHOOL.getMessage());
        }else{
            throw new GirlException(ExceptionResultEnum.MIDDLE_SCHOOL.getCode(),
                    ExceptionResultEnum.MIDDLE_SCHOOL.getMessage());
        }

    }*/
}
