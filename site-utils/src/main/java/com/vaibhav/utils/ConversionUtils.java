package com.vaibhav.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class ConversionUtils {

	public final static SimpleDateFormat dateFormatter = new SimpleDateFormat("MMMM d, yyyy");
	
	public static String convertToString(Date date){
		if(date != null){
			return dateFormatter.format(date);
		}
		return "";
	}
	
	public static Date convertFromString(String dateString) throws Exception {
		if(StringUtils.isNotEmpty(dateString)){
			return dateFormatter.parse(dateString);
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		Date d = new Date();
		System.out.println(convertToString(d));
		
	}
}
