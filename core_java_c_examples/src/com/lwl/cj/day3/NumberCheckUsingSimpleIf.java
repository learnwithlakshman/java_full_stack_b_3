package com.lwl.cj.day3;

import java.util.Scanner;

public class NumberCheckUsingSimpleIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount:");
		int amount = sc.nextInt();
		if (amount < 0) {
			amount = -amount;
		}
		System.out.println("Entered amount is :" + amount);
		sc.close();
	}
}
