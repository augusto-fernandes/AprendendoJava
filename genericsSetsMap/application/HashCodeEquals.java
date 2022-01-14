package application;

public class HashCodeEquals {

	public static void main(String[] args) {
		//Equals Método que compara se o objeto é igual a outro, retornando true ou false.
	String a = "Maria";
	String b = "Alex";
	System.out.println(a.equals(b));
	
	
	//HashCode: Método que retorna um número inteiro representando um código gerado
	//a partir das informações do objeto
	
	String c = "Maria";
	String d = "Alex";
	System.out.println(c.hashCode());
	System.out.println(d.hashCode());
	
	}

}
