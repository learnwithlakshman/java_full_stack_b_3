package com.lwl.cbook.day27;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		
				try {
					List<String> lines = Files.readAllLines(Paths.get("resources/numbers.txt"));
					List<Integer> list = new ArrayList<>();
	
					for(String line:lines) {
						String[] arr = line.split(",");
						List<Integer> t = extractStrToNumber(arr);
						list.addAll(t);
						
					}
									
					
					List<Integer> div3list = nubmersDivisibleBy(list,3);
					System.out.println(div3list);
					List<Integer> div5list = nubmersDivisibleBy(list,5);
					System.out.println(div5list);
				} catch (IOException e) {
					e.printStackTrace();
				}
	}

	private static List<Integer> nubmersDivisibleBy(List<Integer> list, int i) {
		List<Integer> tempList = new ArrayList<>();
		for(Integer ele:list) {
			if(ele % i == 0) {
				tempList.add(ele);
				
			}
		}
		
		return tempList;
	}

	private static List<Integer> extractStrToNumber(String[] lines) {
		List<Integer> list = new ArrayList<>();
		
		for(String l:lines) {
			list.add(Integer.parseInt(l.trim()));
		}
		return list;
	}
}
