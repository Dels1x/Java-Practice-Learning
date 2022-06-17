import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MyFrame extends JFrame implements ActionListener, KeyListener {


    JLabel label;
    ImageIcon ufoIcon;


    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.addKeyListener(this);


        ufoIcon = new ImageIcon("ufo.png");
        label = new JLabel();
        label.setBounds(0, 0, 64, 64);
        label.setIcon(ufoIcon);


        this.add(label);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) { // invoked when a key is typed. Uses KeyChar, char output
        switch(Character.toLowerCase(e.getKeyChar())) {
            case 'w' -> label.setLocation( label.getX(), label.getY()-8);
            case 'a' -> label.setLocation( label.getX()-8, label.getY());
            case 's' -> label.setLocation( label.getX(), label.getY()+8);
            case 'd' -> label.setLocation( label.getX()+8, label.getY());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) { // invoked when a physical key is pressed down. Uses KeyCode, int output
        System.out.println("You pressed a key character: " + e.getKeyChar());
        System.out.println("You pressed a key character: " + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {  // called whenever a button is released
        System.out.println("You released a key character: " + e.getKeyChar());
        System.out.println("You released a key character: " + e.getKeyCode());
    }
}