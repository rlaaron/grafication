import java.util.ArrayList;

public class LineaRecta {
    private Point startPoint, endPoint;
    private double m, b, dy, dx; //m = slope, b = ordinate to origin
     private ArrayList<Point> selectedPoints;

    public LineaRecta(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        selectedPoints = new ArrayList<>();

        calculateCoefficients();
        evaluateCandidatePoints();
    }

    public double getSlope() { return m; }

    public double getOrdinateToOrigin() { return b; }

    public Point getStartPoint() { return startPoint; }

    public Point getEndPoint() { return endPoint; }

    public ArrayList<Point> getSelectedPoints() { return selectedPoints; }

    // private void calculateM() {
    //     this.m = (endPoint.getY() - startPoint.getY()) / (endPoint.getX() - startPoint.getX());
    // }

    private void calculateM() {
        this.m = (dy) / (dx);
    }

    private void calculateB() {
        this.b = startPoint.getY() - m * startPoint.getX();
    }

    public double functionValue(double x, double y) {
        return y - m * x - b;
    }

    private void getDy() {
        dy = endPoint.getY() - startPoint.getY();
    }

    private void getDx() {
        dx = endPoint.getX() - startPoint.getX();
    }

    private void calculateCoefficients() {
        getDx();
        getDy();
        calculateM();
        calculateB();
    }

    private void evaluateCandidatePoints() {
        double x =  startPoint.getX();
        double y =  startPoint.getY();

        double decimal = m - (int) m;
        int integer = (int) m;

        selectedPoints.add(new Point(x, y));

        while(x <= endPoint.getX()){
            decimal += decimal;
            // integer += integer;

            if(decimal >= 1){
                selectedPoints.add(new Point(x, y));
                x+=1;
                decimal -= 1;
            }

            selectedPoints.add(new Point(x, y));
            x +=4;
            // x += integer;
            y++;
        }
    }

    


    //dy = y2-y1
    //dx = x2-x1
    //para sacar los decimales se hace la division de dx/dy , 
    //revisar si la suma de decimales es uno entonces se suma un pixel,
    //para sumar un pixel se suma 1 en x




 
}




