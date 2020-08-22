package com.lwl.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.lwl.jdbc")
public class Runner {

		public static void main(String[] args) {
			try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Runner.class)){
				
					ProductDao productDao = context.getBean(ProductDao.class);
					productDao.showProductCount();
					productDao.showProducts();
				
			}
		}
}
