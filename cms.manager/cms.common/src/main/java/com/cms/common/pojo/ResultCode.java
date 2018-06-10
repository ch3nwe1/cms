package com.cms.common.pojo;

public class ResultCode {

	private int status;
	
	private String msg;
	
	private String url;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ResultCode(int status, String msg, String url) {
		super();
		this.status = status;
		this.msg = msg;
		this.url = url;
	}

	public ResultCode() {
		super();
	}
	
	
}
