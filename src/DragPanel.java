import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {

    ImageIcon ufo = new ImageIcon("ufo.png");;
    final int WIDTH = ufo.getIconWidth();
    final int HEIGHT = ufo.getIconHeight();
    Point ImageCorner;
    Point prevPt;

    DragPanel() {

        ImageCorner = new Point(0, 0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();


        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void PaintComponent(Graphics g) {
        super.paintComponent(g);
        ufo.paintIcon(this, g, (int)ImageCorner.getX(), (int)ImageCorner.getY());
    }

    private class ClickListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);

            prevPt = e.getPoint();


        }
    }

    private class DragListener extends MouseMotionAdapter {

    }

}
