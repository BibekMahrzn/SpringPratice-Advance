package com.denofprogramming.service;

public abstract class AbstactMessage implements MessageOfTheDayService{

	String message = "no message for now";

	public AbstactMessage() {
//		System.out.println("no arg cons : " +AbstactMessage.class.getName());
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
