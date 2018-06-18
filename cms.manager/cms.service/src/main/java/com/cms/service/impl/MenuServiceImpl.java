package com.cms.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.TbMenuInfoMapper;
import com.cms.pojo.TbMenuInfo;
import com.cms.pojo.TbMenuInfoExample;
import com.cms.pojo.TbMenuInfoExample.Criteria;
import com.cms.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private TbMenuInfoMapper menuInfoMapper;
	@Override
	public List<TbMenuInfo> getMenuListByParentId(String parentId) {
		TbMenuInfoExample example = new TbMenuInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		example.setOrderByClause("sortno");
		List<TbMenuInfo> menuList = menuInfoMapper.selectByExample(example);
		return menuList;
	}
	/**
	 * 获取全部菜单
	 */
	@Override
	public List<TbMenuInfo> getMenuList() {
		List<TbMenuInfo> menuList = new ArrayList<>();
		TbMenuInfoExample example = new TbMenuInfoExample();
		//排序
		example.setOrderByClause("sortno");
		menuList = menuInfoMapper.selectByExample(example );
		return menuList;
	}

}
