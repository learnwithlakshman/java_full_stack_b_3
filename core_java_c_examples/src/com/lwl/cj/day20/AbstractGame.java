package com.lwl.cj.day20;

public abstract class AbstractGame implements Game {

	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName()+" game is going start");
	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+" game is going stop");
		
	}

}
