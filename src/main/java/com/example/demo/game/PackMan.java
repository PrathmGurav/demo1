package com.example.demo.game;

import org.springframework.stereotype.Component;

@Component
public class PackMan implements GammingConsole{
	public void up() {
		System.out.println("PackMan Go Up");
	}
	
	public void down() {
		System.out.println("PackMan Go down");
	}
	
	public void left() {
		System.out.println("PackMan Go left");
	}
	
	public void rigth() {
		System.out.println("PackMan Go right");
		
	}
}
