/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54915.atl.blackjack.model;

import esi.atl.g54915.cards.Card;
import esi.atl.g54915.cards.Deck;
import java.util.ArrayList;

/**
 * This is the Player class.
 *
 * @author g54915
 */
public class Player {

    ArrayList<Card> cards = new ArrayList<>();
    private boolean isPlay = true;
    private int total = 0;

    /**
     * Simple constructor of player. //for the tests
     *
     * @param total the total score.
     */
    public Player(int total) {
        this.total = total;
    }

    /**
     * Simple constructor of player.
     */
    public Player() {
    }

    /**
     * This method deals a card and adds its value to the total score.
     *
     * @param deck a deck of 52 cards.
     * @return the dealt card.
     */
    public Card dealCard(Deck deck) {
        Card card = deck.hit();
        cards.add(card);
        total += card.value();
        return card;
    }

    /**
     * This method puts isPlay at false cause the player doesn't want to hit
     * anymore.
     */
    public void stand() {
        isPlay = false;
    }

    /**
     * This method checks if the player is playing or not.
     *
     * @return true if the player is playing and false otherwise.
     */
    public boolean isPlaying() {
        return isPlay;
    }

    /**
     * Simple getter of score.
     *
     * @return the total of the score.
     */
    public int getScore() {
        return total;
    }

}
