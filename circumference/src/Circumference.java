public class Circumference extends Octant{
    private Octant allPoints;

    public Circumference(Point center, double radius) {
        super(center, radius);
        this.calculatePoints();
        this.modifyPointToDraw();
    }

    public Octant getAllPoints() {
        return allPoints;
    }

    public void calculatePoints() {
        this.allPoints = super.getSimetycsOctans();
    }
   
    public void modifyPointToDraw(){
        for(Point p : this.allPoints.getPoints()){
            p.setX(p.getX() + this.getCenter().getX());
            p.setY(p.getY() + this.getCenter().getY());
        }
    } 
    
    
}
