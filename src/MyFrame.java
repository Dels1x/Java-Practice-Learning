import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame extends JFrame{

    DragPanel panel = new DragPanel();

    MyFrame() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);


        this.add(panel);
        this.setVisible(true);
    }

}