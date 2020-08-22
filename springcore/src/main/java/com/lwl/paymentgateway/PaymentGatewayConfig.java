package com.lwl.paymentgateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class PaymentGatewayConfig {
		
		@Value("${paytm.mid}")
		private String mid;
		@Value("${paytm.mobile}")
		private String mobile;
		@Value("${paytm.email}")
		private String email;
		
		public void initPayment() {
			System.out.println("Mid :"+mid);
			System.out.println("Mobile:"+mobile);
			System.out.println("Email :"+email);
		}
		
}
