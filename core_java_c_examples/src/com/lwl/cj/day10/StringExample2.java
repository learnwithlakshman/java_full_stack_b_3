package com.lwl.cj.day10;

public class StringExample2 {
	public static void main(String[] args) {
		String data = " krish,manoj ,charan,Ramesh,mahesh ,Suresh";

		String[] arr = data.split(",");
		for (String name : arr) {
			String shortName = name.trim().toUpperCase().substring(0, 3);
			System.out.println(shortName);
		}

		String name = "manoj";
		for (int i = name.length() - 1; i >= 0 ; i--) {
				System.out.println(name.charAt(i));
		}

	}
}
