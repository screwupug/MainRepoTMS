package duelGame.dice;

import java.util.Random;

public class Dice {

    private Random random;

    public Dice(Random random) {
        this.random = random;
    }

    public int throwDice() {
        return random.nextInt(1, 6);
    }
}
