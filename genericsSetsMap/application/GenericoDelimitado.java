package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produto3;
import service.CalculationService;

public class GenericoDelimitado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Produto3> list = new ArrayList<>();

		String path = "C:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Produto3(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			// o max mostra o valor mais alto 
			Produto3 x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}

	}

                                                                   
