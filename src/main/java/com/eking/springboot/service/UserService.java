package com.eking.springboot.service;

import com.eking.springboot.entity.ItUser;

import java.util.List;

public interface UserService {

	public void saveUser(ItUser user) throws Exception;

	public void updateUser(ItUser user);

	public void deleteUser(String userId);

	public ItUser queryUserById(String userId);

	public List<ItUser> queryUserList(ItUser user);

	public List<ItUser> queryUserListPaged(ItUser user, Integer page, Integer pageSize);

	public ItUser queryUserByIdCustom(String userId);
	
	public void saveUserTransactional(ItUser user);
}
