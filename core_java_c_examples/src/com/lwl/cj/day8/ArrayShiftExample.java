package com.lwl.cj.day8;

import java.util.Arrays;

public class ArrayShiftExample {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		// 2,3,4,5,6,7,8,1
		// 3,4,5,6,7,8,1,2
		// 4,5,6,7,8,1,2,3

		System.out.println(Arrays.toString(arr));
		int n = 3;
		int l = arr.length;
		for (int i = 0; i < n; i++) {
			int temp = arr[0];
			for (int j = 0; j < l - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[l - 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	
		int[] temp = new int[arr.length];
		int j=0;
		for(int i=n;i<l;i++,j++) {
			temp[j] = arr[i];
		}
		for(int i=0;i<n;i++) {
			temp[j++] = arr[i];
		}
		System.out.println(Arrays.toString(temp));
		
		System.arraycopy(arr, n, temp, 0,l-n);
		System.arraycopy(arr, 0, temp, l-n,n);
		System.out.println(Arrays.toString(temp));
	
	}

}
