package com.lwl.cj.day15;

public class MathOperations {

	public  int sum(int a, int b) {
		return a + b;
		
	}
	public int sum(int a,int b,int c) {
		return a + b + c;
	}
	public int sum(int a,int b,int c,int d) {
		return a + b + c + d;
	}

	public int sum(int... arr) {
		
		return 0;
	}
	
	public  static void main(String... args) {
		MathOperations obj = new MathOperations();
		byte a = 1;
		int b = 10;
		System.out.println(obj.sum(a));
	}

}
