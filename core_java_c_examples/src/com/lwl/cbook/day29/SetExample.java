package com.lwl.cbook.day29;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		// Generate 100 unique number between 1 to 1000

		Set<Integer> set =new HashSet<>();
		while(set.size()<=100) {
			int num = (int) (Math.ceil(Math.random() * 1000));
			set.add(num);
		}
		
		System.out.println(set);
	}
}
