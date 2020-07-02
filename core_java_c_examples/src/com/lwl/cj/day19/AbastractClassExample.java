package com.lwl.cj.day19;


abstract class Game{
	public void start() {
		System.out.println("The game started...");
	}

	public abstract void play();
	
	public void stop() {
		System.out.println("The game stopped...");
	}
}

class Car extends Game{

	@Override
	public void play() {
		System.out.println("You are playing .... Car game");
	}
}
class Bicycle extends Game{

	@Override
	public void play() {
		System.out.println("You are playing... Bicycle game");
	}
	
}

public class AbastractClassExample {
	public static void main(String[] args) {
		
		Game game = new Bicycle();
		game.start();
		game.play();
		game.stop();
		
	}
}
