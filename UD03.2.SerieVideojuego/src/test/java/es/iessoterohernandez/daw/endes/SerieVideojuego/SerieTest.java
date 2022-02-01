/**
 * 
 */
package es.iessoterohernandez.daw.endes.SerieVideojuego;

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
class SerieTest {

	static Serie s1;
	static Serie s2;
	static Serie s3;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s1 = new Serie("The Witcher", 2, "Fantasía", "Netflix");
		s2 = new Serie("Loki", 1, "Superheroes", "Marvel");
		s3 = new Serie("The Witcher", 2, "Fantasía", "Netflix");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		s1 = null;
		s2 = null;
		s3 = null;
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
	 * {@link es.iessoterohernandez.daw.endes.SerieVideojuego.Serie#entregar()}.
	 */
	@Test
	void testEntregar() {
		s1.entregar();
		assertTrue(s1.isEntregado());
	}

	/**
	 * Test method for
	 * {@link es.iessoterohernandez.daw.endes.SerieVideojuego.Serie#devolver()}.
	 */
	@Test
	void testDevolver() {
		s1.devolver();
		assertFalse(s1.isEntregado());
	}

	/**
	 * Test method for
	 * {@link es.iessoterohernandez.daw.endes.SerieVideojuego.Serie#isEntregado()}.
	 */
	@Test
	void testIsEntregado() {
		s1.devolver();
		assertFalse(s1.isEntregado());
	}

	/**
	 * Test method for
	 * {@link es.iessoterohernandez.daw.endes.SerieVideojuego.Serie#compareTo(java.lang.Object)}.
	 */
	@Test
	void testCompareTo() {
		assertEquals(Serie.MAYOR, s1.compareTo(s2));
		assertEquals(Serie.MENOR, s2.compareTo(s1));
		assertEquals(Serie.IGUAL, s3.compareTo(s1));
	}

	/**
	 * Test method for
	 * {@link es.iessoterohernandez.daw.endes.SerieVideojuego.Serie#equals(es.iessoterohernandez.daw.endes.SerieVideojuego.Serie)}.
	 */
	@Test
	void testEqualsSerie() {
		assertEquals(false, s1.equals(s2));
		assertEquals(true, s1.equals(s3));
	}

}
