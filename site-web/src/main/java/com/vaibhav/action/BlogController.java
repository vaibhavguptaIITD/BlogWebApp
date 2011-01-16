package com.vaibhav.action;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.vaibhav.blog.service.BlogService;
import com.vaibhav.blog.domain.Blog;

public class BlogController extends ActionSupport{
	
	
	private BlogService blogService;
	private List<Blog> blogs;
	
	public String execute() throws Exception
	{
		blogs = blogService.getLatestBlogs();
		return ActionSupport.SUCCESS;
		
	}

	public BlogService getBlogService() {
		return blogService;
	}

	public void setBlogService(BlogService blogService) {
		this.blogService = blogService;
	}

	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}
	
	public String index() throws Exception
	{
		return ActionSupport.SUCCESS;
	}

}
