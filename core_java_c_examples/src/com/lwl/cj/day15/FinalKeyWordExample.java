package com.lwl.cj.day15;

import java.util.Arrays;

final class One{
	int result(int a,int b) {
		return a + b;
	}
}
class Two {
	void showResult() {
		One obj = new One();
		System.out.println(obj.result(10, 20));
	}
}

class Three{
	final void m1() {
		System.out.println("Welcome to java world");
	}
}
class Four extends Three{
	
	void m2() {
		m1();
	}
}

class Product{
	
		private static final String orgName;
		
		static {
			//Logic
			final String name = "SomeName";
			orgName =  name;
		}
	
		private final int pid;
		private final String pname;
		private final double price;
	
		public Product(int pid, String pname, double price) {
			this.pid = pid;
			this.pname = pname;
			this.price = price;
		}
		public Product discount() {
			double amount =  this.price * 0.01;
			return new Product(pid,pname,price-amount);
		}
		public Product updateName(String newName) {
			return new Product(pid, newName, price);
		}
		
		public void showInfo() {
			System.out.println(String.format("%d %s %f", pid,pname,price));
		}
	
}

public class FinalKeyWordExample {
	
		
		public static int sum(final int[] arr) {
			arr[0] = 10;
			int sum =0;
			for(int i=0;i<arr.length;i++) {
				sum += arr[i];
			}
			return sum;
		}
	
	
		public final static void main(final String[] args) {
			
			int[] numArr = new int[] {1,2,3,4,5};
			System.out.println(sum(numArr));
			System.out.println(Arrays.toString(numArr));
			
			
			
			Product p1 = new Product(1001, "Dell XPS", 87654);
			p1.showInfo();
			Product p2 = p1.discount();
			p2.showInfo();
			Product p3 = p1.updateName("Dell Studio 15");
			
			p1.showInfo();
			
		
		}
}
