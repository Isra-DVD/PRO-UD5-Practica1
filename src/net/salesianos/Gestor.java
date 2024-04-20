package net.salesianos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Gestor {

    public static ArrayList<Restaurante> listaRestaurantes = new ArrayList<>();

    public static void agregarRestaurante() {

        int puntuacion;
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del restaurante");
        String localizacion = JOptionPane.showInputDialog("Introduce la localizacion del restaurante");
        String horario = JOptionPane.showInputDialog("Introduce el horario del restaurante");

        while (true) {
            String puntuacionStr = JOptionPane
                    .showInputDialog("Introduce la valoración del restaurante como número entero");
            if (Validador.esNumero(puntuacionStr)) {
                puntuacion = Integer.parseInt(puntuacionStr);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "La puntuación debe ser entero");
            }
        }

        Restaurante restaurante = new Restaurante(nombre, localizacion, horario, puntuacion);
        listaRestaurantes.add(restaurante);
        JOptionPane.showMessageDialog(null, "Restaurante añadido con exito");
    }
}