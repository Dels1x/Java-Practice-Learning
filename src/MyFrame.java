import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JCheckBox checkBox;
    JButton submitButton;
    ImageIcon xIcon;
    ImageIcon checkIcon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        checkBox = new JCheckBox("I'm not a gay");
        submitButton = new JButton("Submit");
        xIcon = new ImageIcon("x-mark-3-64.png");
        checkIcon = new ImageIcon("ok-64.png");

        submitButton.addActionListener(this);

        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.BOLD, 25));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);


        this.add(submitButton);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submitButton) {
            System.out.println(checkBox.isSelected()); // returns true  or false, depending on if checkbox is the selected or not
        }
    }
}
