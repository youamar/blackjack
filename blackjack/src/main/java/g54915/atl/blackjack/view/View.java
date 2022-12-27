/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54915.atl.blackjack.view;

import esi.atl.g54915.cards.Card;
import java.util.ArrayList;

/**
 * This is the View class.
 *
 * @author g54915
 */
public class View {

    /**
     * This method displays the game's title in a h4ck3r way.
     */
    public void printStart() {
        System.out.println("     ---------------");
        System.out.println("        BL4CKJ4CK   ");
        System.out.println("     ---------------");
    }

    /**
     * This method asks the player for a wish of hit.
     */
    public void askPlayerTurn() {
        System.out.println("Do you want to hit ? yes/no");
    }

    /**
     * This method displays a card.
     *
     * @param c a card.
     */
    public void printCard(Card c) {
        System.out.println("      " + c);
    }

    /**
     * This method displays the ending result of the round.
     *
     * @param playerWin an integer representing the player's winning status.
     */
    public void printEnd(int playerWin) {
        switch (playerWin) {
            case 0:
                System.out.println("        You Lose !");
                break;
            case 1:
                System.out.println("        You Win !");
                break;
            case 2:
                System.out.println("        Draw !");
                break;
        }

        System.out.println("      ---------------");
    }

    /**
     * This method asks the player for a wish of playing.
     */
    public void askPlayerToPlay() {
        System.out.println("Do you want to play ? yes/no");
    }

    /**
     * This method displays the first hand of the player.
     *
     * @param cards the cards of the player
     */
    public void printPlayerFirstHand(ArrayList<Card> cards) {
        System.out.println("       Your Cards : ");
        printCard(cards.get(0));
        printCard(cards.get(1));
        System.out.println("      ---------------");

    }

    /**
     * This method displays the first hand of the bank with a hidden card like
     * it's done in BlackJack.
     *
     * @param cards the cards of the bank.
     */
    public void printBankFirstHand(ArrayList<Card> cards) {
        System.out.println("      Bank Cards : ");
        printCard(cards.get(2));
        System.out.println("      HIDDEN CARD");
        System.out.println("      ---------------");

    }

    /**
     * This method displays the score of the player.
     *
     * @param totalPlayer the score of the player.
     */
    public void printScorePlayer(int totalPlayer) {
        System.out.println("      Your score : " + totalPlayer);
        System.out.println("      ---------------");
    }

    /**
     * This method displays the score of the bank.
     *
     * @param totalBank the score of the bank.
     */
    public void printScoreBank(int totalBank) {
        if (totalBank != -1) {
            System.out.println("      Bank score : " + totalBank);
        }
        System.out.println("      ---------------");
    }

    /**
     * This method asks the player for a wish to play an other round or not.
     */
    public void askPlayerToReplay() {
        System.out.println("Do you want to play an other round ? yes/no");
    }

}
