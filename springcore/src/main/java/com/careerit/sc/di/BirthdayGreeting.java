package com.careerit.sc.di;

import org.springframework.stereotype.Component;


public class BirthdayGreeting implements Greetings {
	
		private String message="Many Many Happy Return of Day!";

		@Override
		public String formatedMessage() {
			return this.message.toUpperCase();
		}
		
		
	
}
