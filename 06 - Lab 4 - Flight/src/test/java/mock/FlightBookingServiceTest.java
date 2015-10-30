package mock;

import static junit.framework.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class FlightBookingServiceTest {
	
	private FlightBookingServiceImpl flightBookingServiceImpl;
	private PersistenceManagerMock<Flight> persistenceManagerMock;
	
	@Before
	public void setUp() throws Exception {
		persistenceManagerMock = new PersistenceManagerMock<Flight>();
		flightBookingServiceImpl = new FlightBookingServiceImpl(persistenceManagerMock);
	}

	@Test
	public void bookSeatOnFlight() throws FlightFullyBookedException {
		Flight flight = new FlightImpl(12);
		persistenceManagerMock.expectLookup(Flight.class, 12, flight);
		
		flightBookingServiceImpl.bookSeatOnFlight(12, "persoon");
		
		assertTrue(flight.isPassengerOnFlight("persoon"));
		persistenceManagerMock.verify();
	}

}
