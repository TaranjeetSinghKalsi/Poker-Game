package com.psl.gems.cardgame.model;

public enum Suit {
    CLUB(0), DIAMOND(1), HEART(2), SPADE(3);
    
    private final int weight;
    
    Suit(int weight) {
        this.weight = weight;
    }
    
    public int getWeight() {
        return weight;
    }
}
