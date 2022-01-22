package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.ProductT;
import model.services.ProductServiceT;

public class ExercicioT {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<ProductT> list = new ArrayList<>();

		list.add(new ProductT("Tv", 900.00));
		list.add(new ProductT("Mouse", 50.00));
		list.add(new ProductT("Tablet", 350.50));
		list.add(new ProductT("HD Case", 80.90));

		ProductServiceT ps = new ProductServiceT();

		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

		System.out.println("Sum = " + String.format("%.2f", sum));
	}

}
