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
class ShoppingCartTest {
	
	static Product p1;
	static Product p2;
	static ShoppingCart sc;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		p1 = new Product("tomate", 2.5);
		p2 = new Product("cebolla", 1.25);
		sc = new ShoppingCart();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		p1 = null;
		p2 = null;
		sc = null;
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
	 * Test method for {@link es.iessoterohernandez.daw.endes.ShoppingCart.ShoppingCart#getItemCount()}.
	 */
	//Cuando se crea, el carro tiene 0 elementos
	@Test
	void testGetItemCount() {
		assertEquals(0, sc.getItemCount());
		
	}
	
	/**
	 * Test method for {@link es.iessoterohernandez.daw.endes.ShoppingCart.ShoppingCart#empty()}.
	 */
	//Cuando está vacío, el carro tiene 0 elementos
	@Test
	void testEmpty() {
		sc.addItem(p1);
		sc.empty();
		assertEquals(0, sc.getItemCount());
	}
	
	/**
	 * Test method for {@link es.iessoterohernandez.daw.endes.ShoppingCart.ShoppingCart#addItem(es.iessoterohernandez.daw.endes.ShoppingCart.Product)}.
	 */
	//Cuando se añade un producto, el número de elementos debe incrementarse
	@Test
	void testAddItem() {
		sc.addItem(p1);
		assertEquals(1, sc.getItemCount());
	}
	
	/**
	 * Test method for {@link es.iessoterohernandez.daw.endes.ShoppingCart.ShoppingCart#getBalance()}.
	 */
	//Cuando se añade un producto, el balance nuevo debe ser la suma del balance anterior y el precio del producto añadido
	@Test
	void testGetBalance() {
		sc.addItem(p1);
		assertEquals(2.5, sc.getBalance());
		sc.addItem(p2);
		assertEquals(3.75, sc.getBalance());
	}

	/**
	 * Test method for {@link es.iessoterohernandez.daw.endes.ShoppingCart.ShoppingCart#removeItem(es.iessoterohernandez.daw.endes.ShoppingCart.Product)}.
	 */
	//Cuando se elimina un producto, el número de elementos debe decrementarse
	@Test
	void testRemoveItem() {
		try {
			sc.removeItem(p2);
			assertEquals(1, sc.getItemCount());
			assertEquals(2.5, sc.getBalance());
		} catch (Exception e) {
			fail("Producto eliminado");
		}
	}
	
	//Cuando se intenta eliminar un producto que no está en el carro, se debe lanzar una excepción ProductNotFoundException.
	//Pista: inserta la llamada en un bloque try y pon un método fail() después de la llamada a removeItem()
	@Test
	void testProductNotFound() {
		try {
			sc.removeItem(p2);
		} catch (Exception e) {
			fail("El producto no está en el carro");
		}
	}
}
