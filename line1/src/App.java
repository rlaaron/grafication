import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        DrawPanel panel = new DrawPanel();

        frame.add(panel);
        frame.setSize(200, 150);
        frame.setVisible(true);

    }
}
