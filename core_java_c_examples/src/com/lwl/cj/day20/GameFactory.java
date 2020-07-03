package com.lwl.cj.day20;

public final class GameFactory {
	private GameFactory() {
		
	}
	public static Game getGame(int ch) {
		
		Game game = null;
		switch (ch) {
		case 1:
			game = new Bike();
			break;
		case 2:
			game = new Bicycle();
			break;
		case 3:
			game = new Ship();
			break;

		}
		return game;
	}
}
