package be.cegeka.battle.weapons;

import java.util.HashMap;
import java.util.Map;

import be.cegeka.battle.weapons.specs.AxeAdvantageSpecification;
import be.cegeka.battle.weapons.specs.SpearAdvantageSpecification;
import be.cegeka.battle.weapons.specs.SwordAdvantageSpecification;
import be.cegeka.battle.weapons.specs.WeaponAdvantageSpecification;

public abstract class Weapon {

    private static Map<Class<? extends Weapon>, WeaponAdvantageSpecification> modifiers;

    static {
        modifiers = new HashMap<Class<? extends Weapon>, WeaponAdvantageSpecification>();
        modifiers.put(Axe.class, new AxeAdvantageSpecification());
        modifiers.put(Sword.class, new SwordAdvantageSpecification());
        modifiers.put(Spear.class, new SpearAdvantageSpecification());
    }

    public abstract int getDamage();

    public boolean isBetterThan(Weapon other) {
        int damage = getDamage();
        if (isWeaponStrategicallyBetterThan(other)) {
            damage += WeaponAdvantageSpecification.DAMAGE_MODIFIER;
        }

        return damage - other.getDamage() >= 0;
    }

    private boolean isWeaponStrategicallyBetterThan(Weapon other) {
        WeaponAdvantageSpecification weaponModifier = modifiers.get(getGenericWeaponType(getClass()));
        return weaponModifier != null && weaponModifier.hasAdvantageOver(other);
    }

    @SuppressWarnings("unchecked")
    private Class<? extends Weapon> getGenericWeaponType(Class<? extends Weapon> weaponClass) {
        if (weaponClass.getSuperclass().equals(Weapon.class)) {
            return weaponClass;
        }
        return getGenericWeaponType((Class<? extends Weapon>) weaponClass.getSuperclass());
    }

}
