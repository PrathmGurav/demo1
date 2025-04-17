package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
	public static void main(String args[]) {
		
		//1 Launch a Spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2 configure things that we want spring to manage - @Configuration
	} 
	
}
