package ejercicios;

import java.util.Scanner;

public class CalificacionDeNumerosaLetras {

	public static void main(String[] args) {
		  Scanner tc = new Scanner(System.in);
	        System.out.print("Ingrese la nota: ");
	        int nota = tc.nextInt();

	        if (nota >= 90) {
	            System.out.println("A");
	        } else if (nota >= 80) {
	            System.out.println("B");
	        } else if (nota >= 70) {
	            System.out.println("C");
	        } else if (nota >= 65) {
	            System.out.println("D");
	        } else {
	            System.out.println("E");
	        }
	    }
	

	}


