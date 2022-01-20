package application;

import java.util.Comparator;

import entities.Product5;

public class MyComparator implements Comparator<Product5> {

	@Override
	public int compare(Product5 p1, Product5 p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
}