package com.lwl.cj.day5;

import java.util.Scanner;

public class PrintPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
					System.out.print(j);
			}
			System.out.println();
		}

		sc.close();
	}
}
