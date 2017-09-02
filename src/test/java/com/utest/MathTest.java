package com.utest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathTest {

	@Test
	void powTwoThree() {
		assertEquals(new Number(8), Math.pow(new Number(2), 3));
	}

	@Test
	void powTwoThree_failed() {
		assertNotEquals(new Number(9), Math.pow(new Number(2), 3));
	}

	@Test
	@DisplayName("2^-1")
	void powToMinusOne() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> Math.pow(new Number(2), -1));
		assertEquals("pow < 0", exception.getMessage());
	}

}