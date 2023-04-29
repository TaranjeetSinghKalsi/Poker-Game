package com.psl.gems.client;

import com.psl.gems.cardgame.entity.Player;
import com.psl.gems.cardgame.entity.PokerGame;
import com.psl.gems.cardgame.util.HtmlGenerator;

public class TestClient {

    public static void main(String[] args) {
    	Player player1= new Player("Ramesh");
    	Player player2= new Player("Suresh");
    	PokerGame pokerGame=new PokerGame();
        pokerGame.registerPlayer(player1);
        pokerGame.registerPlayer(player2);
        
        if(pokerGame.getPlayers().size()==2)
        pokerGame.play();
        
        HtmlGenerator htmlGenerator=new HtmlGenerator(pokerGame);
        htmlGenerator.createHtml();
        
        
    }
}
