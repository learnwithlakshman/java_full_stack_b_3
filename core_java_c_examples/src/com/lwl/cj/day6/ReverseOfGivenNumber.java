package com.lwl.cj.day6;

import java.util.Scanner;

public class ReverseOfGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int rev = 0;
		rev = reverseOfNumber(n);
		System.out.println("Reverse of :" + n + " is :" + rev);
		if (n == rev) {
			System.out.println(n + " is palindrome");
		} else {
			System.out.println(n + " is not a palindrome");
		}

		int l = 10;
		for (int i = 1; i <= l; i++) {
			if(i % 3 == 0)
				continue;
			System.out.println(i);
		}

		sc.close();
	}

	public static int reverseOfNumber(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return rev;
	}

	public static int sumOfDigits(int num) {
		while (num > 9) {
			int sum = 0;
			while (num != 0) {
				sum += num % 10;
				num /= 10;
			}
			num = sum;
		}
		return num;
	}

	public static int sumOfDigitsUntilSingleDigit(int num) {
		while (num > 9) {
			int sum = num % 10 + num / 10;
			num = sum;
		}
		return num;
	}

}
