import javax.swing.JOptionPane;
import net.salesianos.Gestor;
import net.salesianos.Menu;

public class App {
    public static void main(String[] args) throws Exception {

        boolean seguirPreguntando = true;

        while (seguirPreguntando) {

            String opcionUsuario = JOptionPane.showInputDialog(Menu.mostrar());

            switch (opcionUsuario) {
                case "1":
                    Gestor.agregarRestaurante();
                    break;

                case "2":

                    break;

                case "3":

                    break;

                case "4":

                    break;

                case "Q":
                    JOptionPane.showMessageDialog(null, "Adios\n");
                    seguirPreguntando = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Valor invalido, vuelva a intentarlo\n");
                    break;
            }
        }
    }
}
