import character.Clovis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Panel extends JPanel implements ActionListener {
    private static Panel panel = null;
    private static Clovis clovis = new Clovis();
    private Timer timer;
    private final int DELAY = 150;
    int x = 0;

    public Panel() {
        addKeyListener(new TAdapter());
        setFocusable(true);
        setOpaque(false);
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public static Panel getPanel() {
        if(panel == null)
            panel = new Panel();

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(clovis.getSprite(),
                clovis.getX(), clovis.getY(),
                clovis.getDx(), clovis.getDy(),
                x, 0,
                x + 32, 50, null);
        x += 32;

        if (x >= 120)
            x=0;
    }

    private class TAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            clovis.keyPressed(e);
        }
    }
}
