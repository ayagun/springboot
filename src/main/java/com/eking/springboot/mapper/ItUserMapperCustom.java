package com.eking.springboot.mapper;

import com.eking.springboot.entity.ItUser;

import java.util.List;


public interface ItUserMapperCustom {
	
	List<ItUser> queryUserSimplyInfoById(String id);
}