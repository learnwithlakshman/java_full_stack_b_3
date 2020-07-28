package com.lwl.thread;

import java.util.concurrent.TimeUnit;



class MyThread extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println(Thread.currentThread() + " - " + i);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyThreadWithRunnable implements Runnable {
	@Override
	public void run() {
		try {
			for (int i = 1001; i <= 1010; i++) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println(Thread.currentThread() + " - " + i);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {

		/*
		 * Thread thread = Thread.currentThread(); System.out.println(thread);
		 * System.out.println(thread.getThreadGroup());
		 * System.out.println(thread.getPriority());
		 * System.out.println(thread.getName());
		 * 
		 * int ele = 1 / 0; System.out.println(ele);
		 */
		System.out.println("Main method");
		Runnable r = () -> {
			try {
				for (int i = 1001; i <= 1010; i++) {
					TimeUnit.SECONDS.sleep(1);
					System.out.println(Thread.currentThread() + " - " + i);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		Thread t1 = new Thread(r, "T1");
		MyThread t2 = new MyThread();
		t2.setName("T2");

		t1.start();
		t2.start();
		System.out.println("End of main method");

	}
}
