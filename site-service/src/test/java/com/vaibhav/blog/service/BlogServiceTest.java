package com.vaibhav.blog.service;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;

import com.vaibhav.blog.domain.Blog;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:META-INF/spring/app-crud.xml",
		"classpath*:META-INF/spring/service-beans.xml" })


public class BlogServiceTest {
	
@Autowired 
private BlogService blogService;

public BlogService getBlogService() {
	return blogService;
}

public void setBlogService(BlogService blogService) {
	this.blogService = blogService;
}

//@Test
public void testCreateBlog()
{
	Blog b = new Blog();
	b.setTitle("Test Title");
	b.setContent("test content");
	b.setCreatedDate(new Date());
	b.setCategory("random");
	System.out.println("in here");
	try{
	Blog a = blogService.createBlog(b);
	System.out.println("Blog " +  a);
	}
	catch(Exception e)
	{
		System.out.println("In here");
	}
}

//@Test
public void testDeleteBlog()
{
	blogService.deleteBlog(1);
}

//@Test
public void updateBlog()
{
	Blog b = blogService.getBlog(2);
	b.setTitle("new Blog");
	blogService.updateBlog(b);
}
@Test
public void testGetAllBlogMonth()
{
	List<Blog> blogs = blogService.getLatestBlogs();
	
	System.out.println("blog size " + blogs.size());
}

}
