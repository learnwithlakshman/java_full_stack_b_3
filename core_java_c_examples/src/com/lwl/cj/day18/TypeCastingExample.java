package com.lwl.cj.day18;

import java.util.Random;

class One {
	public void m1() {
		System.out.println("One - M1");
	}
}

class Two extends One {
	@Override
	public void m1() {
		System.out.println("Two - M1");
	}

	public void m2() {
		System.out.println("Two - M2");
	}
}

class Three extends One {
	@Override
	public void m1() {
		System.out.println("Three - M1");
	}

	public void m3() {
		System.out.println("Three - M3");
	}
}

public class TypeCastingExample {
	public static void main(String[] args) {
		One one = getInstance();
		one.m1();
		
		if(one instanceof Two) {
			Two two = (Two)one;
			two.m1();
			two.m2();
		}else if(one instanceof Three) {
			Three three = (Three)one;
			three.m1();
			three.m3();
		}
		
	}

	private static One getInstance() {
		
		int num = new Random().nextInt(2)+1;
		System.out.println(num);
		if (num % 2 == 0)
			return new Two();
		else
			return new Three();

	}
}
