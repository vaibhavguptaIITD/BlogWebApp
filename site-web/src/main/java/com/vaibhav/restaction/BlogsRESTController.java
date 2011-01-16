package com.vaibhav.restaction;

import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

public class BlogsRESTController {
	
	 public HttpHeaders index() {
	        return new DefaultHttpHeaders("index")
	            .disableCaching();
	    } 
	
}
