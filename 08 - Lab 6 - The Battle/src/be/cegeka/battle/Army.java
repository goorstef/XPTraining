package be.cegeka.battle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Army {

    private List<Soldier> soldiers;
    private final String slogan;

    public int getSoldierCount() {
        return soldiers.size();
    }

    public Soldier getFrontMan() {
        return getSoldierCount() == 0 ? null : soldiers.get(0);
    }

    public Army() {
        this("Winner's army");
    }

    public Army(String slogan) {
        this.slogan = slogan;
        this.soldiers = new ArrayList<Soldier>();
    }

    public Army reportCasualty(Soldier soldier) {
        System.out.println(slogan + " reports casualty");
        this.soldiers.remove(soldier);
        return this;
    }

    public Army enlist(Soldier... soldiers) {
        this.soldiers.addAll(Arrays.asList(soldiers));
        return this;
    }

    public boolean makeWarNotPeaceTo(Army otherArmy) {
        if (getSoldierCount() == 0) {
            return false;
        }
        if (otherArmy.getSoldierCount() == 0) {
            return true;
        }

        return letOurFrontmanFight(otherArmy);
    }

    private boolean letOurFrontmanFight(Army otherArmy) {
        Soldier ourFrontMan = getFrontMan();
        Soldier theirFrontman = otherArmy.getFrontMan();
        if (ourFrontMan == null) {
            return false;
        }

        if (theirFrontman == null) {
            return true;
        }

        if (ourFrontMan.fight(theirFrontman)) {
            otherArmy.reportCasualty(theirFrontman);
        } else {
            reportCasualty(ourFrontMan);
        }

        return letOurFrontmanFight(otherArmy);
    }
}
