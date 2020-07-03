package com.lwl.cj.day20;

import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		Manager obj = new Manager();
		obj.showMessage();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. Bike 2. Bicycle 3. Ship 4. Exit");
			int ch = sc.nextInt();
			if (ch == 4) {
				System.out.println("Application is going to close....");
				break;
			}
			Game game = GameFactory.getGame(ch);
			if (game != null) {
				game.start();
				game.play();
				game.stop();
			}else {
				System.out.println("Please enter value between 1-3 only");
			}
			
		}
		sc.close();
	}
	
	public void showMessage() {
		System.out.println("..................Message.................");
	}

	
}
