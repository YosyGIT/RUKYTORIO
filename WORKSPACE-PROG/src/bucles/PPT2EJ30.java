package bucles;
import java.util.Scanner;
public class PPT2EJ30 {
	public static void main (String[]args) {
		Scanner entrada= new Scanner(System.in);
		int i;
		int num;
		int suma=0;
		
		for(i=0;i<6;i++) {
			System.out.println("Escribe un número");
			num=entrada.nextInt();
			suma=num+num+num+num+num+num;
		}
		System.out.println("El resultado es: "+suma);
	}
}
