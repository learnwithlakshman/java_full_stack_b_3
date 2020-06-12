package com.lwl.cj.day4;

import java.util.Scanner;

public class SumOfFirstNEvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value: ");
		int N = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 0) {
				System.out.print(i+" ");
				sum += i;
			}
		}

		System.out.println("\nThe sum of first " + N + " natural number is :" + sum);
		sc.close();
	}
}
