package com.careerit.di.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.careerit.di")
public class Manager {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
			
			LoginService loginService1 = context.getBean(LoginService.class);
			LoginService loginService2 = context.getBean(LoginService.class);
			LoginService loginService3 = context.getBean(LoginService.class);

			System.out.println(loginService1);
			System.out.println(loginService2);
			System.out.println(loginService3);
		}

	}

}
