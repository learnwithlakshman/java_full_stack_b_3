package com.lwl.cj.day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SearchAnElementInArray {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new FileInputStream("numbers.txt"));
		String str = sc.nextLine();
		String[] arr = str.split(",");
		int[] numArr = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			numArr[i] = Integer.parseInt(arr[i].trim());
		}
		
		sc = new Scanner(System.in);		
		System.out.println("Enter the number to search element in range(1-100) ");
		int num = sc.nextInt();
		
		boolean isFound = false;
		
		for(int i=0;i<numArr.length;i++) {
			if(num == numArr[i]) {
				isFound = true;
				break;
			}
		}
		
		if(isFound) {
			System.out.println(num+" is found in the given list");
		}else {
			System.out.println(num+" is not found in the given list");
		}
		sc.close();
	}
}
