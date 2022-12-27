/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54915.atl.blackjack.controller;

import esi.atl.g54915.cards.Card;
import g54915.atl.blackjack.model.Game;
import g54915.atl.blackjack.view.View;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the Controller class.
 *
 * @author g54915
 */
public class Controller {
    
    Game game = new Game();
    View v = new View();
    
    /**
     * This method starts the game.
     */
    public void start() {
        v.printStart();
        v.askPlayerToPlay();
        Scanner kbd = new Scanner(System.in);
        String t = kbd.nextLine();
        while (t.equalsIgnoreCase("yes")) {
            ArrayList<Card> cards = game.start();
            v.printPlayerFirstHand(cards);
            v.printScorePlayer(game.getScorePlayer());
            v.printBankFirstHand(cards);
            while (!game.isGameFinished()) {
                if (game.isPlayerPlaying()) {
                    v.askPlayerTurn();
                    t = kbd.nextLine();
                    Card playerCard = game.playerTurn(t.equalsIgnoreCase("Yes"));
                    if (playerCard != null) {
                        v.printCard(playerCard);
                        v.printScorePlayer(game.getScorePlayer());
                    }
                }
                if (game.isBankPlaying()) {
                    Card bankCard = game.bankTurn();
                    if (bankCard != null) {
                        v.printCard(bankCard);
                    }
                }
            }
            v.printEnd(game.isPlayerWin());
            v.printScorePlayer(game.getScorePlayer());
            v.printScoreBank(game.getScoreBank());
            
            v.askPlayerToReplay();
            t = kbd.nextLine();
        }
    }
    
}
