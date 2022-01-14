package application;

import java.util.ArrayList;
import java.util.List;

public class GetPutContravariancia {
	public static void main(String[] args) {
	// esse codigo permite o put mas nao o get ocorrendo uma "contravariancia"
		
		List<Object> myObjs = new ArrayList<Object>();
			myObjs.add("Maria");
			myObjs.add("Alex");
		
			//essa lista só pode ser tanto Number quando Object
		List<? super Number> myNums = myObjs;
			myNums.add(10);
			myNums.add(3.14);
		
		//Number x = myNums.get(0); // erro de compilacao
	}

}
