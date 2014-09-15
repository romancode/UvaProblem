
package set1;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestP100 {
	
	P100.Q100 p100;
	
	@Before
	public void setUp() throws Exception {
		
		p100=new P100.Q100();
		
	}

	@Test(timeout = 5000)
	public void testCalculteCycle() {
		
		assertEquals(16, p100.CalculteCycle(22));
	}
	@Test(timeout = 5000)
	public void testCalculteCycleBetwTwoNumbers() {
		
		assertEquals(20, p100.CalculteCycleBetweenTwo(1, 10));		
		assertEquals(125, p100.CalculteCycleBetweenTwo(100, 200));
		assertEquals(89, p100.CalculteCycleBetweenTwo(201, 210));
		assertEquals(174, p100.CalculteCycleBetweenTwo(900, 1000));		
	}
}
