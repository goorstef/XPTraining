package be.cegeka.battle.weapons;

public class Trident extends Spear {

    @Override
    public int getDamage() {
        return super.getDamage() * 3;
    }
}
