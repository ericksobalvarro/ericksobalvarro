package ejercicios;

import java.util.Scanner;

public class funsionY {

	public static void main(String[] args) {
		
		Scanner tc=new Scanner(System.in);
		double X;
		
		
		
		
		System.out.println("Ingrese un valor para X: " );
		
		X=tc.nextInt();
		
		
		double Y1 = 5 * Math.pow(1, 4) + 2 * Math.pow(1, 3) + 3 * Math.pow(1, 2) + 7;
        double Y2 = 5 * Math.pow(X, 4) + 2 * Math.pow(X, 3) + 3 * Math.pow(X, 2) + 7;

		
		System.out.println("Y para X = 1: " + Y1);
		System.out.println("Y para X = " + X + ": " + Y2);
		
		
				
		

	}

}
