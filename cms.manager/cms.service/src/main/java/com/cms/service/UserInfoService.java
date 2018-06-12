package com.cms.service;

/**
 * 用户表相关业务类
 * @author DELL
 * @date 2018年6月11日 上午12:47:53
 */
public interface UserInfoService {

	/*
	 * 根据登录编号和密码查询数据库
	 */
	boolean getUserByLoginidAndPassword(String loginId, String password);
}
