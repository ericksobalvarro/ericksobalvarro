package ejercicios;

import java.util.Scanner;

public class trianguloEquilateroIsoselesAEscaleno {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
        System.out.println("Ingrese la medida del primer lado: ");
        int lado1 = tc.nextInt();
        System.out.println("Ingrese la medida del segundo lado: ");
        int lado2 = tc.nextInt();
        System.out.println("Ingrese la medida del tercer lado: ");
        int lado3 = tc.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triangulo es equilatero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triangulo es isosceles");
        } else {
            System.out.println("El triangulo es escaleno");
        }
    }
}

	


