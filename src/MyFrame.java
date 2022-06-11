import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JTextField nameTextField;
    JTextField passwordTextField;
    JLabel nameLabel;
    JLabel passwordLabel;
    JButton submitButton;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.setSize(new Dimension(720, 220));
        this.getContentPane().setBackground(Color.black);


        nameLabel = new JLabel("Enter your name: ");
        passwordLabel = new JLabel("Enter your password: ");
        nameLabel.setFont(new Font("Consolas", Font.PLAIN, 36));
        passwordLabel.setFont(new Font("Consolas", Font.PLAIN, 36));
        nameLabel.setForeground(Color.white);
        passwordLabel.setForeground(Color.white);

        nameTextField = new JTextField(); // create a nameTextField
        passwordTextField = new JTextField();
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        submitButton.setSize(new Dimension(700, 50));

        nameTextField.setPreferredSize(new Dimension(250, 50)); // set size
        nameTextField.setFont(new Font("Consolas", Font.PLAIN, 36)); // set font
        nameTextField.setForeground(new Color(0x00FFFF)); // set font color
        nameTextField.setBackground(Color.black); // set background color
        nameTextField.setCaretColor(Color.white); // set this line when you type something color
        nameTextField.setText(""); // set default text

        passwordTextField.setPreferredSize(new Dimension(250, 50)); // set size
        passwordTextField.setFont(new Font("Consolas", Font.PLAIN, 36)); // set font
        passwordTextField.setForeground(new Color(0x00FFFF)); // set font color
        passwordTextField.setBackground(Color.black); // set background color
        passwordTextField.setCaretColor(Color.white); // set this line when you type something color
        passwordTextField.setText(""); // set default text


        this.add(nameLabel);
        this.add(nameTextField);
        this.add(passwordLabel);
        this.add(passwordTextField);
        this.add(submitButton);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submitButton) {
            nameTextField.setEditable(false); // make nameTextField uneditable
            passwordTextField.setEditable(false);
            submitButton.setEnabled(false); // makes button disabled
            System.out.println("Your name is: "+nameTextField.getText());
            System.out.println("Your password is: "+passwordTextField.getText());
        }
    }

}
