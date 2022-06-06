import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {


        // JFrame = a GUI component that functions as container to hold other elements

        JFrame frame = new JFrame();  // creates a frame

        ImageIcon image = new ImageIcon("Dels1x.png"); // create an image icon
        ImageIcon image2 = new ImageIcon("1111.png"); // create an image icon

        frame.setIconImage(image.getImage()); // change icon of frame
        frame.getContentPane().setBackground(new Color(0xEEEEEE));
        frame.setVisible(true); // makes the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // end the script once user closes window
        frame.setSize(532, 552); // sets resolution of a frame
        frame.setLayout(null);
        frame.setResizable(true); // prevents frame from being resized
        frame.setTitle("delsix's lab"); // sets title of a frame
        //frame.pack(); // unpacks everything and PC optimizes it to have everything on screen

        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();
        JPanel yellowPanel = new JPanel();
        JPanel magentaPanel = new JPanel();

        redPanel.setBackground(Color.red);
        bluePanel.setBackground(Color.blue);
        greenPanel.setBackground(Color.green);
        yellowPanel.setBackground(Color.yellow);
        magentaPanel.setBackground(Color.magenta);

        redPanel.setBounds(0,  0, 128, 128);
        bluePanel.setBounds(128,  0, 128, 128);
        greenPanel.setBounds(0,  128, 256, 128);
        yellowPanel.setBounds(256,  0, 256, 256);
        magentaPanel.setBounds(0, 256, 512, 256);


        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();

        label1.setText("Hi kids :)");
        label2.setText("Do you like violence?");

        greenPanel.setLayout(new BorderLayout());
        yellowPanel.setLayout(null);
        magentaPanel.setLayout(new BorderLayout());

        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label2.setBounds(30, 0, 165, 75);
        label3.setVerticalAlignment(JLabel.CENTER);
        label3.setHorizontalAlignment(JLabel.CENTER);

        label3.setText("I only crash these cars"); // set text of label
        label3.setIcon(image2); // sets an image of label
        label3.setHorizontalTextPosition(JLabel.CENTER); // sets text LEFT, CENTER, RIGHT of imageIcon
        label3.setVerticalTextPosition(JLabel.TOP); // sets text TOP, CENTER, BOTTOm of imageIcon
        label3.setForeground(Color.white); // sets font color of text
        label3.setFont(new Font("MV Boli", Font.PLAIN, 32)); // sets font, size of text
        label3.setIconTextGap(-6); // sets gap between image and text
        label3.setBorder(BorderFactory.createLineBorder(Color.black, 5)); // sets a border for our label
        label3.setVerticalAlignment(JLabel.CENTER); // sets a vertical position of our label within label
        label3.setHorizontalAlignment(JLabel.CENTER); // sets a horizontal position of our label within label

        greenPanel.add(label1);
        yellowPanel.add(label2);
        magentaPanel.add(label3);

        frame.add(redPanel); // unpacks panel
        frame.add(bluePanel); // unpacks panel
        frame.add(greenPanel); // unpacks panel
        frame.add(yellowPanel); // unpacks panel
        frame.add(magentaPanel); // unpacks panel


    }
}