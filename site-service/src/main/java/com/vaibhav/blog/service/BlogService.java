package com.vaibhav.blog.service;

import java.util.List;

import com.vaibhav.blog.domain.Blog;

public interface BlogService {
	
	public List<Blog> getAllBlogsByMonthCategory(String month, String category);
	
	public List<Blog> getAllBlogsByCategory(String category);
	
	public List<Blog> getAllBlogsByMonth(String month);
	
	public List<Blog> getLatestBlogs();
	
	public Blog getBlog(Integer id);
	
	public Blog createBlog(Blog b);
	
	public void deleteBlog(Integer i);
	
	public void updateBlog(Blog b);
	

}
