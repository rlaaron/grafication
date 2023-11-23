import java.util.ArrayList;

import javax.swing.JPanel;
import java.awt.*;

public class GUICONTROL extends JPanel {
    private ArrayList<Point> pointsToDraw;
    private CircumferenceControlPoint circumference;

    public GUICONTROL(CircumferenceControlPoint circumference) {
        this.circumference = circumference;
        this.pointsToDraw = this.circumference.getAllPoints();
    }

    public void drawCircumference(Graphics g) {
        for (Point p : this.pointsToDraw) {
            System.out.println("drawCircumference");
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
