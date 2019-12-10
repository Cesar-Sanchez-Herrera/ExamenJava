package ExamenJava;
import java.util.Scanner;
import ExamenJavaMate.Operaciones;

public class NumerosEntrada implements Operaciones{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		int numero1 = scan.nextInt();
		System.out.println("Ingrese el segundo numero");
		int numero2 = scan.nextInt();
		
		System.out.println("Suma: " + Operaciones.suma(numero1, numero2));
		System.out.println("Resta: " + Operaciones.resta(numero1, numero2));
		System.out.println("Multiplicacion: " + Operaciones.multi(numero1, numero2));
		System.out.println("Division: " + Operaciones.divi(numero1, numero2));
	}
}
