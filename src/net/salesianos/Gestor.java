package net.salesianos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Gestor {

    public static ArrayList<Restaurante> listaRestaurantes = new ArrayList<>();

    public static void agregarRestaurante() {

        int puntuacion = -1;
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del restaurante");
        String localizacion = JOptionPane.showInputDialog("Introduce la localizacion del restaurante");
        String horario = JOptionPane.showInputDialog("Introduce el horario del restaurante");

        while (true) {
            String puntuacionStr = JOptionPane
                    .showInputDialog("Introduce la valoración del restaurante como número entero del 0 al 100");
            if (Validador.esNumero(puntuacionStr)) {
                puntuacion = Integer.parseInt(puntuacionStr);

                if (puntuacion >= 0 && puntuacion <= 100) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "La valoración debe ser un número entero del 0 al 100");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La valoración debe ser un número entero del 0 al 100");
            }
        }

        Restaurante restaurante = new Restaurante(nombre, localizacion, horario, puntuacion);
        listaRestaurantes.add(restaurante);
        JOptionPane.showMessageDialog(null, "Restaurante añadido con exito");
    }
}