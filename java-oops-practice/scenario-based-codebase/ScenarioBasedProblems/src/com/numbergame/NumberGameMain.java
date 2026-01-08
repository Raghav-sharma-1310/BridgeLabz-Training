package com.numbergame;

public class NumberGameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player("Player 1");
		Player p2 = new Player("Player 2");
		
        Game g1 =new Game(p1, p2);
        g1.startGame();
	}

}
