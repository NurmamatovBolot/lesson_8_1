package kg.geektech.game.players;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth() > 0 && savedDamage == 0) {
            this.savedDamage = (int) (0.5 * boss.getDamage());
            this.setDamage(this.getDamage() + savedDamage);
        }
    }
}
