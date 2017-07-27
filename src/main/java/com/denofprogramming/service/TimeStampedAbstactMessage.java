package com.denofprogramming.service;

import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("tsm")
public class TimeStampedAbstactMessage extends AbstactMessage{

	public TimeStampedAbstactMessage() {
		super();
//		System.out.println("no arg cons : "+this.getClass());
	}

	@Override
	public void init() {
		System.out.println("init "+this.getClass());
	}

	@Override
	public void destroy() {
		System.out.println("destroy "+this.getClass());
	}
	
	@Override
	public String getMessage(){
		Date d = GregorianCalendar.getInstance().getTime();
		return d.toString() + message;
	}

	@Value("Time Stampped")
	public void setMessage(String message) {
		this.message = message;
	}
}
