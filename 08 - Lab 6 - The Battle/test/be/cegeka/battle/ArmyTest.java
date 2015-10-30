package be.cegeka.battle;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;

import be.cegeka.battle.weapons.Axe;
import be.cegeka.battle.weapons.BroadAxe;
import be.cegeka.battle.weapons.BroadSword;
import be.cegeka.battle.weapons.Spear;
import be.cegeka.battle.weapons.Sword;
import be.cegeka.battle.weapons.Trident;
import be.cegeka.battle.weapons.TwoHandedSword;

public class ArmyTest {

    @Test
    public void getFrontManReturnsFirstEnlistedSoldierToFight() {
        Soldier soldier = new Soldier();
        assertEquals(soldier, new Army().enlist(soldier, new Soldier(), new Soldier()).getFrontMan());
    }

    @Test
    public void getFrontManReturnsNullIfNoOneLeft() {
        assertEquals(null, new Army().getFrontMan());
    }

    @Test
    public void makeWarReturnsFalseIfWeAreTheLosingArmy() {
        Army army_axeMan = new Army().enlist(new Soldier());
        Army army_swordManAndSpearMan = new Army().enlist(new Soldier().equipWith(new Sword()), new Soldier().equipWith(new Spear()));
        assertFalse(army_axeMan.makeWarNotPeaceTo(army_swordManAndSpearMan));
    }

    @Test
    public void makeWarReturnsTrueIfWeAreTheWinningArmy() {
        Army army_broadSwordMan = new Army().enlist(new Soldier().equipWith(new BroadSword()));
        Army army_BroadAxeMan = new Army().enlist(new Soldier().equipWith(new BroadAxe()));
        assertTrue(army_broadSwordMan.makeWarNotPeaceTo(army_BroadAxeMan));
    }

    @Test
    public void makeWarRemovesDeadSoldiersFromTheArmy() {
        Army army1 = new Army("army 1").enlist(
                new Soldier().equipWith(new Axe()),
                new Soldier(),
                new Soldier().equipWith(new TwoHandedSword()),
                new Soldier().equipWith(new Trident()));
        Army army2 = new Army("army 2").enlist(
                new Soldier().equipWith(new Spear()),
                new Soldier().equipWith(new BroadAxe()),
                new Soldier().equipWith(new BroadAxe()));
        assertTrue(army1.makeWarNotPeaceTo(army2));

        assertEquals(2, army1.getSoldierCount());
        assertEquals(0, army2.getSoldierCount());
    }

    @Test
    public void makeWarReturnsTrueToEmptyArmy() {
        assertTrue(new Army().enlist(new Soldier()).makeWarNotPeaceTo(new Army()));
    }

    @Test
    public void makeWarReturnsFalseEmptyArmyToEmptyArmy() {
        assertFalse(new Army().makeWarNotPeaceTo(new Army()));
    }
}
