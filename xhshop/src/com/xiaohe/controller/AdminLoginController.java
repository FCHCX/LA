package com.xiaohe.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.servlet.ModelAndView;

import com.xiaohe.po.Controllers;
import com.xiaohe.service.ControllersService;

@Controller
@RequestMapping("/Admin")
public class AdminLoginController {
	@Autowired
	private ControllersService controllersService;
	
	//管理员登陆
	@RequestMapping("/login.action")
	public String AdminLogin(String Cname,String Cpwd,HttpServletRequest request , HttpServletResponse response) throws Exception{
		String cname = request.getParameter("Cname");
		String cpwd = request.getParameter("Cpwd");
		Controllers controllers = controllersService.login(cname,cpwd);
		if(controllers == null){
			request.setAttribute("message", "用户名或者密码错误");
			return "login";
		}
		else {
			
			return "index";
		}
	}
}
