package be.cegeka.battle.weapons;

public class TwoHandedSword extends Sword {

    @Override
    public int getDamage() {
        return super.getDamage() * 2;
    }
}
