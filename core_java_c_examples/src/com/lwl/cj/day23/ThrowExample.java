package com.lwl.cj.day23;

import java.util.Scanner;

class NumberOperations{
	
		int division(int a,int b) {
			if(b == 0) {
				throw new ArithmeticException("Argument 2 can't 0");
			}
			return a / b;
		}
		
		
	
}


public class ThrowExample {
	public static void main(String[] args) {
		System.out.println("Main");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1 :");
		int a = sc.nextInt();
		System.out.println("Enter the number2 :");
		int b = sc.nextInt();
		int res = a / b;
		System.out.println(res);
		System.out.println("End of main");
	}
}
