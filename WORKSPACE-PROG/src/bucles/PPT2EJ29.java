package bucles;
import java.util.Scanner;
public class PPT2EJ29 {
	public static void main (String[]args) {
		Scanner entrada= new Scanner(System.in);
		String frase;
		int i;
		for(i=0;i<4;i++) {
			System.out.println("Escribe una frase: ");
			frase=entrada.nextLine();
			System.out.println(frase);
		}
		System.out.println("Proceso finalizado");
	}
}
