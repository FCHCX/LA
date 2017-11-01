package com.xiaohe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xiaohe.po.Users;
import com.xiaohe.service.LoginService;


@Controller
@RequestMapping("/user")
public class LoginController {
	@Autowired
	private LoginService loginService;
	Users users = new Users();
	@RequestMapping("/userLogin")
	public String userLogin(Users user){
		users = loginService.queryUserByLoginUser(user);
		//ModelAndView modelAndView = new ModelAndView();
		if(users!=null){
			System.out.println("login success!");	
			return "/loginsuccess.jsp";
		}
		else {
			System.out.println("login fail!");
			return "/login.jsp";
			
		}
	}
	

}
