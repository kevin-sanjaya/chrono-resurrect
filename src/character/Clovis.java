package character;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Clovis {
    private Image sprite;
    private int x = 0;
    private int y = 0;
    private int dx = 35;
    private int dy = 70;

    public Clovis() {
        sprite = new ImageIcon("src/resources/player.png").getImage();
    }

    public Image getSprite() {
        return sprite;
    }

    public int getX() {
        return x;
    }

    public int getDx() {
        return dx;
    }

    public int getY() {
        return y;
    }

    public int getDy() {
        return dy;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            x -= 5;
            dx -= 5;
        }

        if (key == KeyEvent.VK_RIGHT) {
            x += 5;
            dx += 5;
        }

        if (key == KeyEvent.VK_UP) {
            y -= 5;
            dy -= 5;
        }

        if (key == KeyEvent.VK_DOWN) {
            y += 5;
            dy += 5;
        }
    }
}
