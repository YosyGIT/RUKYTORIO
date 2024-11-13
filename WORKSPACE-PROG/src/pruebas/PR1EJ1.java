package pruebas;
import java.util.Scanner;
public class PR1EJ1 {
	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		int numMax=0;
		//Introducimos el primer número
		System.out.println("Escribe un número: ");
		num=entrada.nextInt();
		numMax=num;
		//Bucle del programa
	while(num!=0) {
		System.out.println("Escribe otro número: ");
		num=entrada.nextInt();
	}
		if (num>=numMax) {
			numMax=num;
	}
		System.out.println("El número máximo es: " + numMax);
	}
}

