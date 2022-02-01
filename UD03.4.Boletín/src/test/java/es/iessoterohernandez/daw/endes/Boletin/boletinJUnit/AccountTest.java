package es.iessoterohernandez.daw.endes.Boletin.boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {
	
	static Account a;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		a = new Account("Pepe", 1234, 50f);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		a = null;
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDeposit() {
		assertFalse(a.deposit(-2f));
		assertTrue(a.deposit(4f));
	}

	@Test
	void testWithdraw() {
		assertEquals(false, a.withdraw(-5f, 0f));
		assertEquals(true, a.withdraw(10f, 0.3f));
	}

	@Test
	void testAddInterest() {
		a.addInterest();
		assertEquals(50f + (50f * 0.045f), a.getBalance());
	}

	@Test
	void testGetBalance() {
		assertEquals(41.95f, a.getBalance());
		assertNotEquals(20f, a.getBalance());
	}

	@Test
	void testGetAccountNumber() {
		assertEquals(1234, a.getAccountNumber());
		assertNotEquals(4321, a.getAccountNumber());
	}

}
