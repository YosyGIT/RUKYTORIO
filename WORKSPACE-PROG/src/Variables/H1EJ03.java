package Variables;

public class H1EJ03 {
    public static void main(String[] args) {
        char letra = 'Ñ'; // Carácter objetivo

        // Obtener el valor Unicode del carácter
        int codigoUnicode = (int) letra;

        // Calcular los caracteres antes y después
        char anterior = (char) (codigoUnicode - 1);
        char siguiente = (char) (codigoUnicode + 1);

        // Mostrar los resultados
        System.out.println("Letra: " + letra);
        System.out.println("Código Unicode: " + codigoUnicode);
        System.out.println("Carácter anterior: " + anterior + " (Código Unicode: " + (codigoUnicode - 1) + ")");
        System.out.println("Carácter siguiente: " + siguiente + " (Código Unicode: " + (codigoUnicode + 1) + ")");
    }
}

