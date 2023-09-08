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

        int dy = y2 - y1;
        int dx = x2 - x1;
        int DY =  dy/dy;
        double DX =  dx/dy;

        double decimal = 0;


        // g2d.setColor(Color.BLACK);
        // g2d.drawLine(x1, 600 - y1, x2 , 600 - y2 );

        g2d.setColor(Color.RED);
        // for (Point point : selectedPoints) {
        //     // subtract  500 to x and 600 to y to center the line
        //     // g2d.fillRect((int) point.x - 600, (int) point.y - 600, 3, 3);
        //     g2d.fillRect((int) point.x, (int) point.y, 3, 3);
        // }

       
        //check if DX is >= 1 then keep the decimal part and add it to decimal, and then if the decimal is >= 1 add 1 to x1, all inside to a for loop, and then substract
        // for(int i = 0; i < dy; i++){
        //     decimal += DX;
        //     if(decimal >= 1){
        //         x1 += 1;
        //         decimal -= 1;
        //     }
        //     y1 += DY;
        //     // g2d.fillRect(x1 - 600, y1 - 600 , 3, 3);
        //     // g2d.fillRect((int) point.x - 600, (int) point.y - 600, 3, 3);
        //     g2d.fillRect(x1, 300 - y1, 3, 3);
        // }

        for(Point point : selectedPoints){
            if(decimal >= 1){
                x1 += 1;
                decimal -= 1;
            }else{
                // int newY = 600 - (int) point.y;
                g2d.fillRect((int) point.x, 600 - (int) point.y  , 3, 3);
            }
        }



        
    }
}
