package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GammingConsole;
import com.example.demo.game.MarioGame;
import com.example.demo.game.SuperContra;

@Configuration
public class App03GamingSpringBeans {
	public static void main(String[] args) {
		try(//1 Launch a Spring context
				var context = new AnnotationConfigApplicationContext(GammingConfiguration.class);
		){
			context.getBean(GammingConsole.class).up();
			
			context.getBean(GameRunner.class).run();

		}
		

	}


}
