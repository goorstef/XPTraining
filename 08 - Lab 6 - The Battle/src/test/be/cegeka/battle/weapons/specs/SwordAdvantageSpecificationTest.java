package be.cegeka.battle.weapons.specs;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;

import be.cegeka.battle.weapons.Axe;
import be.cegeka.battle.weapons.BroadAxe;
import be.cegeka.battle.weapons.Spear;
import be.cegeka.battle.weapons.Sword;
import be.cegeka.battle.weapons.Trident;
import be.cegeka.battle.weapons.TwoHandedSword;
import be.cegeka.battle.weapons.specs.SwordAdvantageSpecification;

public class SwordAdvantageSpecificationTest {

    @Test
    public void hasOnlyAdvantageOverAxes() {
        assertTrue(new SwordAdvantageSpecification().hasAdvantageOver(new Axe()));
        assertTrue(new SwordAdvantageSpecification().hasAdvantageOver(new BroadAxe()));
        assertFalse(new SwordAdvantageSpecification().hasAdvantageOver(new Sword()));
        assertFalse(new SwordAdvantageSpecification().hasAdvantageOver(new TwoHandedSword()));
        assertFalse(new SwordAdvantageSpecification().hasAdvantageOver(new Trident()));
        assertFalse(new SwordAdvantageSpecification().hasAdvantageOver(new Spear()));
    }
}
