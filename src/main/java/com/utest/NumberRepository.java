package com.utest;

import java.util.Arrays;
import java.util.List;

public class NumberRepository {

	public List<Number> getListNumbers() {
		return Arrays.asList(new Number(1), new Number(2), new Number(3), new Number(4), new Number(5));
	}

	public Number getTwo() {
		return new Number(2);
	}
}
