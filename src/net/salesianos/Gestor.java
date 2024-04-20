package net.salesianos;

import java.util.ArrayList;
import java.util.Collections;
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

    public static void mostrarRestaurante() {
        Collections.sort(listaRestaurantes,
                (restaurante, otroRestaurante) -> Integer.compare(otroRestaurante.getPuntuacion(),
                        restaurante.getPuntuacion()));
        for (Restaurante restaurante : listaRestaurantes) {
            JOptionPane.showMessageDialog(null, restaurante);
        }
    }

    public static void modificarRestaurante() {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del restaurante que quieres modificar: ");
        for (Restaurante restaurante : listaRestaurantes) {
            if (restaurante.getNombre().equalsIgnoreCase(nombre)) {
                String nuevoNombre = JOptionPane
                        .showInputDialog("Introduce el nuevo nombre del restaurante:");
                String nuevaLocalizacion = JOptionPane
                        .showInputDialog("Introduce la nueva ubicación del restaurante:");
                String nuevoHorario = JOptionPane
                        .showInputDialog("Introduce el nuevo horario de apertura del restaurante:");
                int nuevaPuntuacion;
                while (true) {
                    String puntuacionMensaje = JOptionPane
                            .showInputDialog("Introduce la nueva puntuación que tiene el restaurante: ");
                    if (Validador.esNumero(puntuacionMensaje)) {
                        nuevaPuntuacion = Integer.parseInt(puntuacionMensaje);
                        if (nuevaPuntuacion >= 0 && nuevaPuntuacion <= 100) {
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "La valoración debe ser un número entero del 0 al 100");
                        }
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "La puntuación debe representarse en números enteros.");
                    }
                }
                restaurante.setNombre(nuevoNombre);
                restaurante.setLocalizacion(nuevaLocalizacion);
                restaurante.setHorario(nuevoHorario);
                restaurante.setPuntuacion(nuevaPuntuacion);
                JOptionPane.showMessageDialog(null, "Restaurante modificado con exito.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "El restaurante no se encuentra en la lista.");
    }

    public static void eliminarRestaurante() {
        String nombreEliminar = JOptionPane.showInputDialog("Introduce el nombre del restaurante");
        for (Restaurante restaurante : listaRestaurantes) {
            if (restaurante.getNombre().equalsIgnoreCase(nombreEliminar)) {
                listaRestaurantes.remove(restaurante);
                JOptionPane.showMessageDialog(null, "Restaurante eliminado con exito");
                break;
            } else {
                JOptionPane.showMessageDialog(null,
                        "El nombre que ha introducido no se encuentra dentro de la base de datos");
                break;
            }
        }
    }
}