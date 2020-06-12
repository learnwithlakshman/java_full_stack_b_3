
package com.lwl.cj.day2;

import java.util.Scanner;
/**
 * Write a program to accept two numbers from the user, calculate the sum and display the same.
 * Expected output:
 
	<br>Enter the num1 value:
	<br>10
	<br>Enter the num2 value:
	<br>20
	<br>Sum of 10 and 20 is 30
 */
public class SumOfTwoNumber {
	
	public static void main(String[] args) {
		/*
		 * int num1 = 100;
		 * int num2 = 200;
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2:");
		int num2 = sc.nextInt();
		
		int res = sum(num1,num2);
		System.out.println(num1+" + "+num2+" = "+res);  // to print result
		sc.close();
	}

	/**
	 * This method accepts two integers and return the sum of those two integers
	 * @param a int
	 * @param b int
	 * @return int
	 */
	public static int sum(int a, int b) {
		int s = a + b;
		return s;
	}
}
