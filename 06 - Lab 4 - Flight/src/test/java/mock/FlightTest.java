package mock;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;

public class FlightTest {

	private static final String JEAN_MICHEL_SAIVE = "Jean-Mi";
	private static final String PHILIPPE_SAIVE = "Philippe";

	@Test
	public void testAddPassengerToFlight() throws FlightFullyBookedException {
		FlightImpl flight = new FlightImpl(150);
		flight.addPassenger(JEAN_MICHEL_SAIVE);

		assertEquals(1, flight.numberOfPassengers());
		assertTrue(flight.isPassengerOnFlight(JEAN_MICHEL_SAIVE));
	}

	@Test(expected=FlightFullyBookedException.class)
	public void testCanNotAddPassengerToFullyBookedFlight() throws FlightFullyBookedException {
		
		FlightImpl flight = new FlightImpl(1);
		flight.addPassenger(JEAN_MICHEL_SAIVE);

		flight.addPassenger(PHILIPPE_SAIVE);
	}
}
