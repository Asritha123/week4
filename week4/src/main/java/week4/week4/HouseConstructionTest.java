package week4.week4;

import static org.junit.Assert.*;

import org.junit.Test;

import week4.week4.HouseConstruction;

public class HouseConstructionTest {

	@Test
	public void testcost() {
		HouseConstruction h=new HouseConstruction();
		assertEquals(15000.00 ,h.cost("high", "yes", 6),0);
				
	}

}
