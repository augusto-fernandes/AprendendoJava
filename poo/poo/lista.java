package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lista {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		// assim que se adiciona uma pessoa a mais na lista
		list.add(2, "Marco");
		
		// mostra o tamanho da lista
		System.out.println(list.size());
			
		for(String x: list) {
			System.out.println(x);
		}

		System.out.println("----------------------------");
		//list.remove(1);
		
		// como remover um grupo de valores da lista
		list.removeIf(x -> x.charAt(0)== 'M');
		
		for(String x: list) {
			System.out.println(x);
		}
		System.out.println("----------------------------");
		
		// encontrando a posição de um elemento
		System.out.println("Index of Bob" + list.indexOf("Bob"));
	    System.out.println("Index of Marco" + list.indexOf("Marco"));
	
		System.out.println("----------------------------");
		
		// deixar na lista somente quem tem o caractere tal
		List<String> result = list.stream().filter(x -> x.charAt(0)== 'A').collect(Collectors.toList());
		for(String x: result) {
			System.out.println(x);
		}
		System.out.println("----------------------------");
		
		// como encontrar o primeiro elemento que começa com o predicado
		
		String name = list.stream().filter(x -> x.charAt(0)== 'A').findFirst().orElse(null);
		System.out.println(name);


	}

}
