package com.example.demo.game;

public class GameRunner {
	private MarioGame marioGame;
	
//** Here GameRunner Class tightly copuled to the specific game class	
	public  GameRunner(MarioGame marioGame) {
		// TODO Auto-generated constructor stub
		this.marioGame = marioGame;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running Game "+ marioGame );
		marioGame.up();
		marioGame.down();
		marioGame.left();
		marioGame.rigth();
	}
	
	

}
