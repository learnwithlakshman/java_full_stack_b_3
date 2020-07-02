package com.lwl.cj.day19;

abstract class One {
	public abstract void m1();

	protected abstract void m2();

	public void m3() {
		System.out.println("This is m3 method from One");
	}
}

abstract class Two extends One {
	Two() {

	}

	@Override
	public void m1() {
		System.out.println("This is m1 method from Two");
	}
}

class Three extends Two {
	@Override
	public void m2() {
		System.out.println("This is m2 method from Three");
	}
}

abstract class NumberOperations {
	
	public abstract boolean isPrime(int num);

	public int[] getPrimeNumbersInRange(int lb, int ub) {
		int[] arr = new int[primeCountInRange(lb, ub)];
		int i = 0;
		for (int j = lb; j <= ub; j++) {
			if (isPrime(j)) {
				arr[i++] = j;
			}
		}
		return arr;
	}

	public abstract int primeCountInRange(int lb, int ub);
}

class PrimeNumberGen extends NumberOperations{

	@Override
	public boolean isPrime(int num) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int primeCountInRange(int lb, int ub) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

public class AbstractClassExample2 {
	public static void main(String[] args) {
		One obj = new Three();
		obj.m1();
		obj.m2();
		obj.m3();
		
		NumberOperations numOpe = new PrimeNumberGen();
		numOpe.getPrimeNumbersInRange(10, 200);
	}
}
