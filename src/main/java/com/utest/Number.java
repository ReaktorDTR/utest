package com.utest;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Number {

	private int number;

	public Number add(Number that) {
		return new Number(number + that.number);
	}

	public Number subtract(Number that) {
		return new Number(number - that.number);
	}

	public Number multiply(Number that) {
		return new Number(number * that.number);
	}
}
