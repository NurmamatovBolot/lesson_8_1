package kg.geektech.game.players;

public class Witcher extends Hero{
    public Witcher(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.GIVE_LIFE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0) {
                heroes[i].setHealth(this.getHealth());
                this.setHealth(0);
                break;
            }
        }
    }
}
