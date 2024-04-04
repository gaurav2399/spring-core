package com.gaurav.springlearn.game;

import com.gaurav.springlearn.game.GamingConsole;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	GamingConsole gameConsole;
	
	public GameRunner(GamingConsole console) {
		this.gameConsole = console;
	}
	
	public void run() {
		System.out.println("Mario Game starts running...");
		gameConsole.up();
		gameConsole.down();
		gameConsole.left();
		gameConsole.right();
	}

}

