package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product4;

public class TreeSetComparato {

	public static void main(String[] args) {
		Set<Product4> set = new TreeSet<>();
		set.add(new Product4("TV", 900.0));
		set.add(new Product4("Notebook", 1200.0));
		set.add(new Product4("Tablet", 400.0));
		for (Product4 p : set) {
			System.out.println(p);
		}

	}

}
