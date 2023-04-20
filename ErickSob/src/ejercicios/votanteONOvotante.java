package ejercicios;

import java.util.Scanner;

public class votanteONOvotante {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);
	      
	      System.out.print("Ingrese su edad: ");
	      int edad = tc.nextInt();
	      
	      if (edad >= 16) {
	         System.out.println("Usted es votante");
	      } else {
	         System.out.println("Usted no es votante");
	      }

	}

}
