package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.StreamProduct;

public class ExercicioStream {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

			
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
				
			List<StreamProduct> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new StreamProduct(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			double avg = list.stream()
					 	//pra cada produto p eu vou querer o p.getPrice
					.map(p->p.getPrice()) // gerou uma stream com apenas os preços do produtos

						//x e y levando a  x + y e a soma vai ser divido por list.size que é o tamanho da lista
					.reduce(0.0, (x,y) -> x+y) / list.size();
			
			System.out.println("Avarage price: " + String.format("%.2f", avg));
			
					
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			
			List<String> names = list.stream()
				
				//todo produto p tal que é menor que avg
			.filter(p-> p.getPrice()<avg)// filtra os preços abaixo da media
				
				//pra pegar o nome de cada produto
			.map(p-> p.getName())
			
				//.sorted pra ordernar em ordem alfabetica
			.sorted(comp.reversed())//reversed pra chamar uma ordem decrescente
			
			.collect(Collectors.toList());// pra chamar a stream como lista
			
			names.forEach(System.out:: println);

			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();

		}

	}
