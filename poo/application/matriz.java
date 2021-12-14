package application;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int [][] mat = new int [n] [n];
		
		// montando uma matriz
		for (int i =0; i<mat.length; i++) {
			
			for (int j= 0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		// como mostrar os numeros em diagonal de uma matriz
		System.out.println("main diagonal: ");
		
		for (int i=0;i<mat.length;i++) {
			System.out.print(mat[i][i]+" ");
		}
		System.out.println();
	
		// como contar apenas os numeros negativos
		int count =0;
	  for(int i =0; i<mat.length; i++) {
		 
		  for(int j=0; j<mat[i].length; j++) {
			 
			  if(mat[i][j]<0){
				 count++ ;
			  }
		  }
	  }
     System.out.println("Negative Numbers: " +count);
		
		
		
	
		sc.close();

	}

}
