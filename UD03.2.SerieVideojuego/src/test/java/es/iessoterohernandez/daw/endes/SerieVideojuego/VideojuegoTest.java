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
class VideojuegoTest {
	
	static Videojuego v1;
	static Videojuego v2;
	static Videojuego v3;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		v1 = new Videojuego("Temtem", 300, "RPG", "Crema");
		v2 = new Videojuego("Tom Clancy", 200, "Shooter", "Ubisoft");
		v3 = new Videojuego("Temtem", 300, "RPG", "Crema");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		v1 = null;
		v2 = null;
		v3 = null;
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
	 * Test method for {@link es.iessoterohernandez.daw.endes.SerieVideojuego.Videojuego#entregar()}.
	 */
	@Test
	void testEntregar() {
		v1.entregar();
		assertTrue(v1.isEntregado());
	}

	/**
	 * Test method for {@link es.iessoterohernandez.daw.endes.SerieVideojuego.Videojuego#devolver()}.
	 */
	@Test
	void testDevolver() {
		v1.devolver();
		assertFalse(v1.isEntregado());
	}

	/**
	 * Test method for {@link es.iessoterohernandez.daw.endes.SerieVideojuego.Videojuego#isEntregado()}.
	 */
	@Test
	void testIsEntregado() {
		v1.devolver();
		assertFalse(v1.isEntregado());
	}

	/**
	 * Test method for {@link es.iessoterohernandez.daw.endes.SerieVideojuego.Videojuego#compareTo(java.lang.Object)}.
	 */
	@Test
	void testCompareTo() {
		assertEquals(Serie.MAYOR, v1.compareTo(v2));
		assertEquals(Serie.MENOR, v2.compareTo(v1));
		assertEquals(Serie.IGUAL, v3.compareTo(v1));
	}

	/**
	 * Test method for {@link es.iessoterohernandez.daw.endes.SerieVideojuego.Videojuego#equals(es.iessoterohernandez.daw.endes.SerieVideojuego.Videojuego)}.
	 */
	@Test
	void testEqualsVideojuego() {
		assertEquals(false, v1.equals(v2));
		assertEquals(true, v1.equals(v3));
	}

}
