package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product5;

public class Predicate {

	public static void main(String[] args) {
		List<Product5> list = new ArrayList<>();
		list.add(new Product5("Tv", 900.00));
		list.add(new Product5("Mouse", 50.00));
		list.add(new Product5("Tablet", 350.50));
		list.add(new Product5("HD Case", 80.90));
		
		double min = 100.0; 
		
		//expressao lambda declarada
		//Predicate<Product5> pred = p -> p.getPrice() >= min;
		
		//expressao lambda inline
		list.removeIf( p -> p.getPrice() >= min);
		
		// o '::' serve como referencia chama-se de method reference
		list.removeIf(Product5:: staticProductPredicate);
		
		// reference method com metodo nao estatico
		list.removeIf(Product5:: nonStaticProductPredicate);
		
		for(Product5 p : list) {
			System.out.println(p);
		}

	}

}
