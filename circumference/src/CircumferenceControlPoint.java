import java.lang.reflect.Array;
import java.util.ArrayList;

public class CircumferenceControlPoint extends OctanControlPoint{
    // private Octant allPoints;
    // private OctanControlPoint allPoints;
    private ArrayList<Point> pointsToDraw;

    public CircumferenceControlPoint(Point center, double radius, int controlPoint) {
        super(center, radius, controlPoint);
        this.calculatePoints();
        this.modifyPointToDraw();
    }

    public ArrayList<Point>  getAllPoints() {
        return pointsToDraw;
    }

    // public void calculatePoints() {
    //     // this.allPoints = super.getSimetycsOctans();
    //     this.allPoints = super.getPoints();
    // }
   
    public void modifyPointToDraw(){
        for(Point p : this.getPoints()){
            p.setX(p.getX() + this.getCenter().getX());
            p.setY(p.getY() + this.getCenter().getY());
        }
    } 
    
    
}
