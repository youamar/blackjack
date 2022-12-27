/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54915.atl.blackjack.model;

import esi.atl.g54915.cards.Card;
import java.util.ArrayList;

/**
 * This is the Model interface.
 *
 * @author g54915
 */
public interface Model {

    public boolean isLosing(Player player);

    public boolean isBankPlaying();

    public boolean isPlayerPlaying();

    public Card bankTurn();

    public Card playerTurn(boolean choice);

    public boolean isGameFinished();

    public int getScorePlayer();

    public int getScoreBank();

    public ArrayList<Card> start();

    public int isPlayerWin();
}
