package com.careerit.sc.di;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GreetingService {

	private Greetings greetings;
	
	public void showGreetings() {
		System.out.println("Hello,\n\t" + greetings.formatedMessage());
	}
}
