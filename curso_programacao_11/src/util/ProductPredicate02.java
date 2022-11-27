package util;

import java.util.function.Predicate;

import entities.Product01;

public class ProductPredicate02 implements Predicate<Product01> {

	@Override
	public boolean test(Product01 p) {
		return p.getPrice() >= 100.0;
	}

}
