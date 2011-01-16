package com.vaibhav.action;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class ServerSentEvent extends ActionSupport implements ServletResponseAware{

	
	private HttpServletResponse response;
	
	private String message;
	
	public String execute()
	{
		response.setContentType("text/event-stream");
		message = String.valueOf("dragon hain humau\n\n");
		return ActionSupport.SUCCESS;
	}
	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
		
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
