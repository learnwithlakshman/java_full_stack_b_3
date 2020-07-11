package com.lwl.cbook.day26;

import java.util.LinkedList;
import java.util.List;

public class CollectionExample {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();
		list.add(1001);
		list.add(1005);
		list.add(1009);
		list.add(1010);
		System.out.println(list);
		list.add(1,1010);
		System.out.println(list);
		list.set(0, 1009);
		System.out.println(list.toString());
		System.out.println(list.contains(1010));
		System.out.println(list.indexOf(1010));
		
		for(int i=0;i<list.size();i++) {
			int ele = list.get(i);
			System.out.println(ele);
		}
		System.out.println("Using for each loop");
		for(int ele:list) {
			System.out.println(ele);
		}
		System.out.println("Using streams");
		list.stream().forEach(e->System.out.println(e));
	}
}
