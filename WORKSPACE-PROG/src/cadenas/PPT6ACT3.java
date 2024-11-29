package cadenas;

public class PPT6ACT3 {
	public static void main (String[]args) {
        String entrada = "casa blanca";
        String salida = "";

        for (int i = entrada.length() - 1; i >= 0; i--) {
            salida += entrada.charAt(i);
        }

        System.out.println(salida);
    }
}