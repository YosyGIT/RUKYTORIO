package vectores;

public class EJER4UT3V2 {

	public static void main(String[] args) {

// Declaración de la matriz alumnos 

		int alumnos[][] = { { 1, 2, 3, 4 }, { 10, 20, 30, 40 }, { 100, 200, 300, 400 } };

// Bucle para recorrer las filas de la matriz 

		for (int filas = 0; filas < alumnos.length; filas++) {

			System.out.println("Los valores de la fila " + filas + " son:");

// Bucle para recorrer las columnas de cada fila 

			for (int columnas = 0; columnas < alumnos[filas].length; columnas++) {

				System.out.print(alumnos[filas][columnas] + " "); // Imprimir con un espacio entre los valores

			}

			System.out.println(); // Para pasar a la siguiente línea después de imprimir todos los valores de una
									// fila

		}

	}

}