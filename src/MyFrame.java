import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JLabel label;
    int i = 0;
    MyFrame(){

        ImageIcon icon = new ImageIcon("diamond_helmet_64x64.png");
        button1 = new JButton();
        button2 = new JButton();
        button1.setBounds(50, 50, 150, 150);
        button1.setText("Click me");
        button1.setHorizontalTextPosition(JLabel.CENTER);
        button1.setVerticalTextPosition(JLabel.BOTTOM);
        button1.setFocusable(false);
        button1.setIcon(icon);
        button1.setIconTextGap(-15);
        button1.setForeground(new Color(0xAA00FF));
        button1.setBorder(BorderFactory.createEtchedBorder());
        button1.addActionListener(this);

        button2 = new JButton();
        button2.setBounds(50, 200, 150, 150);
        button2.setText("Click me");
        button2.setHorizontalTextPosition(JLabel.CENTER);
        button2.setVerticalTextPosition(JLabel.BOTTOM);
        button2.setFocusable(false);
        button2.setIcon(icon);
        button2.setEnabled(false);
        button2.setIconTextGap(-15);
        button2.setForeground(new Color(0xAA00FF));
        button2.setBorder(BorderFactory.createEtchedBorder());
        button2.addActionListener(this);

        label = new JLabel();
        label.setText(String.valueOf(i));
        label.setBounds(220, 60, 150, 150);
        label.setFont(new Font("Consolas", Font.BOLD, 96));
        button1.setFont(new Font("Consolas", Font.BOLD, 22));
        button2.setFont(new Font("Consolas", Font.BOLD, 22));
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(new Color(0x9A00FF));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(640, 600);
        this.setVisible(true);
        this.add(button1);
        this.add(button2);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            i++;
            System.out.printf("You clicked the button %d times\n", i);
            label.setText(String.valueOf(i));
            button1.setEnabled(false); // makes the button disabled once clicked
            button2.setEnabled(true);
        }
        else if(e.getSource() == button2){
            i++;
            System.out.printf("You clicked the button %d times\n", i);
            label.setText(String.valueOf(i));
            button1.setEnabled(true); // makes the button disabled once clicked
            button2.setEnabled(false);
        }
    }

}
