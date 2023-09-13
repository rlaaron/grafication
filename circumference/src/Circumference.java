public class Circumference {
    private Point center;
    private double radius;

    public Circumference(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() { return this.center; }
    public double getRadius() { return this.radius; }

    public void setCenter(Point center) { this.center = center; }
    public void setRadius(double radius) { this.radius = radius; }
    
}
