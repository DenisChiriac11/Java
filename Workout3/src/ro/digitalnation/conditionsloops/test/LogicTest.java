package ro.digitalnation.conditionsloops.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import ro.digitalnation.conditionsloops.Logic;

class LogicTest {


	@Test
	void test1Ex1() {
		assertTrue(Logic.ex1(-1, 7, 56));
	}

	@Test
	void test2Ex1() {
		assertTrue(Logic.ex1(345, 7, 45));
	}
	
	@Test
	void test3Ex1() {
		assertFalse(Logic.ex1(-345, -7, 45));
	}
	
	@Test
	void test4Ex1() {
		assertFalse(Logic.ex1(-345, -7, -45));
	}
	
	@Test
	void test1Ex2() {
		assertEquals(56, Logic.ex2(-1, 7, 56));
	}

	@Test
	void test2Ex2() {
		assertEquals(345, Logic.ex2(345, 7, 45));
	}
	
	@Test
	void test3Ex2() {
		assertEquals(45, Logic.ex2(-345, -7, 45));
	}
	
	@Test
	void test4Ex2() {
		assertEquals(-7, Logic.ex2(-345, -7, -7));
	}
	
	@Test
	void test1Ex3() {
		assertEquals(24, Logic.ex3(2, 9));
	}

	@Test
	void test2Ex3() {
		assertEquals(77, Logic.ex3(5, 18));
	}
	
	@Test
	void test3Ex3() {
		assertEquals(-20, Logic.ex3(-11, 7));
	}
	
	@Test
	void test4Ex3() {
		assertEquals(0, Logic.ex3(2, 2));
	}
	
	@Test
	void test1Ex4() {
		assertTrue(Logic.ex4(113));
	}

	@Test
	void test2Ex4() {
		assertTrue(Logic.ex4(17));
	}
	
	@Test
	void test3Ex4() {
		assertFalse(Logic.ex4(77));
	}
	
	@Test
	void test4Ex4() {
		assertFalse(Logic.ex4(225));
	}
	
	@Test
	void test1Ex5() {
		assertTrue(Logic.ex5("AnA"));
	}

	@Test
	void test2Ex5() {
		assertTrue(Logic.ex5("abcdeffedcba"));
	}
	
	@Test
	void test3Ex5() {
		assertFalse(Logic.ex5("test"));
	}
	
	@Test
	void test4Ex5() {
		assertFalse(Logic.ex5("palindrom"));
	}
	
	@Test
	void test1Ex6() {
		assertEquals(1, Logic.ex6(2));
	}

	@Test
	void test2Ex6() {
		assertEquals(13, Logic.ex6(7));
	}
	
	@Test
	void test3Ex6() {
		assertEquals(8, Logic.ex6(6));
	}
	
	@Test
	void test4Ex6() {
		assertEquals(55, Logic.ex6(10));
	}
	
	@Test
	void test1Ex7() {
		assertTrue(Logic.ex7(6));
	}

	@Test
	void test2Ex7() {
		assertTrue(Logic.ex7(496));
	}
	
	@Test
	void test3Ex7() {
		assertFalse(Logic.ex7(121));
	}
	
	@Test
	void test4Ex7() {
		assertFalse(Logic.ex7(55));
	}
	
	@Test
	void test1Ex8() {
		assertEquals(-10, Logic.ex8(-20));
	}

	@Test
	void test2Ex8() {
		assertEquals(14, Logic.ex8(7));
	}
	
	@Test
	void test3Ex8() {
		assertEquals(194, Logic.ex8(12));
	}
	
	@Test
	void test4Ex8() {
		assertEquals(5, Logic.ex8(-5));
	}
	
	@Test
	void test1Ex9() {
		assertEquals(Math.round(204), Math.round(Logic.ex9("EUR", 1000)));
	}

	@Test
	void test2Ex9() {
		assertEquals(Math.round(400), Math.round(Logic.ex9("MDL", 100)));
	}
	
	@Test
	void test3Ex9() {
		assertEquals(Math.round(20), Math.round(Logic.ex9("USD", 94)));
	}
	
	@Test
	void test4Ex9() {
		assertEquals(Math.round(45), Math.round(Logic.ex9("GDP", 252)));
	}
	
	@Test
	void test1Ex10() {
		assertTrue(Logic.ex10("XKs4yGC[Sm"));
	}

	@Test
	void test2Ex10() {
		assertTrue(Logic.ex10("P455W@rd"));
	}
	
	@Test
	void test3Ex10() {
		assertFalse(Logic.ex10("pass"));
	}
	
	@Test
	void test4Ex10() {
		assertFalse(Logic.ex10("123456789"));
	}
}
