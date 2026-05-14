package net.salesianos.InputUtils;

import javax.swing.JOptionPane;

/**
 * Clase de utilidades para pedir y validar datos.
 */
public class InputUtils {

    public static String pedirTexto(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    public static int pedirNumero(String mensaje) {

        while (true) {

            try {

                String texto = JOptionPane.showInputDialog(mensaje);

                if (texto == null) {
                    return -1;
                }

                int numero = Integer.parseInt(texto);

                if (numero >= 1 && numero <= 5) {
                    return numero;
                }

                JOptionPane.showMessageDialog(null,
                        "La puntuación debe ser entre 1 y 5");

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null,
                        "Debes introducir un número válido");

            }
        }
    }
}