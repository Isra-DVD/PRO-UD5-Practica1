package net.salesianos;

public class Validador {
    public static boolean esNumero(String texto) {
        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean noNulo(String texto) {
        if (texto != null) {
            return true;
        } else {
            return false;
        }
    }
}
