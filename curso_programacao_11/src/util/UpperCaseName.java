package util;

import java.util.function.Function;

import entities.Product04;

public class UpperCaseName implements Function<Product04, String>{

	@Override
	public String apply(Product04 p) {
		return p.getName().toUpperCase();
	}

}
