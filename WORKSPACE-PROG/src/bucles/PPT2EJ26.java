package bucles;
import java.util.Scanner;
public class PPT2EJ26 {
	public static void main(String[]args) {
		int num;
		Scanner entrada=new Scanner(System.in);
		
		//bucle
		do {
			System.out.println("Introduce un número: ");
			num=entrada.nextInt();
		}while(num<10);
		System.out.println("Número: "+num+" FIN");
		entrada.close();
	}
}