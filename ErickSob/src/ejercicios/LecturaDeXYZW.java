package ejercicios;

import java.util.Scanner;

public class LecturaDeXYZW {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

	    System.out.print("Ingrese el valor de X: ");
	    int x =tc.nextInt();

	    System.out.print("Ingrese el valor de Y: ");
	    int y = tc.nextInt();

	    System.out.print("Ingrese el valor de Z: ");
	    int z = tc.nextInt();

	    System.out.print("Ingrese el valor de W: ");
	    int w = tc.nextInt();

	    int result = x * y * z * w;
	    System.out.println("El resultado de XYZW es: " + result);

	   
	  }
	}

	


