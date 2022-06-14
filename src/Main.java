import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String [] args) {

        JFrame frame = new JFrame();

        frame.setSize(new Dimension(600, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 3, 5, 5));

        for(int i = 0; i < 9; i++) {
            frame.add(new JButton(String.valueOf(i+1)));
        }


        frame.setVisible(true);

    }
}