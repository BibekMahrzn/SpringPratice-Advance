package com.denofprogramming.service.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

import com.denofprogramming.service.logs.AuditLog;
import com.denofprogramming.service.logs.Counter;


@Component
@Aspect
public class LogAspects {

	@DeclareParents(value="com.denofprogramming.service.*MessagePrinterImpl",defaultImpl=com.denofprogramming.service.logs.AuditLogImpl.class)
	public AuditLog log;
	
	@DeclareParents(value="com.denofprogramming.service.*MessagePrinterImpl",defaultImpl=com.denofprogramming.service.logs.CounterImpl.class)
	public Counter counted;
	
}
