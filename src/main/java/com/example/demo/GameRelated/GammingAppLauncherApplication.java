package com.example.demo.GameRelated;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GammingConsole;

@Configuration
@ComponentScan("com.example.demo.game") //To tell where is the Componets are presents
public class GammingAppLauncherApplication {

//At the place of MarioGame @Component annotation is placed so its instance/obj will be created through GammingConsole interface
//	@Bean
//	public GammingConsole game() {
//		var game = new MarioGame();
//		return game;
//	}

//	@Bean
//	public GameRunner gameRunner(GammingConsole game) {
//		System.out.println(game);
//		GameRunner obj = new GameRunner(game);
//		return obj;
//	}

	public static void main(String[] args) {
		try (// 1 Launch a Spring context
				var context = new AnnotationConfigApplicationContext(GammingAppLauncherApplication.class);) {
			context.getBean(GammingConsole.class).up();

			context.getBean(GameRunner.class).run();

		}

	}

}
