package character;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Crono {
    private static Crono crono;
    private ArrayList<Image> walkingSprite;
    private ArrayList<Image> idleSprite;
    private int x = 230;
    private int y = 655;
    private int lastPosition = 0;
    private boolean isWalking = false;

    public Crono() {
        idleSprite = new ArrayList<>();
        walkingSprite = new ArrayList<>();
        idleSprite.add(new ImageIcon("src/resources/crono/crono-idle-up.gif").getImage());
        idleSprite.add(new ImageIcon("src/resources/crono/crono-idle-down.gif").getImage());
        idleSprite.add(new ImageIcon("src/resources/crono/crono-idle-left.gif").getImage());
        idleSprite.add(new ImageIcon("src/resources/crono/crono-idle-right.gif").getImage());
        walkingSprite.add(new ImageIcon("src/resources/crono/crono-walk-up.gif").getImage());
        walkingSprite.add(new ImageIcon("src/resources/crono/crono-walk-down.gif").getImage());
        walkingSprite.add(new ImageIcon("src/resources/crono/crono-walk-left.gif").getImage());
        walkingSprite.add(new ImageIcon("src/resources/crono/crono-walk-right.gif").getImage());
    }

    public static Crono getCrono() {
        if(crono == null)
            crono = new Crono();

        return crono;
    }

    public Image getSprite() {
        return isWalking ? walkingSprite.get(lastPosition) : idleSprite.get(lastPosition);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            isWalking = true;
            lastPosition = 2;
            x -= 5;
        }

        if (key == KeyEvent.VK_RIGHT) {
            isWalking = true;
            lastPosition = 3;
            x += 5;
        }

        if (key == KeyEvent.VK_UP) {
            isWalking = true;
            lastPosition = 0;
            y -= 5;
        }

        if (key == KeyEvent.VK_DOWN) {
            isWalking = true;
            lastPosition = 1;
            y += 5;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            isWalking = false;
        }

        if (key == KeyEvent.VK_RIGHT) {
            isWalking = false;
        }

        if (key == KeyEvent.VK_UP) {
            isWalking = false;
        }

        if (key == KeyEvent.VK_DOWN) {
            isWalking = false;
        }
    }
}
