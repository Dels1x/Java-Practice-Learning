import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){

        this.setVisible(true); // makes the this visible
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // end the script once user closes window
        this.setSize(512, 512); // sets resolution of a this
        this.setResizable(false); // prevents this from being resized
        this.setTitle("delsix's lab"); // sets title of a this

        ImageIcon image = new ImageIcon("Dels1x.png"); // create an image icon
        this.setIconImage(image.getImage()); // change icon of this
        this.getContentPane().setBackground(new Color(0xA666FF));
    }
}
