package com.cms.service;

import java.util.List;

import com.cms.pojo.TbMenuInfo;

public interface MenuService {

	List<TbMenuInfo> getMenuListByParentId(String parentId);
	List<TbMenuInfo> getMenuList();
}
