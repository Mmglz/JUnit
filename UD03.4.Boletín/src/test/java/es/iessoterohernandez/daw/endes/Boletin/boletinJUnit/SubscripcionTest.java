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
class SubscripcionTest {

	static Subscripcion s1;
	static Subscripcion s2;
	static Subscripcion s3;
	static Subscripcion s4;
	static Subscripcion s5;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s1 = new Subscripcion(0, 0);
		s2 = new Subscripcion(6, 0);
		s3 = new Subscripcion(0, 6);
		s4 = new Subscripcion(8, 4);
		s5 = new Subscripcion(8, 5);
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
	 * {@link es.iessoterohernandez.daw.endes.Boletin.boletinJUnit.Subscripcion#precioPorMes()}.
	 */
	@Test
	void testPrecioPorMes() {
		assertEquals(0.0, s1.precioPorMes());
		assertEquals(0.0, s2.precioPorMes());
		assertEquals(0.0, s3.precioPorMes());
		assertEquals(2.0, s4.precioPorMes());
		assertEquals(2.6, s5.precioPorMes());
	}

	/**
	 * Test method for
	 * {@link es.iessoterohernandez.daw.endes.Boletin.boletinJUnit.Subscripcion#cancel()}.
	 */
	//He creado en la clase Subscripcion el método getPeriodo para poder probar le método cancel().
	@Test
	void testCancel() {
		s5.cancel();
		assertEquals (0, s5.getPeriodo());
	}

}
