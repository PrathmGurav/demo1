package com.example.demo.GameRelated;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GammingConsole;
import com.example.demo.game.MarioGame;

public class App03GamingSpringBeans {

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

	public static void main(String[] args) {
		try (// 1 Launch a Spring context
				var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class);) {
			context.getBean(GammingConsole.class).up();

			context.getBean(GameRunner.class).run();

		}

	}

}
