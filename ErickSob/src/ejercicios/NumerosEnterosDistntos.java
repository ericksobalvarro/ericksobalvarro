package ejercicios;

import java.util.Scanner;

public class NumerosEnterosDistntos {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero positivo: ");
        int numero1 = tc.nextInt();

        System.out.print("Ingrese el segundo número entero positivo: ");
        int numero2 = tc.nextInt();

        int mayor = Math.max(numero1, numero2);
        int menor = Math.min(numero1, numero2);

        int diferencia = mayor - menor;

        System.out.println("La diferencia entre el mayor y el menor es: " + diferencia);

        
    }
}

	


