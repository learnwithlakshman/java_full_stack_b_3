package com.careerit.sc.di;


public class SessionalGreetings implements Greetings {

	private String message = "Happy new year";
	
	@Override
	public String formatedMessage() {
		return message.toUpperCase();
	}

}
