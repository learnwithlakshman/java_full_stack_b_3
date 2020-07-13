package com.lwl.cbook.day27;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListExample2 {

	public static void main(String[] args) {
		String data1 = "44, 87, 39, 54, 75, 40, 70, 28, 12, 60";
		String data2 = " 6, 23, 35, 32, 87, 74, 8, 30, 50, 45,99";
		String data3 = " 26, 33, 36, 38, 88, 77, 84, 39, 52, 46,79";

		String str =  new StringBuilder(data1).append(",").append(data2).append(",").append(data3).toString();
		
		List<Integer> list = new ArrayList<>();
		
		for(String s:str.split(",")) {
			list.add(Integer.parseInt(s.trim()));
		}
//		
//		List<Integer> oddList = new ArrayList<>();
//		
//		for(Integer ele:list) {
//			if(ele % 2 != 0) {
//				oddList.add(ele);
//			}
//		}
		
		// 3 but not 6
		
		list.stream().filter(e-> e % 3 == 0 && e % 6 !=0 ).collect(Collectors.toList()).forEach(e->{
			System.out.println(e);
		});
		
		List<Integer> oddList = list.stream().filter(ele-> ele % 2 != 0).collect(Collectors.toList());
		
		System.out.println(oddList);
		
		
		int ele = 99;
		List<Integer> searchList = Stream.of(39,23,77).collect(Collectors.toList());
		
		System.out.println(list.contains(ele));
		System.out.println(list.containsAll(searchList));
		
		
		// List => (even) -> odd give me new list
		
		List<Integer> evenList = new ArrayList<>();
		list.stream().forEach(e->{
			if(e % 2 == 0) {
				evenList.add(e+1);
			}else {
				evenList.add(e);
			}
		});
		System.out.println(evenList);

	}
}
