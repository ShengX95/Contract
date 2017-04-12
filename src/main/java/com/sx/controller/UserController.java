package com.sx.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sx.context.Page;
import com.sx.entity.User;
import com.sx.http.PageWapper;
import com.sx.http.ResultMsg;
import com.sx.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	Logger logger = Logger.getLogger(UserController.class);
	
	@RequestMapping(path = "/panel", method = RequestMethod.GET)
	public String toIndex(HttpServletRequest request) {
		return Page.USER_PAGE;
	}
	@ResponseBody
	@RequestMapping(path = "/all", method = RequestMethod.GET)
	public PageWapper<User> getAll(HttpServletRequest request){
		int page = Integer.parseInt(request.getParameter("page"));
		int rows = Integer.parseInt(request.getParameter("rows"));
		return new PageWapper<>(userService.getCount(), userService.getUserByPage(page, rows));
	}
	
	@ResponseBody
	@RequestMapping(path = "/del", method = RequestMethod.POST)
	public ResultMsg delUser(@RequestParam String id){
		ResultMsg result = new ResultMsg();
		int r = userService.delUser(id);
		if(r==1)
			result.setSuccess(Boolean.TRUE);
		else{
			result.setSuccess(Boolean.FALSE);
			result.setErrorMsg("删除用户失败！！");
		}
		return result;
	}
}
