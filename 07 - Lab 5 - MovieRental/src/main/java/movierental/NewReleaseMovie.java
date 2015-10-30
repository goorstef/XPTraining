package movierental;

public class NewReleaseMovie extends Movie {

	public NewReleaseMovie(String title) {
		super(title);
	}

	@Override
	public int getPriceCode() {
		return NEW_RELEASE;
	}

	@Override
	public int getFreeDays() {
		return 0;
	}

	@Override
	public double getInitialPrice() {
		return 0;
	}

	@Override
	public double getPriceDay() {
		return 3;
	}

	@Override
	public int getFreeRentalPoints(int days) {
		if (days > 1) {
			return 2;
		}
		return super.getFreeRentalPoints(days);
	}
}
