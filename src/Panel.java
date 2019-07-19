import character.Crono;
import util.MapBackground;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Panel extends JPanel implements ActionListener {
    private static Panel panel = null;
    private Timer timer;
    private final int DELAY = 10;

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
        g.drawImage(MapBackground.getMapBackground().getSprite(),
                0,0,
                1000, 800,
                null);
        g.drawImage(Crono.getCrono().getSprite(),
                Crono.getCrono().getX(),Crono.getCrono().getY(),
                null);
        System.out.println(Crono.getCrono().getX() + " " + Crono.getCrono().getY());
    }

    private class TAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            Crono.getCrono().keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            Crono.getCrono().keyReleased(e);
        }
    }
}
