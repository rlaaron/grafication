import java.util.ArrayList;

public class Octant {
    private ArrayList<Point> points;
    private Point center;
    private double radius;

    
    public Octant(Point center, double radius) {
        this.center = center;
        this.radius = radius;
        this.points = new ArrayList<Point>();
        this.calculatePoints();
    }
    
    public double getRadius() { return radius; }
    public Point getCenter() { return center; }

    public void setRadius(double radius) { this.radius = radius; }
    public void setCenter(Point center) { this.center = center; }


    public void addPoint(Point p) {
        this.points.add(p);
    }

    public ArrayList<Point> getPoints() {
        return this.points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    private int getY(int x) {
        return (int) Math.sqrt((this.radius * this.radius) - (x * x));
    }

    public void calculatePoints() {
        int x = 0;
        int y = (int) this.radius;

        while (x <= y) {
            this.addPoint(new Point(x, y));
            x = x + 1;
            y = this.getY(x);
        }
    }

    public Octant getSimetycsOctans(){
        Octant oct = new Octant(this.center, this.radius);
        ArrayList<Point> points = oct.getPoints();
        ArrayList<Point> newPoints = new ArrayList<Point>();

        for (Point p : points) {
            newPoints.add(new Point(p.getX(), p.getY()));
            newPoints.add(new Point(p.getY(), p.getX()));
            newPoints.add(new Point(p.getY(), -p.getX()));
            newPoints.add(new Point(p.getX(), -p.getY()));
            newPoints.add(new Point(-p.getX(), -p.getY()));
            newPoints.add(new Point(-p.getY(), -p.getX()));
            newPoints.add(new Point(-p.getY(), p.getX()));
            newPoints.add(new Point(-p.getX(), p.getY()));
        }

        oct.setPoints(newPoints);
        return oct;
    }

    

}
