import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame implements ActionListener {

    ArrayList<Integer> list = new ArrayList<>();


    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button10;
    JButton button11;
    JButton button12;
    JButton button13;
    JButton button14;
    JButton button15;
    JPanel osnovapanel;
    JPanel panel1;
    JPanel panel2;
    int n0 = 0;
    int n1 = 1;
    int n2 = 2;
    int n3 = 3;
    int n4 = 4;
    int n5 = 5;
    int n6 = 6;
    int n7 = 7;
    int n8 = 8;
    int n10 = 9;
    char z1 = '+';
    char z2 = '-';
    char z3 = '*';
    char z4 = '/';

    MyFrame() {

        button1 = new JButton();
        button1.setText("1");
        button1.setForeground(Color.BLACK);
        button1.setFocusable(false);
        button1.addActionListener(this);


        JButton button2 = new JButton();
        button2.setText("2");
        button2.setForeground(Color.BLACK);
        button2.setFocusable(false);
        button2.addActionListener(this);

        JButton button3 = new JButton();
        button3.setText("3");
        button3.setForeground(Color.BLACK);
        button3.setFocusable(false);
        button3.addActionListener(this);

        JButton button4 = new JButton();
        button4.setText("4");
        button4.setForeground(Color.BLACK);
        button4.setFocusable(false);
        button4.addActionListener(this);

        JButton button5 = new JButton();
        button5.setText("5");
        button5.setForeground(Color.BLACK);
        button5.setFocusable(false);
        button5.addActionListener(this);

        JButton button6 = new JButton();
        button6.setText("6");
        button6.setForeground(Color.BLACK);
        button6.setFocusable(false);
        button6.addActionListener(this);

        JButton button7 = new JButton();
        button7.setText("7");
        button7.setForeground(Color.BLACK);
        button7.setFocusable(false);
        button7.addActionListener(this);

        JButton button8 = new JButton();
        button8.setText("8");
        button8.setForeground(Color.BLACK);
        button8.setFocusable(false);
        button8.addActionListener(this);

        JButton button9 = new JButton();
        button9.setText("9");
        button9.setForeground(Color.BLACK);
        button9.setFocusable(false);
        button9.addActionListener(this);

        JButton button10 = new JButton();
        button10.setText("0");
        button10.setForeground(Color.BLACK);
        button10.setFocusable(false);
        button10.addActionListener(this);

        JButton button11 = new JButton();
        button11.setText("+");
        button11.setForeground(Color.BLACK);
        button11.setFocusable(false);
        button11.addActionListener(this);


        JButton button12 = new JButton();
        button12.setText("-");
        button12.setForeground(Color.BLACK);
        button12.setFocusable(false);
        button12.addActionListener(this);

        JButton button13 = new JButton();
        button13.setText("*");
        button13.setForeground(Color.BLACK);
        button13.setFocusable(false);
        button13.addActionListener(this);

        JButton button14 = new JButton();
        button14.setText("/");
        button14.setForeground(Color.BLACK);
        button14.setFocusable(false);
        button14.addActionListener(this);

        JButton button15 = new JButton();
        button15.setText("=");
        button15.setForeground(Color.BLACK);
        button15.setFocusable(false);
        button15.addActionListener(this);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.lightGray);
        panel1.setBounds(120, 120, 400, 450);
        panel1.setLayout(new GridLayout(5, 3));
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);
        panel1.add(button6);
        panel1.add(button7);
        panel1.add(button8);
        panel1.add(button9);
        panel1.add(button12);
        panel1.add(button10);
        panel1.add(button11);
        panel1.add(button14);
        panel1.add(button15);
        panel1.add(button13);




        JLabel label1 = new JLabel();
        label1.setForeground(Color.BLUE);
        label1.setText("Result: ");
        label1.setFont(new Font("MV Bovi", Font.PLAIN, 30));
        label1.setBounds(50, 40, 150, 60);


        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.PINK);
        panel2.setBounds(120, 5, 400, 120);

        panel2.setLayout(null);
        panel2.add(label1);





        JPanel osnovapalnel = new JPanel();
        osnovapalnel.setBackground(Color.WHITE);
        osnovapalnel.setLayout(null);
        osnovapalnel.add(panel2);
        osnovapalnel.add(panel1);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(650, 650);

        this.setResizable(false);

        this.setLayout(new GridLayout());
        this.add(osnovapalnel);
        this.setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());
        if(e.getSource() == button1) {
            System.out.println("Pidoras");
        }

    }
}