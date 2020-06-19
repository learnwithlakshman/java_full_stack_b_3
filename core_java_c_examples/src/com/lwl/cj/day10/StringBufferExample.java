package com.lwl.cj.day10;

public class StringBufferExample {
	public static void main(String[] args) {
		String name = "Krish";
		String empno = "1001";
		float salary = 356766;
		String city = "BZA";
		// Name:{name}, Empno: {empno} , Salary:{salary} and City: {city}
		StringBuffer sb = new StringBuffer();
		String profile = new String();
		profile = sb.append("Name:").append(name).append(", Empno").append(empno).append(", Salary").append(salary)
					.append("and City").append(city).toString();
			
			
			System.out.println(profile);
	
		
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		String data = "12343214";
		data = null;
		boolean isTrue = new StringBuffer(data).reverse().toString().equals(data);
		if(isTrue) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}
}
