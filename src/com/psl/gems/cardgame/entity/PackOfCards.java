package com.psl.gems.cardgame.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import com.psl.gems.cardgame.model.Card;
import com.psl.gems.cardgame.model.Rank;
import com.psl.gems.cardgame.model.Suit;

class PackOfCards {
    private List<Card> cards;

    public PackOfCards() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card getTopCard() {
        if (!cards.isEmpty()) {
            Card card=cards.get(0);
            cards.remove(0);
            return card;
        }
        return null;
    }

    public void addCard(Card card) {
        if (card != null && !cards.contains(card)) {
            cards.add(card);
        }
    }

    public Card getRandomCard() {
        if (!cards.isEmpty()) {
            Random random = new Random();
            int index = random.nextInt(cards.size());
            return cards.get(index);
        }
        return null;
    }

    public int getSize() {
        return cards.size();
    }

    public void resetAscending() {
        cards.sort(Comparator.comparingInt(Card::getValue));
    }

    public void resetDescending() {
        cards.sort(Comparator.comparingInt(Card::getValue).reversed());
    }
}
