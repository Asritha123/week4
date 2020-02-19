package week4.week4;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCompoundTest {

	@Test
	public void testSimpleInterest() {
		SimpleCompound s=new SimpleCompound();
		assertEquals(3500.0,s.SimpleInterest(10000,7,5),0);
	}

	@Test
	public void testCompoundInterest() {
		SimpleCompound s=new SimpleCompound();
		assertEquals(14071.004226562505,s.CompoundInterest(10000,7,5),0);
	}
}
