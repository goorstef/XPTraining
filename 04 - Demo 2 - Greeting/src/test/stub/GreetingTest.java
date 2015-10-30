package stub;

import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GreetingTest {

	private Greeting g;
	
	@Before
	public void setUp() throws Exception {
		g  = new Greeting();
	}

	@Test
	public void morning(){
		String s = g.getGreeting();
		assertEquals("Good Morning", s);
	}
	
}
