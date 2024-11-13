package estructuras;
import java.util.Scanner;
public class PPT2AC17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //LEEMOS EL NUM
        System.out.print("Introduce un número: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es neutro.");
        }
        //CERRAMOS EL PROGRAMA
        scanner.close();
    }
}