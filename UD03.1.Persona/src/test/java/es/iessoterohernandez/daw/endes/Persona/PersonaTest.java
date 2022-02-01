package es.iessoterohernandez.daw.endes.Persona;

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
class PersonaTest {

	static Persona p1;
	static Persona p2;
	static Persona p3;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Antes de ejecutar ningun metodo de la clase");

		p1 = new Persona("Pepe", 18, 'H', 70, 1.80);
		p2 = new Persona("Pepa", 16, 'M', 30, 1.60);
		p3 = new Persona("Pepi", 20, 'M', 100, 1.60);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Después de ejecutar los metodos de la clase");
		p1 = null;
		p2 = null;
		p3 = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Antes de ejecutar cada metodo de la clase");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Después de ejecutar cada metodo de la clase");
	}

	/**
	 * Test method for
	 * {@link es.iessoterohernandez.daw.endes.junitdemo.Persona#calcularIMC()}.
	 */
	@Test
	void testCalcularIMC() {
		assertEquals(Persona.PESO_IDEAL, p1.calcularIMC());
		assertEquals(Persona.INFRAPESO, p2.calcularIMC());
		assertEquals(Persona.SOBREPESO, p3.calcularIMC());

	}

	/**
	 * Test method for
	 * {@link es.iessoterohernandez.daw.endes.junitdemo.Persona#esMayorDeEdad()}.
	 */
	@Test
	void testEsMayorDeEdad() {
		assertTrue(p1.esMayorDeEdad());
		assertFalse(p2.esMayorDeEdad());
		assertTrue(p3.esMayorDeEdad());
	}

}
