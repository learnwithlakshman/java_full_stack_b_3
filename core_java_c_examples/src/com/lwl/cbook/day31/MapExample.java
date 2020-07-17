package com.lwl.cbook.day31;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {

	public static void main(String[] args) {

		List<Integer> list = Stream.of(1, 3, 4, 5, 6, 2, 8, 9, 10, 7).mapToInt(e -> e).boxed()
				.collect(Collectors.toList());

		// K -> V -> K * K
		Map<Integer, Integer> map = list.stream().collect(Collectors.toMap(e -> e, e -> e * e));

		Set<Integer> keys = map.keySet();

		System.out.println(keys);

		Collection<Integer> values = map.values();
		System.out.println(values);
		
		for(Integer key:keys) {
			System.out.println(key +" = "+map.get(key));
		}
		
		// Java8
		
		keys.stream().forEach(key->{
			System.out.println(key +" = "+map.get(key));
		});
		
		//
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		
		entrySet.stream().forEach((entry)->{
			System.out.println(entry.getKey()+" <=> "+entry.getValue());
		});

	}
}
