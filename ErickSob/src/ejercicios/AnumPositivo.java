package ejercicios;

import java.util.Scanner;

public class AnumPositivo {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);

		    System.out.print("Ingrese un número: ");
		    double a = tc.nextInt();

		    double y;
		    if (a >= 0) {
		      y = Math.pow(2, a);
		    } else {
		      y = a + 5;
		    }

		    System.out.println("El resultado de Y es " + y);

		   
		  }
		}

	


