package com.cms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.common.pojo.Node;
import com.cms.common.pojo.State;
import com.cms.pojo.TbMenuInfo;
import com.cms.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private MenuService menuService;
	@RequestMapping("/init")
	@ResponseBody
	private List<Node> getMenuList(){
		List<Node> nodes = new ArrayList<>();
		List<TbMenuInfo> menuList = menuService.getMenuList();
		Node node = null;
		State state = new State(false,false,false,false);
		for (TbMenuInfo tbMenuInfo : menuList) {
			node = new Node();
			node.setNodeId(tbMenuInfo.getMenuId());
			node.setText(tbMenuInfo.getMenuName());
			node.setPid(tbMenuInfo.getParentId());
			node.setHref(tbMenuInfo.getUrl());
			node.setState(state);
			nodes.add(node);
		}
		return new Node().createTree(nodes);
	}
}
