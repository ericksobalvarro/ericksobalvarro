package ejercicios;

import java.util.Scanner;

public class valordeY {

	public static void main(String[] args) {
		
		double C = 2.5;
		double X;
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de X: ");
		
		 X=tc.nextInt();
				
		double Y = X * C - 2;
		
		System.out.println("C: " + C);
		System.out.println("X: " + X);
		System.out.println("Y: " + Y);
		


	}

}
