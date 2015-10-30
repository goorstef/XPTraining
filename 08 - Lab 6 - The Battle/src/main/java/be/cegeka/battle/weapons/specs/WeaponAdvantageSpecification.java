package be.cegeka.battle.weapons.specs;

import be.cegeka.battle.weapons.Weapon;

public interface WeaponAdvantageSpecification {

    Class<? extends Weapon> appliesTo();

    boolean hasAdvantageOver(Weapon weapon);

    static int DAMAGE_MODIFIER = 3;

}
