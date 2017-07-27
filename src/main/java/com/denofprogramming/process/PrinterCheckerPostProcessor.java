package com.denofprogramming.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.denofprogramming.service.MessagePrinterImpl;

public class PrinterCheckerPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		if(arg0 instanceof MessagePrinterImpl)
			System.out.println("A I => "+arg1);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		if(arg0 instanceof MessagePrinterImpl)
			System.out.println("B I => "+arg1);
		return arg0;
	}

}
