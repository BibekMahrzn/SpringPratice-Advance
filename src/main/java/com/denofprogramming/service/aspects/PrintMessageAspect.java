package com.denofprogramming.service.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.denofprogramming.service.logs.AuditLog;
import com.denofprogramming.service.logs.Counter;

@Component
@Aspect
final public class PrintMessageAspect {
	
//	@Pointcut("execution(* com.denofprogramming.service.MessagePrinter.printMessage(..))")
//	public void name(){}

//	@Before("execution(* com.denofprogramming.service.MessagePrinter.printMessage(..))")
//	@Before("PointCuts.name()")
//	public void before(JoinPoint p){
//		System.out.println("Message Before => "+p.getSignature());
////		System.out.println(p.getKind());
////		System.out.println(p.getSignature().getName());
////		System.out.println(p.getSignature().getDeclaringType());
//	}
//	
//	
//	@After("PointCuts.name()")
//	public void after(JoinPoint p){
//		System.out.println("Message After => "+p.getSignature());
//	}
//	
//	@AfterReturning(pointcut="PointCuts.name()",returning="name")
//	public void afterReturning(JoinPoint p,String name){
//		System.out.println("Message("+name+")After Returning => "+p.getSignature());
//	}
//	
//	@AfterThrowing(pointcut="PointCuts.name()",throwing="ex")
//	public void afterThrowing(JoinPoint p,Exception ex){
//		System.out.println("Message Exception => "+ex+" on "+p.getSignature());
//	}
	
	@AfterReturning(pointcut="PointCuts.logg()",returning="value")
	void magic(JoinPoint join,String value) throws InterruptedException{
		AuditLog log = (AuditLog)join.getThis();
		Counter counted = (Counter)join.getThis();
		counted.increase();
		log.add(value);
//		log.display();
	}
	
}
