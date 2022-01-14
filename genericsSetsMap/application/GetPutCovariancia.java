package application;

import java.util.ArrayList;
import java.util.List;

public class GetPutCovariancia {

	public static void main(String[] args) {
		// esse codigo permite o get, mas nao permite o inserir/put, o que chamamos de "covariancia"
		
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(10);
		intList.add(5);
		
		// o "?" significa que pode ser de "qualquer tipo" e que extenda da wrapper Number.
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		
		// o compilador nao sabe se o int vai ser compativel com um possivel outro tipo Number.	
		//list.add(20);	 // erro de compilacao
		

	}

}
