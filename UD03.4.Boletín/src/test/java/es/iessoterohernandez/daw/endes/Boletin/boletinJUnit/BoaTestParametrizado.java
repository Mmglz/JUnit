package es.iessoterohernandez.daw.endes.Boletin.boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BoaTestParametrizado {
	static Boa b1;
	static Boa b2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		b1 = new Boa("Uroboros", 6, "granola bars");
		b2 = new Boa("Medusa", 1, "humans");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		b1 = null;
		b2 = null;
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@ParameterizedTest(name = "test isHealthy")
	@CsvSource({
			"Uroboros1, 6, hamster, false",
			"Medusa1, 1, granola bars, true",
			"Uroboros2, 2, lettuce, false ",
			"Medusa2, 9, lettuce, false",
			"Uroboros3, 7, granola bars,   true",
			"Medusa3, 2, lettuce, false",
			"Uroboros3, 1, granola bars, true",
			"Medusa4, 8, granola bars, true"

	})
	void testIsHealthy(String name, int length, String favoriteFood, boolean expectedResult) {
		b1 = new Boa(name, length, favoriteFood);
		assertEquals(expectedResult, b1.isHealthy());
	}
	
	@ParameterizedTest(name ="test fitsInCage")
	@CsvSource({
			"Uroboros1, 6, 5, hamster, false",
			"Medusa1, 1, 3, granola bars, true",
			"Uroboros2, 2, 1, lettuce, false ",
			"Medusa2, 9, 4,  lettuce, false",
			"Uroboros3, 7, 10, granola bars,   true",
			"Medusa3, 2, 1, lettuce, false",
			"Uroboros3, 1, 9, granola bars, true",
			"Medusa4, 8, 12, granola bars, true"
		
	})
	void testFitsInCage(String name, int length, int cageLenght, String favoriteFood, boolean expectedResult) {
		b1= new Boa(name, length, favoriteFood);
		
		assertEquals(expectedResult, b1.fitsInCage(cageLenght));
	}

}
