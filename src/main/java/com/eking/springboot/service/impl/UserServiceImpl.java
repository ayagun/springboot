package com.eking.springboot.service.impl;

import com.eking.springboot.entity.ItUser;
import com.eking.springboot.mapper.ItUserMapper;
import com.eking.springboot.mapper.ItUserMapperCustom;
import com.eking.springboot.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private ItUserMapper itUserMapper;

	@Autowired
	private ItUserMapperCustom itUserMapperCustom;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveUser(ItUser user) throws Exception {
		
/*		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/

		itUserMapper.insert(user);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateUser(ItUser user) {
//		userMapper.updateByPrimaryKeySelective(user);
		itUserMapper.updateByPrimaryKey(user);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void deleteUser(String userId) {
		itUserMapper.deleteByPrimaryKey(userId);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public ItUser queryUserById(String userId) {
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return itUserMapper.selectByPrimaryKey(userId);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<ItUser> queryUserList(ItUser user) {
		
		try {
			Thread.sleep(11000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Example example = new Example(ItUser.class);
		Example.Criteria criteria = example.createCriteria();
		
		if (!StringUtils.isEmptyOrWhitespace(user.getUserName())) {
//			criteria.andEqualTo("username", user.getUsername());
			criteria.andLike("username", "%" + user.getUserName() + "%");
		}

		List<ItUser> userList = itUserMapper.selectByExample(example);
		
		return userList;
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<ItUser> queryUserListPaged(ItUser user, Integer page, Integer pageSize) {
		// 开始分页
        PageHelper.startPage(page, pageSize);
		
		Example example = new Example(ItUser.class);
		Example.Criteria criteria = example.createCriteria();

		example.orderBy("registTime").desc();
		List<ItUser> userList = itUserMapper.selectByExample(example);
		
		return userList;
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public ItUser queryUserByIdCustom(String userId) {
		
		List<ItUser> userList = itUserMapperCustom.queryUserSimplyInfoById(userId);
		
		if (userList != null && !userList.isEmpty()) {
			return (ItUser)userList.get(0);
		}
		
		return null;
	}
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveUserTransactional(ItUser user) {

		itUserMapper.insert(user);
		
		int a = 1 / 0;
		
		//user.setIsDelete(1);
		itUserMapper.updateByPrimaryKeySelective(user);
	}
}
