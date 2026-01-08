package com.numbergame;

import java.util.*;

public class Game {
	private int  currentNumber = 0;
	private Player player1;
	private Player player2;
	private Scanner sc =new Scanner(System.in);

	Game(Player p1, Player p2){
		this.player1 = p1;
		this.player2 = p2;
	}
	
	public void startGame() {
		Player currPlayer =player1;
		
		while(currentNumber < 20) {	
			System.out.println(currPlayer.getName() + " has the chance ");
			System.out.print("Enter the choices : ");
			int choices = sc.nextInt();
			if(choices <1 || choices >3) {
				System.out.println("Enter the valid number ...");
				continue;
			}
			for(int i=1 ; i<=choices; i++) {
				currentNumber++;
				
				if (currentNumber == 20) {
                    System.out.println(currPlayer.getName() + " You LOST!`");
                }
			}
			currPlayer = (currPlayer == player1) ? player2 : player1;
		}
		
	}
	
}
