package application;

public class Strings {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG ";
		
		// Para deixar as letras minusculas e maiusculas
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		
		// O TRIM Elimina os espaços em branco
		String s03 = original.trim();
		
		// Mostra a string a partir de uma variavel adiante
		String s04 = original.substring(2);
		
		// Mostra a partir do caractere 2 até o 9
		String s05 = original.substring(2, 9);
		
		// O replace muda um caractere para um que voce deseja, exemplo trocar o 'a' pelo 'x'
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		
		// mostra aonde esta a letra
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

	}

}
