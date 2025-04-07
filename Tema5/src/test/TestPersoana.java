package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import basic.Persoana;

class TestPersoana {

	static Persoana persoana;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		persoana = new Persoana("Popescu", "Ion-Andrei", 40, true);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testName() {
		assertEquals("Popescu", persoana.getNume());
	}

	@Test
	void testPrenume() {
		assertEquals("Ion-Andrei", persoana.getPrenume());
	}
	
	@Test
	void testVarsta() {
		persoana.setVarsta(40);
		assertEquals(40, persoana.getVarsta());
	}
	
	@Test
	void testCasatorita() {
		assertEquals(true, persoana.isCasatorita());
	}
	
	@Test
	void testToString() {
		String expectedToString = "Nume: Popescu, Prenume: Ion-Andrei, Varsta: 40, casatorita: true, curs: JAVA";
		assertEquals(expectedToString, persoana.toString());
	}
	
	
	@Test
	void testObtineIdentificator() {
		String expectedIdentificator = "ionandrei_POPESCU";
		assertEquals(expectedIdentificator, persoana.obtineIdentificator());
	}
	
	@Test
	void testCurs() {
		Persoana.curs = "JAVA";
		assertEquals("JAVA", Persoana.curs);
	}
	
	@Test
	void testEmptyConstructor() {
		Persoana emptyPerson = new Persoana();
		assertNotNull(emptyPerson);
	}

	
}
