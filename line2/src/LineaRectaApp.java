import javax.swing.JFrame;

public class LineaRectaApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LineaRectaApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 1200);

        Point startPoint = new Point(2, 3);
        Point endPoint = new Point(200, 70);
        GUI gui = new GUI(startPoint, endPoint);
        frame.add(gui);

        frame.setVisible(true);
    }
}