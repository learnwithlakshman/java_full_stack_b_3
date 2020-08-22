package com.careerit.sc.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.careerit.sc.scope")
public class Runner {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Runner.class)) {

			ContactService dao = context.getBean(ContactService.class);
			System.out.println(dao.getContactNames());
		}
	}
}
