package com.lwl.cj.day22;

public class ExceptionDemo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		System.out.println("Start - Main");
		String[] names = "Manoj,Charan,CV,Rajesh,Mahesh,Jayesh,Ramesh".split(",");

				
		for (String name : names) {
			try {
				String sub = name.substring(0, 3);
				System.out.println(sub.toUpperCase());
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			} 
		}

		System.out.println("End - Main");

	}

}
