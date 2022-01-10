package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.ComparableTo;

public class Comparable {
	public static void main(String[] args) {
		List<ComparableTo> list = new ArrayList<>();
		
		String path = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			// vai ler uma linha do arquivo enquanto essa linha for diferente de nulo ela vai adicionar o valor na lista  
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new ComparableTo(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			//é uma forma de ordernar uma coleção
			// faz com que a lista seja ordenada por odem alfabetica ou do menor numero ao maior
			Collections.sort(list);
			for (ComparableTo emp : list) {
				System.out.println(emp.getName() + "," +emp.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
