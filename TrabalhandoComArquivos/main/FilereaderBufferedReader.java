package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilereaderBufferedReader {

	public static void main(String[] args) {
		String path = "C:\\Users\\Augusto\\Desktop\\curso\\JAVA\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {

			fr = new FileReader(path);
			
			// recebendo o filereader como argumento se torna mais rapido a leitura, tornando mais flexivel.
			br = new BufferedReader(fr);
			
			// se o arquivo estiver no final o readline retorna nulo.
			String line =br.readLine();
			
			//esquema basico de como se ler um arquivo buffered reader.
			while(line!=null) {
				System.out.println(line);
				line = br.readLine();
				
			}
		}
		catch(IOException e ) {
			System.out.println("Error: " + e.getMessage());
		}
		finally{
			//ainda pode ocorrer exceções entao deve-se usar o try e catch para evitar possiveis problemas de nao fechar o fr e o bf
			try {
					if(br!=null) {
						br.close();
					}
					if(fr != null) {
						fr.close();
					}
		    }
			//IOException sao exceções de entradas e saidas de dados.
			catch(IOException e){
				 
				 //stacktrace mostra onde está o possivel erro do programa.
				 e.printStackTrace();
				
			}
	}
		

	}

}
