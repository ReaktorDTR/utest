package com.utest;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Math {

	public static Number pow(Number number, int pow) {
		if (pow < 0) throw new IllegalArgumentException("pow < 0");
		if (pow == 0) return new Number(0);
		else if (pow == 1) return number;
		else return number.multiply(pow(number, pow - 1));
	}

}
