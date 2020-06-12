package com.lwl.cj.day5;

import java.util.Scanner;

public class GeneratePrimeInRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lb value:");
		int lb = sc.nextInt();
		System.out.println("Enrter the ub value:");
		int ub = sc.nextInt();

		for (int k = lb; k <= ub; k++) {
			int num = k;

			boolean isPrime = true;
			if (num <= 1) {
				isPrime = false;
			} else {
				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime) {
				System.out.println(num);
			}
		}
		sc.close();
	}

}
