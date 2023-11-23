import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Circumference");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        Point center = new Point(400, 300);
        double radius = 200;
        int controlPoint = 10;
        // Circumference circumference = new Circumference(center, radius);
        // GUI gui = new GUI(circumference);
        
        CircumferenceControlPoint circumference = new CircumferenceControlPoint(center, radius, controlPoint);
        GUICONTROL gui = new GUICONTROL(circumference);

        frame.add(gui);
        frame.setVisible(true);
        
    }
}
