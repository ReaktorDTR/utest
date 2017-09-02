package com.utest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Extra {

	@Test
	@Disabled("Two assertions - bad idea")
	void catchThemAll() {
		assertAll(
				() -> assertEquals(new Number(17), Math.pow(new Number(4), 2)),
				() -> assertEquals(new Number(65), Math.pow(new Number(8), 2))
		);
	}

	@TestFactory
	Stream<DynamicTest> powDynamicTest() {
		return IntStream.range(0, 10)
				.mapToObj(index -> DynamicTest.dynamicTest("2^" + index, () -> assertEquals(new Number(16), Math.pow(new Number(2), index))));
	}

	@ParameterizedTest
	@ValueSource(ints = {1, 2})
	void trickyPow(int pow) {
		assertEquals(new Number(4), Math.pow(new Number(2), pow));
	}

	@DisplayName("Pow number")
	@ParameterizedTest(name = "{index}. {0}^{1} = {2}")
	@CsvSource({"2, 1, 2", "2,2,4", "2,3,8"})
	void trickyPow(int number, int pow, int result) {
		assertEquals(new Number(result), Math.pow(new Number(number), pow));
	}
}
