package com.lwl.cj.day8;

import java.util.Arrays;

public class ArrayMinAndMax {
	public static void main(String[] args) {
		int[] arr = getArrayFromSomeSource();
		int min;
		int max;
		min = max = arr[0];
		System.out.println(Arrays.toString(arr));
		for(int i=1;i<arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("Min :"+min);
		System.out.println("Max :"+max);
		
		
	}

	private static int[] getArrayFromSomeSource() {
		return new int[] {3,4,5,6,7,8,9,1,3,4,5,6,7,8,9};
	}
}
