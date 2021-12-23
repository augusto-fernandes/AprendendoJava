package main;

import java.io.File;
import java.util.Scanner;

public class CaminhosDosArquivos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// acessar somente o nome do arquivo:
		
		System.out.println("getName: " + path.getName());//getName puxa o nome do arquivo e despreza o caminho.
		
		// só o caminho e deprezando o nome:
		System.out.println("getParent: " + path.getParent());
		
		// todo o caminho:
		System.out.println("getPath: " + path.getPath());
		
		
		
		
		
		
		
		sc.close();

	}

}
