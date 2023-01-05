package Bowling;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {

    @org.junit.jupiter.api.Test
    void getCurrentFrame() {
        var game = new BowlingGame();
        assertEquals(11, game.getCurrentFrame(21));
        assertEquals(1, game.getCurrentFrame(1));
        assertNotEquals(0, game.getCurrentFrame(5));

    }

    @org.junit.jupiter.api.Test
    void getCurrentBall() {
        var ball = new BowlingGame();
        assertEquals(1, ball.getCurrentBall());
    }

    @org.junit.jupiter.api.Test
    void scoreBall() {
    }

    @org.junit.jupiter.api.Test
    void getBallScore() {
        var ball = new BowlingGame();
        assertEquals(0, ball.getBallScore(1,15));
    }

    @org.junit.jupiter.api.Test
    void isStrike() {
        var strike = new BowlingGame();
        assertFalse(strike.isStrike(9));

    }

    @org.junit.jupiter.api.Test
    void isSpare() {
        var strike = new BowlingGame();
        assertFalse(strike.isStrike(9));
    }
}