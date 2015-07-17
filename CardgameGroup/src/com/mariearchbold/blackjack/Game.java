package com.mariearchbold.blackjack;

import java.util.Collections;

import com.mariearchbold.blackjack.Card.suitEnum;

public class Game {
	static Player p1 = new Player();
	static Player p2 = new Player();

	//	public Game() {
	//		
	//		
	//	}

	public static void main(String[] args) {
		Game game = new Game();
		playGame();
		p1.setName("Player 1");
		p2.setName("Player 2");
		game.gameLoop(p1);
		game.gameLoop(p2);
		//System.out.print(Player.deck + " " + Player.deck.size());
		game.checkScores();

	}


	private void gameLoop(Player player) {
		while(player.getCurrentScore()<18){
			player.setCurrentScore(Player.deck.get(0).getValue());
			System.out.println(Player.deck.get(0));
			Player.deck.remove(0);
			System.out.println(player.getName() + player.getCurrentScore());
		

		}
	}

	public static void playGame(){
		Player.populateDeck(suitEnum.HEARTS);
		Player.populateDeck(suitEnum.DIAMONDS);
		Player.populateDeck(suitEnum.SPADES);
		Player.populateDeck(suitEnum.CLUBS);

		Collections.shuffle(Player.deck);
	}

	public void checkScores(){
		//p1.setCurrentScore(21);
		//p2.setCurrentScore(21);
		if(p1.getCurrentScore() >21 && p2.getCurrentScore()>21){
			System.out.println("lose");
		}else if(p1.getCurrentScore() > p2.getCurrentScore()){
			System.out.println("Player 1 wins");
		}else if(p2.getCurrentScore() > p1.getCurrentScore()){
			System.out.println("Player 2 wins");
		}
	}
}


