package ejercicios;

import java.util.Scanner;

public class ParoImpar {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);
	      
	      System.out.print("Ingrese un número: ");
	      int numero = tc.nextInt();
	      
	      if (numero % 2 == 0) {
	         System.out.println("El número es par");
	      } else {
	         System.out.println("El número es impar");
	      }

	}

}
