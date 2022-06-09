package projects.HowToOpenANewWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("Open a new window");

    LaunchPage() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(420, 420));
        frame.setLayout(null);
        frame.setVisible(true);

        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == myButton){

            // 2 ways we can use to prevent user from creation of infinite amount of windows

            // myButton.setEnabled(false); // disables the button
            frame.dispose(); // exits the frame window
            NewWindow myWindow = new NewWindow();
        }
    }
}
