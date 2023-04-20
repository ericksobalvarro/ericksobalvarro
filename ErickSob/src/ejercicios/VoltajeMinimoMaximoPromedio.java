package ejercicios;

import java.util.Scanner;

public class VoltajeMinimoMaximoPromedio {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
        int n;
        double voltaje, minimo, maximo, promedio, suma;

        System.out.print("Ingrese la cantidad de voltajes: ");
        n = tc.nextInt();

        System.out.print("Ingrese el voltaje 1: ");
        voltaje = tc.nextInt();

        minimo = voltaje;
        maximo = voltaje;
        suma = voltaje;

        for (int i = 2; i <= n; i++) {
            System.out.print("Ingrese el voltaje " + i + ": ");
            voltaje =  tc.nextInt();
            suma += voltaje;
            if (voltaje < minimo) {
                minimo = voltaje;
            }
            if (voltaje > maximo) {
                maximo = voltaje;
            }
        }

        promedio = suma / n;

        System.out.println("El voltaje mínimo es: " + minimo);
        System.out.println("El voltaje máximo es: " + maximo);
        System.out.println("El promedio de los voltajes es: " + promedio);

	}

}
