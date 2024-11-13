package estructuras;
import java.util.Scanner;
public class PPT2EJ20 {
	public static void main (String []args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Introduzca un número del 1 al 7: ");
		int numero=scanner.nextInt();
		
		switch (numero) {
			case 1: System.out.println("El día es Lunes y es un día laborable"); break;
			case 2: System.out.println("El día es Martes y es un día laborable"); break;
			case 3: System.out.println("El día es Miércoles y es un día laborable"); break;
			case 4: System.out.println("El día es Jueves y es un día laborable"); break;
			case 5: System.out.println("El día es Viernes y es un día laborable"); break;
			case 6: System.out.println("El día es Sábado y es un NO día laborable"); break;
			case 7: System.out.println("El día es Domingo y es un día NO laborable"); break;
			default: System.out.println("ERROR: Introduzca un número del 1 al 7"); break;
			
		}
	}
}
