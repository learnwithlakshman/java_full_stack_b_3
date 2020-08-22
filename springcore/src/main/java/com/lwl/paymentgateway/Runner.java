package com.lwl.paymentgateway;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.lwl.paymentgateway")
public class Runner {

		public static void main(String[] args) {
			try(AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(Runner.class)){
				
					PaymentGatewayConfig config = context.getBean(PaymentGatewayConfig.class);
					config.initPayment();
			}
		}
}
