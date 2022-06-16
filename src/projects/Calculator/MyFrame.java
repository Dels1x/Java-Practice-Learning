package projects.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class MyFrame extends JFrame implements ActionListener {


    String result = "0";
    String num = "";
    String operator;
    Color bg = new Color(0x141414);
    Color fg = new Color(0xFCFCFC);
    String[] buttonStrings = {"7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+", "<-", "0", "/", "="};
    ArrayList<JButton> buttons = new ArrayList<>();
    JPanel panelButtons;
    JPanel panelResult;
    JLabel labelResult;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(316, 489));
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(bg);


        panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(4, 4));
        panelButtons.setBounds(0, 110, 300, 340);
        panelButtons.setBackground(bg);

        panelResult = new JPanel();
        panelResult.setLayout(new BorderLayout());
        panelResult.setBounds(0, 0, 300, 110);
        panelResult.setBackground(new Color(0x0F0F0F));

        labelResult = new JLabel("0");
        labelResult.setFont(new Font("Consolas", Font.BOLD, 48));
        labelResult.setForeground(fg);
        labelResult.setHorizontalAlignment(JLabel.RIGHT);


        for (int i = 0; i < buttonStrings.length; i++) {
            buttons.add(new JButton(buttonStrings[i]));
            panelButtons.add(buttons.get(i));
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

        for (JButton button : buttons) {
            if (e.getSource() == buttons.get(3)) {
                if (Objects.equals(result, "0")) {
                    result = num;
                    num = "";
                    operator = "*";
                    break;
                } else if (Objects.equals(num, "")) {
                    operator = "*";
                } else {
                    int num1 = Integer.parseInt(result) * Integer.parseInt(num);
                    result = String.valueOf(num1);
                    num = "";
                    operator = "*";
                    labelResult.setText(result);
                    break;
                }
            } else if (e.getSource() == buttons.get(7)) {
                if (Objects.equals(num, "")) {
                    num = "0";
                }
                int num1 = Integer.parseInt(result) - Integer.parseInt(num);
                result = String.valueOf(Math.abs(num1));
                num = "";
                operator = "-";
                labelResult.setText(result);
                break;
            } else if (e.getSource() == buttons.get(11)) {
                if (Objects.equals(num, "")) {
                    num = "0";
                }
                int num1 = Integer.parseInt(result) + Integer.parseInt(num);
                result = String.valueOf(num1);
                num = "";
                operator = "+";
                labelResult.setText(result);
                break;
            } else if (e.getSource() == buttons.get(12)) {
                if (!Objects.equals(num, "")) {
                    num = num.substring(0, num.length() - 1);
                    labelResult.setText(num);
                } else {
                    System.out.println("String is empty!");
                }
                break;
            } else if (e.getSource() == buttons.get(14)) {
                if (Objects.equals(result, "0")) {
                    result = num;
                    num = "";
                    operator = "/";
                    break;
                } else if (Objects.equals(num, "")) {
                    operator = "/";
                } else {
                    int num1 = Integer.parseInt(result) / Integer.parseInt(num);
                    result = String.valueOf(num1);
                    num = "";
                    operator = "/";
                    labelResult.setText(result);
                    break;
                }
            } else if (e.getSource() == buttons.get(15)) {
                if (Objects.equals(operator, "+")) {
                    int num1 = Integer.parseInt(result) + Integer.parseInt(num);
                    result = String.valueOf(num1);
                    num = "";
                    operator = "";
                    labelResult.setText(result);
                    num = result;
                    result = "0";
                    break;
                } else if (Objects.equals(operator, "-")) {
                    int num1 = Integer.parseInt(result) - Integer.parseInt(num);
                    result = String.valueOf(num1);
                    num = "";
                    operator = "";
                    labelResult.setText(result);
                    num = result;
                    result = "0";
                    break;
                } else if (Objects.equals(operator, "/")) {
                    if (Objects.equals(result, "0")) {
                        result = num;
                        num = "";
                        break;
                    } else if (Objects.equals(num, "")) {
                        operator = "/";
                    } else {
                        int num1 = Integer.parseInt(result) / Integer.parseInt(num);
                        result = String.valueOf(num1);
                        num = "";
                        operator = "/";
                        labelResult.setText(result);
                        num = result;
                        result = "0";
                        break;
                    }
                } else if (Objects.equals(operator, "*")) {
                    if (Objects.equals(result, "0")) {
                        result = num;
                        num = "";
                        operator = "*";
                        break;
                    } else if (Objects.equals(num, "")) {
                        operator = "*";
                    } else {
                        int num1 = Integer.parseInt(result) * Integer.parseInt(num);
                        result = String.valueOf(num1);
                        num = "";
                        operator = "*";
                        labelResult.setText(result);
                        num = result;
                        result = "0";
                        break;
                    }
                } else {
                    System.out.println("You should decide operator first!");
                }
                break;
            } else {
                if (e.getSource() == button) {
                    num += String.valueOf(button.getText());
                    labelResult.setText(num);
                    break;
                }
            }
        }

        System.out.println("num: "+num);
        System.out.println("result: "+result);

    }
}
