/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g54915.cards;

/**
 * Enumeration of cards values.
 *
 * @author g54915
 */
public enum Value {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8),
    NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10);

    private final int faceValue;

    Value(int value) {
        faceValue = value;
    }

    /**
     * Simple getter of the value of the card.
     *
     * @return an integer representing the value of the card.
     */
    public int getValue() {
        return faceValue;
    }
}
