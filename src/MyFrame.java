import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JCheckBox checkbox;
    JButton button;
    ImageIcon check = new ImageIcon("ok-64.png");
    ImageIcon x = new ImageIcon("x-mark-3-64.png");


    MyFrame() {
        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(800, 600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        checkbox = new JCheckBox("Are you a gae?");
        button = new JButton("Submit");

        checkbox.setSelectedIcon(check);
        checkbox.setIcon(x);

        button.addActionListener(this);

        this.add(button);
        this.add(checkbox);
        this.pack();
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            if(checkbox.isSelected()) {
                System.out.println("You are a gay? What the fuck");
            }
            else{
                System.out.println("You are not a gay. Congratulations");
            }
        }
    }
}
