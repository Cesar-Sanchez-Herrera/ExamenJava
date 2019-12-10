package ExamenJava;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String palabrainvertida = "";
		System.out.println("Ingrese una palabra");
		String palabra = scan.nextLine();

		for (int x = palabra.length() - 1; x >= 0; x--) {
			palabrainvertida = palabrainvertida + palabra.charAt(x);
		}
		System.out.println(palabrainvertida);
		if (palabra.equals(palabrainvertida)) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
	}
}

