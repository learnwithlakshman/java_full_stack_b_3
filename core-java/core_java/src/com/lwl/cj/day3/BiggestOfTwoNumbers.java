package com.lwl.cj.day3;

import java.util.Scanner;

public class BiggestOfTwoNumbers {
	public static void main(String[] args) {
		// (exp) ? statement1 : statement2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1:");
		int a = sc.nextInt();
		System.out.println("Enter the num2:");
		int b = sc.nextInt();
		int res = (a > b) ? a : b;
		System.out.println("Biggest is: "+res);
		sc.close();
	}
}
