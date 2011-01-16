package com.vaibhav.blog.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.vaibhav.utils.ConversionUtils;

@Entity
@Table(name = "blog")
@NamedQueries(value = {
		@NamedQuery(name = "blog.findByMonthCategory", query = "SELECT b from  Blog b WHERE category=:category and MONTHNAME(createdDate) = :month order by createdDate desc"),
		@NamedQuery(name = "blog.findByCategory", query = "SELECT b from  Blog b WHERE category=:category order by createdDate desc"),
		@NamedQuery(name = "blog.findByMonth", query = "SELECT b from  Blog b WHERE MONTHNAME(createdDate) = :month order by createdDate desc"),
		@NamedQuery(name = "blog.getLatestBlogs", query = "SELECT b from  Blog b  order by createdDate desc limit 20")
	}
)

public class Blog implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer id;
	private String title;
	private String content;
	@Temporal(TemporalType.TIMESTAMP) @Column(name="created_date")
	private Date createdDate;
	
	@Temporal(TemporalType.TIMESTAMP) @Column(name="updated_date")
	private Date updatedDate;
	
	private String category;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getCreatedDateString()
	{
		return ConversionUtils.convertToString(createdDate);
	}
	
	

}
