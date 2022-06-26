package kg.geektech.game.players;

import java.util.Random;

public class Thor extends Hero {

    boolean withoutOneRound;
    private Random random = new Random();

    public Thor(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.EXIT_ROUND);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        if (this.getHealth() > 0) {
            withoutOneRound = random.nextBoolean();
            if (withoutOneRound) {
                boss.setDamage(0);
            } else {
                boss.setDamage(50);
            }

        }
    }
}
