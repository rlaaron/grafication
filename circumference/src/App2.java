import java.awt.Frame;
import java.awt.Graphics;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.awt.Color;

//METODO DE TRAZADO RAPIDO DE LA CIRCUNFERENCIA
public class App2 extends Frame {

    public App2() {
        setTitle("Trazado de circunferencia");
        this.setSize(1000, 1000);
        this.setVisible(true);
    }

    @Override

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);

        int r;
        int x = 0, y1 = 0, x1 = 0, n, x2, y, sx, sy, f;
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
        sx = 10;
        sy = 5;


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

        f = sy/sx;
        // f =2;
        System.out.println("f: "+f);
        // PUNTOS DIBUJADOS

        // PRIMER PUNTO
        // g.drawLine(x1 + centrox, (y1 + centroy) * f, x2 + centrox, (y + centroy)*f);
        // g.drawLine(x2 + centrox, (y + centroy) * f, x + centrox, (x + centroy)*f);
        // // points.add(new Point(x1 + centrox, y1 + centroy));
        // // points.add(new Point(x2 + centrox, y + centroy));
        // // lines.add(new Line(new Point(x1 + centrox, y1 + centroy), new Point(x2 + centrox, y + centroy)));


        // // SEGUNDO PUNTO
        // g.drawLine(y1 + centrox, (x1 + centroy)*f, y + centrox, (x2 + centroy)*f);
        // g.drawLine(y + centrox, (x2 + centroy)*f, x + centrox, (x + centroy)*f);


        // points.add(new Point(y1 + centrox, x1 + centroy));
        // points.add(new Point(y + centrox, x2 + centroy));
        // lines.add(new Line(new Point(y1 + centrox, x1 + centroy), new Point(y + centrox, x2 + centroy)));

        // TERCER PUNTO
        //  g.drawLine(-y1 + centrox, (x1 + centroy)*f, -y + centrox, (x2 + centroy)*f);
        //  g.drawLine(-y + centrox, (x2 + centroy)*f, -x + centrox, (x + centroy)*f);
        // // points.add(new Point(-y1 + centrox, x1 + centroy));
        // // points.add(new Point(-y + centrox, x2 + centroy));
        // // lines.add(new Line(new Point(-y1 + centrox, x1 + centroy), new Point(-y + centrox, x2 + centroy)));

        // // CUARTO PUNTO
        // g.drawLine(-y1 + centrox, (-x1 + centroy)*f, -y + centrox, (-x2 + centroy)*f);
        // g.drawLine(-y + centrox, (-x2 + centroy)*f, -x + centrox, (-x + centroy)*f);
        // // points.add(new Point(-y1 + centrox, -x1 + centroy));
        // // points.add(new Point(-y + centrox, -x2 + centroy));
        // // lines.add(new Line(new Point(-y1 + centrox, -x1 + centroy), new Point(-y + centrox, -x2 + centroy)));

        // // QUINTO PUNTO
        // g.drawLine(centrox - x1, (centroy - y1)*f, centrox - x2, (centroy - y)*f);
        // g.drawLine(centrox - x2, (centroy - y)*f, centrox - x, (centroy - x)*f);
        // // points.add(new Point(centrox - x1, centroy - y1));
        // // points.add(new Point(centrox - x2, centroy - y));
        // // lines.add(new Line(new Point(centrox - x1, centroy - y1), new Point(centrox - x2, centroy - y)));

        // // SEXTO PUNTO
        // g.drawLine(centrox + y1, (centroy - x1)*f, centrox + y, (centroy - x2)*f);
        // g.drawLine(centrox + y, (centroy - x2)*f, centrox + x, (centroy - x)*f);
        // points.add(new Point(centrox + y1, centroy - x1));
        // points.add(new Point(centrox + y, centroy - x2));
        // lines.add(new Line(new Point(centrox + y1, centroy - x1), new Point(centrox + y, centroy - x2)));

        // // SEPTIMO PUNTO
        // g.drawLine(-x1 + centroy, (y1 + centroy)*f, -x2 + centrox, (y + centroy)*f);
        // g.drawLine(-x2 + centroy, (y + centroy)*f, -x + centrox, (x + centroy)*f);
        // // points.add(new Point(-x1 + centroy, y1 + centroy));
        // // points.add(new Point(-x2 + centroy, y + centroy));
        // // lines.add(new Line(new Point(-x1 + centroy, y1 + centroy), new Point(-x2 + centroy, y + centroy)));

        // // OCTAVO PUNTO
        // System.out.println("octavo punto");
        // g.drawLine(x1 + centroy, (-y1 + centroy)*f, x2 + centrox, (-y + centroy)*f);
        // g.drawLine(x2 + centroy, (-y + centroy)*f, x + centrox, (-x + centroy)*f);
        // // points.add(new Point(x1 + centroy, -y1 + centroy));
        // points.add(new Point(x2 + centroy, -y + centroy));
        // lines.add(new Line(new Point(x1 + centroy, -y1 + centroy), new Point(x2 + centroy, -y + centroy)));

        // PUNTOS SIMETRICOS
        // for (Point p : points) {
        //     g.drawLine(p.getX(), p.getY(), p.getX(), p.getY());
        // }
        // int i = 1;
        // for(Point p : points){
        //     System.out.println("point: "+i+" "+p.getX() + " " + p.getY());
        //     i++;
        // }

        // int j = 1;
        // for(Line l : lines){
        //     g.drawLine(l.getStartPoint().getX(), l.getStartPoint().getY(), l.getEndPoint().getX(), l.getEndPoint().getY());
        //     System.out.println("line "+j+": "+l.getStartPoint().getX() + " " + l.getStartPoint().getY()+" "+l.getEndPoint().getX() + " " + l.getEndPoint().getY());
        //     j++;
        // }



        g.drawOval(centrox - x2, centroy - y, x2 * 2, y * 2);


    }

    public static void main(String[] args) {
        App2 p = new App2();

    }
}