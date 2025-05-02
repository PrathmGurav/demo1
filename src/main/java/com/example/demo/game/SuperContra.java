package com.example.demo.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifire")
public class SuperContra implements GammingConsole{
	public void up() {
		System.out.println("SuperContra Go Up");
	}
	
	public void down() {
		System.out.println("SuperContra Go down");
	}
	
	public void left() {
		System.out.println("SuperContra Go left");
	}
	
	public void rigth() {
		System.out.println("SuperContra Go right");
		
	}
}
