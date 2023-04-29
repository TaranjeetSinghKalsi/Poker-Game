package com.psl.gems.cardgame.entity;

import java.util.ArrayList;
import java.util.List;

import com.psl.gems.cardgame.model.Card;

public class PokerGame {
	private PackOfCards fullPack;
	private List<Player> players;
	private Player winner;

	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}

	public PokerGame() {
		fullPack = new PackOfCards();
		players = new ArrayList<>();
		winner=null;
	}

	public void registerPlayer(Player player) {
		if (player != null && !players.contains(player)) {
			players.add(player);
		}
	}

	public void play() {
		if (players.size() == 2) {
			fullPack.shuffle();
			
			for (int i = 0; i < 3; i++) {
				for (Player player : players) {
					Card card = fullPack.getTopCard();
					System.out.println(player.getName()+"--->"+ card + "--->" + card.getValue());
					if (card != null) {
						player.addCard(card);
					}
				}
			}

			int highestValue = Integer.MIN_VALUE;
			for (Player player : players) {
				System.out.println("Highest of " + player.getName() + " ---> " + player.getHighestCard());
				int playerHighestValue = player.getHighestCard().getValue();

				if (playerHighestValue > highestValue) {
					highestValue = playerHighestValue;
					winner = player;
				}
			}
			if (winner != null) {
				System.out.println("The winner is: " + winner.getName());
			}
		} else {
			System.out.println("2 players are required to play the game.");
		}
	}

	public PackOfCards getFullPack() {
		return fullPack;
	}

	public void setFullPack(PackOfCards fullPack) {
		this.fullPack = fullPack;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

}