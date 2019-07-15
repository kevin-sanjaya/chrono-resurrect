import javax.swing.*;

public class Frame extends JFrame {
    public Frame() {
        initFrame();
    }

    private void initFrame() {
        add(new Panel());
        setSize(1200, 800);
        setTitle("Project Clovis");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
