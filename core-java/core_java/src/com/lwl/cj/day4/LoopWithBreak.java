package com.lwl.cj.day4;

import java.util.Scanner;

public class LoopWithBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 2;; i++) {

			if (i % 2 == 0) {
				sum += i;
			}
			if (sum >= num) {
				System.out.println("Sum value is :" + sum + " and num " + num);
				break;
			}

		}
		sc.close();

	}
}
