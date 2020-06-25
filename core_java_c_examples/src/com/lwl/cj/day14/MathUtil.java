package com.lwl.cj.day14;

public final class MathUtil {

	private MathUtil() {
		
	}
	public static int biggest(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	}

	public static int sumOfDigits(int num) {
		if (num > 0 && num <= 9)
			return num;
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

	public static boolean isPrime(int num) {
		if (num < 1) {
			return false;
		}
		if (num != 2 && num % 2 == 0) {
			return false;
		}

		for (int i = 2; i <= (int) Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}
}
