package epam.Task4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleInterestTest {

	@Test
	void test() {
		SimpleInterest s=new SimpleInterest();
		assertEquals(Double.valueOf(400.0),s.calculatesimpleinterest(2000.0,5.0,4.0));
	}

}
