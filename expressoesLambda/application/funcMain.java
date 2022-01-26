package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.func;

public class funcMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enteer full file path: ");
		String path = sc.nextLine();
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			//codigo parar ler os dados do arquivo:
			
			List<func> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new func(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();				
			}
			//recebendo o valor do salario:
			System.out.println("Enter Salary: ");
			double salary = sc.nextDouble();
			
			
			//filtrando emails pelo salario:
			List<String> emails = list.stream()
					 
					.filter(x -> x.getSalary()>salary)
					.map(x-> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
			emails.forEach(System.out::println);
			
			 
			double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));
		} catch(IOException e){
			System.out.println("Error: " + e.getMessage());
			
		}
		
		
		
		
		
		sc.close();

	}

}
