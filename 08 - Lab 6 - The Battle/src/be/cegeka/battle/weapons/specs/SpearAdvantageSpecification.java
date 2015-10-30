package be.cegeka.battle.weapons.specs;

import be.cegeka.battle.weapons.Spear;
import be.cegeka.battle.weapons.Sword;
import be.cegeka.battle.weapons.Weapon;

public class SpearAdvantageSpecification implements WeaponAdvantageSpecification {

    @Override
    public Class<? extends Weapon> appliesTo() {
        return Spear.class;
    }

    @Override
    public boolean hasAdvantageOver(Weapon weapon) {
        return Sword.class.isAssignableFrom(weapon.getClass());
    }

}
