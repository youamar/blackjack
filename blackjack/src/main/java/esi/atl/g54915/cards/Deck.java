/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g54915.cards;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This is the Deck class.
 *
 * @author g54915
 */
public class Deck {

    ArrayList<Card> cards = new ArrayList<>();

    /**
     * Simple constructor of a deck.
     */
    public Deck() {

        for (Color col : Color.values()) {
            for (Value val : Value.values()) {
                cards.add(new Card(col, val));
            }
        }
    }

    /**
     * Simple getter of a deck.
     *
     * @return a deck of 52 cards.
     */
    public Deck getDeck() {
        return this;
    }

    /**
     * This method shuffles a deck of cards.
     *
     */
    public void shuffle() {
        if (!this.isEmpty()) {
            Collections.shuffle(this.cards);
        } else {
            throw new IllegalArgumentException("There is nothing to shuffle, the deck is empty.");
        }
    }

    /**
     * This method checks if a deck is empty or not.
     *
     * @return true if the deck is empty and false otherwise.
     */
    public boolean isEmpty() {
        return this.cards.isEmpty();
    }

    /**
     * This method removes of the deck the card that the user picked.
     *
     * @return the card that has been removed of the deck.
     */
    public Card hit() {
        if (!this.isEmpty()) {
            Card chosenCard = this.cards.get(0);
            this.cards.remove(0);
            return chosenCard;
        } else {
            throw new IllegalArgumentException("There is nothing to hit, the deck is empty.");
        }
    }

    /**
     * This method saves in a list cards based on the number that the user
     * entered.
     *
     * @param nb number of cards between 1 and 52.
     * @return the list of cards based on the number that the user entered.
     */
    public ArrayList<Card> chosenCards(int nb) {
        ArrayList<Card> chosen = new ArrayList<>();
        while (!this.isEmpty() && nb >= 1 && nb <= 52) {
            chosen.add(this.hit());
            nb--;
        }
        return chosen;
    }

    /**
     * This method gets the number of cards in the deck.
     *
     * @return the number of cards in the deck.
     */
    public int size() {
        return this.cards.size();
    }

    /**
     * Simple toString method.
     *
     * @return a string with the cards of the deck.
     */
    @Override
    public String toString() {
        return this.cards.toString();
    }

}
