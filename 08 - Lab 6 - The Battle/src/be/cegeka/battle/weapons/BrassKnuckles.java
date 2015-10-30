package be.cegeka.battle.weapons;

public class BrassKnuckles extends BareFists {

	@Override
	public int getDamage() {
		return super.getDamage() * 2;
	}
}
