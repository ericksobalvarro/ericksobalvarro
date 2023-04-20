package ejercicios;

import java.util.Scanner;

public class Adivinanza {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

      
        String respuesta = "Leon";

        
        int numIntentos = 3;

        
        System.out.println("¿Cuál es la capital del folklore nicaragüense?");

        for (int i = 0; i < numIntentos; i++) {
            System.out.print("Intento " + (i + 1) + ": ");
            String intento = tc.nextLine();

            if (intento.equalsIgnoreCase(respuesta)) {
                System.out.println("¡Correcto! La capital del folklore nicaragüense es " + respuesta + ".");
                return;
            } else {
                System.out.println("Incorrecto. Inténtalo de nuevo.");
            }
        }

        
        System.out.println("Lo siento, has agotado tus intentos. La capital del folklore nicaragüense es " + respuesta + ".");
    }

	}


