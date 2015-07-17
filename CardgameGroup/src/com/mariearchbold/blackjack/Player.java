package com.mariearchbold.blackjack;

import java.util.ArrayList;

import com.mariearchbold.blackjack.Card.suitEnum;

public class Player {
	int gamesWon =0;
	int currentScore =0;
	String name = "";
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}

	public static ArrayList<Card> deck = new ArrayList<>();


	public int getGamesWon() {
		return gamesWon;
	}
	public void setGamesWon(int gamesWon) {
		this.gamesWon = gamesWon;
	}
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = this.currentScore+ currentScore;
	}
	public static void main(String[] args) {


		//first player
		Player player1 = new Player();


		//second player
		Player player2 = new Player();


	}

	//	public int hit() {
	//		
	//	}
	//	
	public static void populateDeck(suitEnum suit){
		int suitLimit = (52 / 4);


		for(int i = 2, j = 0; i < (suitLimit + 2); ++i){

			j = i;

			if(i == 14){

				Card tempCard = new Card(11, suit);
				deck.add(tempCard);
				continue;
			}
			
			if(i > 9){
				j = 10;
			}

			Card tempCard = new Card(j , suit);

			deck.add(tempCard);
		}
	}
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
	
//	public String getName(){
//		return this.name;
//		
//		
//	}
}
