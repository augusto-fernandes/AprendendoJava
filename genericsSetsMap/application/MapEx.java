package application;

import java.util.Map;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		
		Map<String,String> cookies = new TreeMap<>();
		
		// put é a operacao pra inserir um elemento no Map.
		//a chave(k) é o primeiro elemento, o segundo elemento é o valor (v).
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "9983891");
		
		// removendo o email  que é o key do Map.
		cookies.remove("email");
		
		//o Map nao aceita repetições, entao ele sobrescreve o elemento.
		cookies.put("phone", "321");
		
		System.out.println("Contans 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		// mostra quantos elemente tem.
		System.out.println("Size: " + cookies.size());
		
		
		System.out.println("All cookies");
		//pra cada key no conjunto de chaves key e imprime
		for(String key : cookies.keySet()) {
			
			System.out.println(key + ": " + cookies.get(key));
		}



	}

}
