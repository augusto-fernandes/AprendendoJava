package application;

public class HashCodeEquals {

	public static void main(String[] args) {
		//Equals M?todo que compara se o objeto ? igual a outro, retornando true ou false.
	String a = "Maria";
	String b = "Alex";
	System.out.println(a.equals(b));
	
	
	//HashCode: M?todo que retorna um n?mero inteiro representando um c?digo gerado
	//a partir das informa??es do objeto
	
	String c = "Maria";
	String d = "Alex";
	System.out.println(c.hashCode());
	System.out.println(d.hashCode());
	
	}

}
