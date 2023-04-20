package ejercicios;

import java.util.Scanner;

public class XesnegativoOno {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);

		    System.out.print("Ingrese un número: ");
		    double x = tc.nextInt();

		    if (x < 0) {
		      double result = Math.pow(x, 4);
		      System.out.println("El resultado de " + x + " elevado a la cuarta potencia es " + result);
		    } else {
		      double result = Math.pow(x, 2);
		      System.out.println("El resultado de " + x + " elevado a la segunda potencia es " + result);
		    }

		  
	}

}
