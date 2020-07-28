package com.lwl.thread;

public class TaskManager {

	private static volatile TaskManager obj;

	private TaskManager() {
	}

	public void showActiveProcesses() {
		System.out.println("Show all processes");
	}

	public void killProcess(int pid) {
		System.out.println("Killed process with id :" + pid);
	}

	public static TaskManager getInstance() {

		if (obj == null) {
			synchronized (TaskManager.class) {
				if (obj == null) {
					obj = new TaskManager();
				}
			}
		}
		return obj;
	}

}
