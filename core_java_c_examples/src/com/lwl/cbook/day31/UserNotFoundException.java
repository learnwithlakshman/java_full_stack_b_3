package com.lwl.cbook.day31;

public class UserNotFoundException extends Exception {

		private String message;

		public UserNotFoundException(String message) {
			super(message);
		}
		
		
}
