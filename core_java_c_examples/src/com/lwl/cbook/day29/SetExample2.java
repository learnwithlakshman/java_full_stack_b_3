package com.lwl.cbook.day29;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class SetExample2 {

	public static void main(String[] args) {
		List<Integer> list = new Random().ints(1, 100).limit(30).boxed().collect(Collectors.toList());
		System.out.println(list);
		Set<Integer> set = new HashSet<>();
		set.addAll(list);
		System.out.println(set);
		
		
	}
}
