package projects.HowToOpenANewWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Open a new window");
    JButton exitButton = new JButton("Exit the window");

    LaunchPage(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setVisible(true);
        frame.setLayout(null);

        button.setFocusable(false);
        button.setBounds(87, 120, 300, 200);
        button.addActionListener(this);

        exitButton.setEnabled(false);

        frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        NewWindow newWindow;
        if (e.getSource() == button) {

            button.setEnabled(false);
            exitButton.setEnabled(true);
            newWindow = new NewWindow();
        }
    }
}
