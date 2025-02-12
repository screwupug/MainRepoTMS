package duelGame.character;

import duelGame.armor.Armor;
import duelGame.dice.Dice;
import duelGame.weapon.Weapon;

public class Archer extends Hero {

    public Archer(Dice dice, int hitPoints, Armor armor, Weapon weapon) {
        super(dice, hitPoints, armor, weapon);
    }
}
