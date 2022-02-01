/**
 * 
 */
package es.iessoterohernandez.daw.endes.Boletin.boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author manoli
 *
 */
class OperadorAritmeticoTest {

	static int a;
	static int b;
	static int c;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		a = 6;
		b = 2;
		c = 0;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link es.iessoterohernandez.daw.endes.Boletin.boletinJUnit.OperadorAritmetico#suma(int, int)}.
	 */
	@Test
	void testSuma() {
		assertEquals(8, OperadorAritmetico.suma(a, b));
	}

	/**
	 * Test method for
	 * {@link es.iessoterohernandez.daw.endes.Boletin.boletinJUnit.OperadorAritmetico#division(int, int)}.
	 */
	@Test
	void testDivision() {
		try {
			assertEquals(3, OperadorAritmetico.division(a, b));
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	void testDivisionException(){
		try {
			assertEquals(0, OperadorAritmetico.division(a, c));
		} catch (Exception e) {
			fail("El divisor no puede ser 0");
		}
	}

}
