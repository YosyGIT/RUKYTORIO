package estructuras;

import java.util.Scanner;

public class PPT2EJ22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Intruduzca un número: ");
		int num1 = scanner.nextInt();
		System.out.println("Introduzca otro número");
		int num2 = scanner.nextInt();
		System.out.println("Introduce la operación que quieres usar, un * si quiere multiplicarlos, un + si quiere sumarlos, un - si quiere restarlos, un % o / si quiere visualizar el resto o el cociente de una división entera.");
		char operacion = scanner.next().charAt(0);
		int resul;
		switch (operacion) {
		case '*':
			resul = num1 * num2;
			System.out.println("El resultado es= " + resul);
			break;
		case '+':
			resul = num1 + num2;
			System.out.println("El resultado es= " + resul);
			break;
		case '-':
			resul = num1 - num2;
			System.out.println("El resultado es= " + resul);
			break;
		case '%':
			resul = num1 % num2;
			System.out.println("El resto de la división es= " + resul);
			break;
		case '/':
			resul = num1 / num2;
			System.out.println("El resultado es= " + resul);
			break;
		default:
			System.out.println("ERROR: Operación no ejecutable, inicie de nuevo.");
			break;

		}
	}
}
