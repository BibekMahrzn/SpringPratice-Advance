package com.denofprogramming.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denofprogramming.model.MessageValue;

@Service("dMessage")
public class DynamicMessageOfTheDayImpl implements MessageOfTheDayService {
	
	private String[] message2 = {};
	
	private MessageValue[] messages; // initialization not required
	
	private List<MessageValue> messageList;
	@Inject
	private Map<String, MessageValue> messageMap; // autowire use string(which is id) as key
	
//	public DynamicMessageOfTheDayImpl(){
//		System.out.println("no arg cons : " + this.getClass());
//	}
	
	public void setMessageMap(Map<String, MessageValue> messageMap) {
		// making a copy
		this.messageMap.putAll(messageMap);
	}

	public void setMessageList(List<MessageValue> messageValue) {
		// making a copy
		this.messageList.addAll(messageValue);
	}
	
//	@Autowired
//	public DynamicMessageOfTheDayImpl(List<MessageValue> messageList) {   // rather than this which is list with MessageValue
//		this.messageList = messageList;
//	}
	
	// does spring container prefare this one than above constructor as it directly refers to MessageValue 
//	public DynamicMessageOfTheDayImpl(MessageValue[] messages) {
//		this.messages = messages;
//	}

//	public DynamicMessageOfTheDayImpl(String[] message) {
//		this.message2 = (String[])message.clone();
//	}

	public String getMessage(){
		final int day = GregorianCalendar.getInstance().get(Calendar.DAY_OF_WEEK);
//		final String message = messages[day -1].getMessage();
//		String message = messageList.get(day -1).getMessage()+"<list>";
		String message = messageMap.get(String.valueOf(day)).getMessage()+"<Map>";
//		String message = message2[day-1];
 		return message;
	}
	
	public void setMessages(MessageValue[] messages){
		this.messages = (MessageValue[])messages.clone();
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
