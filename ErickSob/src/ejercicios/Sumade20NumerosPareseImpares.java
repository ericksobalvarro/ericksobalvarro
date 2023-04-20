package ejercicios;

import java.util.Scanner;

public class Sumade20NumerosPareseImpares {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingresa un número: ");
            int numero = tc.nextInt();

            if (numero % 2 == 0) {
                pares += numero;
            } else {
                impares += numero;
            }
        }

        System.out.println("La suma de los números pares es: " + pares);
        System.out.println("La suma de los números impares es: " + impares);

	}

}
