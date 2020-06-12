package com.lwl.cj.day5;

import java.util.Scanner;

public class GenerateNPrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = sc.nextInt();
		int count = 0; 
		int k = 2;
		for (;;) {
			int num = k++;
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
				System.out.print(num+" ");
				count++;
			}
			if(count == n)
				break;
		}
		sc.close();
	}
}
