package ejercicios;

import java.util.Scanner;

public class NumerosPerfectos {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int numero = tc.nextInt();

        int sumaDivisores = 0;

        
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        
        if (sumaDivisores == numero) {
            System.out.println("El número " + numero + " es perfecto.");
        } else {
            System.out.println("El número " + numero + " no es perfecto.");
        }


	}

}
