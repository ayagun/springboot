package com.eking.springboot.controller;

import com.eking.springboot.entity.ItUser;
import com.eking.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("mybatis")
public class ItUserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/saveUser")
	public void saveUser() throws Exception {
		
		//String userId = sid.nextShort();
		
		ItUser user = new ItUser();
		//user.setId(userId);
		user.setUserName("new" + new Date());
		user.setAddress("科技大道16号");
		user.setBirthday(new Date());
		user.setCreateTime(new Date());
		user.setEmail("404566882@qq.com");
		user.setHobby("读书，打球，上网");
		user.setPasswd("new123456");
		user.setPhone("13337546625");
		userService.saveUser(user);
		
		//return IMoocJSONResult.ok("保存成功");
	}
	
	@RequestMapping("/updateUser")
	public void updateUser() {
		
		ItUser user = new ItUser();
		user.setUserId(1001);
		user.setUserName("update" + new Date());
		user.setPasswd("update123456");
		user.setHobby("update读书，打球，上网");
		user.setAddress("new科技大道16号");
		
		userService.updateUser(user);
		
		//return IMoocJSONResult.ok("保存成功");
	}
	
	@RequestMapping("/deleteUser")
	public void deleteUser(String userId) {
		
		userService.deleteUser(userId);
		
		//return IMoocJSONResult.ok("删除成功");
	}
	
	@RequestMapping("/queryUserById")
	public ItUser queryUserById(String userId) {

		return userService.queryUserById(userId);
		//return IMoocJSONResult.ok(userService.queryUserById(userId));
	}
	
	@RequestMapping("/queryUserList")
	public List<ItUser> queryUserList() {
		
		ItUser user = new ItUser();
		user.setUserName("admin");
		
		List<ItUser> userList = userService.queryUserList(user);

		return userList;
		//return IMoocJSONResult.ok(userList);
	}
	
	@RequestMapping("/queryUserListPaged")
	public List<ItUser> queryUserListPaged(Integer page) {
		
		if (page == null) {
			page = 1;
		}

		int pageSize = 10;
		
		ItUser user = new ItUser();
//		user.setNickname("lee");
		
		return userService.queryUserListPaged(user, page, pageSize);
		
		//return IMoocJSONResult.ok(userList);
	}
	
/*	@RequestMapping("/queryUserByIdCustom")
	public IMoocJSONResult queryUserByIdCustom(String userId) {
		
		return IMoocJSONResult.ok(userService.queryUserByIdCustom(userId));
	}*/
	
	@RequestMapping("/saveUserTransactional")
	public void saveUserTransactional() {
		
		//String userId = sid.nextShort();
		
		ItUser user = new ItUser();
		//user.setId(userId);
		user.setUserName("lee" + new Date());
		user.setPasswd("abc123");
		
		userService.saveUserTransactional(user);
		
		//return IMoocJSONResult.ok("保存成功");
	}
}
