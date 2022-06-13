import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton intelButton;
    JRadioButton nvidiaButton;
    JRadioButton amdButton;
    ButtonGroup vendors;
    ImageIcon intelIcon = new ImageIcon("intel.png");
    ImageIcon amdIcon = new ImageIcon("amd.png");
    ImageIcon nvidiaIcon = new ImageIcon("nvidia.png");


    MyFrame() {
        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(800, 600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        vendors = new ButtonGroup();
        intelButton = new JRadioButton("Intel");
        nvidiaButton = new JRadioButton("NVIDIA");
        amdButton = new JRadioButton("AMD");

        intelButton.setIcon(intelIcon);
        amdButton.setIcon(amdIcon);
        nvidiaButton.setIcon(nvidiaIcon);

        vendors.add(intelButton);
        vendors.add(nvidiaButton);
        vendors.add(amdButton);

        this.add(intelButton);
        this.add(nvidiaButton);
        this.add(amdButton);
        this.pack();
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == amdButton) {
            System.out.println("#AMDTASHI");
        }
        else if(e.getSource() == nvidiaButton) {
            System.out.println("GTX 1050 Ti lover?");
        }
        else if(e.getSource() == intelButton) {
            System.out.println("U tebya siniy probitiy anus");
        }
    }
}
