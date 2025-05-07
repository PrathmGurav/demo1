package com.example.demo.SpringXMLConfiguration;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GammingConsole;

public class SimpleLauncherApplication {
	public static void main(String[] args) {
		try (// 1 Launch a Spring context
				var context = new ClassPathXmlApplicationContext("contextConfiguration.xml");) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			context.getBean(GameRunner.class).run();

		}

	}

}
	