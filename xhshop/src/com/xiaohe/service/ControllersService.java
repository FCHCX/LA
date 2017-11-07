package com.xiaohe.service;

import com.xiaohe.po.Controllers;


public interface ControllersService{
	
	/*public List<Controllers> AdminLogin(Controllers controllers)throws Exception;*/
	public Controllers login(String Cname, String Cpwd) throws Exception;

	
}