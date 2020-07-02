package com.lwl.cj.day19;

class TaskManager {

	private static TaskManager obj = null;

	private TaskManager() {
	}
	public synchronized static TaskManager getInstance() {
		if (obj == null) {
			obj = new TaskManager();
		}
		return obj;
	}
}

public class SingletonExample {
	public static void main(String[] args) {
		TaskManager obj1 = TaskManager.getInstance();
		TaskManager obj2 = TaskManager.getInstance();
		TaskManager obj3 = TaskManager.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
