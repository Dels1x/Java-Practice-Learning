import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;


    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        button = new JButton("Pick a color");
        button.addActionListener(this);
        label = new JLabel("This is your color :D");
        label.setFont(new Font("Consolas", Font.BOLD, 32));


        this.add(label);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            Color color = JColorChooser.showDialog(null, "Pick a color", Color.white);
            this.getContentPane().setBackground(color);
        }
    }
}