package com.xiaohe.service.impl;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.xiaohe.mapper.ControllersMapperCustom;
import com.xiaohe.po.Controllers;
import com.xiaohe.service.ControllersService;

public class ControllersServiceImpl implements ControllersService{

	//@Autowired
	//private Controllers  controllers;
	@Autowired
	private ControllersMapperCustom controllersMapperCustom;
	/*	@Override
	public List<Controllers> AdminLogin(Controllers controllers)throws Exception {
		// TODO Auto-generated method stub
		String result = controllersMapperCustom.selectAdminCname(controllers.getCname());
		String Name = controllersMapperCustom.selectAdminCpwd(controllers.getCpwd());
		return null;
	}*/

	@Override
	public Controllers login(String Cname, String Cpwd) throws Exception{
		// TODO Auto-generated method stub
//		Map<String,String> map = new HashMap<String, String>();
//		map.put("Cname", Cname);
//		map.put("Cpwd", Cpwd);
		Controllers  controllers = new Controllers();
		controllers.setCname(Cname);
		controllers.setCpwd(Cpwd);
		Controllers controller = controllersMapperCustom.selectAdmin(controllers);
		return controller;
	}

}
