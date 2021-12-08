package EstruturaSequencial;



import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int a;
		double b;	
		char c;
		x = sc.next();
		a = sc.nextInt();
		b = sc.nextDouble();
		c = sc.next().charAt(0);
		System.out.println("voce digitou a string:" + x);
		System.out.println("voce digitou o numero int:" + a);
		System.out.printf("voce digitou %.2f%n" +b);
		System.out.println("voce digitou a letra char :" + c);
		sc.close();
	}

}
