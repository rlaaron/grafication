import java.util.ArrayList;

import javax.swing.JPanel;
import java.awt.*;

class GUI extends JPanel {
    LineaRecta lineaRecta;
    ArrayList<Point> selectedPoints;

    public GUI(Point startPoint, Point endPoint) {
        lineaRecta = new LineaRecta(startPoint, endPoint);
        selectedPoints = new ArrayList<>();
        evaluateCandidatePoints();
    }

    private void evaluateCandidatePoints() {
        for (int x = -100; x <= 100; x++) {
            for (int y = -100; y <= 100; y++) {
                double xDouble = (double) x;
                double yDouble = (double) y;

                if (lineaRecta.isPointOnLine(xDouble, yDouble)) {
                    selectedPoints.add(new Point(xDouble, yDouble));
                }
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int x1 = (int) lineaRecta.startPoint.x;
        int y1 = (int) (lineaRecta.m * lineaRecta.startPoint.x + lineaRecta.b);
        int x2 = (int) lineaRecta.endPoint.x;
        int y2 = (int) (lineaRecta.m * lineaRecta.endPoint.x + lineaRecta.b);

        g2d.setColor(Color.RED);
        for (Point point : selectedPoints) {
            // subtract  600 to point.y because the origin of the screen is at the top left corner
            g2d.fillRect((int) point.x, 600 - (int) point.y, 3, 3);
        }
        
    }
}
