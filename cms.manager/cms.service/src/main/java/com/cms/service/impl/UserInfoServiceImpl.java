package com.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.cms.dao.TbUserInfoMapper;
import com.cms.pojo.TbUserInfo;
import com.cms.pojo.TbUserInfoExample;
import com.cms.pojo.TbUserInfoExample.Criteria;
import com.cms.service.UserInfoService;
/**
 * 用户表相关业务实现类
 * @author DELL
 * @date 2018年6月11日 上午12:51:30
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Autowired
	private TbUserInfoMapper tbUserInfoMapper;
	/**
	 * 根据用户编号和密码验证用户登录信息
	 */
	@Override
	public boolean getUserByLoginidAndPassword(String loginId, String password) {
		TbUserInfoExample example = new TbUserInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andLoginIdEqualTo(loginId);
		//对密码进行加密后验证
		password = DigestUtils.md5DigestAsHex(password.getBytes());
		criteria.andPasswordEqualTo(password);
		List<TbUserInfo> selectByExample = tbUserInfoMapper.selectByExample(example);
		if(selectByExample != null && selectByExample.size() > 0){
			return true;
		}
		return false;
	}

}
