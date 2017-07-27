package com.denofprogramming.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("message")
public class BasicMessageOfTheDayImpl implements MessageOfTheDayService {

	@Value(" User Generated")
	private String message = "hello world";
	
	
	
	public BasicMessageOfTheDayImpl() {
//		System.out.println("no arg cons :"+ this.getClass());
	}

	public String getMessage() {		
		return message;
	}

	public void setMessage(String message){
		this.message = message;
	}

	@Override
	public void init() {
		System.out.println("init called");
	}

	@Override
	public void destroy() {
		System.out.println("destroy called");
	}
	
}
