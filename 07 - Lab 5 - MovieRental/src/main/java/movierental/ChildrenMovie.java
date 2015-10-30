package movierental;

public class ChildrenMovie extends Movie {

	public ChildrenMovie(String title) {
		super(title);
	}

	@Override
	public int getPriceCode() {
		return CHILDRENS;
	}

	@Override
	public int getFreeDays() {
		return 3;
	}

	@Override
	public double getInitialPrice() {
		return 1.5;
	}

	@Override
	public double getPriceDay() {
		return 1.5;
	}

}
