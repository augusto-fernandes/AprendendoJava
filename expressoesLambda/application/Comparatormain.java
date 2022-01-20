package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product5;

public class Comparatormain {

	public static void main(String[] args) {

			List<Product5> list = new ArrayList<>();

			list.add(new Product5("TV", 900.00));
			list.add(new Product5("Notebook", 1200.00));
			list.add(new Product5("Tablet", 450.00));

			list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

			for (Product5 p : list) {
				System.out.println(p);
			}
		
	}

}
