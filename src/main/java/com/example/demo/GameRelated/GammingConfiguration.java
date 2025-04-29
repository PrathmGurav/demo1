package com.example.demo.GameRelated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GammingConsole;
import com.example.demo.game.MarioGame;

@Configuration
public class GammingConfiguration {
	
	@Bean
	public GammingConsole game() {
		var game = new MarioGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GammingConsole game) {
		GameRunner obj = new GameRunner(game);
		return obj;
	}
}
