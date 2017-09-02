package com.utest;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import static com.utest.Math.pow;

@NoArgsConstructor
@AllArgsConstructor
public class NumberService {

	private NumberRepository numberRepository;

	public Number powOfTwo(int pow) {
		return pow(numberRepository.getTwo(), pow);
	}
}
