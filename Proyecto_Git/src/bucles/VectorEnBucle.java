package bucles;
import java.util.Scanner;
public class VectorEnBucle {
	  public static void main(String[] args) {
	     // Crear un vector de tamaño 5
	     int[] vector = new int[5];
	 
	     Scanner scanner = new Scanner(System.in);
	 
	     // Rellenamos el vector con datos
	     System.out.println("Introduce 5 números para llenar el vector:");
	     for (int i = 0; i < vector.length; i++) {
	         System.out.print("Número " + (i + 1) + ": ");
	         vector[i] = scanner.nextInt();
	     }
	 
	     // Mostrar los datos del vector
	     System.out.println("Los datos del vector son:");
	     for (int i = 0; i < vector.length; i++) {
	         System.out.println("Elemento " + (i + 1) + ": " + vector[i]);
	     }
	 
	     scanner.close();
	 	}
	}

