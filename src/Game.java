import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {

    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    Game() {
        frame = new JFrame("KeyBinding Demon");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);


        label = new JLabel();
        label.setBounds(0, 0, 75, 75);
        label.setBackground(new Color(0xFF5555));
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        rightAction = new RightAction();
        leftAction = new LeftAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");

        label.getActionMap().put("upAction", upAction);
        label.getActionMap().put("downAction", downAction);
        label.getActionMap().put("leftAction", leftAction);
        label.getActionMap().put("rightAction", rightAction);


        frame.add(label);
        frame.setVisible(true);
    }

    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()-12);
        }
    }

    public class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()+12);
        }
    }

    public class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+12, label.getY());
        }
    }

    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-12, label.getY());
        }
    }


}
