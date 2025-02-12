package duelGame.character;

import duelGame.armor.Armor;
import duelGame.dice.Dice;
import duelGame.weapon.Weapon;

public class Hero {

    private Dice dice;
    private int hitPoints;
    private Armor armor;
    private Weapon weapon;

    Hero(Dice dice, int hitPoints, Armor armor, Weapon weapon) {
        this.dice = dice;
        this.hitPoints = hitPoints;
        this.armor = armor;
        this.weapon = weapon;
    }

    public int attack() {
        int diceResult = dice.throwDice();
        int weaponDamage = weapon.getDamage();
        return Math.max(diceResult, weaponDamage);
    }

    public void getDamage(int damage) {
        int totalDamage = armor.getProtection(damage);
        hitPoints = hitPoints - totalDamage;
        System.out.println(getName() + " получает урон " + totalDamage);
    }

    public boolean isAlive() {
        return hitPoints > 0;
    }

    public String getName() {
        return this.getClass().getName();
    }
}
