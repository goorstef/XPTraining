package be.cegeka.battle;

import be.cegeka.battle.weapons.BareFists;
import be.cegeka.battle.weapons.Weapon;

public class Soldier {

    private Weapon weapon;

    public Soldier() {
        this.weapon = new BareFists();
    }

    public Soldier equipWith(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public boolean fight(Soldier otherSoldier) {
        // TODO eventually also add modifiers for individual soldier strength & speed etc
        return weapon.isBetterThan(otherSoldier.weapon);
    }
}
