package EstruturaSequencial;

import java.util.Scanner;

public class dadosNaMesmaLinha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
          
		sc.close();
	}
	

}
