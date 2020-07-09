package com.lwl.cj.day24;

public class InsufficientBalanceException extends Exception{
	
	private String message;

	public InsufficientBalanceException(String message) {
		this.message = message;
	}

	public InsufficientBalanceException() {
		this.message = "You don't have sufficient balance to withdraw";
	}

	@Override
	public String toString() {
		return "InsufficientBalanceException [message=" + message + "]";
	}
	
	
	
	
	

}
