package application;

import java.util.Scanner;

import entities.rent;

public class rentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		rent[] vect = new rent[10];

		System.out.println(" How many rooms will be rented?");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			
			System.out.println("Rent #" + i + ":");
			
			System.out.print("Name: ");
			sc.nextLine();
			
			String name = sc.nextLine();
			System.out.print("Email: ");

			String email = sc.nextLine();
			System.out.print("Room: ");

			int room = sc.nextInt();
			vect[room] = new rent(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();

	}

}
