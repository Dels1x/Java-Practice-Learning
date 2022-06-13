import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    int frameWidth = 626;

    ProgressBarDemo() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(frameWidth, 516));
        frame.setLayout(null);
        frame.setVisible(true);

        bar.setValue(0);
        bar.setBounds(0, 0, frame.getContentPane().getWidth() - 50, 61);
        bar.setStringPainted(true);
        bar.setBackground(new Color(0x1C2244));


        frame.add(bar);

        System.out.println(frame.getWidth());
        System.out.println(frame.getHeight());
        System.out.println(frame.getContentPane().getWidth());
        System.out.println(frame.getContentPane().getHeight());
    }
}
