package ejercicios;

import java.util.Scanner;

public class metodoDeCramer {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

        double a, b, c, d, e, f, determinante, determinanteX, determinanteY, x, y;

        System.out.print("Ingrese el valor de a: ");
        a = tc.nextInt();

        System.out.print("Ingrese el valor de b: ");
        b = tc.nextInt();

        System.out.print("Ingrese el valor de c: ");
        c = tc.nextInt();

        System.out.print("Ingrese el valor de d: ");
        d = tc.nextInt();

        System.out.print("Ingrese el valor de e: ");
        e = tc.nextInt();

        System.out.print("Ingrese el valor de f: ");
        f = tc.nextInt();

     
        determinante = a * e - b * d;

        determinanteX = c * e - b * f;

        determinanteY = a * f - c * d;

       
        if (determinante != 0) {
          
            x = determinanteX / determinante;

            y = determinanteY / determinante;

            System.out.println("El sistema tiene solución única.");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else {
            
            if (determinanteX != 0 || determinanteY != 0) {
                System.out.println("El sistema no tiene solución.");
            } else {
              
                System.out.println("El sistema tiene infinitas soluciones.");
            }
        }

	}

}
