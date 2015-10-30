package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

	private Movie _movie;
	private int _daysRented;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	public double getPrice() {
		double thisAmount = 0;
		thisAmount += getMovie().getInitialPrice();
		if (getDaysRented() > getMovie().getFreeDays())
			thisAmount += (getDaysRented() - getMovie().getFreeDays()) * getMovie().getPriceDay();
		return thisAmount;
	}

	public int getFreeRentalPoints() {
		return _movie.getFreeRentalPoints(getDaysRented());
	}

}
