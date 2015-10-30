package movierental;

public class Movie {

	public static final int CHILDRENS = 2;
	public static final int NEW_RELEASE = 1;
	public static final int REGULAR = 0;

	private String _title;

	public Movie(String title) {
		_title = title;
	}

	public int getPriceCode() {
		return REGULAR;
	}

	public String getTitle() {
		return _title;
	}

	public int getFreeDays() {
		return 2;
	}

	public double getPriceDay() {
		return 1.5;
	}

	public double getInitialPrice() {
		return 2;
	}

	public int getFreeRentalPoints(int days) {
		return 1;
	}
}
