import java.awt.Frame;
import java.awt.Graphics;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.awt.Color;

public class App3 extends Frame{
    public App3() {
        setTitle("Trazado de circunferencia");
        this.setSize(1000, 1000);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);

        int r;
        int x = 0, y1 = 0, x1 = 0, n, x2, y;
        double rc, yc, aux;
        int centrox, centroy;
        ArrayList<Point> points;
        points = new ArrayList<Point>();
        ArrayList<Line> lines;
        lines = new ArrayList<Line>();

        // Radio de la circunferencia:
        r = 200;
        y1 = r;
        n = 2;

        // Centro de la circunferencia:
        centrox = 400;
        centroy = 400;

        // Trazado de la circunferencia:
        rc = (r * r) / 2;

        x = (int) Math.sqrt(rc);

        x2 = x / n;
        yc = r * r - x2 * x2;
        aux = Math.sqrt(yc);
        aux = Math.round(aux);
        y = (int) aux;


        Point point1 = new Point(x1 + centrox, y1 + centroy);
        Point point2 = new Point(x2 + centrox, y + centroy);
        Line line = new Line(point1, point2);

        // Add the new line object to the list of lines.
        lines.add(line);
        
        // Iterate over the rest of the points in the list.
        for (int i = 2; i < points.size(); i++) {
          // Get the previous point and the current point.
          Point previousPoint = points.get(i - 1);
          Point currentPoint = points.get(i);
        
          // Create a new line object with the previous point and the current point.
          line = new Line(previousPoint, currentPoint);
        
          // Add the new line object to the list of lines.
          lines.add(line);
        }

        int i = 1;
        for(Point p : points){
            System.out.println("point: "+i+" "+p.getX() + " " + p.getY());
            i++;
        }

        int j = 1;
        for(Line l : lines){
            g.drawLine(l.getStartPoint().getX(), l.getStartPoint().getY(), l.getEndPoint().getX(), l.getEndPoint().getY());
            System.out.println("line "+j+": "+l.getStartPoint().getX() + " " + l.getStartPoint().getY()+" "+l.getEndPoint().getX() + " " + l.getEndPoint().getY());
            j++;
        }
        
    }

    public static void main(String[] args) {
        App3 p = new App3();

    }
}
// first point
 g.drawLine(x1 + centrox, y1 + centroy, x2 + centrox, y + centroy);
 g.drawLine(x2 + centrox, y + centroy, x + centrox, x + centroy);

//  second point
g.drawLine(y1 + centrox, x1 + centroy, y + centrox, x2 + centroy);
g.drawLine(y + centrox, x2 + centroy, x + centrox, x + centroy);

// third point
g.drawLine(-y1 + centrox, x1 + centroy, -y + centrox, x2 + centroy);
g.drawLine(-y + centrox, x2 + centroy, -x + centrox, x + centroy);

// fourth point
g.drawLine(-y1 + centrox, -x1 + centroy, -y + centrox, -x2 + centroy);
g.drawLine(-y + centrox, -x2 + centroy, -x + centrox, -x + centroy);

// fifth point
g.drawLine(centrox - x1, centroy - y1, centrox - x2, centroy - y);
g.drawLine(centrox - x2, centroy - y, centrox - x, centroy - x);

// sixth point
g.drawLine(centrox + y1, centroy - x1, centrox + y, centroy - x2);
g.drawLine(centrox + y, centroy - x2, centrox + x, centroy - x);

// seventh point
g.drawLine(-x1 + centroy, y1 + centroy, -x2 + centrox, y + centroy);
g.drawLine(-x2 + centroy, y + centroy, -x + centrox, x + centroy);

// OCTAVO PUNTO
g.drawLine(x1 + centroy, -y1 + centroy, x2 + centrox, -y + centroy);
g.drawLine(x2 + centroy, -y + centroy, x + centrox, -x + centroy);