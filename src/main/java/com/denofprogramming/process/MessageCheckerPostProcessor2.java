package com.denofprogramming.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;

import com.denofprogramming.service.MessageOfTheDayService;

public class MessageCheckerPostProcessor2 implements BeanPostProcessor, PriorityOrdered {

	private int order;

	public void setOrder(int order) {
		this.order = order;
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return order;
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		if (arg0 instanceof MessageOfTheDayService) {
			MessageOfTheDayService s = (MessageOfTheDayService) arg0;
			if (!"".equals(s.getMessage()))
				System.out.println("A I2 => " + arg1 + "  " + s.getMessage());
		}
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		if (arg0 instanceof MessageOfTheDayService) {
			MessageOfTheDayService s = (MessageOfTheDayService) arg0;
			if (!"".equals(s.getMessage()))
				System.out.println("B I2 => " + arg1 + "  " + s.getMessage());
		}
		return arg0;
	}

}
