package com.denofprogramming.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("nontsm")
public class NoTimeStampedAbstactMessage extends AbstactMessage{

	public NoTimeStampedAbstactMessage() {
		super();
//		System.out.println("no arg cons : " + this.getClass());
	}

	@Override
	public void init() {
		System.out.println("init "+this.getClass() );
		
	}

	@Override
	public void destroy() {
		System.out.println("destroy "+this.getClass());
	}
	
	@Value("non Time Stampped")
	public void setMessage(String message) {
		this.message = message;
	}
}
