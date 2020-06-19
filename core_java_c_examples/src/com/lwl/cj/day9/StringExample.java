package com.lwl.cj.day9;

import java.util.Arrays;
import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+(i+1)+" value");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		increment(arr);
		System.out.println(Arrays.toString(arr));
		int a = 100;
		System.out.println(a);
		increment(a);
		System.out.println(a);
		sc.close();
	}
	
	public static void increment(int[] numArr) {
			for(int i=0;i<numArr.length;i++) {
				numArr[i] = ++numArr[i];
			}
			System.out.println(Arrays.toString(numArr));
	}
	public static void increment(int a) {
		a = a + 1;
		System.out.println(a);
	}
}
