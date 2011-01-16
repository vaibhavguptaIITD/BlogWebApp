package com.vaibhav.action;
import com.opensymphony.xwork2.ActionSupport;

public class ProjectController extends ActionSupport	{
	
	private String p;
	
	public String execute()
	{
		
		return ActionSupport.SUCCESS;
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}
	
	
}