package es.iessoterohernandez.daw.endes.Boletin.boletinJUnit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OperadorAritmeticoTest {
	
	static int a;
	static int b;
	static int c;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		a = 6;
		b = 2;
		c = 0;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSuma() {
		assertEquals(8, OperadorAritmetico.suma(a, b));
	}

	@Test
	public void testDivision() {
		try {
			assertEquals(3, OperadorAritmetico.division(a, b));
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void testDivisionException(){
		try {
			assertEquals(0, OperadorAritmetico.division(a, c));
		} catch (Exception e) {
			fail("El divisor no puede ser 0");
		}
	}

}
