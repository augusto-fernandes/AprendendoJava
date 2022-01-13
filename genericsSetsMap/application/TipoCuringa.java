package application;
import java.util.Arrays;
import java.util.List;

public class TipoCuringa {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5,2,10);
		printList(myInts);
	
		List<String>myStrs = Arrays.asList("Maria", "Alex","Bob");
		printList(myStrs);	
	}
	
	// o "?" é um tipo curinga que serve pra imprimir uma lista de qualquer tipo.
	public static void printList(List<?> list) {
		for( Object obj: list) {
			System.out.println(obj);

		}
	}
}
