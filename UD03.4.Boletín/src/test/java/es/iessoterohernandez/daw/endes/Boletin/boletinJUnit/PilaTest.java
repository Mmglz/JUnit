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
class PilaTest {
	
	static Pila p;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
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
		p = new Pila();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {	
	}

	/**
	 * Test method for {@link es.iessoterohernandez.daw.endes.Boletin.boletinJUnit.Pila#push(java.lang.Integer)}.
	 */
	@Test
	void testPush() {
		p.push(1);
		assertTrue(p.isEmpty());
		p.push(21);
		assertTrue(p.isEmpty());
		p.push(5);
		assertFalse(p.isEmpty());
	}

	/**
	 * Test method for {@link es.iessoterohernandez.daw.endes.Boletin.boletinJUnit.Pila#pop()}.
	 */
	@Test
	void testPop() {
		assertEquals(null, p.pop());
		
		p.push(10);
		p.push(11);
		p.push(12);
		assertEquals(12, p.pop());
		assertEquals(11, p.pop());
		assertEquals(10, p.pop());
	}

	/**
	 * Test method for {@link es.iessoterohernandez.daw.endes.Boletin.boletinJUnit.Pila#isEmpty()}.
	 */
	@Test
	void testIsEmpty() {
		assertTrue(p.isEmpty());
		p.push(3);
		assertFalse(p.isEmpty());
	}

	/**
	 * Test method for {@link es.iessoterohernandez.daw.endes.Boletin.boletinJUnit.Pila#top()}.
	 */
	@Test
	void testTop() {
		assertEquals(null, p.top());
		
		p.push(3);
		p.push(4);
		p.push(5);
		
		assertEquals(5, p.top());
	}

}
