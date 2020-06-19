package com.lwl.cj.day10;

public class StringExample1 {
	public static void main(String[] args) {
		String name1 = "krish";
		String name2 = "krish";
		String name3 = "KRISH";
		
		System.out.println(name1 == name2);
		System.out.println(name2 == name3);
		
		name2 = name2.toUpperCase();
	
		System.out.println(name1 == name2);
		System.out.println(name2 == name3);
		System.out.println(name1.equals(name2));
		System.out.println(name2.equals(name3));
		
	}
}
