package application;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
			//O hashset é mais rapido mas nao mostra os elementos em sequencia.
		Set<String> set = new HashSet<>();
		//treeSet ele ordena os dados
		//linkedHashSet ele mostra os elementos na ordem que foram adicionado
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
			// remove todo mundo que tenha a letra T, nesse exemplo
		set.removeIf(x -> x.charAt(0) =='T' );
		
			// contains mostra se um elemento existe ou nao.
		System.out.println(set.contains("Notebook"));
		
			//imprime os elementos do conjunto.
		for (String p : set) {
			System.out.println(p);
		}
	}
}