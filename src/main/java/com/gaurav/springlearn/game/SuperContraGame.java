package com.gaurav.springlearn.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {
	
	public void up() {
		System.out.println("Jump...");
	}
	
	public void down() {
		System.out.println("Go into hole...");
	}
	
	public void left() {
		System.out.println("Stop...");
	}
	
	public void right() {
		System.out.println("Accelerate...");
	}

}
