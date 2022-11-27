package application;

import java.util.Comparator;

import entities.Product01;

public class MyComparator01 implements Comparator<Product01> {

	@Override
	public int compare(Product01 p1, Product01 p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
