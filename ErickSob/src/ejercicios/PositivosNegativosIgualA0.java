package ejercicios;

import java.util.Scanner;

public class PositivosNegativosIgualA0 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

	    int num, pos = 0, neg = 0, cero = 0;

	    System.out.println("Introduce 20 números: ");

	    for (int i = 0; i < 20; i++) {
	      num = tc.nextInt();

	      if (num > 0) {
	        pos++;
	      } else if (num < 0) {
	        neg++;
	      } else {
	        cero++;
	      }
	    }

	    System.out.println("Números positivos: " + pos);
	    System.out.println("Números negativos: " + neg);
	    System.out.println("Números iguales a cero: " + cero);

	   

	}

}
