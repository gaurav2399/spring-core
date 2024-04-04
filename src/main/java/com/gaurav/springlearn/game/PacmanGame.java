package com.gaurav.springlearn.game;

import com.gaurav.springlearn.game.GamingConsole;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacmanGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Move in space");
		
	}

	@Override
	public void down() {
		System.out.println("Move to earth");
	}

	@Override
	public void left() {
		System.out.println("Move in left");
	}

	@Override
	public void right() {
		System.out.println("Move in right");
	}

}
