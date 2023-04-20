package ejercicios;

import java.util.Scanner;

public class LecturaDeNumerosXY {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

        System.out.print("Ingrese el valor de X: ");
        double x = tc.nextInt();
        System.out.print("Ingrese el valor de Y: ");
        double y = tc.nextInt();

        if (x < 0 && y < 0) {
            double resultado = Math.pow(x, 2) + Math.pow(y, 2);
            System.out.println("Resultado: " + resultado);
        } else if (x < 0 && y >= 0) {
            double resultado = y - x;
            System.out.println("Resultado: " + resultado);
        } else if (x >= 0 && y < 0) {
            if (y == 0) {
                System.out.println("No se puede dividir por cero");
            } else {
                double resultado = x / y;
                System.out.println("Resultado: " + resultado);
            }
        } else {
            if (x > y) {
                double resultado = x + y;
                System.out.println("Resultado: " + resultado);
            } else {
                double resultado = Math.sqrt(x);
                System.out.println("Resultado: " + resultado);
            }
        }

     
    }
}




