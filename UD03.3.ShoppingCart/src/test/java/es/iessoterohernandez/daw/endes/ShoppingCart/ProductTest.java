/**
 * 
 */
package es.iessoterohernandez.daw.endes.ShoppingCart;

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
class ProductTest {
	
	static Product p1;
	static Product p2;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		p1 = new Product("tomate", 2.5);
		p2 = new Product ("tomate", 1);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		p1 = null;
		p2 = null;
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
	 * Test method for {@link es.iessoterohernandez.daw.endes.ShoppingCart.Product#equals(java.lang.Object)}.
	 */
	@Test
	void testEqualsObject() {
		assertEquals(true, p1.equals(p2));
	}

}
