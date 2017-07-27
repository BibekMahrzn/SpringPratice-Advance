package com.denofprogramming;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.denofprogramming.service.MessagePrinter;
//import com.denofprogramming.service.BasicMessageOfTheDayImpl;
import com.denofprogramming.service.MessagePrinterImpl;
import com.denofprogramming.service.logs.AuditLog;
import com.denofprogramming.service.logs.Counter;

public class Client {

	public static void main(final String[] args) {

		// configuration part
		try (ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("springdemo/application.xml")) {
			c.registerShutdownHook();

			// MessagePrinter printer = (MessagePrinter) c.getBean("printer");
			// MessagePrinter printer =
			// c.getBean("printer",MessagePrinter.class);

			// work only for one id
			MessagePrinter printer = (MessagePrinter)c.getBean("hello");

			// doing something part...
			c.start();
			printer.printMessage();
			printer.printMessage("Epic hahaha");
			printer.test();
			
			printer.returnMessage();
			printer.returnMessage();
			printer.returnMessage();
	
			((AuditLog)printer).display();
			System.out.println(((Counter)printer).getCount());
			
			c.stop();

			// BasicMessageOfTheDayImpl b =
			// c.getBean(BasicMessageOfTheDayImpl.class);
			// b.setMessage("Something new");
			// System.out.println(b.getMessage());
			//
			// BasicMessageOfTheDayImpl b2 =
			// c.getBean(BasicMessageOfTheDayImpl.class);
			// System.out.println(b2.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}



/*class A{
	
}

class B{
	private A aobj;
	private A dobj;
	
	public void b(){
		aobj = new A();
		// class B is dependent to class A i.e it is fixed when b() method is called <tightly coupled>
	}
	
	// this is dependency injection passing object externally when the method called
	public void bb(A obj){
		dobj = obj;
		// what r its advantage 
		// decoupling between classes (if A is interface it is much more better as you can pass any class object implementing it)
		// causes inversion of control 
		
		// dobj and obj are different object i m sure they will have different object id 
		// dobj is something handle by container (and this passing of handle is IOC)
	}
}
*/













