package com.lwl.cj.day7;

public class ArrayExample1 {

	public static void main(String[] args) {
		System.out.println(args.length);
		int empno = Integer.parseInt(args[0]);
		String name = args[1];
		float salary = Float.parseFloat(args[3 + 4 - 8]);
		System.out.println(empno);
		System.out.println(name);
		System.out.println(salary + 1000);
		
	}
}
