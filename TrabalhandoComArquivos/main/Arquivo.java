package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {
	public static void main(String[] args) throws FileNotFoundException {
	// pra voce trablhar com diretório voce precisa usar duas barra
			// apenas uma barra a IDE entende que voce esta querendo usar \n

		File file = new File("C:\\Users\\Augusto\\Desktop\\curso\\JAVA\\in.txt");
		Scanner sc = null;
		try {
		sc = new Scanner(file);
		while (sc.hasNextLine()) {
		System.out.println(sc.nextLine());
		}
		}
		catch (IOException e) {
		System.out.println("Error: " + e.getMessage());
		}
		finally {
		if (sc != null) {
		sc.close();
}
		}
	}
}