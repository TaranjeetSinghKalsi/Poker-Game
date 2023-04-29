package com.psl.gems.cardgame.entity;

import java.util.ArrayList;

import com.psl.gems.cardgame.model.Card;

public class Player {
    private String name;
    private ArrayList<Card> cardsInHand;

    public Player(String name) {
        this.name = name;
        this.cardsInHand=new ArrayList<Card>();
    }

    
    public void setCardsInHand(ArrayList<Card> cardsInHand) {
		this.cardsInHand = cardsInHand;
	}


	public void addCard(Card card) {
        cardsInHand.add(card);
    }

    public ArrayList<Card> getCardsInHand() {
        return cardsInHand;
    }

    public Card getHighestCard() {
        Card highestCard = null;
        for (Card card : cardsInHand) {
            if (highestCard == null || card.getValue() > highestCard.getValue()) {
                highestCard = card;
            }
        }
        return highestCard;
    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
