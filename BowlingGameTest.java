package Bowling;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {

    @org.junit.jupiter.api.Test
    void getCurrentFrame() {
    }

    @org.junit.jupiter.api.Test
    void getCurrentBall() {
    }

    @org.junit.jupiter.api.Test
    void scoreBall() {
    }

    @org.junit.jupiter.api.Test
    void getBallScore() {
    }

    @org.junit.jupiter.api.Test
    void isStrike() {
        var strike = new BowlingGame();
        assertEquals(false, strike.isStrike(9));

    }

    @org.junit.jupiter.api.Test
    void isSpare() {
        var strike = new BowlingGame();
        assertFalse(strike.isStrike(9));
    }
}