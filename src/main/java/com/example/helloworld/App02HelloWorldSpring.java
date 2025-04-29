package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;
import com.example.demo.game.SuperContra;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		try(//1 Launch a Spring context
				var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		){
			//2 configure things that we want spring to manage - @Configuration
			//HelloWorldConfiguration class --> @Configuration Annotation
			//name --> @Bean
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("MyName"));
			
			System.out.println(context.getBean("person"));
			
//			Calling Bean by Type
//			Here error can be posssible when there are tow or more beans of this class (No matters their names are different)
			System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean("person2ByMethodCall"));
			
			System.out.println(context.getBean("person3ByParameters"));

		}

		
		
	}

}
