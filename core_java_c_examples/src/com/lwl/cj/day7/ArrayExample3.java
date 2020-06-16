package com.lwl.cj.day7;

import java.util.Arrays;

public class ArrayExample3 {
	public static void main(String[] args) {
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			int num = (int) (Math.random() * 50);
			arr[i] = num;
		}

		System.out.println(Arrays.toString(arr));
		// Get me all prime number
		int count = 0;
		int num = 27;
		for (int i = 0; i < arr.length; i++) {
			int ele = arr[i];
			if (ele % num == 0) {
				System.out.print(ele + " ");
				count++;
			}
		}

		if (count == 0) {
			System.out.println("There are no elements which are divisiable by " + num);
		}

	}
}
