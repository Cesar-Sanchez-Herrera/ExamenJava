package ExamenJava;
import java.util.Scanner;;
public class Mayor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el primer numero");
		int a = scan.nextInt();
		System.out.println("Ingresa el segundo numero");
		int b = scan.nextInt();
		
		if (a <= 21 && a > b) {
			System.out.println(a);
		}else if(b<= 21 && b>a) {
			System.out.println(b);
		}else if(a >= 21 && b>=21) {
			System.out.println("0");
		}else {
			System.out.println("ERROR");
		}
	}
}
