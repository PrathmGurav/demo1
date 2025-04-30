package com.example.demo.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private GammingConsole game;
	
//** Here GameRunner Class tightly copuled to the specific game class	
	public  GameRunner(GammingConsole game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running Game "+ game );
		game.up();
		game.down();
		game.left();
		game.rigth();
	}
	
	

}
