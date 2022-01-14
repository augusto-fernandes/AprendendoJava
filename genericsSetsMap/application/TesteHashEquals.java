package application;

import entities.Client;

public class TesteHashEquals {

	public static void main(String[] args) {
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Bob", "Alex@gmail.com");
		Client c3 = new Client ("Maria", "maria@gmail.com");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c3));
		
		// da falso porque o "==" nao compara conteudo e sim referencia de memoria
		System.out.println(c1 == c2);

	}

}
