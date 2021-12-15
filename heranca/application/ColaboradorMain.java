package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.colaborador;
import entities.outsourcedEmployee;

public class ColaboradorMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<colaborador> list = new ArrayList<>();
		
		System.out.println("Enter the number of employee");
		int n = sc.nextInt();
		
		for (int i =1; i<=n ; i++) {
			System.out.println("Employee #"+ i + "data");
			System.out.print("outsourced (y/n)?");
			char ch = sc.next().charAt(0);
			System.out.print("name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(ch=='y') {
				System.out.print("Additional charge: ");
				double additionalCharge= sc.nextDouble();
				colaborador cb = new outsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(cb);
			}
			else {
				colaborador cb = new colaborador(name,hours,valuePerHour);
				list.add(cb);
			}
		}
		
		System.out.println();
		System.out.println("Payments: ");
		for(colaborador cb: list) {
			System.out.println(cb.getName() +" - $ " + String.format("%.2f", cb.payment()));
		}
		
		
		sc.close();

	}

}
