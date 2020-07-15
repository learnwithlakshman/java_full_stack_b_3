package com.lwl.cbook.day29;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
	private int pid;
	private String name;

	public Product(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + "]";
	}

}



public class ListExample {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 1, 2, 3, 4, 5, 6 };
		List<Integer> list = Arrays.asList(arr);
		arr = (Integer[]) list.toArray();
		System.out.println(Arrays.toString(arr));

		Stream<Integer> stream = Stream.of(2, 3, 4, 5, 6, 1, 8, 9, 7);

		List<Integer> numList = stream.collect(Collectors.toList());
		System.out.println(numList);

		Collections.sort(numList);
		System.out.println(numList);

		List<Product> prodList = Stream.of(new Product(1001, "A"), new Product(1001, "B"),
				new Product(1004, "MacAirBook"), new Product(1008, "HP 5632"), new Product(1003, "Dell Studio15"))
				.collect(Collectors.toList());

		prodList.sort(Comparator
				.comparing(Product::getPid)
				.thenComparing(Comparator.comparing(Product::getName).reversed())

		);
		System.out.println(prodList);

	}
}
