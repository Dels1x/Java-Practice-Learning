import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {


        // Layout Manager = Defines natural layout for components within a container

        // GridLayout = places components in a grid of cells
        //              Each component takes all the available space within its cell,
        //              and each cell is the same size.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 3, 5, 8));
        frame.setSize(600, 600);

        for(int i = 1; i < 10; i++){
            frame.add(new JButton(String.valueOf(i)));
        }

        frame.setVisible(true);


    }
}