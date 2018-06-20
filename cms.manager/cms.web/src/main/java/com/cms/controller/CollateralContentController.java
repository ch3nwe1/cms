package com.cms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.common.pojo.Node;
import com.cms.common.pojo.State;
import com.cms.pojo.TbCollateralContent;
import com.cms.service.CollateralContentService;

@Controller
@RequestMapping("/classify")
public class CollateralContentController {

	@Autowired
	private CollateralContentService collateralContentService;
	@RequestMapping("tree")
	@ResponseBody
	public List<Node> getContent(){
		List<Node> nodes = new ArrayList<>();
		List<TbCollateralContent> contentList = collateralContentService.getContentList();
		Node node = null;
		State state = new State(false, false, false, true);
		for (TbCollateralContent tbCollateralContent : contentList) {
			node = new Node();
			node.setId(tbCollateralContent.getId());
			node.setPid(tbCollateralContent.getParentId());
			node.setText(tbCollateralContent.getName());
			node.setState(state);
			nodes.add(node);
		}
		return new Node().createTree(nodes);
	}
}
