package com.careerit.sc.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("greetings.xml");
		GreetingService service = context.getBean(GreetingService.class);
		service.showGreetings();

	}
}
