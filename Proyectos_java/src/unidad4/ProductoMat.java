package unidad4;
import java.util.*;
public class ProductoMat {
	static 	Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		double v[];
		int n;
		System.out.print("Numero de elementos: ");
		n = entrada.nextInt();
		
		v = new double[n];
		leerArreglo(v);
		System.out.println("El producto de los elementos "+" = "+producto(v));
		
		
		
	}
	static void leerArreglo(double a[]){
		int n = 0;
		System.out.println("Introduce "+a.length+" datos.");
		for (; n < a.length; n++) {
			a[n] = entrada.nextDouble();
		}
	}
	
	static double producto(double w[]){
		double pd = 1.0;
		int n = w.length - 1;
		while(n >= 0){
			if(w[n] > 0.0)
				pd *= w[n--];
			else
				n--;
		}
			return pd;
	}
	

}
