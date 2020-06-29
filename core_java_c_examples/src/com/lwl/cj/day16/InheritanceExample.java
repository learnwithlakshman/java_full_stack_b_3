package com.lwl.cj.day16;

class One{
	int a;
	int b;
	public int add() {
		return a + b;
	}
}

class Two extends One{
		
	public int mul() {
		return a * b;
	}
}

public class InheritanceExample {
	public static void main(String[] args) {
		Two obj = new Two();
		obj.a = 10;
		obj.b = 20;
		
		System.out.println(obj.add());
		System.out.println(obj.mul());
	}
}
