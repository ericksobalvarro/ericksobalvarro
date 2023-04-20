package ejercicios;

import java.util.Scanner;

public class AritmeticaPromedio {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números a leer: ");
        int n =tc.nextInt();

        double suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa un número: ");
            double numero = tc.nextInt();
            suma += numero;
        }

        double media = suma / n;

        System.out.println("La media aritmética es: " + media);

	}

}
