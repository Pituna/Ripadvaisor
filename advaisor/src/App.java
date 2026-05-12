import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Mi primera ventana");

        JLabel label = new JLabel("Hola Swing 👋");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        frame.add(label);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
