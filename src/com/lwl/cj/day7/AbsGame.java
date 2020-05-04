package com.lwl.cj.day7;

public abstract class AbsGame implements Game {

	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName()+" is started");
	}

	
	@Override
	public void stop() {

		System.out.println(this.getClass().getSimpleName()+" is stoped");
		
	}
	
}
