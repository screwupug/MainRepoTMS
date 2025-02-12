package duelGame;

import duelGame.armor.Armor;
import duelGame.armor.HeavyArmor;
import duelGame.armor.LightArmor;
import duelGame.armor.MiddleArmor;
import duelGame.character.Archer;
import duelGame.character.Hero;
import duelGame.character.Paladin;
import duelGame.character.Rogue;
import duelGame.dice.Dice;
import duelGame.weapon.Arch;
import duelGame.weapon.Dagger;
import duelGame.weapon.Sword;
import duelGame.weapon.Weapon;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Dice dice = new Dice(random);
        Hero player1 = chooseYourHero(random, dice);
        Hero player2 = chooseYourHero(random, dice);
        playGame(player1, player2);
    }

    private static Hero chooseYourHero(Random random, Dice dice) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 3, где 1 - паладин, 2 - разбойник 3 - лучник");
        Weapon weapon;
        Armor armor;
        int result = scanner.nextInt();

        switch (result) {
            case 1:
                weapon = new Sword(5, random);
                armor = new HeavyArmor(10, 3);
                return new Paladin(dice, 40, armor, weapon);
            case 2:
                weapon = new Dagger(7, random);
                armor = new MiddleArmor(5, 6);
                return new Rogue(dice, 20, armor, weapon);
            case 3:
                weapon = new Arch(10, random);
                armor = new LightArmor(2, 8);
                return new Archer(dice, 10, armor, weapon);
            default:
                return null;
        }
    }

    private static void playGame(Hero player1, Hero player2) {
        while (player1.isAlive() && player2.isAlive()) {
            takeTurn(player1, player2);

            if (!player2.isAlive()) break;

            takeTurn(player2, player1);

            if (!player1.isAlive()) break;
        }

        System.out.println("\nИгра окончена!");
        if (player1.isAlive()) {
            System.out.println(player1.getName() + " победил!");
        } else {
            System.out.println(player2.getName() + " победил!");
        }
    }

    private static void takeTurn(Hero attacker, Hero defender) {
        Scanner scanner = new Scanner(System.in);
        int damage;
        System.out.println("Ход " + attacker.getName());
        System.out.println("Нажмите Enter, чтобы бросить кубик ");
        scanner.nextLine();
        damage = attacker.attack();
        defender.getDamage(damage);
    }
}
