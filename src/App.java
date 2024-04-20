import javax.swing.JOptionPane;
import net.salesianos.Gestor;
import net.salesianos.Menu;
import net.salesianos.Validador;

public class App {
    public static void main(String[] args) throws Exception {

        boolean seguirPreguntando = true;

        while (seguirPreguntando) {

            String opcionUsuario = JOptionPane.showInputDialog(Menu.mostrar());
            if (Validador.noNulo(opcionUsuario)) {

                switch (opcionUsuario) {
                    case "1":
                        Gestor.agregarRestaurante();
                        break;

                    case "2":
                        Gestor.modificarRestaurante();
                        break;

                    case "3":
                        Gestor.mostrarRestaurante();
                        break;

                    case "4":
                        Gestor.eliminarRestaurante();
                        break;

                    case "Q":
                        JOptionPane.showMessageDialog(null, "Adios\n");
                        seguirPreguntando = false;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Valor invalido, vuelva a intentarlo\n");
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Valor invalido, vuelva a intentarlo\n");
            }
        }
    }
}
