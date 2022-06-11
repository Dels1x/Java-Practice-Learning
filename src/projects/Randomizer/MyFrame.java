package projects.Randomizer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyFrame extends JFrame implements ActionListener {

    int randomNumber = 0;
    Random random = new Random();
    JLabel randomNumberLabel;
    JLabel minNumberLabel;
    JLabel maxNumberLabel;
    JButton randomizeButton;
    JTextField minNumberTextField;
    JTextField maxNumberTextField;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(800, 700));
        this.setLayout(null);
        this.setResizable(false);


        randomNumberLabel = new JLabel(String.valueOf(randomNumber));
        randomizeButton = new JButton("Randomize");
        minNumberTextField = new JTextField();
        maxNumberTextField = new JTextField();
        JPanel numberPanel = new JPanel();
        JPanel textFieldsPanel = new JPanel();
        JPanel buttonPanel = new JPanel();


        // numberPanel-------
        numberPanel.setLayout(new BorderLayout());
        numberPanel.setBounds(0, 0, 800, 350);
        randomNumberLabel.setVerticalAlignment(JLabel.CENTER);
        randomNumberLabel.setHorizontalAlignment(JLabel.CENTER);
        randomNumberLabel.setFont(new Font("Consolas", Font.PLAIN, 128));
        this.add(numberPanel);
        numberPanel.add(randomNumberLabel);


        // textFieldsPanel--------

        textFieldsPanel.setLayout(new GridLayout(2, 2, 20, 5));
        textFieldsPanel.setBounds(0, 350, 800, 120);

        minNumberLabel = new JLabel("Min number:");
        maxNumberLabel = new JLabel("Max number:");
        minNumberLabel.setFont(new Font("Consolas", Font.PLAIN, 32));
        maxNumberLabel.setFont(new Font("Consolas", Font.PLAIN, 32));

        minNumberTextField.setSize(new Dimension(500, 50));
        maxNumberTextField.setSize(new Dimension(500, 50));
        minNumberTextField.setFont(new Font("Consolas", Font.PLAIN, 32));
        maxNumberTextField.setFont(new Font("Consolas", Font.PLAIN, 32));

        this.add(textFieldsPanel);
        textFieldsPanel.add(minNumberLabel);
        textFieldsPanel.add(maxNumberLabel);
        textFieldsPanel.add(minNumberTextField);
        textFieldsPanel.add(maxNumberTextField);


        // buttonPanel-------

        buttonPanel.setLayout(new BorderLayout());
        buttonPanel.setBounds(0, 470, 800, 230);
        randomizeButton.setFont(new Font("Consolas", Font.PLAIN, 32));
        randomizeButton.setVerticalAlignment(JButton.CENTER);
        randomizeButton.setHorizontalAlignment(JButton.CENTER);
        randomizeButton.setBackground(Color.lightGray);
        randomizeButton.addActionListener(this);
        this.add(buttonPanel);
        buttonPanel.add(randomizeButton);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == randomizeButton) {
            if(Integer.parseInt(maxNumberTextField.getText()) + 1 > Integer.parseInt(minNumberTextField.getText())){
                randomNumberLabel.setFont(new Font("Consolas", Font.PLAIN, 128));
                randomNumber = random.nextInt(
                        Integer.parseInt(minNumberTextField.getText()),
                        Integer.parseInt(maxNumberTextField.getText()) + 1);
                randomNumberLabel.setText(String.valueOf(randomNumber));
            }
            else{
                randomNumberLabel.setFont(new Font("Consolas", Font.PLAIN, 32));
                randomNumberLabel.setText("Max number should be higher that minimal!");
            }

        }
    }
}
