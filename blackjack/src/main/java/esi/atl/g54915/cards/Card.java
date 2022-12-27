/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g54915.cards;

/**
 * This is the Card class.
 *
 * @author g54915
 */
public class Card {

    private Color col;
    private Value val;

    /**
     * Simple constructor of a Card.
     *
     * @param col color of the card.
     * @param val value of the card.
     */
    public Card(Color col, Value val) {
        if (col == null || val == null) {
            throw new IllegalArgumentException("The parameters are not suitable.");
        }
        this.col = col;
        this.val = val;
    }

    /**
     * Simple getter of color.
     *
     * @return the color.
     */
    public Color getCol() {
        return col;
    }

    /**
     * Simple toString method.
     *
     * @return a string with the value and color of the Card.
     */
    @Override
    public String toString() {
        return val + " of " + col;
    }

    /**
     * This method gets the value as an integer of the card.
     *
     * @return an integer representing the value of the card for the game.
     */
    public int value() {
        return val.getValue();
    }

}
