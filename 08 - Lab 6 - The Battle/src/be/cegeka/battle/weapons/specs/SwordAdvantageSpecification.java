package be.cegeka.battle.weapons.specs;

import be.cegeka.battle.weapons.Axe;
import be.cegeka.battle.weapons.Sword;
import be.cegeka.battle.weapons.Weapon;

public class SwordAdvantageSpecification implements WeaponAdvantageSpecification {

    @Override
    public Class<? extends Weapon> appliesTo() {
        return Sword.class;
    }

    @Override
    public boolean hasAdvantageOver(Weapon weapon) {
        return Axe.class.isAssignableFrom(weapon.getClass());
    }

}
