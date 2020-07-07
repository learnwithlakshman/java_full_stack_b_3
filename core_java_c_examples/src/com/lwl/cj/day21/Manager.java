package com.lwl.cj.day21;

import java.util.function.Function;
import java.util.function.Predicate;

class Student implements Cloneable{
	int regno;
	String name;
	
	public Student(int regno,String name) {
		this.regno = regno;
		this.name = name;
	}

	
	@Override
	protected Student clone() throws CloneNotSupportedException {
		return (Student) super.clone();
	}


	@Override
	public String toString() {
		return "Student [regno=" + regno + ", name=" + name + "]";
	}
	
}


@FunctionalInterface
interface EvenOrOddd{
	
	
	boolean isEven(int ele);
	
	default int countEvenInRange(int a,int b)
	{
		int count =0;
		for(int i=a;i<=b;i++) {
			if(isEven(i))
				count++;
		}
		return count;
	}
	
	public static boolean isEquals(Object obj) {
		return true;
	}
	
}


public class Manager {
	
	
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Predicate<Integer> obj1 = (x)-> x % 2 == 0;
		
		Predicate<String> obj =   (x) -> x.isEmpty();
		
		Student student = new Student(1001, "Krish");
		student.name = "Krishna";
		
		Student s1 = student.clone();
		System.out.println(s1);
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int evenCount = count(arr, (t)->  t % 2 == 0);
		int oddCount =  count(arr,  (t)->  t % 2 != 0);
		int primeCount = count(arr, (ele) -> isPrime(ele));
		System.out.println(evenCount);
		System.out.println(oddCount);
		System.out.println(primeCount);

	}

	private static boolean isPrime(int ele) {
		if (ele < 2)
			return false;
		for (int i = 2; i <= ele / 2; i++)
			if (ele % i == 0)
				return false;

		return true;
	}

	public static int count(int[] arr, Predicate<Integer> predicate) {
		int count = 0;
		for (int ele : arr) {
			if (predicate.test(ele)) {
				count++;
			}
		}
		return count;
	}

}
