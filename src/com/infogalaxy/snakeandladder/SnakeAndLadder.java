package com.infogalaxy.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		/**
		 * Variable for defining player position in game
		 */
		int position = 0;
		int count_dieRoll = 0;
		final int NO_PLAY = 1;
		final int LADDER = 2;
		final int SNAKE = 3;
		/**
		 * Random class object to generate Die Number between 1-6
		 */
		Random random = new Random();
		
		System.out.println("Player 1 Start Position is = "+position);

		while(position != 100) {
		
			int dieNo = random.nextInt(6)+1;
			System.out.println("Die Number="+dieNo);
			
			count_dieRoll++;
			
			int option = random.nextInt(3)+1;
			System.out.println("Option Number="+option);
			switch(option) {
			case NO_PLAY:
					System.out.println("Option = NO PLAY");
					position = position;
				break;
			case LADDER:
					System.out.println("Option = LADDER");
					position = position + dieNo;
					if(position > 100) {
						position = position - dieNo;
					}
				break;
			case SNAKE:
					System.out.println("Option = SNAKE");
					position = position - dieNo;
					if(position < 0) {
						position = 0;
					}
				break;
			}
			System.out.println("New Position = "+position);
			System.out.println("##########################");
		}
		System.out.println("Total Count of Die Roll to Win the Game = "+count_dieRoll);
	}

}
