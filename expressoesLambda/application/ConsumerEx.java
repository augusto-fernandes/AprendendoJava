package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.ProductConsumer;
import util.PriceUpdate;

public class ConsumerEx {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<ProductConsumer> list = new ArrayList<>();
		list.add(new ProductConsumer("Tv", 900.00));
		list.add(new ProductConsumer("Mouse", 50.00));
		list.add(new ProductConsumer("Tablet", 350.50));
		list.add(new ProductConsumer("HD Case", 80.90));

		double factor = 1.1;
		
		//lanbda declarada
	//	Consumer<ProductConsumer> cons = p->p.setPrice(p.getPrice()*factor);
		
		list.forEach(new PriceUpdate());

		//reference method com o metodo estatico
		list.forEach(ProductConsumer :: staticPriceUpdate);
	
		//metodo nao estatico
		list.forEach(ProductConsumer :: nonStaticPriceUpdate);
		
		//lambda inline
		list.forEach(p->p.setPrice(p.getPrice()*factor));
		
		list.forEach(System.out::println);

	}

}
