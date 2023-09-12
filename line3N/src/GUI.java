import java.util.ArrayList;

import javax.swing.JPanel;
import java.awt.*;

public class GUI extends JPanel {
    private LineaRecta lineaRecta;
    private ArrayList<Point> selectedPoints;

    public GUI(Point startPoint, Point endPoint) {
        lineaRecta = new LineaRecta(startPoint, endPoint);
        selectedPoints = new ArrayList<>();
        getCandidatePoints();
    }

    private void getCandidatePoints() {
        selectedPoints = lineaRecta.getSelectedPoints();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        
        // g2d.setColor(Color.RED);
        
        // g2d.drawLine((int) lineaRecta.getStartPoint().getX(), 600 - (int) lineaRecta.getStartPoint().getY(), (int) lineaRecta.getEndPoint().getX(), 600 - (int) lineaRecta.getEndPoint().getY());
        
        g2d.setColor(Color.BLACK);
        for (Point point : selectedPoints) {
            g2d.fillRect((int) point.getX(), 600 - (int) point.getY()  , 2, 2);
            
        }

        
    }
}       
