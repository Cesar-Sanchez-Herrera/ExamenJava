package ExamenJavaMate;

public interface Operaciones {
	
	public static int suma(int numero1, int numero2) {
        int op; 
        op = numero1 + numero2; 
        return op;
	}
	
	public static int resta(int numero1, int numero2) {
        int op; 
        op = numero1 - numero2; 
        return op;
	}
	
	public static int multi(int numero1, int numero2) {
        int op; 
        op = numero1 * numero2; 
        return op;
	}
	
	public static float divi(float numero1, float numero2) {
        float op; 
        op = numero1 / numero2;
        if(numero1 != 0 && numero2 != 0) {
        	 return op;
        }else {
        	return 0;
        }
       
	}
}
