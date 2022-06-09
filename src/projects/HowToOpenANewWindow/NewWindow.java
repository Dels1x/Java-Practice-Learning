package projects.HowToOpenANewWindow;

import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hi, this is the new window! :)");

    NewWindow(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(420, 420));
        frame.setLayout(null);
        frame.setVisible(true);

        label.setBounds(20, 80, 400, 80);
        label.setFont(new Font("Consolas", Font.PLAIN, 16));
        frame.add(label);
    }
}
