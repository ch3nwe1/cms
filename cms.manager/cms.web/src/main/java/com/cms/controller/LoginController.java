package com.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.common.pojo.ResultCode;


/**
 * 登录前端控制器
 * @author DELL
 * @date 2018年6月9日 下午7:06:02
 */
@Controller
public class LoginController {

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
		resultCode.setStatus(300);
		resultCode.setMsg("login success");
		return resultCode;
	}
}
