package com.denofprogramming.service.events;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

public class MessagePrinterEvent extends ApplicationEvent{

	private String message ;
	private static final long serialVersionUID = 1L;
	
	public MessagePrinterEvent(Object source) {
		super(source);
	}
	
	public MessagePrinterEvent(Object source,String message) {
		super(source);
		this.message = message;
	}
	
	@Override
	public String toString() {
		return message;
	}

}
