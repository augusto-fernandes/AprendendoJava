package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class TaxPayerMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for( int i = 1; i<=n; i++) {
			System.out.println("Tax payer# " +i +"data: " );
			System.out.println("individual or company (i/c)?");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Anual income: ");
			Double income = sc.nextDouble();
			
		if(ch =='i') {
			System.out.println("Heatlh expenditures: ");
			Double healthExpenditures = sc.nextDouble();
			list.add(new Individual(name, income, healthExpenditures));			
		}
		else {
			System.out.println("Number of employees: ");
			Integer numberOfEmployees = sc.nextInt();
			list.add(new Company(name, income, numberOfEmployees));
		}
		
		Double sum = 0.0;
		System.out.println();	
		System.out.println("Taxes paid: ");
		for(TaxPayer tp : list) {
			Double tax = tp.tax();
			System.out.println(tp.getName() + "$:" + String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES $ :" +String.format("%.2f", sum));
		
		
			
			
		}
		
		
		
		
		
		sc.close();

	}

}
