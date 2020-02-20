package epam.Task4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompundInterestTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		CompundInterest c=new CompundInterest();
		assertEquals(Double.valueOf(216.65290240000013),c.calculate_compound_interest(1000.0,5.0,4.0));
	}

}
