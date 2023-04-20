package ejercicios;

public class NumerosPerfectos62 {

	public static void main(String[] args) {
		int contador = 0;
        int numero = 1;
        while (contador < 3) {
            if (esPerfecto(numero)) {
                System.out.println(numero + " es un número perfecto.");
                contador++;
            }
            numero++;
        }
    }

    public static boolean esPerfecto(int n) {
        int suma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }
        return suma == n;

	}

}
