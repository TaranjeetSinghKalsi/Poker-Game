package com.psl.gems.cardgame.model;

public class Card {
    private final Suit suit;
    private final Rank rank;
    
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
    
    public Suit getSuit() {
        return suit;
    }
    
    public Rank getRank() {
        return rank;
    }
    
    public int getValue() {
        return rank.getWeight() * 4 + suit.getWeight();
    }

    @Override
    public String toString() {
        return suit + "-" + rank;
    }
}