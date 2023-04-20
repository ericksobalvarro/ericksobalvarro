package ejercicios;

import java.util.Scanner;

public class NiñoJovenAdulto {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
        int edad;

        System.out.print("Ingrese la edad: ");
        edad = tc.nextInt();

        if (edad < 13) {
            System.out.println("Niño");
        } else if (edad <= 25) {
            System.out.println("Joven");
        } else {
            System.out.println("Adulto");
        }

	}

}
