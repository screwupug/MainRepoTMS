package duelGame.weapon;

import java.util.Random;

public abstract class Weapon {
    private int damage;
    private Random random;

    Weapon(int attack, Random random) {
        this.damage = attack;
        this.random = random;
    }

    public int getDamage() {
        return random.nextInt(0, damage);
    }
}
