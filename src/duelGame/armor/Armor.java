package duelGame.armor;

public abstract class Armor {

    private int protection;
    private int durability;

    Armor(int protection, int durability) {
        this.durability = durability;
        this.protection = protection;
    }

    public int getProtection(int damage) {
        if (durability <= 0) return damage;
        int finalDamage = Math.max(protection - damage, 0);
        durability--;
        return finalDamage;
    }
}
