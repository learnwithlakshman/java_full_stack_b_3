package com.lwl.cj.day14;

public class StaticBlockExample {
	static int a = 10;
	static {
		a = 100;
		a++;

	}

	{
		a++;
	}

	public static void main(String[] args) {

		StaticBlockExample obj1 = new StaticBlockExample();
		StaticBlockExample obj2 = new StaticBlockExample();
		System.out.println(StaticBlockExample.a);
	}

}
