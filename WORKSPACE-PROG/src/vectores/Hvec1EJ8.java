package vectores;

import java.util.Scanner;

public class Hvec1EJ8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe SOLO los números de un DNI: ");
		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };
		int ndni = entrada.nextInt();
		int calculo = ndni % 23;
		char dni = letras[calculo];
		System.out.println("La letra que corresponde al DNI es: "+dni);
	}
}
