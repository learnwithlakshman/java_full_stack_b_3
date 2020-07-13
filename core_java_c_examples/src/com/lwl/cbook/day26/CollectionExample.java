package com.lwl.cbook.day26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class CollectionExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
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
		
		
		Iterator<Integer> iterator = list.iterator();
		System.out.println("Using iterator");
		while(iterator.hasNext()) {
			int ele = iterator.next();
//			if(ele > 1005) {
//				iterator.remove();
//			}
			System.out.println(ele);
		}
		System.out.println(list);
		
		System.out.println("List Iteraator");
		
		ListIterator<Integer> listItr = list.listIterator();
		
		while(listItr.hasNext()) {
			int ele = listItr.next();
			if(ele <= 1005) {
				listItr.set(2020);
			}
			System.out.println(ele);
		}
		
		System.out.println("Reverse traverse");
		
		while(listItr.hasPrevious()) {
			int ele = listItr.previous();
			System.out.println(ele);
		}
		
		
	}
}
