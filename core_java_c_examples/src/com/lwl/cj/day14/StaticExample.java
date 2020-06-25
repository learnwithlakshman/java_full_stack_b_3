package com.lwl.cj.day14;

public class StaticExample {

	public StaticExample() {
		System.out.println("Constructor");
	}
	{
		System.out.println("IIB -1");
	}
	{
		System.out.println("IIB -2");
	}

	static {
		System.out.println("Static Block -1");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		StaticExample obj1 = new StaticExample();
		StaticExample obj2 = new StaticExample();
		
	}

	static {
		System.out.println("Static Block -2");
		
	}
}
