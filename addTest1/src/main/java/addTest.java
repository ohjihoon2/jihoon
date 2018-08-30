

import static org.junit.Assert.*;

import org.junit.Test;



public class addTest {

	@Test
	public void addition() {
		adder add = new adder();
		int sum = add.Addition("1+3");
		assertEquals(4, sum);
	}
	
}
