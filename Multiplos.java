package ExamenJava;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		int numero = scan.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
	}
}
