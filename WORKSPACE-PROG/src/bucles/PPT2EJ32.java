package bucles;
import java.util.Scanner;
public class PPT2EJ32 {
	public static void main (String[]args) {
		//Declaramos el escaner
		Scanner entrada = new Scanner(System.in);
		//Declaramos las variables
		int nota;
		int aprobados=0;
		//Creamos un bucle con for
		for(int i=0;i<10;i++) {
			do {
				System.out.println("Introduzca la nota: ");
				nota=entrada.nextInt();
				//Validamos el dato
				if (nota<0 || nota>10) {
					System.out.println("Nota inválida. Induce nuevamente.");
				}
			}while(nota<0 || nota>10);
			if (nota>=5) {
				aprobados++;
			}
		}
		System.out.print("Número de alumnos que aprueban el módulo: "+ aprobados);
	}
}
