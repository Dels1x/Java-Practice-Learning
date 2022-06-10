import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JTextField textbox;
    JButton submitButton;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(new Dimension(720, 720));

        textbox = new JTextField(); // create a textbox
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        textbox.setPreferredSize(new Dimension(250, 50)); // set size
        textbox.setFont(new Font("Consolas", Font.PLAIN, 36)); // set font
        textbox.setForeground(new Color(0xFF561F)); // set font color
        textbox.setBackground(Color.darkGray); // set background color
        textbox.setCaretColor(Color.white); // set this line when you type something color
        textbox.setText("delsix"); // set default text


        this.add(textbox);
        this.add(submitButton);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submitButton) {
            textbox.setEditable(false); // make textbox uneditable
            submitButton.setEnabled(false); // makes button disabled
            System.out.println("Welcome "+textbox.getText());
        }
    }

}
