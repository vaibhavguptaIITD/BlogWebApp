package com.vaibhav.blog.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.vaibhav.utils.orm.GenericDao;
import com.vaibhav.blog.domain.Blog;

public class BlogServiceImpl implements BlogService{
	
	private GenericDao<Blog> genericDAO; 

	@Override
	public List<Blog> getAllBlogsByMonthCategory(String month, String category) {
		Map<String,String> params = new HashMap<String,String>();
		params.put("month", month);
		params.put("category", category);
		return (List<Blog>)genericDAO.findByNamedQuery("blog.findByMonthCategory", params);
	}

	@Override
	public Blog getBlog(Integer id) 
	{
		return genericDAO.get(Blog.class, id);
	}
	
	@Transactional(readOnly=false)
	public Blog createBlog(Blog b)
	{
		return genericDAO.create(b);
	}
	
	@Transactional(readOnly=false)
	public void deleteBlog(Integer id)
	{
		genericDAO.delete(Blog.class, id);
	}
	
	@Transactional(readOnly=false)
	public void updateBlog(Blog b)
	{
		genericDAO.update(b);
	}
	
	@Override
	public List<Blog> getAllBlogsByCategory(String category) {
		Map<String,String> params = new HashMap<String,String>();
		params.put("category", category);
		return (List<Blog>)genericDAO.findByNamedQuery("blog.findByCategory", params);
	}

	@Override
	public List<Blog> getAllBlogsByMonth(String month) {
		Map<String,String> params = new HashMap<String,String>();
		params.put("month", month);
		return (List<Blog>)genericDAO.findByNamedQuery("blog.findByMonth", params);
	}
	
	@Override
	public List<Blog> getLatestBlogs() {
//		Map<String,String> params = new HashMap<String,String>();
//		params.put("limit", limit.toString());
		return (List<Blog>)genericDAO.findByNamedQuery("blog.getLatestBlogs");
	}

	

	public GenericDao<Blog> getGenericDAO() 
	{
		return genericDAO;
	}

	public void setGenericDAO(GenericDao<Blog> genericDAO) 
	{
		this.genericDAO = genericDAO;
	}

	
	
	

}
