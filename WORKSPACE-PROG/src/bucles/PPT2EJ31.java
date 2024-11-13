package bucles;
import java.util.Scanner;
public class PPT2EJ31 {
	public static void main(String[]args) {
	Scanner entrada= new Scanner(System.in);
	int cantidad=0;
	int num=0;
	int suma=0;
	System.out.println("Número de datos: ");
	cantidad=entrada.nextInt();
	for (int i=0;i<cantidad;i++) {
		System.out.println("Introduce número: ");
		num=entrada.nextInt();
		suma=suma+num;
	}
	System.out.println("La media es: "+suma/cantidad);
	if(num%2!=0);
		System.out.println("Se ha insertado algún par");
	}
}
