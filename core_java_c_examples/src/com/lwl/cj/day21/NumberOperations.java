package com.lwl.cj.day21;

public interface NumberOperations {

		public boolean isPrime(int num);
		public int[] primeInRange(int lb,int ub);
		
		default int primeCountInRange(int lb,int ub) {
			int arr[] = primeInRange(lb, ub);
			return arr.length;
		}
	
}
