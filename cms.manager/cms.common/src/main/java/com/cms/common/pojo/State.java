package com.cms.common.pojo;

public class State {

	private boolean checked;//指示一个节点是否处于checked状态，用一个checkbox图标表示
	private boolean disabled;//指示一个节点是否处于disabled状态。（不是selectable，expandable或checkable）
	private boolean expanded;//指示一个节点是否处于展开状态
	private boolean selected;//指示一个节点是否可以被选择。
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public boolean isDisabled() {
		return disabled;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	public boolean isExpanded() {
		return expanded;
	}
	public void setExpanded(boolean expanded) {
		this.expanded = expanded;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public State(boolean checked, boolean disabled, boolean expanded, boolean selected) {
		super();
		this.checked = checked;
		this.disabled = disabled;
		this.expanded = expanded;
		this.selected = selected;
	}
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
