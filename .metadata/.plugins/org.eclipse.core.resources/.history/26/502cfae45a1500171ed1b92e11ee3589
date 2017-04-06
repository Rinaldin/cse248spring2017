package p1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is printed when running before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is printed when running after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("printed before each method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("printed after each method");
	}

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		assertEquals(2, c.add(1, 1));
	}

}
