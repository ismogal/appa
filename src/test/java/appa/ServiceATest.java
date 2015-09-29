package appa;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceATest {

	@Test
	public void testPlus() {
		IServiceA sa = new ServiceA();
		int results = sa.plus(10, 10);
		assertEquals(20, results);
	}

}
