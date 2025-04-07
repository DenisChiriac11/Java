package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBasics {

	@Test
	void testDefineString() {
		String prenume = null;
		assertNull(prenume);
	}

	@Test
	void testInitString() {
		String prenume = "Maria";
		assertEquals("Maria", prenume);
	}

	@Test
	void testConcatenation() {
		String salut = "Hello World " + "Andrei";
		assertEquals("Hello World Andrei", salut);
	}

	@Test
	void testInteger() {
		Object varsta = 20;
		assertNotNull(varsta);
	}

	@Test
	void testBoolean() {
		boolean casatorita = false;
		assertFalse(casatorita);
	}

}
