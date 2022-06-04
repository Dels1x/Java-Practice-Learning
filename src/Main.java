import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {


        // JLabel = a GUI display area for a string of text,  an image, or both

        JFrame frame = new JFrame();  // creates a frame

        ImageIcon image = new ImageIcon("Dels1x.png"); // create an image icon
        ImageIcon image2 = new ImageIcon("1111.png"); // create an image icon

        frame.setIconImage(image.getImage()); // change icon of frame
        frame.getContentPane().setBackground(new Color(0xEEEEEE));

        JLabel label = new JLabel(); // create a label
        label.setText("I'm at 50th lesson :D"); // set text of label
        label.setIcon(image2); // sets an image of label
        label.setHorizontalTextPosition(JLabel.CENTER); // sets text LEFT, CENTER, RIGHT of imageIcon
        label.setVerticalTextPosition(JLabel.TOP); // sets text TOP, CENTER, BOTTOm of imageIcon
        label.setForeground(Color.black); // sets font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 32)); // sets font, size of text
        label.setIconTextGap(-12); // sets gap between image and text
        label.setBackground(Color.yellow); // sets background color
        label.setOpaque(true);
        label.setBorder(BorderFactory.createLineBorder(Color.black, 5)); // sets a border for our label
        label.setVerticalAlignment(JLabel.CENTER); // sets a vertical position of our label within label
        label.setHorizontalAlignment(JLabel.CENTER); // sets a horizontal position of our label within label
        label.setBounds(0, 0, 370, 135);

        frame.setVisible(true); // makes the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // end the script once user closes window
        frame.setSize(512, 512); // sets resolution of a frame
        frame.setLayout(null);
        frame.setResizable(true); // prevents frame from being resized
        frame.setTitle("delsix's lab"); // sets title of a frame
        //frame.pack(); // unpacks everything and PC optimizes it to have everything on screen



        frame.add(label); // unpacks label


    }
}