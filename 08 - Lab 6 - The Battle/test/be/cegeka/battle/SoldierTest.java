package be.cegeka.battle;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;

import be.cegeka.battle.weapons.Axe;
import be.cegeka.battle.weapons.BroadAxe;
import be.cegeka.battle.weapons.BroadSword;

public class SoldierTest {

    @Test
    public void fightWinsIfBetterWeapon() {
        assertTrue(new Soldier().equipWith(new BroadSword()).fight(new Soldier().equipWith(new Axe())));
    }

    @Test
    public void fightLosesIfWorseWeapon() {
    	assertFalse(new Soldier().equipWith(new Axe()).fight(new Soldier().equipWith(new BroadAxe())));
    }
    
    @Test
    public void fightWinsWithSameWeapon() {
        assertTrue(new Soldier().equipWith(new BroadSword()).fight(new Soldier().equipWith(new BroadSword())));
    }

    @Test
    public void fightWinsWithSameDefaultWeaponWhichIsBareFisted() {
        assertTrue(new Soldier().fight(new Soldier()));
    }
}
