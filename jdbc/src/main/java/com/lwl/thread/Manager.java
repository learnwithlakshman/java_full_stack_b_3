package com.lwl.thread;

public class Manager {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 3; i++) {
				TaskManager taskManager = TaskManager.getInstance();
				System.out.println(taskManager);
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 3; i++) {
				TaskManager taskManager = TaskManager.getInstance();
				System.out.println(taskManager);
			}
		});
		Thread t3 = new Thread(() -> {
			for (int i = 1; i <= 3; i++) {
				TaskManager taskManager = TaskManager.getInstance();
				System.out.println(taskManager);
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
	}
}
