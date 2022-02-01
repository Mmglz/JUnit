package es.iessoterohernandez.daw.endes.Boletin.boletinJUnit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {
	
	static Account a;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		a = new Account("Pepe", 1234, 50f);
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
	public void testDeposit() {
		assertFalse(a.deposit(-2f));
		assertTrue(a.deposit(4f));
	}

	@Test
	public void testWithdraw() {
		assertEquals(false, a.withdraw(-5f, 0f));
		assertEquals(true, a.withdraw(10f, 0.3f));
	}

	@Test
	public void testAddInterest() {
		a.addInterest();
		assertEquals(50f + (50f * 0.045f), a.getBalance());
	}

	@Test
	public void testGetBalance() {
		assertEquals(41.95f, a.getBalance());
		assertNotEquals(20f, a.getBalance());
	}

	@Test
	public void testGetAccountNumber() {
		assertEquals(1234, a.getAccountNumber());
		assertNotEquals(4321, a.getAccountNumber());
	}
}
