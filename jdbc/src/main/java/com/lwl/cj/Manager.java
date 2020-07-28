package com.lwl.cj;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;



public class Manager {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();

		List<String> list = new ArrayList<>();
		Class<? extends List> cls = list.getClass();

		Method[] methods = cls.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}

		Class<?> obj = cls.getSuperclass();
		System.out.println(obj);

		Class<?>[] inter = cls.getInterfaces();
		for (Class c : inter) {
			System.out.println(c);
		}
	}

	public static void readFromList(List<? extends Number> list) {
		for (Number n : list) {
			System.out.println(n);
		}
	}
}
