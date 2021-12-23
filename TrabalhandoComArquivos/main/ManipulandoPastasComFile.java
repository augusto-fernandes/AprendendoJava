package main;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasComFile {

	public static void main(String[] args) {
		// mostra todos os arquivos ou pastas de uma determinado diretorio que voce deseja
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//fazendo a listagens de pastas
		File[] folders = path.listFiles(File::isDirectory); //especefica somente o que é diretório ou pasta
		System.out.println("FOLDERS:");	
		
		//pra cada folder na lista de folder, vai imprimir
		for(File folder: folders) {
			System.out.println(folder);
			
		}
		// codigo para mostrar apenas arquivos:
		
		File[] files = path.listFiles(File::isFile);// isFiles mostra apenas os arquivos
		System.out.println("FILES: ");
		
		// pra cada file na lista de files, imprime os arquivos
		for(File file: files) {
			
			System.out.println(file);
		}
		
		//criando uma subpasta
		boolean success = new File(strPath + "\\subPasta").mkdir();// mkdir é utilizado para criar directorios.
		System.out.println("Directory created successfully: " + success);
		sc.close();

	}
	

}
