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

        int x1 = (int) lineaRecta.getStartPoint().getX();
        int y1 = (int) (lineaRecta.getSlope() * lineaRecta.getStartPoint().getX() + lineaRecta.getOrdinateToOrigin());
        int x2 = (int) lineaRecta.getEndPoint().getX();
        int y2 = (int) (lineaRecta.getSlope() * lineaRecta.getEndPoint().getX() + lineaRecta.getOrdinateToOrigin());

        int dy = y2 - y1;
        int dx = x2 - x1;

        int DY =  1;
        double DX =  dx/dy;

        double decimal = 0;
       


       
        for(Point point : selectedPoints){
            if(decimal >= 1){
                x1 += 1;
                decimal -= 1;
            }else{
                // int newY = 600 - (int) point.y;
                g2d.fillRect((int) point.getX(), 600 - (int) point.getY()  , 3, 3);
            }
        }
        
        g2d.setColor(Color.RED);

        for (Point point : selectedPoints) {
            g2d.fillRect((int) point.getX(), 600 - (int) point.getY()  , 3, 3);
            
        }

        
    }
}
