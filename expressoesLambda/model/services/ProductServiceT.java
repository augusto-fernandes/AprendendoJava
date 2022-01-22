package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.ProductT;

public class ProductServiceT {
	public double filteredSum(List<ProductT> list, Predicate<ProductT> criteria) {
		double sum = 0.0;
		for (ProductT p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
