package com.denofprogramming.service.logs;

public interface AuditLog {
	
	public void add(String s) throws InterruptedException;
	
	public void display();

}
