import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo() {
        frame = new JFrame("SliderDemo");
        panel = new JPanel();
        label = new JLabel("Select temperature");
        slider = new JSlider(0, 100, 20);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(555, 555);

        slider.setPreferredSize(new Dimension(400, 490));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(20);
        slider.setPaintLabels(true);
        slider.setFont(new Font("Consolas", Font.PLAIN, 24));
        slider.setOrientation(SwingConstants.VERTICAL); // make slider be vertical
        slider.addChangeListener(this);

        label.setText(slider.getValue() + " Celcius");
        label.setFont(new Font("MV Boli", Font.PLAIN, 24));

        panel.add(slider);
        panel.add(label);
        frame.add(panel);

        frame.setVisible(true);
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText(slider.getValue() + " Celcius");
    }
}
