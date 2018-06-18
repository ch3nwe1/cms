package com.cms.common.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * 树形菜单模型
 * @author DELL
 * @date 2018年6月18日 下午2:41:54
 */
public class Node {

	private String nodeId;//节点编号
	private String pid;//父节点编号
	private String text;//节点名称
	private String icon;//图标
	private String href;//触发的链接
	private State state;
	private List<Node> nodes;//子节点
	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public List<Node> getNodes() {
		return nodes;
	}
	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
	
	public Node(){
		//this.nodes = new ArrayList<>();
	}
	public Node(String nodeId, String pid) {
		super();
		this.nodeId = nodeId;
		this.pid = pid;
		//this.nodes = new ArrayList<>();
	}
	public Node(String nodeId, String pid, String text, String icon, String href, State state) {
		super();
		this.nodeId = nodeId;
		this.pid = pid;
		this.text = text;
		this.icon = icon;
		this.href = href;
		this.state = state;
		//this.nodes = new ArrayList<>();
	}
	/*
	 * 生成树
	 */
	public List<Node> createTree(List<Node> nodes){
		
		if(nodes == null || nodes.size() == 0){
			return null;
		}
		List<Node> nodeList= new ArrayList<>();
		for (Node node : nodes) {
			//添加根节点
			if("0".equals(node.getPid())){
				nodeList.add(node);
			}else{
				addChild(nodeList, node);
			}
		}
		return nodeList;
	}
	/**
	 * 向指定节点添加子节点
	 * @param node
	 * @param child
	 */
	public void addChild(List<Node> nodeList, Node child){
		for (Node node2 : nodeList) {
			
			if(node2 == null) return;
			//首先判断有无子节点
			if(node2.getNodeId().equals(child.getPid())){
				if(node2.getNodes() == null){
					node2.setNodes(new ArrayList<Node>());
				}
				node2.getNodes().add(child);
				return;
			}
			//如果当前节点没有子节点则退出
			if(node2.getNodes() == null) return;
			for(Node item : node2.getNodes()){//遍历子节点
				if(item.getNodeId().equals(child.getPid())){//找到子节点对应的父节点，并添加进去
					if(item.getNodes() == null){
						item.setNodes(new ArrayList<Node>());
					}
					item.getNodes().add(child);
					return;
				}else{//如果未找到，则递归子节点去找
					if(item.getNodes() != null && item.getNodes().size() > 0){
						addChild(item.getNodes(), child);
					}
				}
			}
		}
	}
	
	@Override
	public String toString() {
		return "Node [nodeId=" + nodeId + ", pid=" + pid + ", text=" + text + ", icon=" + icon + ", href=" + href
				+ ", nodes=" + nodes + "]";
	}
	
	
}
