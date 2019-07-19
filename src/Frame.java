import javax.swing.*;

public class Frame extends JFrame {
    private static Frame frame = null;

    public Frame() {
        add(Panel.getPanel());
        setSize(1000, 800);
        setTitle("Chrono Trigger");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static Frame getFrame() {
        if(frame == null)
            frame = new Frame();

        return frame;
    }
}
