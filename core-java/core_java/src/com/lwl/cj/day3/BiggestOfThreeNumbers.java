package com.lwl.cj.day3;

import java.util.Scanner;

public class BiggestOfThreeNumbers {
	public static void main(String[] args) {
		// (exp) ? statement1 : (exp) ? statement2: statement3;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1:");
		int a = sc.nextInt();
		System.out.println("Enter the num2:");
		int b = sc.nextInt();
		System.out.println("Enter the num2:");
		int c = sc.nextInt();
		int res;
		
		if (a > b && a > c) {
			res = a;
		} else if (b > c) {
			res = b;
		} else {
			res = c;
		}

//		int res = (a > b && a > c) ? a : (b > c) ? b : c;
		System.out.println("Biggest is :" + res);
		sc.close();
	}
}
