package com.sx.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sx.context.Page;
import com.sx.entity.User;
import com.sx.service.IUserService;

@Controller
@RequestMapping("/")
public class UserController {
	@Resource 
	private IUserService userService;
	Logger logger = Logger.getLogger(UserController.class);
	@RequestMapping(path="/login",method=RequestMethod.GET)
	public String toIndex(HttpServletRequest request){
		return Page.LOGIN_PAGE;
	}
	
	@RequestMapping(path="/login",method=RequestMethod.POST)
	public String login(HttpServletRequest request,Model model){
		String id=request.getParameter("username");
		String password=request.getParameter("password");
		User user = userService.getUserByIdAndPsd(id, password);
		if(user!=null)
			return Page.MAIN_PAGE;
		else
			return Page.LOGIN_PAGE;
	}
}
