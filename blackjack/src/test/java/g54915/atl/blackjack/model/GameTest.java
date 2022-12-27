/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54915.atl.blackjack.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This is the Game class of the Model's tests.
 *
 * @author g54915
 */
public class GameTest {

    public GameTest() {
    }

    /**
     * This test checks if isPlayerWin() works properly in a general case.
     */
    @Test
    void isPlayerWinGeneralCase() {
        Game game = new Game(new Player(21), new Player(10));
        assertEquals(1, game.isPlayerWin());

        game = new Game(new Player(21), new Player(22));
        assertEquals(1, game.isPlayerWin());
    }

    /**
     * This test checks if isPlayerWin() works properly in case of a draw.
     */
    @Test
    void isPlayerWinDrawCase() {
        Game game = new Game(new Player(21), new Player(21));
        assertEquals(2, game.isPlayerWin());
    }

    /**
     * This test checks if isPlayerWin() works properly in case of a lose.
     */
    @Test
    void isPlayerWinLoseCase() {
        Game game = new Game(new Player(12), new Player(21));
        assertEquals(0, game.isPlayerWin());

        game = new Game(new Player(22), new Player(22));
        assertEquals(0, game.isPlayerWin());
    }

}
