package util;

import java.util.function.Consumer;

import entities.Product03;

public class PriceUpdate03 implements Consumer<Product03> {

	@Override
	public void accept(Product03 p) {
		p.setPrice(p.getPrice() * 1.1);	
	}

}
