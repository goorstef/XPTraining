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
import be.cegeka.battle.weapons.specs.SpearAdvantageSpecification;

public class SpearAdvantageSpecificationTest {

    @Test
    public void hasOnlyAdvantageOverSwords() {
        assertFalse(new SpearAdvantageSpecification().hasAdvantageOver(new Axe()));
        assertFalse(new SpearAdvantageSpecification().hasAdvantageOver(new BroadAxe()));
        assertTrue(new SpearAdvantageSpecification().hasAdvantageOver(new Sword()));
        assertTrue(new SpearAdvantageSpecification().hasAdvantageOver(new TwoHandedSword()));
        assertFalse(new SpearAdvantageSpecification().hasAdvantageOver(new Trident()));
        assertFalse(new SpearAdvantageSpecification().hasAdvantageOver(new Spear()));
    }
}
