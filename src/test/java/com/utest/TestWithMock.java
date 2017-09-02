package com.utest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestWithMock {

	@Test
	void powOfTwo(@Mock NumberRepository numberRepository) {
		when(numberRepository.getTwo()).thenReturn(new Number(2));
		assertEquals(new Number(16), new NumberService(numberRepository).powOfTwo(4));
	}

}

