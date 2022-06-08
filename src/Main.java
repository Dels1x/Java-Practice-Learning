import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {


        // Layout Manager = Defines natural layout for components within a container

        // FlowLayout = places components in a row, sized at their preferred size.
        //              If the horizontal space in the container is too small,
        //              the FlowLayout class uses the next available row.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10)); // You can write in parentheses where you want your components to stack
        frame.setSize(600, 600);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(225, 256));
        panel.setLayout(new FlowLayout()); // actually panels have flowlayout by default, so no need of this line
        panel.setBackground(Color.gray);


        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));
        panel.add(new JButton("11"));
        panel.add(new JButton("12"));
        panel.add(new JButton("13"));
        panel.add(new JButton("13"));
        panel.add(new JButton("14"));
        panel.add(new JButton("15"));
        panel.add(new JButton("16"));
        panel.add(new JButton("17"));
        panel.add(new JButton("18"));
        panel.add(new JButton("19"));
        panel.add(new JButton("20"));
        panel.add(new JButton("21"));
        panel.add(new JButton("22"));
        panel.add(new JButton("23"));
        panel.add(new JButton("24"));
        panel.add(new JButton("25"));
        panel.add(new JButton("26"));
        panel.add(new JButton("27"));
        panel.add(new JButton("28"));
        panel.add(new JButton("29"));
        panel.add(new JButton("30"));
        panel.add(new JButton("31"));

        frame.add(panel);












        frame.setVisible(true);


    }
}