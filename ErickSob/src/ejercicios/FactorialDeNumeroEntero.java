package ejercicios;

import java.util.Scanner;

public class FactorialDeNumeroEntero {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
        int num;
        int factorial = 1;

        System.out.print("Ingrese un número entero positivo: ");
        num = tc.nextInt();

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println(num + "! = " + factorial);

	}

}
