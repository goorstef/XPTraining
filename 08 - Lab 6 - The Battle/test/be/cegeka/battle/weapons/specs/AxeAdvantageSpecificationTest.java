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
import be.cegeka.battle.weapons.specs.AxeAdvantageSpecification;

public class AxeAdvantageSpecificationTest {

    @Test
    public void hasOnlyAdvantageOverSpears() {
        assertFalse(new AxeAdvantageSpecification().hasAdvantageOver(new Axe()));
        assertFalse(new AxeAdvantageSpecification().hasAdvantageOver(new BroadAxe()));
        assertFalse(new AxeAdvantageSpecification().hasAdvantageOver(new Sword()));
        assertFalse(new AxeAdvantageSpecification().hasAdvantageOver(new TwoHandedSword()));
        assertTrue(new AxeAdvantageSpecification().hasAdvantageOver(new Trident()));
        assertTrue(new AxeAdvantageSpecification().hasAdvantageOver(new Spear()));
    }
}
