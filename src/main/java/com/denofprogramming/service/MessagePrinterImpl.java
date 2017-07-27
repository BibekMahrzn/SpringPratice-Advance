package com.denofprogramming.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.denofprogramming.service.events.MessagePrinterEvent;

//@Component
@Service("hello")
public final class MessagePrinterImpl implements MessagePrinter {

//	@Autowired(required=false)
//	@Qualifier("tsm")
	@Inject
	@Named("dMessage")
	private MessageOfTheDayService service;
//	private MessageOfTheDayService service2;
	@Value("arg Name ")
	private String name;
	@Value(">>>>> ")
	private String name2;
	@Inject
	private ApplicationEventPublisher publisher;

//	@Autowired
//	public MessagePrinter(MessageOfTheDayService service, @Value("Text ") String name, @Value(">>>> ") String name2) {
//		System.out.println("arg cons : "+this.getClass());
//		this.service = service;
//		this.name = name;
//		this.name2 = name2;
//	}
	
	
//	public MessagePrinter() {
//		System.out.println("no arg cons : "+this.getClass());
//	}

////	@Value("Text ")
//	public void setName(String name) {
//	 this.name = name;
//	 }
//	
////	@Value(">>>> ")
//	 public void setName2(String name2) {
//	 this.name2 = name2;
//	 }
//	 
////	@Autowired
//	 public void setService(MessageOfTheDayService service) {
//			this.service = service;
//		}

	@Override
	public void printMessage() {
		returnMessage();
	}
	
	@Override
	public String returnMessage() {
		String ss=null;
		if(service != null){
		// System.out.println(service.getMessage());
			ss = name + name2 + service.getMessage();
			System.out.println(ss);
			//
//			publisher.publishEvent(new MessagePrinterEvent(this, ss));
		}
		else
			System.out.println("nothing to print");
		
		return ss;	
	}
	
	@Override
	public void printMessage(String s){
		System.out.println(s);
//		throw new IllegalArgumentException();
	}
	
	@Override
	public String test(){
		return "test";
	}


}
