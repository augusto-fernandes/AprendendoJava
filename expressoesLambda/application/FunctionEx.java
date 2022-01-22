package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.ProductFunction;
import util.UpperCaseName;

public class FunctionEx {

	public static void main(String[] args) {
		List<ProductFunction> list = new ArrayList<>();
		list.add(new ProductFunction("Tv", 900.00));
		list.add(new ProductFunction("Mouse", 50.00));
		list.add(new ProductFunction("Tablet", 350.50));
		list.add(new ProductFunction("HD Case", 80.90));
		
		// o map pega todos os valores da lista e aplica a função entre parenteses
		// nao da pra chamar o map antes de converter para stream
		 
		//List<String>names =list.stream().map(new UpperCaseName()).collect(Collectors.toList());//metodo interface
		 
		 //List<String>names =list.stream().map(ProductFunction ::staticUpperCase).collect(Collectors.toList());// metodo estatico
		 
		 List<String>names =list.stream().map(p -> p.getName()).collect(Collectors.toList()); 
		 
		 names.forEach(System.out::println);
	}

}
