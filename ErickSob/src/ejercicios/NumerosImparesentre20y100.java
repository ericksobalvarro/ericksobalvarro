package ejercicios;

public class NumerosImparesentre20y100 {

	public static void main(String[] args) {
		 int contadorImpares = 0;
	        int sumaImpares = 0;

	        for (int i = 21; i <= 99; i += 2) {
	            contadorImpares++;
	            sumaImpares += i;
	        }

	        System.out.println("Entre 20 y 100 hay " + contadorImpares + " números impares");
	        System.out.println("La suma de los números impares es " + sumaImpares);
	}

}
