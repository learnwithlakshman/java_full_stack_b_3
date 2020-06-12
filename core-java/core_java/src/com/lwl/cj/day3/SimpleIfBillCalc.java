package com.lwl.cj.day3;

import java.util.Scanner;

public class SimpleIfBillCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount: ");
		float bill_amount = sc.nextFloat();
		float discount_amount = 0;
		float net_amount = bill_amount;

		// byte short char int float double long boolean
		if (bill_amount >= 5000) {
			discount_amount = bill_amount * 0.1f;
			net_amount = bill_amount - discount_amount;
		}

		System.out.println("Bill amount :" + bill_amount);
		System.out.println("Discount :" + discount_amount);
		System.out.println("Net amount:" + net_amount);
		sc.close();
	}
}
