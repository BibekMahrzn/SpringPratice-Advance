package com.denofprogramming.service.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinterListner implements ApplicationListener<MessagePrinterEvent>{

	@Override
	public void onApplicationEvent(MessagePrinterEvent paramE) {
		System.out.println("init .... ");
		try {
			Thread.sleep(3000);
			System.out.println(">>>"+paramE.toString());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("fin ....");
	}

}
