import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame extends JFrame implements MouseListener {


    JLabel label;


    MyFrame() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addMouseListener(this);


        label = new JLabel("You just started work of this program!");
        label.setFont(new Font("Consolas", Font.PLAIN, 64));


        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("You pressed the button of mouse!");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("You released the button of your mouse!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Your cursor entered the window!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Your curser exited the window!");
    }
}