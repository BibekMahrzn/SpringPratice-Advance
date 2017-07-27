package com.denofprogramming.service.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class PointCuts {
	
//	@Pointcut("execution(* com.denofprogramming.service.MessagePrinter.printMessage(..))")
//	@Pointcut("execution(public String com.denofprogramming.service.MessagePrinter.printMessage(..))")
	@Pointcut("execution(* com.denofprogramming.service.MessagePrinter.*(..))")
//	@Pointcut("execution(* com.denofprogramming.service.MessagePrinter.printMessage(String,..))")
	public void name(){}
	
	@Pointcut("execution(* com.denofprogramming.service.MessagePrinter.returnMessage(..))")
	public void logg(){}

}

