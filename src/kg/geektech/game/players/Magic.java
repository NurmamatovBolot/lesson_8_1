package kg.geektech.game.players;

import java.util.Random;

public class Magic extends Hero {
    private Random random = new Random();
    private int boostedDamage = 1 + random.nextInt(2-1);

    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].setDamage(heroes[i].getDamage() * boostedDamage);
            }
        }
    }


}
