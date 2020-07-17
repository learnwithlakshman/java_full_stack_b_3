package com.lwl.cbook.day30;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapExample {

	public static void main(String[] args) {
			mapWithNumbers();
	}

	private static void mapWithNumbers() {
		List<Integer> list = IntStream.range(1, 21).boxed().collect(Collectors.toList());
		//k -> key , k^2 -> value
		
		Map<Integer,Integer> map = new HashMap<>();
		for(Integer i:list) {
			map.put(i, i*i);
		}
		
		list.stream().collect(Collectors.toMap(e->e, e->e*2));
		System.out.println(map);
		
	}
	
	private static void mapWithString() {
		String data = "A,B,C,D,E,A,B,E,C,D,E,G,B,L,M,N,G,S,M,N,T";

		Map<String, Integer> map = new HashMap<>();

		for (String d : data.split(",")) {

			map.putIfAbsent(d, 0);
			map.put(d, map.get(d) + 1);

		}

		System.out.println(map);
	}
}
