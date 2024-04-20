package net.salesianos;

public class Menu {
    public static String mostrar() {
        final String MENU = """
                1. Añadir restaurante.\n
                2. Modificar restaurante.\n
                3. Mostrar restaurantes.\n
                4. Eliminar restaurante.\n
                Q. Salir del programa.\n
                    """;
        return MENU;
    }
}
