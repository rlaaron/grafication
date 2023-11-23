import java.util.ArrayList;

import javax.swing.JPanel;
import java.awt.*;

public class GUI extends JPanel {
    private ArrayList<Point> pointsToDraw;
    private Circumference circumference;

    public GUI(Circumference circumference) {
        this.circumference = circumference;
        this.pointsToDraw = this.circumference.getAllPoints().getPoints();
    }

    public void drawCircumference(Graphics g) {
        for (Point p : this.pointsToDraw) {
            System.out.println(p.getX() + " " + p.getY());
            g.drawLine(p.getX(), p.getY(), p.getX(), p.getY());
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.drawCircumference(g);
    }
    
}
