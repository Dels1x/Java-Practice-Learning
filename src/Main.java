import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {


        // Layout Manager = Defines natural layout for components within a container

        // JLayeredPane = Swing container that provides a third dimension for positioning components. ex. depth, Z-index

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);


        JFrame frame = new JFrame("JLayeredPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);


        frame.setVisible(true);


    }
}