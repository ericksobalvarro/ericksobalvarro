package ejercicios;

import java.util.Scanner;

public class NumerosEnterosPositivoNegativo {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

        System.out.print("Ingrese el primer entero: ");
        int entero1 = tc.nextInt();

        System.out.print("Ingrese el segundo entero: ");
        int entero2 = tc.nextInt();

        if ((entero1 > 0 && entero2 < 0) || (entero1 < 0 && entero2 > 0)) {
            System.out.println("Signos opuestos");
        }

      
    }
}

	


