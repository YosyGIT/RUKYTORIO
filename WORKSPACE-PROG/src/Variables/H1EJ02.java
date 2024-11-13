package Variables;

public class H1EJ02 {
	    public static void main(String[] args) {
	        // Definimos las variables
	        double saldo = 35000; // Saldo en euros
	        double tasaInteres = 0.06; // Tasa de interés del 6%
	        // Calculamos el interés
	        double interes = saldo * tasaInteres;
	        // Mostramos el resultado
	        System.out.printf("El interés a pagar sobre un saldo de %.2f euros con una tasa de interés del %.2f%% es: %.2f euros%n", saldo, tasaInteres * 100, interes);
	    }
}
