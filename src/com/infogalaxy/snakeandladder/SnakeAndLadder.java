package com.infogalaxy.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	
	int position = 0;
	
	Random random = new Random();
	
	public void showPosition(int no) {
		System.out.println("Player "+no+" Position is = "+position);		
	}

	public void playGame(int no) {
		
		int dieNo = random.nextInt(6)+1;
		System.out.println("Die Number="+dieNo);
		
		int option = random.nextInt(3)+1;
		System.out.println("Option Number="+option);
		switch(option) {
		case Constants.NO_PLAY:
				System.out.println("Option = NO PLAY");
				position = position;
			break;
		case Constants.LADDER:
				System.out.println("Option = LADDER");
				position = position + dieNo;
				if(position > 100) {
					position = position - dieNo;
				}
			break;
		case Constants.SNAKE:
				System.out.println("Option = SNAKE");
				position = position - dieNo;
				if(position < 0) {
					position = 0;
				}
			break;
		}
		showPosition(no);
		System.out.println("##########################");
	}
	
	public static void main(String[] args) {
		SnakeAndLadder player1 = new SnakeAndLadder();
		SnakeAndLadder player2 = new SnakeAndLadder();
		player1.showPosition(1);
		player2.showPosition(2);
		while(player1.position != 100 || player2.position != 100) {
			player1.playGame(1);
			player2.playGame(2);
		}
	}
}
