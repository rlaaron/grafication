import java.util.ArrayList;
public class OctanControlPoint {
    private ArrayList<Point> points;
    private Point center;
    private double radius; 
    private int x, y, x2,  controlPoint;  
    
    public OctanControlPoint(Point center, double radius, int controlPoint) {
        this.center = center;
        this.radius = radius;
        this.controlPoint = controlPoint;
        this.points = new ArrayList<Point>();
        this.calculateCords();
        this.calculatePoints();
    }

    public double getRadius() { return radius; }
    public Point getCenter() { return center; }

    public void setRadius(double radius) { this.radius = radius; }
    public void setCenter(Point center) { this.center = center; }

    public void addPoint(Point p) { this.points.add(p); }

    public ArrayList<Point> getPoints() { return this.points; }

    public void setPoints(ArrayList<Point> points) { this.points = points; }

    private void calculateX() { 
        this.x = (int) Math.sqrt((this.radius * this.radius) / 2); 
    }
    private void calculateX2(){
        this.x2 = (int) x / controlPoint;
    }
    private void  calculateY() { 
        this.y = (int) Math.sqrt((this.radius * this.radius) - (this.x2 * this.x2));
    }

    public void calculateCords() {
        this.calculateX();
        this.calculateY();
        this.calculateX2();
    }

    public void calculatePoints() {
        // this.calculateX2();
        // this.calculateY();
        this.addPoint(new Point(this.x2, this.y));
        this.addPoint(new Point(this.y, this.x2));
        this.addPoint(new Point(this.y, -this.x2));
        this.addPoint(new Point(this.x2, -this.y));
        this.addPoint(new Point(-this.x2, -this.y));
        this.addPoint(new Point(-this.y, -this.x2));
        this.addPoint(new Point(-this.y, this.x2));
        this.addPoint(new Point(-this.x2, this.y));
        System.out.println("calculate points ");
        System.out.println(this.getPoints().size());
    
    }

    // public OctanControlPoint getSimetycsOctans(){
    //     OctanControlPoint oct = new OctanControlPoint(this.center, this.radius, this.controlPoint);
    //     ArrayList<Point> points = oct.getPoints();
    //     ArrayList<Point> newPoints = new ArrayList<Point>();

    //     for (Point p : points) {
    //         newPoints.add(new Point(p.getX(), p.getY()));
    //         newPoints.add(new Point(p.getY(), p.getX()));
    //         newPoints.add(new Point(p.getY(), -p.getX()));
    //         newPoints.add(new Point(p.getX(), -p.getY()));
    //         newPoints.add(new Point(-p.getX(), -p.getY()));
    //         newPoints.add(new Point(-p.getY(), -p.getX()));
    //         newPoints.add(new Point(-p.getY(), p.getX()));
    //         newPoints.add(new Point(-p.getX(), p.getY()));
    //         System.out.println(p.getX() + " " + p.getY());
    //     }
    //     System.out.println("here");
    //     System.out.println(newPoints.size());
    //     oct.setPoints(newPoints);
    //     return oct;
        
    // }
    
}
