package main;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		
		/* È um bloco try que declara um ou mais recursos
		 * e garante que esses recursos serao fechados ao final do bloco
		*/
		
		String path = "C:\\Users\\Augusto\\Desktop\\curso\\JAVA\\in.txt";		
		
		// em vez de declarar o br e o fr separados, essa é uma forma mais facil de declarar.
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			
			
			
			String line =br.readLine();
			
			while(line!=null) {
				System.out.println(line);
				line = br.readLine();
				
			}
		}
		catch(IOException e ) {
			System.out.println("Error: " + e.getMessage());
		}
		
		


	}

}
