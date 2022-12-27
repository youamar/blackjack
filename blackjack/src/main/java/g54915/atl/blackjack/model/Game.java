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
 * This is the Game class.
 *
 * @author g54915
 */
public class Game implements Model {

    private Player bank;
    private Player player;
    private Deck deck;

    /**
     * Simple constructor of the game. // for the tests
     *
     * @param player a player.
     * @param bank the bank.
     */
    public Game(Player player, Player bank) {
        this.bank = bank;
        this.player = player;
    }

    /**
     * Simple constructor of the game.
     */
    public Game() {

    }

    /**
     * This method checks if the player is losing.
     *
     * @param player a player.
     * @return true if the player is losing and false otherwise.
     */
    @Override
    public boolean isLosing(Player player) {
        if (player.getScore() > 21) {
            return true;
        }
        return false;
    }

    /**
     * This method says if the bank is playing or not.
     *
     * @return true if the bank is playing and false otherwise.
     */
    @Override
    public boolean isBankPlaying() {
        return bank.isPlaying();
    }

    /**
     * This method says if the player is playing or not.
     *
     * @return true if the player is playing and false otherwise.
     */
    @Override
    public boolean isPlayerPlaying() {
        return player.isPlaying();
    }

    /**
     * This method is used when it's the bank's turn, the bank hits cards until
     * it reaches 17 on its score.
     *
     * @return null to stop the hit and the hitted card otherwise.
     */
    @Override
    public Card bankTurn() {
        if (bank.isPlaying() && !this.isLosing(player)) {
            if (bank.getScore() < 17) {
                return bank.dealCard(deck);
            } else {
                bank.stand();
            }
        }
        return null;
    }

    /**
     * This method is used when it's the player's turn, the player can choose if
     * he wants to hit or stand.
     *
     *
     * @param choice the player's choice hit or stand.
     * @return the hitted card or null otherwise.
     */
    @Override
    public Card playerTurn(boolean choice) {
        if (player.isPlaying()) {
            if (choice) {
                return player.dealCard(deck);
            } else {
                player.stand();
            }
        }
        return null;
    }

    /**
     * This method checks if the game is finished or not.
     *
     * @return true if the game is finished and false otherwise.
     */
    @Override
    public boolean isGameFinished() {
        return (!(isPlayerPlaying() || isBankPlaying())) || (this.isLosing(bank) || this.isLosing(player));
    }

    /**
     * Simple getter of player's score.
     *
     * @return the score of the player.
     */
    @Override
    public int getScorePlayer() {
        return player.getScore();
    }

    /**
     * Simple getter of bank's score.
     *
     * @return the score of the bank.
     */
    @Override
    public int getScoreBank() {
        return bank.getScore();
    }

    /**
     * This method does what is required on the start of a game.
     *
     * @return the cards.
     */
    @Override
    public ArrayList<Card> start() {
        deck = new Deck();
        bank = new Player();
        player = new Player();
        deck.shuffle();
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(player.dealCard(deck));
        cards.add(player.dealCard(deck));
        cards.add(bank.dealCard(deck));
        bank.dealCard(deck);
        return cards;
    }

    /**
     * This method checks if the player won or not.
     *
     * @return 0 if the player lost, 1 if the player won and 2 if there is a
     * draw.
     */
    @Override
    public int isPlayerWin() {
        if (!isLosing(player)) {
            if (isLosing(bank)) {
                return 1;
            } else if ((player.getScore() > bank.getScore())) {
                return 1;
            } else if (player.getScore() == bank.getScore()) {
                return 2;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

}
