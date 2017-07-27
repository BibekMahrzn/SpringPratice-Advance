package com.denofprogramming.service.logs;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class AuditLogImpl implements AuditLog{

	List<String> logs = new ArrayList<String>();
	
	@Override
	public void add(String s) throws InterruptedException {
		Thread.sleep(1000);
		Date d = GregorianCalendar.getInstance().getTime();
		logs.add(d.toString()+" => "+s);
	}

	@Override
	public void display() {
		for (String string : logs) {
			System.out.println(string);
		}
	}

}
