package vectores;

import java.util.Scanner;

public class PPT3busqueda2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor;
		int nota;
		int ultimaPosicion = -1;  
		boolean encontrado = false;
		int v[] = new int[6];

		// Pedir las 6 notas de los alumnos
		System.out.println("Introduce las 6 notas de los alumnos: ");
		for (int pos = 0; pos < v.length; pos++) {
			valor = entrada.nextInt();
			v[pos] = valor;
		}

		// Pedir la nota de un alumno
		System.out.println("Introduce la nota del alumno: ");
		nota = entrada.nextInt();

		// Verificar si la nota está repetida y guardar la última posición
		for (int k = 0; k < v.length; k++) {
			if (v[k] == nota) {
				encontrado = true;
				ultimaPosicion = k;
			}
		}

		// Mostrar resultado
		if (encontrado) {
			System.out.println("La nota " + nota + " se encuentra en la posición: " + ultimaPosicion);
		} else {
			System.out.println("La nota " + nota + " no está repetida.");
		}

		entrada.close(); // Cerrar el escáner
	}
}
