import javax.swing.*;
import java.util.ArrayList;
import net.salesianos.restaurante.Restaurante;
public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("RipAdbaisor");

        JLabel label = new JLabel("Hola Swing 👋");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        frame.add(label);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        ArrayList<Restaurante> restaurantes = new ArrayList<>();

        JButton boton = new JButton("Añadir");
        boton.setBounds(120,100,150,40);
        frame.add(boton);
        boton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Boton pulsado");
        
            String nombre = JOptionPane.showInputDialog("Nombre del restaurante:");
            String ciudad = JOptionPane.showInputDialog("Ciudad:");
            String tipo = JOptionPane.showInputDialog("Tipo de comida:");
            String puntuacionStr = JOptionPane.showInputDialog("Puntuación (1-5):");
            int puntuacion = Integer.parseInt(puntuacionStr);
            Restaurante r = new Restaurante(puntuacion, nombre, ciudad, tipo);
            restaurantes.add(r);
        });
    }
}
