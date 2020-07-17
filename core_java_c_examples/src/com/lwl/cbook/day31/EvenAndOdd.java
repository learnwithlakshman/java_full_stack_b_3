package com.lwl.cbook.day31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenAndOdd {

	public static void main(String[] args) {

		List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 20, 13, 15, 18, 17, 19, 20, 29).mapToInt(e -> e)
				.boxed().collect(Collectors.toList());

		// "EVEN"  => 2,4,6....   "ODD" => 1,3,5  
		
		Map<String,List<Integer>> map = new HashMap<>();
		
		// Logic
		
		String e = "EVEN";
		String o = "ODD";
		
		map.put(e, new ArrayList<>());
		map.put(o, new ArrayList<>());

		list.stream().forEach(ele->{
			
			if(ele % 2 == 0) {
				List<Integer> l = map.get(e);
				l.add(ele);
				map.put(e, l);
			}else {
				List<Integer> l = map.get(o);
				l.add(ele);
				map.put(o, l);
			}
			
		});
		
		
		
	
	
	}
}
