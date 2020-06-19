package com.lwl.cj.day8;

public class Search3Elements {
	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int e1 = 3;
		int e2 = 4;
		int e3 = 11;
		
		if(isAllElementsPresent(arr, e1, e2, e3)) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}

	}

	public static boolean isAllElementsPresent(int arr[], int e1, int e2, int e3) {
		if (isPresent(arr, e1) && isPresent(arr, e2) && isPresent(arr, e3)) {
			return true;
		}
		return false;
	}

	public static boolean isPresent(int[] arr, int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (ele == arr[i])
				return true;
		}
		return false;
	}
}
