package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBuffWriter {

	public static void main(String[] args) {
		// este codigo vai criar um arquivo que nao existia antes no computador
				
		// criando um vetor e ja instanciando valores nele.
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night"};
		
		String path = "C:\\Users\\Augusto\\Desktop\\curso\\JAVA\\out.txt";
		
		/* Writer cria e recria arquivos          
		 * colocando "true" do lado nao recria o arquivo, apenas adiciona novos conteudos
		 * sem o true o arquivo é apenas destruido e recriado com as mesmas informações  */
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			
			// grava no arquivos as palavras escritas acima.
			for(String line: lines) {
			
				// faz com que a linha seja escrita no arquivo.
				bw.write(line);
				// write nao tem quebra de linha entao é usado o newline.
				bw.newLine();
			}			
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
