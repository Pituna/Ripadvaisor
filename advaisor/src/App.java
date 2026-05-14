import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import net.salesianos.restaurante.Restaurante;
import net.salesianos.InputUtils.InputUtils;

/**
 * Aplicación principal RipAdbaisor.
 * Permite añadir, editar, mostrar y eliminar restaurantes.
 */
public class App {

    public static void main(String[] args) {

        JFrame frame = new JFrame("RipAdbaisor");

        frame.setSize(400, 300);

        // Impide cerrar con la X
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        frame.setLocationRelativeTo(null);

        ArrayList<Restaurante> restaurantes = new ArrayList<>();

        boolean salir = false;

        while (!salir) {

            String menu = """
                    1. Añadir restaurante
                    2. Editar restaurante
                    3. Mostrar restaurantes
                    4. Eliminar restaurante
                    5. Salir
                    """;

            String opcion = JOptionPane.showInputDialog(menu);

            if (opcion == null) {
                continue;
            }

            try {

                switch (opcion) {

                    case "1":

                        String nombre = InputUtils.pedirTexto("Nombre:");

                        String ciudad = InputUtils.pedirTexto("Ciudad:");

                        String tipo = InputUtils.pedirTexto("Tipo:");

                        int puntuacion = InputUtils.pedirNumero(
                                "Puntuación (1-5)");

                        Restaurante nuevo = new Restaurante(
                                puntuacion,
                                nombre,
                                ciudad,
                                tipo);

                        restaurantes.add(nuevo);

                        JOptionPane.showMessageDialog(null,
                                "Restaurante añadido");

                        break;

                    case "2":

                        if (restaurantes.isEmpty()) {
                            JOptionPane.showMessageDialog(null,
                                    "No hay restaurantes");
                            break;
                        }

                        String listaEditar = "";

                        for (int i = 0; i < restaurantes.size(); i++) {

                            listaEditar += i + " - "
                                    + restaurantes.get(i)
                                    + "\n";
                        }

                        int indiceEditar = Integer.parseInt(
                                JOptionPane.showInputDialog(
                                        listaEditar
                                        + "\nSelecciona índice"));

                        Restaurante editar = restaurantes.get(indiceEditar);

                        editar.setNombre(
                                InputUtils.pedirTexto("Nuevo nombre"));

                        editar.setCiudad(
                                InputUtils.pedirTexto("Nueva ciudad"));

                        editar.setTipo(
                                InputUtils.pedirTexto("Nuevo tipo"));

                        editar.setPuntuacion(
                                InputUtils.pedirNumero(
                                        "Nueva puntuación"));

                        JOptionPane.showMessageDialog(null,
                                "Restaurante editado");

                        break;
