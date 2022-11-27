package model.entities;

import java.util.List;
import java.util.function.Predicate;

import entities.Product05;

public class ProductService05 {

	public double filteredSum(List<Product05> list, Predicate<Product05> criteria) {
		double sum = 0.0;
		for (Product05 p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();			}
		}
		return sum;
	}
}
