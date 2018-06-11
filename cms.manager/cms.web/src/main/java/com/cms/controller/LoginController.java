package com.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.common.pojo.ResultCode;
import com.cms.service.UserInfoService;


/**
 * 登录前端控制器
 * @author DELL
 * @date 2018年6月9日 下午7:06:02
 */
@Controller
public class LoginController {

	@Autowired
	private UserInfoService userInfoService;
	/*
	 * 登录页控制
	 */
	@RequestMapping("/")
	private String login(){
		return "login";
	}
	/*
	 *登录校验  
	 *?乱码问题待解决?
	 */
	@RequestMapping("/login/validate")
	@ResponseBody
	private ResultCode validate(@RequestParam String username, @RequestParam String password){
		ResultCode resultCode = new ResultCode();
		
		boolean result = userInfoService.getUserByLoginidAndPassword(username, password);
		
		try {
			if(result){
				resultCode.setStatus(200);
				resultCode.setMsg("login success");
			}else{
				resultCode.setStatus(405);
				resultCode.setMsg("username or password is wrong");
			}
		} catch (Exception e) {
			e.printStackTrace();
			resultCode.setStatus(500);
			resultCode.setMsg("server error");
		}
		return resultCode;
	}
	/*
	 * 登录成功
	 */
	@RequestMapping("/login")
	private String logon(){
		return "index";
	}
}
