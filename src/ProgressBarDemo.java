import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 100);

    int frameWidth = 626;

    ProgressBarDemo() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(frameWidth, 516));
        frame.setLayout(null);
        frame.setVisible(true);

        bar.setValue(0);
        bar.setBounds(0, 0, frame.getContentPane().getWidth(), frame.getContentPane().getWidth() / 8);
        bar.setStringPainted(true);
        bar.setBackground(new Color(0x1C2244));
        bar.setForeground(new Color(0x00AAFF));
        bar.setFont(new Font("Arial", Font.BOLD, 50));


        frame.add(bar);

        System.out.println(frame.getWidth()); // gets you width of frame
        System.out.println(frame.getHeight()); // gets you height of frame
        System.out.println(frame.getContentPane().getWidth()); // gets you width of content pane
        System.out.println(frame.getContentPane().getHeight()); // gets you height of content pane

        fill();
    }

    public void fill() {
        int counter = 0;

        while(counter <= 100) {
            counter++;
            bar.setValue(counter);
            try {
                Thread.sleep(32);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        bar.setString("Done! :)");
    }
}
