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
        for (int x = (int) lineaRecta.getStartPoint().x; x <= lineaRecta.getEndPoint().x; x++) {
            for (int y = (int) lineaRecta.getStartPoint().y; y <= lineaRecta.getEndPoint().y; y++) {
                double xDouble = (double) x;
                double yDouble = (double) y;

                if (lineaRecta.isPointOnLine(xDouble, yDouble)) {
                    selectedPoints.add(new Point(xDouble, yDouble));
                    System.out.println("Punto seleccionado: " + xDouble + ", " + yDouble);
                    break;
                }
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.RED);
        for (Point point : selectedPoints) {
            // subtract  600 to point.y because the origin of the screen is at the top left corner
            g2d.fillRect((int) point.x, 600 - (int) point.y, 3, 3);
        }
        
    }
}
