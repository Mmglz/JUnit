package es.iessoterohernandez.daw.endes.Boletin.boletinJUnit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SubscripcionTest {
	
	static Subscripcion s1;
	static Subscripcion s2;
	static Subscripcion s3;
	static Subscripcion s4;
	static Subscripcion s5;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		s1 = new Subscripcion(0, 0);
		s2 = new Subscripcion(6, 0);
		s3 = new Subscripcion(0, 6);
		s4 = new Subscripcion(8, 4);
		s5 = new Subscripcion(8, 5);
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
	public void testPrecioPorMes() {
		assertEquals(0.0, s1.precioPorMes());
		assertEquals(0.0, s2.precioPorMes());
		assertEquals(0.0, s3.precioPorMes());
		assertEquals(2.0, s4.precioPorMes());
		assertEquals(2.6, s5.precioPorMes());
	}
	
	//He creado en la clase Subscripcion el método getPeriodo para poder probar le método cancel().
	@Test
	public void testCancel() {
		s5.cancel();
		assertEquals (0, s5.getPeriodo());
	}

}
