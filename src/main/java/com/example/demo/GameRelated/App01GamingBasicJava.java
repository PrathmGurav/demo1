package com.example.demo.GameRelated;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GammingConsole;
import com.example.demo.game.SuperContra;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
//		var game = new MarioGame();
		var game = new SuperContra();

		var gameRunner = new GameRunner(game);
		//game is dependency for gameRunner class
		
		gameRunner.run();
	}

}
