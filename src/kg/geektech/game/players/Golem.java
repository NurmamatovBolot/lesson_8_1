package kg.geektech.game.players;

public class Golem extends Hero{
    private int appliedDamage;

    public Golem(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.APPLIED_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                appliedDamage = (int) (heroes.length * (0.2 * boss.getDamage()));
                heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage() + appliedDamage);
            }
        }
    }
}
