package be.cegeka.battle.weapons;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;

public class WeaponTest {

    @Test
    public void isBetterThan_WithoutModifiers() {
        assertFalse(new BareFists().isBetterThan(new Axe()));
    }

    @Test
    public void isBetterThan_FalseIfSame() {
        assertFalse(new Axe().isBetterThan(new Axe()));
    }

    @Test
    public void isBetterThan_TrueIfMoreDamageSameType() {
        assertTrue(new BroadAxe().isBetterThan(new Axe()));
    }

    @Test
    public void isBetterThan_TrueIfMoreDamageDifferentType() {
        assertTrue(new Trident().isBetterThan(new BroadSword()));
    }

    @Test
    public void isBetterThan_TrueIfModifierAppliedOutputsMoreDamage() {
        assertTrue(new BroadAxe().isBetterThan(new Trident()));
        assertTrue(new Spear().isBetterThan(new Sword()));
        assertTrue(new Sword().isBetterThan(new Axe()));
    }

    @Test
    public void isBetterThan_FalseIfModifierAppliedOutputsSameDamage() {
        assertFalse(new Axe().isBetterThan(new Trident()));
        assertFalse(new Sword().isBetterThan(new BroadAxe()));
    }
}
