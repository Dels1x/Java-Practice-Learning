package projects.Clicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame implements ActionListener {

    static int morgenshterns = 0;
    JButton morgenshternButton;
    JLabel morgenshternLabel;
    JPanel morgenshternPanel;
    ImageIcon morgenshternIcon = new ImageIcon("Morgen.png");

    Game() {
        this.setSize(516, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        ClickAction clickAction = new ClickAction();


        morgenshternPanel = new JPanel();
        morgenshternPanel.setLayout(new GridLayout());
        morgenshternPanel.setPreferredSize(new Dimension(500, 250));

        morgenshternButton = new JButton();
        morgenshternButton.addActionListener(this);
        morgenshternButton.setIcon(morgenshternIcon);
        morgenshternButton.getInputMap().put(KeyStroke.getKeyStroke("W"), "clickAction");
        morgenshternButton.getInputMap().put(KeyStroke.getKeyStroke("w"), "clickAction");
        morgenshternButton.getActionMap().put("clickAction", clickAction);

        morgenshternLabel = new JLabel(String.valueOf(morgenshterns));
        morgenshternLabel.setFont(new Font("Consolas", Font.BOLD, 64));
        morgenshternLabel.setHorizontalAlignment(JLabel.CENTER);


        morgenshternPanel.add(morgenshternButton);
        morgenshternPanel.add(morgenshternLabel);
        this.add(morgenshternPanel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(morgenshternButton)) {
            morgenshterns += 1;
            morgenshternLabel.setText(String.valueOf(morgenshterns));
        }
    }

    public class ClickAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            morgenshterns += 1;
            morgenshternLabel.setText(String.valueOf(morgenshterns));
        }
    }
}
