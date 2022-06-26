package kg.geektech.game.players;

import java.util.Random;

public class Warrior extends Hero {

    private static Random random = new Random();
    private int criticalDamage;

    public Warrior(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth() > 0 && criticalDamage == 0) {
            this.criticalDamage = 2 + random.nextInt(4 - 2);
            this.setDamage(this.getDamage() * criticalDamage);
        }

    }
}
