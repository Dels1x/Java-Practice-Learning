package projects.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MyFrame extends JFrame implements ActionListener {


    String result = "";
    String num = "";
    Color bg = new Color(0x0A0A0A);
    Color fg = new Color(0xFCFCFC);
    String[] buttonStrings = {"7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+", "-", "0", "/", "="};
    ArrayList<JButton> buttons = new ArrayList<>();
    JPanel panelButtons;
    JPanel panelResult;
    JLabel labelResult;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(325, 500));
        this.setResizable(false);
        this.setLayout(new GridLayout(2, 1));
        this.getContentPane().setBackground(bg);

        panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(4, 4));

        panelResult = new JPanel();
        panelResult.setLayout(new BorderLayout());

        panelResult.setBackground(bg);

        labelResult = new JLabel("0");
        labelResult.setFont(new Font("Consolas", Font.BOLD, 64));
        labelResult.setForeground(fg);
        labelResult.setHorizontalAlignment(JLabel.RIGHT);


        for (int i = 0; i < buttonStrings.length; i++) {
            buttons.add(new JButton(buttonStrings[i]));
            panelButtons.add(buttons.get(i));
            System.out.println(buttons.get(i));
            buttons.get(i).addActionListener(this);
            buttons.get(i).setFont(new Font("Consolas", Font.BOLD, 32));
            buttons.get(i).setBackground(bg);
            buttons.get(i).setForeground(fg);


            panelResult.add(labelResult, BorderLayout.CENTER);
            this.add(panelResult);
            this.add(panelButtons);

            this.setVisible(true);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < buttons.size(); i++){
            if(e.getSource() == buttons.get(i)) {
                result += String.valueOf(i);
                System.out.println(result);
                labelResult.setText(result);
            }
        }


    }
}
