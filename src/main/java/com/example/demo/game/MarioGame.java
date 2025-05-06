package com.example.demo.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GammingConsole{
	public void up() {
		System.out.println("MarioGame Go Up");
	}
	
	public void down() {
		System.out.println("MarioGame Go down");
	}
	
	public void left() {
		System.out.println("MarioGame Go left");
	}
	
	public void rigth() {
		System.out.println("MarioGame Go right");
		
		
	}
}
