package epam.Task4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EstimateCostofHouseTest {

	@Test
	
	public void testCost() {
		EstimateCostofHouse test=new  EstimateCostofHouse();
		assertEquals(3600.00,test.totalamount("standard material", 3),0);
	}
	@Test
	public void testCost1() {
		EstimateCostofHouse test=new  EstimateCostofHouse();
		assertEquals(6000.00,test.totalamount("Abovestandard material", 4),0);
	}
	@Test
	public void testCost2() {
		EstimateCostofHouse test=new  EstimateCostofHouse();
		assertEquals(3600.00,test.totalamount("Highstandard material", 2),0);
	}
	@Test
	public void testCost3() {
		EstimateCostofHouse test=new  EstimateCostofHouse();
		assertEquals(10000.00,test.totalamount("HighstandardFullautomatic", 4),0);


}
}