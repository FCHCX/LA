package com.xiaohe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.xiaohe.mapper.UsersMapper;
import com.xiaohe.po.Users;
import com.xiaohe.service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Autowired
	private UsersMapper usersMapper;
	
	@Override
	public Users queryUserByLoginUser(Users users) {
		// TODO Auto-generated method stub
		return usersMapper.queryUsersByLoginUser(users);
	}

}
