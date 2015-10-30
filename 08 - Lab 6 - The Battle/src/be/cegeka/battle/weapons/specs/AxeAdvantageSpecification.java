package be.cegeka.battle.weapons.specs;

import be.cegeka.battle.weapons.Axe;
import be.cegeka.battle.weapons.Spear;
import be.cegeka.battle.weapons.Weapon;

public class AxeAdvantageSpecification implements WeaponAdvantageSpecification {

    @Override
    public Class<? extends Weapon> appliesTo() {
        return Axe.class;
    }

    @Override
    public boolean hasAdvantageOver(Weapon weapon) {
        return Spear.class.isAssignableFrom(weapon.getClass());
    }

}
