package util;

import javax.swing.*;
import java.awt.*;

public class MapBackground {
    private static MapBackground mapBackground;
    private Image sprite;

    public MapBackground() {
        sprite = new ImageIcon("src/resources/map-background.png").getImage();
    }

    public Image getSprite() {
        return sprite;
    }

    public static MapBackground getMapBackground() {
        if(mapBackground == null)
            mapBackground = new MapBackground();

        return mapBackground;
    }
}
