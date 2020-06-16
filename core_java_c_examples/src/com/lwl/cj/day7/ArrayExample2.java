package com.lwl.cj.day7;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		// int[] arr = new int[]{101,102,103,104,105};
		// int[] arr = {101,102,103,104,105};
		for (int i = 0; i < 10; i++) {
			int num = (int)(Math.random() * 20);
			arr[i] = num;
		}
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
		// Java 5
		System.out.println();
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
	}
}
