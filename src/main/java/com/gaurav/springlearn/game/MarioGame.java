package com.gaurav.springlearn.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MarioQualifier")
public class MarioGame implements GamingConsole {
		
	public void up() {
		System.out.println("Move up...");
	}
	
	public void down() {
		System.out.println("Move down...");
	}
	
	public void left() {
		System.out.println("Move backwards...");
	}
	
	public void right() {
		System.out.println("Move forwards...");
	}

}
