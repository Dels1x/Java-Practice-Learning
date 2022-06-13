import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String [] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 100));
        panel.setBackground(Color.RED);

        frame.setLayout(new GridBagLayout());
        frame.add(panel, new GridBagConstraints());
        frame.setSize(new Dimension(800, 800));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}