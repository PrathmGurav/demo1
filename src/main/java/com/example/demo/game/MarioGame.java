package com.example.demo.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GammingConsole{
	public void up() {
		System.out.println("Go Up");
	}
	
	public void down() {
		System.out.println("Go down");
	}
	
	public void left() {
		System.out.println("Go left");
	}
	
	public void rigth() {
		System.out.println("Go right");
	}
}
